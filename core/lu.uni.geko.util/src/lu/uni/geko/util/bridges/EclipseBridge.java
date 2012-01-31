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
package lu.uni.geko.util.bridges;

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

/**
 * A utility class hiding details of the Eclipse API for recurring tasks that are not project-specific.<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently only providing one
 * implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 */
public final class EclipseBridge {
   /** Utility classes should not have a public or default constructor. */
   private EclipseBridge() {
   }

   /**
    * Installs and starts the plug-in with the given ID at the given location using the context of an already installed plug-in.
    *
    * @param installedPluginID
    *           the ID of the plug-in that provides the context for installing the new plug-in
    * @param newPluginID
    *           the id of the new plug-in
    * @param newPluginLocation
    *           the location identifier of the new plug-in
    * @return the new plug-in
    * @throws BundleException
    *            if the installation failed or if the plug-in could not be started
    */
   public static Bundle installAndStartNewPluginFromInstalledPlugin(final String installedPluginID, final String newPluginID,
         final String newPluginLocation) throws BundleException {
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
    * Returns the registered extension for the given property of the given extension point ID if the registered extension is
    * unique (i.e. no other extension extends this extension point) and the property is an instance of the given class. Throws a
    * {@link java.lang.RuntimeException RuntimeException} if no extension or more than one extensions are registered or if the
    * registered extension is not an instance of the given class.
    *
    * @param <T>
    *           the type of the extension point property
    * @param extensionPointID
    *           the ID of the extension point to be inspected
    * @param propertyName
    *           the name of the extension point property
    * @param extensionClass
    *           the class of the extension point property
    * @return the registered extension
    */
   public static <T> T getUniqueRegisteredExtension(final String extensionPointID, final String propertyName,
         final Class<T> extensionClass) {
      List<T> registeredExecutableExtensions = getRegisteredExtensions(extensionPointID, propertyName, extensionClass);
      if (registeredExecutableExtensions.size() != 1) {
         throw new RuntimeException("Found '" + registeredExecutableExtensions.size()
               + "' extensions for the mandatory unique property '" + propertyName + "' for the extension point '"
               + extensionPointID + "'!");
      } else {
         return JavaBridge.one(registeredExecutableExtensions);
      }
   }

   /**
    * Returns a list that contains all registered extensions for the given property of the given extension point ID if the
    * property is an instance of the given class for all registered extensions.
    *
    * @param <T>
    *           the type of the extension point property
    * @param extensionPointID
    *           the ID of the extension point to be inspected
    * @param propertyName
    *           the name of the extension point property
    * @param extensionClass
    *           the class of the extension point property
    * @return a list containing the registered extensions
    */
   public static <T> List<T> getRegisteredExtensions(final String extensionPointID, final String propertyName,
         final Class<T> extensionClass) {
      List<T> executableExtensions = new ArrayList<T>();
      try {
         IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPointID);
         for (IConfigurationElement extConfElem : config) {
            Object executableExt = extConfElem.createExecutableExtension(propertyName);
            T extension = JavaBridge.dynamicCast(executableExt, extensionClass,
                  "property for the extension point configuration element");
            executableExtensions.add(extension);
         }
      } catch (CoreException e) {
         // soften
         throw new RuntimeException(e);
      }
      return executableExtensions;
   }

   /**
    * Returns a list that contains all registered extensions for the given property of the given extension point ID if the
    * property is an instance of the given class for all registered extensions and if the given priority property exists. The list
    * is ordered by decreasing priority (i.e. starting with the extension having the highest integer value priority).
    *
    * @param <T>
    *           the type of the extension point property
    * @param extensionPointID
    *           the ID of the extension point to be inspected
    * @param propertyName
    *           the name of the extension point property
    * @param priorityPropertyName
    *           the name of the priority property used for ordering
    * @param extensionClass
    *           the class of the extension point property
    * @return a list containing the registered extensions ordered by decreasing priority
    */
   public static <T> List<T> getRegisteredExtensionsInDescPriority(final String extensionPointID, final String propertyName,
         final String priorityPropertyName, final Class<T> extensionClass) {
      List<Pair<T, Integer>> executableExtensionsWithPriority = getRegisteredExtensionsWithPriority(extensionPointID,
            propertyName, priorityPropertyName, extensionClass);
      sortExtensionsDescByPriority(executableExtensionsWithPriority);
      List<T> executableExtensions = new ArrayList<T>(executableExtensionsWithPriority.size());
      for (Pair<T, Integer> extensionPriorityPair : executableExtensionsWithPriority) {
         executableExtensions.add(extensionPriorityPair.first);
      }
      return executableExtensions;
   }

   /**
    * Returns a list that contains all registered extensions for the given property of the given extension point ID together with
    * their priority property if the property is an instance of the given class for all registered extensions and if the given
    * priority property exists. The list is not sorted in any particular order.
    *
    * @param <T>
    *           the type of the extension point property
    * @param extensionPointID
    *           the ID of the extension point to be inspected
    * @param propertyName
    *           the name of the extension point property
    * @param priorityPropertyName
    *           the name of the priority property used for ordering
    * @param extensionClass
    *           the class of the extension point property
    * @return a list containing the registered extensions together with their priority
    */
   public static <T> List<Pair<T, Integer>> getRegisteredExtensionsWithPriority(final String extensionPointID,
         final String propertyName, final String priorityPropertyName, final Class<T> extensionClass) {
      List<Pair<T, Integer>> executableExtensionsWithPriority = new ArrayList<Pair<T, Integer>>();
      try {
         IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPointID);
         for (IConfigurationElement extConfElem : config) {
            Object executableExt = extConfElem.createExecutableExtension(propertyName);
            String priorityValue = extConfElem.getAttribute(priorityPropertyName);
            Integer priority = JavaBridge.parseInt(priorityValue);
            T extension = JavaBridge.dynamicCast(executableExt, extensionClass,
                  "property for the extension point configuration element");
            executableExtensionsWithPriority.add(new Pair<T, Integer>(extension, priority));
         }
      } catch (CoreException e) {
         // soften
         throw new RuntimeException(e);
      }
      return executableExtensionsWithPriority;
   }

   /**
    * Sorts the given extension-priority pairs descending according to their priority.
    *
    * @param <T>
    *           the type of the extensions
    * @param extensionsWithPriority
    *           a list of extension-priority pairs
    */
   public static <T> void sortExtensionsDescByPriority(final List<Pair<T, Integer>> extensionsWithPriority) {
      Comparator<Pair<T, Integer>> priorityComparator = new Comparator<Pair<T, Integer>>() {
         @Override
         public int compare(final Pair<T, Integer> arg0, final Pair<T, Integer> arg1) {
            int comparison;
            comparison = arg1.second.compareTo(arg0.second);
            if (comparison == 0) {
               throw new RuntimeException("The two extensions '" + arg0.first + "' and '" + arg1.first
                     + "' both extend the same extension point using the same priority '" + arg0.second + "'!");
            }
            return comparison;
         }
      };
      Collections.sort(extensionsWithPriority, priorityComparator);
   }

   /**
    * Calls the given callable in a protected mode and returns the result (waiting for the result to be computed). Exceptions
    * thrown in the callable are printed to the default error console and softened (i.e. rethrown as
    * {@link java.lang.RuntimeException RuntimeException}).
    *
    * @param <T>
    *           the return type of the callable
    * @param callable
    *           the callable to be run in protected mode
    * @return the result of the callable
    *
    * @see org.eclipse.core.runtime.SafeRunner#run(ISafeRunnable) SafeRunner.run
    */
   public static <T> T callInProtectedMode(final Callable<T> callable) {
      final FutureTask<T> futureTask = new FutureTask<T>(callable);
      ISafeRunnable safeRunnable = new ISafeRunnable() {
         @Override
         public void handleException(final Throwable e) {
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

   /**
    * Runs the given runnable in a protected mode and waits for the corresponding thread to finish this computation. Exceptions
    * thrown in the runnable are printed to the default error console and softened (i.e. rethrown as
    * {@link java.lang.RuntimeException RuntimeException}).
    *
    * @param runnable
    *           the runnable to be run in protected mode
    *
    * @see org.eclipse.core.runtime.SafeRunner#run(ISafeRunnable) SafeRunner.run
    */
   public static void runInProtectedMode(final Runnable runnable) {
      // RATIONALE MK force the thread that calls this method to wait until computation is finished to avoid concurrency problems
      Callable<Boolean> callable = new Callable<Boolean>() {
         @Override
         public Boolean call() throws Exception {
            runnable.run();
            return true;
         }
      };
      callInProtectedMode(callable);
   }

   /**
    * Returns the value of the structured selection variable of the given execution event.
    *
    * @param event
    *           an execution event of the user interface
    * @return the structured selection of the event
    */
   public static StructuredSelection getCurrentStructuredSelection(final ExecutionEvent event) {
      Object selectionVarValue = HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);
      if (selectionVarValue instanceof StructuredSelection) {
         return (StructuredSelection) selectionVarValue;
      } else {
         throw new RuntimeException("The current selection '" + selectionVarValue + "' has to be a StructuredSelection!");
      }
   }

   /**
    * Turns off the automatic build feature of the workbench if it is currently switched on and returns {@code true} when this was
    * the case.
    *
    * @return whether autobuild was on
    * @throws CoreException
    *            if the feature could not be set
    */
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

   /**
    * Turns on the automatic build feature of the workbench.
    *
    * @throws CoreException
    *            if the feature could not be set
    */
   public static void turnOnAutoBuild() throws CoreException {
      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceDescription description = workspace.getDescription();
      if (!description.isAutoBuilding()) {
         description.setAutoBuilding(true);
         workspace.setDescription(description);
      }
   }
}
