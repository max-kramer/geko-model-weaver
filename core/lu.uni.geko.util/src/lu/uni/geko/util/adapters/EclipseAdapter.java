/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 ******************************************************************************/
package lu.uni.geko.util.adapters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

public class EclipseAdapter {

   public static Bundle installAndStartNewPluginFromInstalledPlugin(String installedPluginID, String newPluginID,
         String newPluginLocation) throws BundleException {
      Bundle bundle = Platform.getBundle(newPluginID);
      if (bundle == null) {
         Bundle installedBundle = Platform.getBundle(installedPluginID);
         BundleContext bundleContext = installedBundle.getBundleContext();
         bundle = bundleContext.installBundle(newPluginLocation);
      }
      int state = bundle.getState();
      if (state != Bundle.ACTIVE && state != Bundle.STARTING) {
         bundle.start();
      }
      return bundle;
   }

   /**
    * Returns the unique registered extension for a given extension point id and a given property that is an instance of the given
    * class. Throws a {@link java.lang.RuntimeException} if no extension or more than one extensions are registered or if the
    * registered extension is not an instance of the given class.
    *
    * @param extensionPointID
    *           the ID of the extension point to be inspected
    * @param propertyName
    *           the name of the extension point property
    * @param extensionClass
    *           the expected class for the extension point property
    */
   public static <T> T getUniqueRegisteredExecutableExtension(String extensionPointID, String propertyName,
         Class<T> extensionClass) {
      List<T> registeredExecutableExtensions = getRegisteredExecutableExtensions(extensionPointID, propertyName, extensionClass);
      if (registeredExecutableExtensions.size() != 1) {
         throw new RuntimeException("Found '" + registeredExecutableExtensions.size()
               + "' extensions for the mandatory unique property '" + propertyName + "' for the extension point '"
               + extensionPointID + "'!");
      } else {
         return JavaAdapter.one(registeredExecutableExtensions);
      }
   }

   /**
    * Returns a list that contains all registered extensions for a given extension point id and a given property that are
    * instances of the given class.
    *
    * @param extensionPointID
    *           the ID of the extension point to be inspected
    * @param propertyName
    *           the name of the extension point property
    * @param extensionClass
    *           the expected class for the extension point property
    */
   public static <T> List<T> getRegisteredExecutableExtensions(String extensionPointID, String propertyName,
         Class<T> extensionClass) {
      List<T> executableExtensions = new ArrayList<T>();
      try {
         IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPointID);
         for (IConfigurationElement extConfElem : config) {
            Object executableExt = extConfElem.createExecutableExtension("class");
            T extension = JavaAdapter.dynamicCast(executableExt, extensionClass,
                  "property for the extension point configuration element");
            executableExtensions.add(extension);
         }
      } catch (CoreException e) {
         // soften
         throw new RuntimeException(e);
      }
      return executableExtensions;
   }

   public static <T> List<T> getRegisteredExecutablesInDescPriority(String extensionPointID, String propertyName,
         Class<T> extensionClass) {
      List<Pair<T, Integer>> executableExtensionsWithPriority = getRegisteredExecutablesWithPriority(extensionPointID,
            propertyName, extensionClass);
      sortExectuablesDescByPriority(extensionPointID, executableExtensionsWithPriority);
      List<T> executableExtensions = new ArrayList<T>(executableExtensionsWithPriority.size());
      for (Pair<T, Integer> extensionPriorityPair : executableExtensionsWithPriority) {
         executableExtensions.add(extensionPriorityPair.first);
      }
      return executableExtensions;
   }

   public static <T> List<Pair<T, Integer>> getRegisteredExecutablesWithPriority(String extensionPointID, String propertyName,
         Class<T> extensionClass) {
      List<Pair<T, Integer>> executableExtensionsWithPriority = new ArrayList<Pair<T, Integer>>();
      try {
         IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPointID);
         for (IConfigurationElement extConfElem : config) {
            Object executableExt = extConfElem.createExecutableExtension("class");
            String priorityValue = extConfElem.getAttribute("priority");
            Integer priority = JavaAdapter.parseInt(priorityValue);
            T extension = JavaAdapter.dynamicCast(executableExt, extensionClass,
                  "property for the extension point configuration element");
            executableExtensionsWithPriority.add(new Pair<T, Integer>(extension, priority));
         }
      } catch (CoreException e) {
         // soften
         throw new RuntimeException(e);
      }
      return executableExtensionsWithPriority;
   }

   public static <T> void sortExectuablesDescByPriority(final String extensionPointID,
         List<Pair<T, Integer>> executableExtensionsWithPriority) {
      Comparator<Pair<T, Integer>> priorityComparator = new Comparator<Pair<T, Integer>>() {
         @Override
         public int compare(Pair<T, Integer> arg0, Pair<T, Integer> arg1) {
            int comparison;
            comparison = arg1.second.compareTo(arg0.second);
            if (comparison == 0) {
               throw new RuntimeException("The two extensions '" + arg0.first + "' and '" + arg1.first
                     + "' both extend the same extension point " + "'" + extensionPointID + "' using the same priority '"
                     + arg0.second + "'!");
            }
            return comparison;
         }
      };
      Collections.sort(executableExtensionsWithPriority, priorityComparator);
   }

   public static <T> T callInProtectedMode(final Callable<T> callable) {
      final FutureTask<T> futureTask = new FutureTask<T>(callable);
      ISafeRunnable safeRunnable = new ISafeRunnable() {
         @Override
         public void handleException(Throwable e) {
            System.err.println("Exception while running in protected mode:");
            // soften
            throw new RuntimeException(e);
            // FIXME MK dynamically remove extension once they threw an exception
            // e.g. using Platform.getExtensionRegistry().removeExtension(extension, token)
         }

         @Override
         public void run() throws Exception {
            futureTask.run();
         }
      };
      try {
         SafeRunner.run(safeRunnable);
         return futureTask.get();
      } catch (InterruptedException e) {
         safeRunnable.handleException(e);
      } catch (ExecutionException e) {
         safeRunnable.handleException(e);
      }
      return null;
   }

   public static void runInProtectedMode(final Runnable runnable) {
      // RATIONALE MK force the thread that calls this method to wait until computation is finished
      Callable<Boolean> callable = new Callable<Boolean>() {
         @Override
         public Boolean call() throws Exception {
            runnable.run();
            return true;
         }
      };
      callInProtectedMode(callable);
   }

   public static StructuredSelection getCurrentStructuredSelection(ExecutionEvent event) {
      Object selectionVarValue = HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);
      if (selectionVarValue instanceof StructuredSelection) {
         return (StructuredSelection) selectionVarValue;
      } else {
         throw new RuntimeException("The current selection '" + selectionVarValue + "' has to be a StructuredSelection!");
      }
   }

   public static boolean turnOffAutoBuildIfOn() throws CoreException {
      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceDescription description = workspace.getDescription();
      if (description.isAutoBuilding()) {
         description.setAutoBuilding(false);
         workspace.setDescription(description);
         return true;
      } else {
         return false;
      }
   }

   public static void turnOnAutoBuild() throws CoreException {
      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceDescription description = workspace.getDescription();
      if (!description.isAutoBuilding()) {
         description.setAutoBuilding(true);
         workspace.setDescription(description);
      }
   }
}
