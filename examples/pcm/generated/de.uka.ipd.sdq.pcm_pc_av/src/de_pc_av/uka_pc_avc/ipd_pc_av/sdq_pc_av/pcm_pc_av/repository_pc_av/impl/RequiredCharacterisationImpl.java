/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableCharacterisationType;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Characterisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredCharacterisationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredCharacterisationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredCharacterisationImpl#getInterface_RequiredCharacterisation <em>Interface Required Characterisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredCharacterisationImpl extends EObjectImpl implements RequiredCharacterisation {
   /**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected static final VariableCharacterisationType TYPE_EDEFAULT = VariableCharacterisationType.STRUCTURE;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected VariableCharacterisationType type = TYPE_EDEFAULT;

   /**
    * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameter()
    * @generated
    * @ordered
    */
   protected Parameter parameter;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RequiredCharacterisationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_avPackage.Literals.REQUIRED_CHARACTERISATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableCharacterisationType getType() {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setType(VariableCharacterisationType newType) {
      VariableCharacterisationType oldType = type;
      type = newType == null ? TYPE_EDEFAULT : newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.REQUIRED_CHARACTERISATION__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter getParameter() {
      if (parameter != null && parameter.eIsProxy()) {
         InternalEObject oldParameter = (InternalEObject)parameter;
         parameter = (Parameter)eResolveProxy(oldParameter);
         if (parameter != oldParameter) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_pc_avPackage.REQUIRED_CHARACTERISATION__PARAMETER, oldParameter, parameter));
         }
      }
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter basicGetParameter() {
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParameter(Parameter newParameter) {
      Parameter oldParameter = parameter;
      parameter = newParameter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.REQUIRED_CHARACTERISATION__PARAMETER, oldParameter, parameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Interface getInterface_RequiredCharacterisation() {
      if (eContainerFeatureID() != Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION) return null;
      return (Interface)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInterface_RequiredCharacterisation(Interface newInterface_RequiredCharacterisation, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newInterface_RequiredCharacterisation, Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInterface_RequiredCharacterisation(Interface newInterface_RequiredCharacterisation) {
      if (newInterface_RequiredCharacterisation != eInternalContainer() || (eContainerFeatureID() != Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION && newInterface_RequiredCharacterisation != null)) {
         if (EcoreUtil.isAncestor(this, newInterface_RequiredCharacterisation))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newInterface_RequiredCharacterisation != null)
            msgs = ((InternalEObject)newInterface_RequiredCharacterisation).eInverseAdd(this, Repository_pc_avPackage.INTERFACE__REQUIRED_CHARACTERISATIONS, Interface.class, msgs);
         msgs = basicSetInterface_RequiredCharacterisation(newInterface_RequiredCharacterisation, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION, newInterface_RequiredCharacterisation, newInterface_RequiredCharacterisation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInterface_RequiredCharacterisation((Interface)otherEnd, msgs);
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
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION:
            return basicSetInterface_RequiredCharacterisation(null, msgs);
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
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION:
            return eInternalContainer().eInverseRemove(this, Repository_pc_avPackage.INTERFACE__REQUIRED_CHARACTERISATIONS, Interface.class, msgs);
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
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__TYPE:
            return getType();
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__PARAMETER:
            if (resolve) return getParameter();
            return basicGetParameter();
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION:
            return getInterface_RequiredCharacterisation();
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
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__TYPE:
            setType((VariableCharacterisationType)newValue);
            return;
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__PARAMETER:
            setParameter((Parameter)newValue);
            return;
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION:
            setInterface_RequiredCharacterisation((Interface)newValue);
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
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__PARAMETER:
            setParameter((Parameter)null);
            return;
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION:
            setInterface_RequiredCharacterisation((Interface)null);
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
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__TYPE:
            return type != TYPE_EDEFAULT;
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__PARAMETER:
            return parameter != null;
         case Repository_pc_avPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION:
            return getInterface_RequiredCharacterisation() != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (type: ");
      result.append(type);
      result.append(')');
      return result.toString();
   }

} //RequiredCharacterisationImpl
