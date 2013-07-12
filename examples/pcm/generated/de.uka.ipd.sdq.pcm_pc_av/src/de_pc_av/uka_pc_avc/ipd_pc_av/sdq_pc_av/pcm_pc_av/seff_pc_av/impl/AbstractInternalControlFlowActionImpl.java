/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractInternalControlFlowAction;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_performance_pc_av.InfrastructureCall;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_performance_pc_av.ParametricResourceDemand;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_performance_pc_av.ResourceCall;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_performance_pc_av.Seff_performance_pc_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Internal Control Flow Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.AbstractInternalControlFlowActionImpl#getResourceDemand_Action <em>Resource Demand Action</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.AbstractInternalControlFlowActionImpl#getInfrastructureCall__Action <em>Infrastructure Call Action</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.AbstractInternalControlFlowActionImpl#getResourceCall__Action <em>Resource Call Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractInternalControlFlowActionImpl extends AbstractActionImpl implements AbstractInternalControlFlowAction {
   /**
    * The cached value of the '{@link #getResourceDemand_Action() <em>Resource Demand Action</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceDemand_Action()
    * @generated
    * @ordered
    */
   protected EList<ParametricResourceDemand> resourceDemand_Action;

   /**
    * The cached value of the '{@link #getInfrastructureCall__Action() <em>Infrastructure Call Action</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInfrastructureCall__Action()
    * @generated
    * @ordered
    */
   protected EList<InfrastructureCall> infrastructureCall__Action;

   /**
    * The cached value of the '{@link #getResourceCall__Action() <em>Resource Call Action</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceCall__Action()
    * @generated
    * @ordered
    */
   protected EList<ResourceCall> resourceCall__Action;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AbstractInternalControlFlowActionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_pc_avPackage.Literals.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ParametricResourceDemand> getResourceDemand_Action() {
      if (resourceDemand_Action == null) {
         resourceDemand_Action = new EObjectContainmentWithInverseEList<ParametricResourceDemand>(ParametricResourceDemand.class, this, Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION, Seff_performance_pc_avPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND);
      }
      return resourceDemand_Action;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<InfrastructureCall> getInfrastructureCall__Action() {
      if (infrastructureCall__Action == null) {
         infrastructureCall__Action = new EObjectContainmentWithInverseEList<InfrastructureCall>(InfrastructureCall.class, this, Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION, Seff_performance_pc_avPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL);
      }
      return infrastructureCall__Action;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceCall> getResourceCall__Action() {
      if (resourceCall__Action == null) {
         resourceCall__Action = new EObjectContainmentWithInverseEList<ResourceCall>(ResourceCall.class, this, Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION, Seff_performance_pc_avPackage.RESOURCE_CALL__ACTION_RESOURCE_CALL);
      }
      return resourceCall__Action;
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
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceDemand_Action()).basicAdd(otherEnd, msgs);
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfrastructureCall__Action()).basicAdd(otherEnd, msgs);
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceCall__Action()).basicAdd(otherEnd, msgs);
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
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION:
            return ((InternalEList<?>)getResourceDemand_Action()).basicRemove(otherEnd, msgs);
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION:
            return ((InternalEList<?>)getInfrastructureCall__Action()).basicRemove(otherEnd, msgs);
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION:
            return ((InternalEList<?>)getResourceCall__Action()).basicRemove(otherEnd, msgs);
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
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION:
            return getResourceDemand_Action();
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION:
            return getInfrastructureCall__Action();
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION:
            return getResourceCall__Action();
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
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION:
            getResourceDemand_Action().clear();
            getResourceDemand_Action().addAll((Collection<? extends ParametricResourceDemand>)newValue);
            return;
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION:
            getInfrastructureCall__Action().clear();
            getInfrastructureCall__Action().addAll((Collection<? extends InfrastructureCall>)newValue);
            return;
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION:
            getResourceCall__Action().clear();
            getResourceCall__Action().addAll((Collection<? extends ResourceCall>)newValue);
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
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION:
            getResourceDemand_Action().clear();
            return;
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION:
            getInfrastructureCall__Action().clear();
            return;
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION:
            getResourceCall__Action().clear();
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
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION:
            return resourceDemand_Action != null && !resourceDemand_Action.isEmpty();
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION:
            return infrastructureCall__Action != null && !infrastructureCall__Action.isEmpty();
         case Seff_pc_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION:
            return resourceCall__Action != null && !resourceCall__Action.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //AbstractInternalControlFlowActionImpl
