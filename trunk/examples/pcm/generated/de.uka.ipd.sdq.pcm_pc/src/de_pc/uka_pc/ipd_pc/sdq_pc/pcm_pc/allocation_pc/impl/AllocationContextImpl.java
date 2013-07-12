/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.Allocation;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.AllocationContext;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.Allocation_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.util.Allocation_pcValidator;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.AssemblyContext;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.EventChannel;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.impl.EntityImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.ResourceContainer;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.impl.AllocationContextImpl#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.impl.AllocationContextImpl#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.impl.AllocationContextImpl#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.impl.AllocationContextImpl#getEventChannel__AllocationContext <em>Event Channel Allocation Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocationContextImpl extends EntityImpl implements AllocationContext {
   /**
    * The cached value of the '{@link #getResourceContainer_AllocationContext() <em>Resource Container Allocation Context</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceContainer_AllocationContext()
    * @generated
    * @ordered
    */
   protected ResourceContainer resourceContainer_AllocationContext;

   /**
    * The cached value of the '{@link #getAssemblyContext_AllocationContext() <em>Assembly Context Allocation Context</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssemblyContext_AllocationContext()
    * @generated
    * @ordered
    */
   protected AssemblyContext assemblyContext_AllocationContext;

   /**
    * The cached value of the '{@link #getEventChannel__AllocationContext() <em>Event Channel Allocation Context</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEventChannel__AllocationContext()
    * @generated
    * @ordered
    */
   protected EventChannel eventChannel__AllocationContext;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AllocationContextImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Allocation_pcPackage.Literals.ALLOCATION_CONTEXT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceContainer getResourceContainer_AllocationContext() {
      if (resourceContainer_AllocationContext != null && resourceContainer_AllocationContext.eIsProxy()) {
         InternalEObject oldResourceContainer_AllocationContext = (InternalEObject)resourceContainer_AllocationContext;
         resourceContainer_AllocationContext = (ResourceContainer)eResolveProxy(oldResourceContainer_AllocationContext);
         if (resourceContainer_AllocationContext != oldResourceContainer_AllocationContext) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_pcPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT, oldResourceContainer_AllocationContext, resourceContainer_AllocationContext));
         }
      }
      return resourceContainer_AllocationContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceContainer basicGetResourceContainer_AllocationContext() {
      return resourceContainer_AllocationContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceContainer_AllocationContext(ResourceContainer newResourceContainer_AllocationContext) {
      ResourceContainer oldResourceContainer_AllocationContext = resourceContainer_AllocationContext;
      resourceContainer_AllocationContext = newResourceContainer_AllocationContext;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Allocation_pcPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT, oldResourceContainer_AllocationContext, resourceContainer_AllocationContext));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext getAssemblyContext_AllocationContext() {
      if (assemblyContext_AllocationContext != null && assemblyContext_AllocationContext.eIsProxy()) {
         InternalEObject oldAssemblyContext_AllocationContext = (InternalEObject)assemblyContext_AllocationContext;
         assemblyContext_AllocationContext = (AssemblyContext)eResolveProxy(oldAssemblyContext_AllocationContext);
         if (assemblyContext_AllocationContext != oldAssemblyContext_AllocationContext) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_pcPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT, oldAssemblyContext_AllocationContext, assemblyContext_AllocationContext));
         }
      }
      return assemblyContext_AllocationContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext basicGetAssemblyContext_AllocationContext() {
      return assemblyContext_AllocationContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAssemblyContext_AllocationContext(AssemblyContext newAssemblyContext_AllocationContext) {
      AssemblyContext oldAssemblyContext_AllocationContext = assemblyContext_AllocationContext;
      assemblyContext_AllocationContext = newAssemblyContext_AllocationContext;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Allocation_pcPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT, oldAssemblyContext_AllocationContext, assemblyContext_AllocationContext));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation getAllocation_AllocationContext() {
      if (eContainerFeatureID() != Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT) return null;
      return (Allocation)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAllocation_AllocationContext(Allocation newAllocation_AllocationContext, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newAllocation_AllocationContext, Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAllocation_AllocationContext(Allocation newAllocation_AllocationContext) {
      if (newAllocation_AllocationContext != eInternalContainer() || (eContainerFeatureID() != Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT && newAllocation_AllocationContext != null)) {
         if (EcoreUtil.isAncestor(this, newAllocation_AllocationContext))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newAllocation_AllocationContext != null)
            msgs = ((InternalEObject)newAllocation_AllocationContext).eInverseAdd(this, Allocation_pcPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION, Allocation.class, msgs);
         msgs = basicSetAllocation_AllocationContext(newAllocation_AllocationContext, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT, newAllocation_AllocationContext, newAllocation_AllocationContext));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventChannel getEventChannel__AllocationContext() {
      if (eventChannel__AllocationContext != null && eventChannel__AllocationContext.eIsProxy()) {
         InternalEObject oldEventChannel__AllocationContext = (InternalEObject)eventChannel__AllocationContext;
         eventChannel__AllocationContext = (EventChannel)eResolveProxy(oldEventChannel__AllocationContext);
         if (eventChannel__AllocationContext != oldEventChannel__AllocationContext) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_pcPackage.ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT, oldEventChannel__AllocationContext, eventChannel__AllocationContext));
         }
      }
      return eventChannel__AllocationContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventChannel basicGetEventChannel__AllocationContext() {
      return eventChannel__AllocationContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEventChannel__AllocationContext(EventChannel newEventChannel__AllocationContext) {
      EventChannel oldEventChannel__AllocationContext = eventChannel__AllocationContext;
      eventChannel__AllocationContext = newEventChannel__AllocationContext;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Allocation_pcPackage.ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT, oldEventChannel__AllocationContext, eventChannel__AllocationContext));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean OneAssemblyContextOrOneEventChannelShouldBeReferred(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Allocation_pcValidator.DIAGNOSTIC_SOURCE,
                   Allocation_pcValidator.ALLOCATION_CONTEXT__ONE_ASSEMBLY_CONTEXT_OR_ONE_EVENT_CHANNEL_SHOULD_BE_REFERRED,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OneAssemblyContextOrOneEventChannelShouldBeReferred", EObjectValidator.getObjectLabel(this, context) }),
                   new Object [] { this }));
         }
         return false;
      }
      return true;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAllocation_AllocationContext((Allocation)otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
            return basicSetAllocation_AllocationContext(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
      switch (eContainerFeatureID()) {
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
            return eInternalContainer().eInverseRemove(this, Allocation_pcPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION, Allocation.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Allocation_pcPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT:
            if (resolve) return getResourceContainer_AllocationContext();
            return basicGetResourceContainer_AllocationContext();
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT:
            if (resolve) return getAssemblyContext_AllocationContext();
            return basicGetAssemblyContext_AllocationContext();
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
            return getAllocation_AllocationContext();
         case Allocation_pcPackage.ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT:
            if (resolve) return getEventChannel__AllocationContext();
            return basicGetEventChannel__AllocationContext();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case Allocation_pcPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT:
            setResourceContainer_AllocationContext((ResourceContainer)newValue);
            return;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT:
            setAssemblyContext_AllocationContext((AssemblyContext)newValue);
            return;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
            setAllocation_AllocationContext((Allocation)newValue);
            return;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT:
            setEventChannel__AllocationContext((EventChannel)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case Allocation_pcPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT:
            setResourceContainer_AllocationContext((ResourceContainer)null);
            return;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT:
            setAssemblyContext_AllocationContext((AssemblyContext)null);
            return;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
            setAllocation_AllocationContext((Allocation)null);
            return;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT:
            setEventChannel__AllocationContext((EventChannel)null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case Allocation_pcPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT:
            return resourceContainer_AllocationContext != null;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT:
            return assemblyContext_AllocationContext != null;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
            return getAllocation_AllocationContext() != null;
         case Allocation_pcPackage.ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT:
            return eventChannel__AllocationContext != null;
      }
      return super.eIsSet(featureID);
   }

} //AllocationContextImpl
