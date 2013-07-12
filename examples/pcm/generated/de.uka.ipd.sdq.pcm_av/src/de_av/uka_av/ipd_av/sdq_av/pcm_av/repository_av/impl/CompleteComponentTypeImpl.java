/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.CompleteComponentType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.ProvidesComponentType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.util.Repository_avValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.CompleteComponentTypeImpl#getParentProvidesComponentTypes <em>Parent Provides Component Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompleteComponentTypeImpl extends RepositoryComponentImpl implements CompleteComponentType {
   /**
    * The cached value of the '{@link #getParentProvidesComponentTypes() <em>Parent Provides Component Types</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParentProvidesComponentTypes()
    * @generated
    * @ordered
    */
   protected EList<ProvidesComponentType> parentProvidesComponentTypes;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CompleteComponentTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_avPackage.Literals.COMPLETE_COMPONENT_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ProvidesComponentType> getParentProvidesComponentTypes() {
      if (parentProvidesComponentTypes == null) {
         parentProvidesComponentTypes = new EObjectResolvingEList<ProvidesComponentType>(ProvidesComponentType.class, this, Repository_avPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES);
      }
      return parentProvidesComponentTypes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean AtLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_avValidator.DIAGNOSTIC_SOURCE,
                   Repository_avValidator.COMPLETE_COMPONENT_TYPE__AT_LEAST_ONE_INTERFACE_HAS_TO_BE_PROVIDED_OR_REQUIRED_BY_AUSEFULL_COMPLETE_COMPONENT_TYPE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AtLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean providedInterfacesHaveToConformToProvidedType2(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_avValidator.DIAGNOSTIC_SOURCE,
                   Repository_avValidator.COMPLETE_COMPONENT_TYPE__PROVIDED_INTERFACES_HAVE_TO_CONFORM_TO_PROVIDED_TYPE2,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "providedInterfacesHaveToConformToProvidedType2", EObjectValidator.getObjectLabel(this, context) }),
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
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Repository_avPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES:
            return getParentProvidesComponentTypes();
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
         case Repository_avPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES:
            getParentProvidesComponentTypes().clear();
            getParentProvidesComponentTypes().addAll((Collection<? extends ProvidesComponentType>)newValue);
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
         case Repository_avPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES:
            getParentProvidesComponentTypes().clear();
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
         case Repository_avPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES:
            return parentProvidesComponentTypes != null && !parentProvidesComponentTypes.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //CompleteComponentTypeImpl
