/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageModel;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageScenario;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UserData;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.UsageModelImpl#getUsageScenario_UsageModel <em>Usage Scenario Usage Model</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.UsageModelImpl#getUserData_UsageModel <em>User Data Usage Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageModelImpl extends EObjectImpl implements UsageModel {
   /**
    * The cached value of the '{@link #getUsageScenario_UsageModel() <em>Usage Scenario Usage Model</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUsageScenario_UsageModel()
    * @generated
    * @ordered
    */
   protected EList<UsageScenario> usageScenario_UsageModel;

   /**
    * The cached value of the '{@link #getUserData_UsageModel() <em>User Data Usage Model</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUserData_UsageModel()
    * @generated
    * @ordered
    */
   protected EList<UserData> userData_UsageModel;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UsageModelImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Usagemodel_av_pcPackage.Literals.USAGE_MODEL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<UsageScenario> getUsageScenario_UsageModel() {
      if (usageScenario_UsageModel == null) {
         usageScenario_UsageModel = new EObjectContainmentWithInverseEList<UsageScenario>(UsageScenario.class, this, Usagemodel_av_pcPackage.USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL, Usagemodel_av_pcPackage.USAGE_SCENARIO__USAGE_MODEL_USAGE_SCENARIO);
      }
      return usageScenario_UsageModel;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<UserData> getUserData_UsageModel() {
      if (userData_UsageModel == null) {
         userData_UsageModel = new EObjectContainmentWithInverseEList<UserData>(UserData.class, this, Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL, Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA);
      }
      return userData_UsageModel;
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
         case Usagemodel_av_pcPackage.USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsageScenario_UsageModel()).basicAdd(otherEnd, msgs);
         case Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserData_UsageModel()).basicAdd(otherEnd, msgs);
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
         case Usagemodel_av_pcPackage.USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL:
            return ((InternalEList<?>)getUsageScenario_UsageModel()).basicRemove(otherEnd, msgs);
         case Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL:
            return ((InternalEList<?>)getUserData_UsageModel()).basicRemove(otherEnd, msgs);
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
         case Usagemodel_av_pcPackage.USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL:
            return getUsageScenario_UsageModel();
         case Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL:
            return getUserData_UsageModel();
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
         case Usagemodel_av_pcPackage.USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL:
            getUsageScenario_UsageModel().clear();
            getUsageScenario_UsageModel().addAll((Collection<? extends UsageScenario>)newValue);
            return;
         case Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL:
            getUserData_UsageModel().clear();
            getUserData_UsageModel().addAll((Collection<? extends UserData>)newValue);
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
         case Usagemodel_av_pcPackage.USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL:
            getUsageScenario_UsageModel().clear();
            return;
         case Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL:
            getUserData_UsageModel().clear();
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
         case Usagemodel_av_pcPackage.USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL:
            return usageScenario_UsageModel != null && !usageScenario_UsageModel.isEmpty();
         case Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL:
            return userData_UsageModel != null && !userData_UsageModel.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //UsageModelImpl
