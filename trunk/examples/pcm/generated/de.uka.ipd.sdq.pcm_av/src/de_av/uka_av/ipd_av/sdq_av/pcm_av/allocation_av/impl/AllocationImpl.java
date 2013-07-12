/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.util.Allocation_avValidator;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.EntityImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceEnvironment;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationImpl#getTargetResourceEnvironment_Allocation <em>Target Resource Environment Allocation</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationImpl#getSystem_Allocation <em>System Allocation</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationImpl#getAllocationContexts_Allocation <em>Allocation Contexts Allocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocationImpl extends EntityImpl implements Allocation {
   /**
    * The cached value of the '{@link #getTargetResourceEnvironment_Allocation() <em>Target Resource Environment Allocation</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetResourceEnvironment_Allocation()
    * @generated
    * @ordered
    */
   protected ResourceEnvironment targetResourceEnvironment_Allocation;

   /**
    * The cached value of the '{@link #getSystem_Allocation() <em>System Allocation</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSystem_Allocation()
    * @generated
    * @ordered
    */
   protected de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System system_Allocation;

   /**
    * The cached value of the '{@link #getAllocationContexts_Allocation() <em>Allocation Contexts Allocation</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAllocationContexts_Allocation()
    * @generated
    * @ordered
    */
   protected EList<AllocationContext> allocationContexts_Allocation;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AllocationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Allocation_avPackage.Literals.ALLOCATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceEnvironment getTargetResourceEnvironment_Allocation() {
      if (targetResourceEnvironment_Allocation != null && targetResourceEnvironment_Allocation.eIsProxy()) {
         InternalEObject oldTargetResourceEnvironment_Allocation = (InternalEObject)targetResourceEnvironment_Allocation;
         targetResourceEnvironment_Allocation = (ResourceEnvironment)eResolveProxy(oldTargetResourceEnvironment_Allocation);
         if (targetResourceEnvironment_Allocation != oldTargetResourceEnvironment_Allocation) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_avPackage.ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION, oldTargetResourceEnvironment_Allocation, targetResourceEnvironment_Allocation));
         }
      }
      return targetResourceEnvironment_Allocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceEnvironment basicGetTargetResourceEnvironment_Allocation() {
      return targetResourceEnvironment_Allocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTargetResourceEnvironment_Allocation(ResourceEnvironment newTargetResourceEnvironment_Allocation) {
      ResourceEnvironment oldTargetResourceEnvironment_Allocation = targetResourceEnvironment_Allocation;
      targetResourceEnvironment_Allocation = newTargetResourceEnvironment_Allocation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Allocation_avPackage.ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION, oldTargetResourceEnvironment_Allocation, targetResourceEnvironment_Allocation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System getSystem_Allocation() {
      if (system_Allocation != null && system_Allocation.eIsProxy()) {
         InternalEObject oldSystem_Allocation = (InternalEObject)system_Allocation;
         system_Allocation = (de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System)eResolveProxy(oldSystem_Allocation);
         if (system_Allocation != oldSystem_Allocation) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_avPackage.ALLOCATION__SYSTEM_ALLOCATION, oldSystem_Allocation, system_Allocation));
         }
      }
      return system_Allocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System basicGetSystem_Allocation() {
      return system_Allocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSystem_Allocation(de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System newSystem_Allocation) {
      de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System oldSystem_Allocation = system_Allocation;
      system_Allocation = newSystem_Allocation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Allocation_avPackage.ALLOCATION__SYSTEM_ALLOCATION, oldSystem_Allocation, system_Allocation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<AllocationContext> getAllocationContexts_Allocation() {
      if (allocationContexts_Allocation == null) {
         allocationContexts_Allocation = new EObjectContainmentWithInverseEList<AllocationContext>(AllocationContext.class, this, Allocation_avPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION, Allocation_avPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT);
      }
      return allocationContexts_Allocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Allocation_avValidator.DIAGNOSTIC_SOURCE,
                   Allocation_avValidator.ALLOCATION__EACH_ASSEMBLY_CONTEXT_WITHIN_SYSTEM_HAS_TO_BE_ALLOCATED_EXACTLY_ONCE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean CommunicatingServersHaveToBeConnectedByLinkingResource(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Allocation_avValidator.DIAGNOSTIC_SOURCE,
                   Allocation_avValidator.ALLOCATION__COMMUNICATING_SERVERS_HAVE_TO_BE_CONNECTED_BY_LINKING_RESOURCE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CommunicatingServersHaveToBeConnectedByLinkingResource", EObjectValidator.getObjectLabel(this, context) }),
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
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Allocation_avPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocationContexts_Allocation()).basicAdd(otherEnd, msgs);
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
         case Allocation_avPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION:
            return ((InternalEList<?>)getAllocationContexts_Allocation()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Allocation_avPackage.ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION:
            if (resolve) return getTargetResourceEnvironment_Allocation();
            return basicGetTargetResourceEnvironment_Allocation();
         case Allocation_avPackage.ALLOCATION__SYSTEM_ALLOCATION:
            if (resolve) return getSystem_Allocation();
            return basicGetSystem_Allocation();
         case Allocation_avPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION:
            return getAllocationContexts_Allocation();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case Allocation_avPackage.ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION:
            setTargetResourceEnvironment_Allocation((ResourceEnvironment)newValue);
            return;
         case Allocation_avPackage.ALLOCATION__SYSTEM_ALLOCATION:
            setSystem_Allocation((de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System)newValue);
            return;
         case Allocation_avPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION:
            getAllocationContexts_Allocation().clear();
            getAllocationContexts_Allocation().addAll((Collection<? extends AllocationContext>)newValue);
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
         case Allocation_avPackage.ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION:
            setTargetResourceEnvironment_Allocation((ResourceEnvironment)null);
            return;
         case Allocation_avPackage.ALLOCATION__SYSTEM_ALLOCATION:
            setSystem_Allocation((de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System)null);
            return;
         case Allocation_avPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION:
            getAllocationContexts_Allocation().clear();
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
         case Allocation_avPackage.ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION:
            return targetResourceEnvironment_Allocation != null;
         case Allocation_avPackage.ALLOCATION__SYSTEM_ALLOCATION:
            return system_Allocation != null;
         case Allocation_avPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION:
            return allocationContexts_Allocation != null && !allocationContexts_Allocation.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //AllocationImpl
