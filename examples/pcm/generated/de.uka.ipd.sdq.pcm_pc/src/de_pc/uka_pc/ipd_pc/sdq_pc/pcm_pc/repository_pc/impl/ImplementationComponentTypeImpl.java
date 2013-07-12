/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.CompleteComponentType;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ComponentType;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ImplementationComponentType;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.util.Repository_pcValidator;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.impl.ImplementationComponentTypeImpl#getParentCompleteComponentTypes <em>Parent Complete Component Types</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.impl.ImplementationComponentTypeImpl#getComponentParameterUsage_ImplementationComponentType <em>Component Parameter Usage Implementation Component Type</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.impl.ImplementationComponentTypeImpl#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationComponentTypeImpl extends RepositoryComponentImpl implements ImplementationComponentType {
   /**
    * The cached value of the '{@link #getParentCompleteComponentTypes() <em>Parent Complete Component Types</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParentCompleteComponentTypes()
    * @generated
    * @ordered
    */
   protected EList<CompleteComponentType> parentCompleteComponentTypes;

   /**
    * The cached value of the '{@link #getComponentParameterUsage_ImplementationComponentType() <em>Component Parameter Usage Implementation Component Type</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getComponentParameterUsage_ImplementationComponentType()
    * @generated
    * @ordered
    */
   protected EList<VariableUsage> componentParameterUsage_ImplementationComponentType;

   /**
    * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getComponentType()
    * @generated
    * @ordered
    */
   protected static final ComponentType COMPONENT_TYPE_EDEFAULT = ComponentType.BUSINESS_COMPONENT;

   /**
    * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getComponentType()
    * @generated
    * @ordered
    */
   protected ComponentType componentType = COMPONENT_TYPE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ImplementationComponentTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pcPackage.Literals.IMPLEMENTATION_COMPONENT_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<CompleteComponentType> getParentCompleteComponentTypes() {
      if (parentCompleteComponentTypes == null) {
         parentCompleteComponentTypes = new EObjectResolvingEList<CompleteComponentType>(CompleteComponentType.class, this, Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES);
      }
      return parentCompleteComponentTypes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<VariableUsage> getComponentParameterUsage_ImplementationComponentType() {
      if (componentParameterUsage_ImplementationComponentType == null) {
         componentParameterUsage_ImplementationComponentType = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE);
      }
      return componentParameterUsage_ImplementationComponentType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComponentType getComponentType() {
      return componentType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setComponentType(ComponentType newComponentType) {
      ComponentType oldComponentType = componentType;
      componentType = newComponentType == null ? COMPONENT_TYPE_EDEFAULT : newComponentType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE, oldComponentType, componentType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean RequiredInterfacesHaveToConformToCompleteType(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_pcValidator.DIAGNOSTIC_SOURCE,
                   Repository_pcValidator.IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_INTERFACES_HAVE_TO_CONFORM_TO_COMPLETE_TYPE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RequiredInterfacesHaveToConformToCompleteType", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean providedInterfacesHaveToConformToCompleteType(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_pcValidator.DIAGNOSTIC_SOURCE,
                   Repository_pcValidator.IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_INTERFACES_HAVE_TO_CONFORM_TO_COMPLETE_TYPE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "providedInterfacesHaveToConformToCompleteType", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean ProvidedInterfaceHaveToConformToComponentType(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_pcValidator.DIAGNOSTIC_SOURCE,
                   Repository_pcValidator.IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_INTERFACE_HAVE_TO_CONFORM_TO_COMPONENT_TYPE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProvidedInterfaceHaveToConformToComponentType", EObjectValidator.getObjectLabel(this, context) }),
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
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            return ((InternalEList<?>)getComponentParameterUsage_ImplementationComponentType()).basicRemove(otherEnd, msgs);
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
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES:
            return getParentCompleteComponentTypes();
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            return getComponentParameterUsage_ImplementationComponentType();
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE:
            return getComponentType();
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
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES:
            getParentCompleteComponentTypes().clear();
            getParentCompleteComponentTypes().addAll((Collection<? extends CompleteComponentType>)newValue);
            return;
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            getComponentParameterUsage_ImplementationComponentType().clear();
            getComponentParameterUsage_ImplementationComponentType().addAll((Collection<? extends VariableUsage>)newValue);
            return;
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE:
            setComponentType((ComponentType)newValue);
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
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES:
            getParentCompleteComponentTypes().clear();
            return;
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            getComponentParameterUsage_ImplementationComponentType().clear();
            return;
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE:
            setComponentType(COMPONENT_TYPE_EDEFAULT);
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
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES:
            return parentCompleteComponentTypes != null && !parentCompleteComponentTypes.isEmpty();
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            return componentParameterUsage_ImplementationComponentType != null && !componentParameterUsage_ImplementationComponentType.isEmpty();
         case Repository_pcPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE:
            return componentType != COMPONENT_TYPE_EDEFAULT;
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
      result.append(" (componentType: ");
      result.append(componentType);
      result.append(')');
      return result.toString();
   }

} //ImplementationComponentTypeImpl
