/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.AssemblyContext;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.Parameter_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.VariableUsage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageModel;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UserData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.UserDataImpl#getAssemblyContext_userData <em>Assembly Context user Data</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.UserDataImpl#getUsageModel_UserData <em>Usage Model User Data</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.UserDataImpl#getUserDataParameterUsages_UserData <em>User Data Parameter Usages User Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDataImpl extends EObjectImpl implements UserData {
   /**
    * The cached value of the '{@link #getAssemblyContext_userData() <em>Assembly Context user Data</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssemblyContext_userData()
    * @generated
    * @ordered
    */
   protected AssemblyContext assemblyContext_userData;

   /**
    * The cached value of the '{@link #getUserDataParameterUsages_UserData() <em>User Data Parameter Usages User Data</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUserDataParameterUsages_UserData()
    * @generated
    * @ordered
    */
   protected EList<VariableUsage> userDataParameterUsages_UserData;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UserDataImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Usagemodel_av_pcPackage.Literals.USER_DATA;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext getAssemblyContext_userData() {
      if (assemblyContext_userData != null && assemblyContext_userData.eIsProxy()) {
         InternalEObject oldAssemblyContext_userData = (InternalEObject)assemblyContext_userData;
         assemblyContext_userData = (AssemblyContext)eResolveProxy(oldAssemblyContext_userData);
         if (assemblyContext_userData != oldAssemblyContext_userData) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Usagemodel_av_pcPackage.USER_DATA__ASSEMBLY_CONTEXT_USER_DATA, oldAssemblyContext_userData, assemblyContext_userData));
         }
      }
      return assemblyContext_userData;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext basicGetAssemblyContext_userData() {
      return assemblyContext_userData;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAssemblyContext_userData(AssemblyContext newAssemblyContext_userData) {
      AssemblyContext oldAssemblyContext_userData = assemblyContext_userData;
      assemblyContext_userData = newAssemblyContext_userData;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_av_pcPackage.USER_DATA__ASSEMBLY_CONTEXT_USER_DATA, oldAssemblyContext_userData, assemblyContext_userData));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UsageModel getUsageModel_UserData() {
      if (eContainerFeatureID() != Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA) return null;
      return (UsageModel)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetUsageModel_UserData(UsageModel newUsageModel_UserData, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newUsageModel_UserData, Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUsageModel_UserData(UsageModel newUsageModel_UserData) {
      if (newUsageModel_UserData != eInternalContainer() || (eContainerFeatureID() != Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA && newUsageModel_UserData != null)) {
         if (EcoreUtil.isAncestor(this, newUsageModel_UserData))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newUsageModel_UserData != null)
            msgs = ((InternalEObject)newUsageModel_UserData).eInverseAdd(this, Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL, UsageModel.class, msgs);
         msgs = basicSetUsageModel_UserData(newUsageModel_UserData, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA, newUsageModel_UserData, newUsageModel_UserData));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<VariableUsage> getUserDataParameterUsages_UserData() {
      if (userDataParameterUsages_UserData == null) {
         userDataParameterUsages_UserData = new EObjectContainmentWithInverseEList<VariableUsage>(VariableUsage.class, this, Usagemodel_av_pcPackage.USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA, Parameter_av_pcPackage.VARIABLE_USAGE__USER_DATA_VARIABLE_USAGE);
      }
      return userDataParameterUsages_UserData;
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
         case Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetUsageModel_UserData((UsageModel)otherEnd, msgs);
         case Usagemodel_av_pcPackage.USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserDataParameterUsages_UserData()).basicAdd(otherEnd, msgs);
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
         case Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA:
            return basicSetUsageModel_UserData(null, msgs);
         case Usagemodel_av_pcPackage.USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA:
            return ((InternalEList<?>)getUserDataParameterUsages_UserData()).basicRemove(otherEnd, msgs);
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
         case Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA:
            return eInternalContainer().eInverseRemove(this, Usagemodel_av_pcPackage.USAGE_MODEL__USER_DATA_USAGE_MODEL, UsageModel.class, msgs);
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
         case Usagemodel_av_pcPackage.USER_DATA__ASSEMBLY_CONTEXT_USER_DATA:
            if (resolve) return getAssemblyContext_userData();
            return basicGetAssemblyContext_userData();
         case Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA:
            return getUsageModel_UserData();
         case Usagemodel_av_pcPackage.USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA:
            return getUserDataParameterUsages_UserData();
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
         case Usagemodel_av_pcPackage.USER_DATA__ASSEMBLY_CONTEXT_USER_DATA:
            setAssemblyContext_userData((AssemblyContext)newValue);
            return;
         case Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA:
            setUsageModel_UserData((UsageModel)newValue);
            return;
         case Usagemodel_av_pcPackage.USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA:
            getUserDataParameterUsages_UserData().clear();
            getUserDataParameterUsages_UserData().addAll((Collection<? extends VariableUsage>)newValue);
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
         case Usagemodel_av_pcPackage.USER_DATA__ASSEMBLY_CONTEXT_USER_DATA:
            setAssemblyContext_userData((AssemblyContext)null);
            return;
         case Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA:
            setUsageModel_UserData((UsageModel)null);
            return;
         case Usagemodel_av_pcPackage.USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA:
            getUserDataParameterUsages_UserData().clear();
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
         case Usagemodel_av_pcPackage.USER_DATA__ASSEMBLY_CONTEXT_USER_DATA:
            return assemblyContext_userData != null;
         case Usagemodel_av_pcPackage.USER_DATA__USAGE_MODEL_USER_DATA:
            return getUsageModel_UserData() != null;
         case Usagemodel_av_pcPackage.USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA:
            return userDataParameterUsages_UserData != null && !userDataParameterUsages_UserData.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //UserDataImpl
