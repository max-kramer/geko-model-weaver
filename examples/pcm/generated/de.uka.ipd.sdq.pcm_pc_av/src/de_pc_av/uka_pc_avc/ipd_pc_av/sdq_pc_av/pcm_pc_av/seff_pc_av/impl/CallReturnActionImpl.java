/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.Parameter_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableUsage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.CallReturnAction;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Return Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.CallReturnActionImpl#getReturnVariableUsage__CallReturnAction <em>Return Variable Usage Call Return Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallReturnActionImpl extends CallActionImpl implements CallReturnAction {
   /**
    * The cached value of the '{@link #getReturnVariableUsage__CallReturnAction() <em>Return Variable Usage Call Return Action</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReturnVariableUsage__CallReturnAction()
    * @generated
    * @ordered
    */
   protected EList<VariableUsage> returnVariableUsage__CallReturnAction;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CallReturnActionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_pc_avPackage.Literals.CALL_RETURN_ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<VariableUsage> getReturnVariableUsage__CallReturnAction() {
      if (returnVariableUsage__CallReturnAction == null) {
         returnVariableUsage__CallReturnAction = new EObjectContainmentWithInverseEList<VariableUsage>(VariableUsage.class, this, Seff_pc_avPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION, Parameter_pc_avPackage.VARIABLE_USAGE__CALL_RETURN_ACTION_VARIABLE_USAGE);
      }
      return returnVariableUsage__CallReturnAction;
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
         case Seff_pc_avPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getReturnVariableUsage__CallReturnAction()).basicAdd(otherEnd, msgs);
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
         case Seff_pc_avPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
            return ((InternalEList<?>)getReturnVariableUsage__CallReturnAction()).basicRemove(otherEnd, msgs);
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
         case Seff_pc_avPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
            return getReturnVariableUsage__CallReturnAction();
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
         case Seff_pc_avPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
            getReturnVariableUsage__CallReturnAction().clear();
            getReturnVariableUsage__CallReturnAction().addAll((Collection<? extends VariableUsage>)newValue);
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
         case Seff_pc_avPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
            getReturnVariableUsage__CallReturnAction().clear();
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
         case Seff_pc_avPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
            return returnVariableUsage__CallReturnAction != null && !returnVariableUsage__CallReturnAction.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //CallReturnActionImpl
