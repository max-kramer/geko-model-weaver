/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Unit;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitCarryingElement;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceInterfaceProvidingEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceProvidedRole;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.EntityImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceRepository;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceType;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.impl.ResourceTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.impl.ResourceTypeImpl#getUnitSpecification <em>Unit Specification</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.impl.ResourceTypeImpl#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.impl.ResourceTypeImpl#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceTypeImpl extends EntityImpl implements ResourceType {
   /**
    * The default value of the '{@link #getUnitSpecification() <em>Unit Specification</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUnitSpecification()
    * @generated
    * @ordered
    */
   protected static final String UNIT_SPECIFICATION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getUnitSpecification() <em>Unit Specification</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUnitSpecification()
    * @generated
    * @ordered
    */
   protected String unitSpecification = UNIT_SPECIFICATION_EDEFAULT;

   /**
    * The cached value of the '{@link #getResourceProvidedRoles__ResourceInterfaceProvidingEntity() <em>Resource Provided Roles Resource Interface Providing Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceProvidedRoles__ResourceInterfaceProvidingEntity()
    * @generated
    * @ordered
    */
   protected EList<ResourceProvidedRole> resourceProvidedRoles__ResourceInterfaceProvidingEntity;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourcetype_pc_avPackage.Literals.RESOURCE_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unit getUnit() {
      Unit unit = basicGetUnit();
      return unit != null && unit.eIsProxy() ? (Unit)eResolveProxy((InternalEObject)unit) : unit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unit basicGetUnit() {
      // TODO: implement this method to return the 'Unit' reference
      // -> do not perform proxy resolution
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUnit(Unit newUnit) {
      // TODO: implement this method to set the 'Unit' reference
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getUnitSpecification() {
      return unitSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUnitSpecification(String newUnitSpecification) {
      String oldUnitSpecification = unitSpecification;
      unitSpecification = newUnitSpecification;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT_SPECIFICATION, oldUnitSpecification, unitSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceProvidedRole> getResourceProvidedRoles__ResourceInterfaceProvidingEntity() {
      if (resourceProvidedRoles__ResourceInterfaceProvidingEntity == null) {
         resourceProvidedRoles__ResourceInterfaceProvidingEntity = new EObjectContainmentWithInverseEList<ResourceProvidedRole>(ResourceProvidedRole.class, this, Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY, Entity_pc_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE);
      }
      return resourceProvidedRoles__ResourceInterfaceProvidingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRepository getResourceRepository_ResourceType() {
      if (eContainerFeatureID() != Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE) return null;
      return (ResourceRepository)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceRepository_ResourceType(ResourceRepository newResourceRepository_ResourceType, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceRepository_ResourceType, Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceRepository_ResourceType(ResourceRepository newResourceRepository_ResourceType) {
      if (newResourceRepository_ResourceType != eInternalContainer() || (eContainerFeatureID() != Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE && newResourceRepository_ResourceType != null)) {
         if (EcoreUtil.isAncestor(this, newResourceRepository_ResourceType))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceRepository_ResourceType != null)
            msgs = ((InternalEObject)newResourceRepository_ResourceType).eInverseAdd(this, Resourcetype_pc_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY, ResourceRepository.class, msgs);
         msgs = basicSetResourceRepository_ResourceType(newResourceRepository_ResourceType, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE, newResourceRepository_ResourceType, newResourceRepository_ResourceType));
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
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceProvidedRoles__ResourceInterfaceProvidingEntity()).basicAdd(otherEnd, msgs);
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceRepository_ResourceType((ResourceRepository)otherEnd, msgs);
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
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<?>)getResourceProvidedRoles__ResourceInterfaceProvidingEntity()).basicRemove(otherEnd, msgs);
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE:
            return basicSetResourceRepository_ResourceType(null, msgs);
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
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE:
            return eInternalContainer().eInverseRemove(this, Resourcetype_pc_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY, ResourceRepository.class, msgs);
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
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT:
            if (resolve) return getUnit();
            return basicGetUnit();
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT_SPECIFICATION:
            return getUnitSpecification();
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return getResourceProvidedRoles__ResourceInterfaceProvidingEntity();
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE:
            return getResourceRepository_ResourceType();
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
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT:
            setUnit((Unit)newValue);
            return;
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT_SPECIFICATION:
            setUnitSpecification((String)newValue);
            return;
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            getResourceProvidedRoles__ResourceInterfaceProvidingEntity().clear();
            getResourceProvidedRoles__ResourceInterfaceProvidingEntity().addAll((Collection<? extends ResourceProvidedRole>)newValue);
            return;
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE:
            setResourceRepository_ResourceType((ResourceRepository)newValue);
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
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT:
            setUnit((Unit)null);
            return;
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT_SPECIFICATION:
            setUnitSpecification(UNIT_SPECIFICATION_EDEFAULT);
            return;
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            getResourceProvidedRoles__ResourceInterfaceProvidingEntity().clear();
            return;
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE:
            setResourceRepository_ResourceType((ResourceRepository)null);
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
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT:
            return basicGetUnit() != null;
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT_SPECIFICATION:
            return UNIT_SPECIFICATION_EDEFAULT == null ? unitSpecification != null : !UNIT_SPECIFICATION_EDEFAULT.equals(unitSpecification);
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return resourceProvidedRoles__ResourceInterfaceProvidingEntity != null && !resourceProvidedRoles__ResourceInterfaceProvidingEntity.isEmpty();
         case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE:
            return getResourceRepository_ResourceType() != null;
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
      if (baseClass == UnitCarryingElement.class) {
         switch (derivedFeatureID) {
            case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT: return Units_pc_avPackage.UNIT_CARRYING_ELEMENT__UNIT;
            case Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT_SPECIFICATION: return Units_pc_avPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION;
            default: return -1;
         }
      }
      if (baseClass == ResourceInterfaceProvidingEntity.class) {
         switch (derivedFeatureID) {
            case Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY: return Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY;
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
      if (baseClass == UnitCarryingElement.class) {
         switch (baseFeatureID) {
            case Units_pc_avPackage.UNIT_CARRYING_ELEMENT__UNIT: return Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT;
            case Units_pc_avPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION: return Resourcetype_pc_avPackage.RESOURCE_TYPE__UNIT_SPECIFICATION;
            default: return -1;
         }
      }
      if (baseClass == ResourceInterfaceProvidingEntity.class) {
         switch (baseFeatureID) {
            case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY: return Resourcetype_pc_avPackage.RESOURCE_TYPE__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY;
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
      result.append(" (unitSpecification: ");
      result.append(unitSpecification);
      result.append(')');
      return result.toString();
   }

} //ResourceTypeImpl
