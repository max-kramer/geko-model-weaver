/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.CharacterisedVariable;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.Parameter_av_avPackage;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableCharacterisationType;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characterised Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.impl.CharacterisedVariableImpl#getCharacterisationType <em>Characterisation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterisedVariableImpl extends VariableImpl implements CharacterisedVariable {
   /**
    * The default value of the '{@link #getCharacterisationType() <em>Characterisation Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCharacterisationType()
    * @generated
    * @ordered
    */
   protected static final VariableCharacterisationType CHARACTERISATION_TYPE_EDEFAULT = VariableCharacterisationType.STRUCTURE;

   /**
    * The cached value of the '{@link #getCharacterisationType() <em>Characterisation Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCharacterisationType()
    * @generated
    * @ordered
    */
   protected VariableCharacterisationType characterisationType = CHARACTERISATION_TYPE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CharacterisedVariableImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Parameter_av_avPackage.Literals.CHARACTERISED_VARIABLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableCharacterisationType getCharacterisationType() {
      return characterisationType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCharacterisationType(VariableCharacterisationType newCharacterisationType) {
      VariableCharacterisationType oldCharacterisationType = characterisationType;
      characterisationType = newCharacterisationType == null ? CHARACTERISATION_TYPE_EDEFAULT : newCharacterisationType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Parameter_av_avPackage.CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE, oldCharacterisationType, characterisationType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Parameter_av_avPackage.CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE:
            return getCharacterisationType();
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
         case Parameter_av_avPackage.CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE:
            setCharacterisationType((VariableCharacterisationType)newValue);
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
         case Parameter_av_avPackage.CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE:
            setCharacterisationType(CHARACTERISATION_TYPE_EDEFAULT);
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
         case Parameter_av_avPackage.CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE:
            return characterisationType != CHARACTERISATION_TYPE_EDEFAULT;
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
      result.append(" (characterisationType: ");
      result.append(characterisationType);
      result.append(')');
      return result.toString();
   }

} //CharacterisedVariableImpl
