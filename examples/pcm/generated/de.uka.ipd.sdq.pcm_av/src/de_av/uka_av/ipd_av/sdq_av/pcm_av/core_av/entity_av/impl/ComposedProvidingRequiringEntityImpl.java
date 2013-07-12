/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.impl.ComposedStructureImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ComposedProvidingRequiringEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.InterfaceProvidingEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.InterfaceProvidingRequiringEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.InterfaceRequiringEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceInterfaceRequiringEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceRequiredRole;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.util.Entity_avValidator;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.ProvidedRole;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.RequiredRole;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Providing Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.ComposedProvidingRequiringEntityImpl#getProvidedRoles_InterfaceProvidingEntity <em>Provided Roles Interface Providing Entity</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.ComposedProvidingRequiringEntityImpl#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.ComposedProvidingRequiringEntityImpl#getRequiredRoles_InterfaceRequiringEntity <em>Required Roles Interface Requiring Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComposedProvidingRequiringEntityImpl extends ComposedStructureImpl implements ComposedProvidingRequiringEntity {
   /**
    * The cached value of the '{@link #getProvidedRoles_InterfaceProvidingEntity() <em>Provided Roles Interface Providing Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProvidedRoles_InterfaceProvidingEntity()
    * @generated
    * @ordered
    */
   protected EList<ProvidedRole> providedRoles_InterfaceProvidingEntity;

   /**
    * The cached value of the '{@link #getResourceRequiredRoles__ResourceInterfaceRequiringEntity() <em>Resource Required Roles Resource Interface Requiring Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceRequiredRoles__ResourceInterfaceRequiringEntity()
    * @generated
    * @ordered
    */
   protected EList<ResourceRequiredRole> resourceRequiredRoles__ResourceInterfaceRequiringEntity;

   /**
    * The cached value of the '{@link #getRequiredRoles_InterfaceRequiringEntity() <em>Required Roles Interface Requiring Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredRoles_InterfaceRequiringEntity()
    * @generated
    * @ordered
    */
   protected EList<RequiredRole> requiredRoles_InterfaceRequiringEntity;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ComposedProvidingRequiringEntityImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Entity_avPackage.Literals.COMPOSED_PROVIDING_REQUIRING_ENTITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ProvidedRole> getProvidedRoles_InterfaceProvidingEntity() {
      if (providedRoles_InterfaceProvidingEntity == null) {
         providedRoles_InterfaceProvidingEntity = new EObjectContainmentWithInverseEList<ProvidedRole>(ProvidedRole.class, this, Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY, Repository_avPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE);
      }
      return providedRoles_InterfaceProvidingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceRequiredRole> getResourceRequiredRoles__ResourceInterfaceRequiringEntity() {
      if (resourceRequiredRoles__ResourceInterfaceRequiringEntity == null) {
         resourceRequiredRoles__ResourceInterfaceRequiringEntity = new EObjectContainmentWithInverseEList<ResourceRequiredRole>(ResourceRequiredRole.class, this, Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY, Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE);
      }
      return resourceRequiredRoles__ResourceInterfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<RequiredRole> getRequiredRoles_InterfaceRequiringEntity() {
      if (requiredRoles_InterfaceRequiringEntity == null) {
         requiredRoles_InterfaceRequiringEntity = new EObjectContainmentWithInverseEList<RequiredRole>(RequiredRole.class, this, Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY, Repository_avPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE);
      }
      return requiredRoles_InterfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean ProvidedRolesMustBeBound(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Entity_avValidator.DIAGNOSTIC_SOURCE,
                   Entity_avValidator.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_MUST_BE_BOUND,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProvidedRolesMustBeBound", EObjectValidator.getObjectLabel(this, context) }),
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
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedRoles_InterfaceProvidingEntity()).basicAdd(otherEnd, msgs);
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceRequiredRoles__ResourceInterfaceRequiringEntity()).basicAdd(otherEnd, msgs);
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredRoles_InterfaceRequiringEntity()).basicAdd(otherEnd, msgs);
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
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<?>)getProvidedRoles_InterfaceProvidingEntity()).basicRemove(otherEnd, msgs);
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<?>)getResourceRequiredRoles__ResourceInterfaceRequiringEntity()).basicRemove(otherEnd, msgs);
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<?>)getRequiredRoles_InterfaceRequiringEntity()).basicRemove(otherEnd, msgs);
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
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return getProvidedRoles_InterfaceProvidingEntity();
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return getResourceRequiredRoles__ResourceInterfaceRequiringEntity();
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return getRequiredRoles_InterfaceRequiringEntity();
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
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            getProvidedRoles_InterfaceProvidingEntity().clear();
            getProvidedRoles_InterfaceProvidingEntity().addAll((Collection<? extends ProvidedRole>)newValue);
            return;
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().clear();
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().addAll((Collection<? extends ResourceRequiredRole>)newValue);
            return;
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            getRequiredRoles_InterfaceRequiringEntity().clear();
            getRequiredRoles_InterfaceRequiringEntity().addAll((Collection<? extends RequiredRole>)newValue);
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
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            getProvidedRoles_InterfaceProvidingEntity().clear();
            return;
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().clear();
            return;
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            getRequiredRoles_InterfaceRequiringEntity().clear();
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
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return providedRoles_InterfaceProvidingEntity != null && !providedRoles_InterfaceProvidingEntity.isEmpty();
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return resourceRequiredRoles__ResourceInterfaceRequiringEntity != null && !resourceRequiredRoles__ResourceInterfaceRequiringEntity.isEmpty();
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return requiredRoles_InterfaceRequiringEntity != null && !requiredRoles_InterfaceRequiringEntity.isEmpty();
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
      if (baseClass == InterfaceProvidingEntity.class) {
         switch (derivedFeatureID) {
            case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY: return Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == ResourceInterfaceRequiringEntity.class) {
         switch (derivedFeatureID) {
            case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY: return Entity_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == InterfaceRequiringEntity.class) {
         switch (derivedFeatureID) {
            case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY: return Entity_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == InterfaceProvidingRequiringEntity.class) {
         switch (derivedFeatureID) {
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
      if (baseClass == InterfaceProvidingEntity.class) {
         switch (baseFeatureID) {
            case Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY: return Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == ResourceInterfaceRequiringEntity.class) {
         switch (baseFeatureID) {
            case Entity_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY: return Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == InterfaceRequiringEntity.class) {
         switch (baseFeatureID) {
            case Entity_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY: return Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == InterfaceProvidingRequiringEntity.class) {
         switch (baseFeatureID) {
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} //ComposedProvidingRequiringEntityImpl
