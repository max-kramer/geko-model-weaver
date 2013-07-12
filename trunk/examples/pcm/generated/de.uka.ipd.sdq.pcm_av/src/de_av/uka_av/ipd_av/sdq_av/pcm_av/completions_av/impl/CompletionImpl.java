/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.Completion;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.Completions_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.ComposedProvidingRequiringEntityImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableUsage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.CompleteComponentType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.ComponentType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.ImplementationComponentType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.RepositoryComponent;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.util.Repository_avValidator;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Completion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl.CompletionImpl#getRepository__RepositoryComponent <em>Repository Repository Component</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl.CompletionImpl#getParentCompleteComponentTypes <em>Parent Complete Component Types</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl.CompletionImpl#getComponentParameterUsage_ImplementationComponentType <em>Component Parameter Usage Implementation Component Type</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl.CompletionImpl#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompletionImpl extends ComposedProvidingRequiringEntityImpl implements Completion {
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
   protected CompletionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Completions_avPackage.Literals.COMPLETION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Repository getRepository__RepositoryComponent() {
      if (eContainerFeatureID() != Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT) return null;
      return (Repository)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRepository__RepositoryComponent(Repository newRepository__RepositoryComponent, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newRepository__RepositoryComponent, Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRepository__RepositoryComponent(Repository newRepository__RepositoryComponent) {
      if (newRepository__RepositoryComponent != eInternalContainer() || (eContainerFeatureID() != Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT && newRepository__RepositoryComponent != null)) {
         if (EcoreUtil.isAncestor(this, newRepository__RepositoryComponent))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newRepository__RepositoryComponent != null)
            msgs = ((InternalEObject)newRepository__RepositoryComponent).eInverseAdd(this, Repository_avPackage.REPOSITORY__COMPONENTS_REPOSITORY, Repository.class, msgs);
         msgs = basicSetRepository__RepositoryComponent(newRepository__RepositoryComponent, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT, newRepository__RepositoryComponent, newRepository__RepositoryComponent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<CompleteComponentType> getParentCompleteComponentTypes() {
      if (parentCompleteComponentTypes == null) {
         parentCompleteComponentTypes = new EObjectResolvingEList<CompleteComponentType>(CompleteComponentType.class, this, Completions_avPackage.COMPLETION__PARENT_COMPLETE_COMPONENT_TYPES);
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
         componentParameterUsage_ImplementationComponentType = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, Completions_avPackage.COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE);
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
         eNotify(new ENotificationImpl(this, Notification.SET, Completions_avPackage.COMPLETION__COMPONENT_TYPE, oldComponentType, componentType));
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
                   Repository_avValidator.DIAGNOSTIC_SOURCE,
                   Repository_avValidator.IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_INTERFACES_HAVE_TO_CONFORM_TO_COMPLETE_TYPE,
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
                   Repository_avValidator.DIAGNOSTIC_SOURCE,
                   Repository_avValidator.IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_INTERFACES_HAVE_TO_CONFORM_TO_COMPLETE_TYPE,
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
                   Repository_avValidator.DIAGNOSTIC_SOURCE,
                   Repository_avValidator.IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_INTERFACE_HAVE_TO_CONFORM_TO_COMPONENT_TYPE,
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
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetRepository__RepositoryComponent((Repository)otherEnd, msgs);
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
         case Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT:
            return basicSetRepository__RepositoryComponent(null, msgs);
         case Completions_avPackage.COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
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
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
      switch (eContainerFeatureID()) {
         case Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT:
            return eInternalContainer().eInverseRemove(this, Repository_avPackage.REPOSITORY__COMPONENTS_REPOSITORY, Repository.class, msgs);
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
         case Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT:
            return getRepository__RepositoryComponent();
         case Completions_avPackage.COMPLETION__PARENT_COMPLETE_COMPONENT_TYPES:
            return getParentCompleteComponentTypes();
         case Completions_avPackage.COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            return getComponentParameterUsage_ImplementationComponentType();
         case Completions_avPackage.COMPLETION__COMPONENT_TYPE:
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
         case Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT:
            setRepository__RepositoryComponent((Repository)newValue);
            return;
         case Completions_avPackage.COMPLETION__PARENT_COMPLETE_COMPONENT_TYPES:
            getParentCompleteComponentTypes().clear();
            getParentCompleteComponentTypes().addAll((Collection<? extends CompleteComponentType>)newValue);
            return;
         case Completions_avPackage.COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            getComponentParameterUsage_ImplementationComponentType().clear();
            getComponentParameterUsage_ImplementationComponentType().addAll((Collection<? extends VariableUsage>)newValue);
            return;
         case Completions_avPackage.COMPLETION__COMPONENT_TYPE:
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
         case Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT:
            setRepository__RepositoryComponent((Repository)null);
            return;
         case Completions_avPackage.COMPLETION__PARENT_COMPLETE_COMPONENT_TYPES:
            getParentCompleteComponentTypes().clear();
            return;
         case Completions_avPackage.COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            getComponentParameterUsage_ImplementationComponentType().clear();
            return;
         case Completions_avPackage.COMPLETION__COMPONENT_TYPE:
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
         case Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT:
            return getRepository__RepositoryComponent() != null;
         case Completions_avPackage.COMPLETION__PARENT_COMPLETE_COMPONENT_TYPES:
            return parentCompleteComponentTypes != null && !parentCompleteComponentTypes.isEmpty();
         case Completions_avPackage.COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
            return componentParameterUsage_ImplementationComponentType != null && !componentParameterUsage_ImplementationComponentType.isEmpty();
         case Completions_avPackage.COMPLETION__COMPONENT_TYPE:
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
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == RepositoryComponent.class) {
         switch (derivedFeatureID) {
            case Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT: return Repository_avPackage.REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;
            default: return -1;
         }
      }
      if (baseClass == ImplementationComponentType.class) {
         switch (derivedFeatureID) {
            case Completions_avPackage.COMPLETION__PARENT_COMPLETE_COMPONENT_TYPES: return Repository_avPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES;
            case Completions_avPackage.COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE: return Repository_avPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;
            case Completions_avPackage.COMPLETION__COMPONENT_TYPE: return Repository_avPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE;
            default: return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == RepositoryComponent.class) {
         switch (baseFeatureID) {
            case Repository_avPackage.REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT: return Completions_avPackage.COMPLETION__REPOSITORY_REPOSITORY_COMPONENT;
            default: return -1;
         }
      }
      if (baseClass == ImplementationComponentType.class) {
         switch (baseFeatureID) {
            case Repository_avPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES: return Completions_avPackage.COMPLETION__PARENT_COMPLETE_COMPONENT_TYPES;
            case Repository_avPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE: return Completions_avPackage.COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;
            case Repository_avPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE: return Completions_avPackage.COMPLETION__COMPONENT_TYPE;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //CompletionImpl
