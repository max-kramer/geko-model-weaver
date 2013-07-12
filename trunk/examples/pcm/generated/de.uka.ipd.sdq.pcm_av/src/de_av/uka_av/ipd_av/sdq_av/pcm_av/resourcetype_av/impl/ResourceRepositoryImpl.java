/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceInterface;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceRepository;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.SchedulingPolicy;

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
 * An implementation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.impl.ResourceRepositoryImpl#getResourceInterfaces__ResourceRepository <em>Resource Interfaces Resource Repository</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.impl.ResourceRepositoryImpl#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.impl.ResourceRepositoryImpl#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRepositoryImpl extends EObjectImpl implements ResourceRepository {
   /**
    * The cached value of the '{@link #getResourceInterfaces__ResourceRepository() <em>Resource Interfaces Resource Repository</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceInterfaces__ResourceRepository()
    * @generated
    * @ordered
    */
   protected EList<ResourceInterface> resourceInterfaces__ResourceRepository;

   /**
    * The cached value of the '{@link #getSchedulingPolicies__ResourceRepository() <em>Scheduling Policies Resource Repository</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSchedulingPolicies__ResourceRepository()
    * @generated
    * @ordered
    */
   protected EList<SchedulingPolicy> schedulingPolicies__ResourceRepository;

   /**
    * The cached value of the '{@link #getAvailableResourceTypes_ResourceRepository() <em>Available Resource Types Resource Repository</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAvailableResourceTypes_ResourceRepository()
    * @generated
    * @ordered
    */
   protected EList<ResourceType> availableResourceTypes_ResourceRepository;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceRepositoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourcetype_avPackage.Literals.RESOURCE_REPOSITORY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceInterface> getResourceInterfaces__ResourceRepository() {
      if (resourceInterfaces__ResourceRepository == null) {
         resourceInterfaces__ResourceRepository = new EObjectContainmentWithInverseEList<ResourceInterface>(ResourceInterface.class, this, Resourcetype_avPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY, Resourcetype_avPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE);
      }
      return resourceInterfaces__ResourceRepository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<SchedulingPolicy> getSchedulingPolicies__ResourceRepository() {
      if (schedulingPolicies__ResourceRepository == null) {
         schedulingPolicies__ResourceRepository = new EObjectContainmentWithInverseEList<SchedulingPolicy>(SchedulingPolicy.class, this, Resourcetype_avPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY, Resourcetype_avPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY);
      }
      return schedulingPolicies__ResourceRepository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceType> getAvailableResourceTypes_ResourceRepository() {
      if (availableResourceTypes_ResourceRepository == null) {
         availableResourceTypes_ResourceRepository = new EObjectContainmentWithInverseEList<ResourceType>(ResourceType.class, this, Resourcetype_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY, Resourcetype_avPackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE);
      }
      return availableResourceTypes_ResourceRepository;
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
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceInterfaces__ResourceRepository()).basicAdd(otherEnd, msgs);
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulingPolicies__ResourceRepository()).basicAdd(otherEnd, msgs);
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailableResourceTypes_ResourceRepository()).basicAdd(otherEnd, msgs);
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
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY:
            return ((InternalEList<?>)getResourceInterfaces__ResourceRepository()).basicRemove(otherEnd, msgs);
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
            return ((InternalEList<?>)getSchedulingPolicies__ResourceRepository()).basicRemove(otherEnd, msgs);
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
            return ((InternalEList<?>)getAvailableResourceTypes_ResourceRepository()).basicRemove(otherEnd, msgs);
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
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY:
            return getResourceInterfaces__ResourceRepository();
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
            return getSchedulingPolicies__ResourceRepository();
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
            return getAvailableResourceTypes_ResourceRepository();
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
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY:
            getResourceInterfaces__ResourceRepository().clear();
            getResourceInterfaces__ResourceRepository().addAll((Collection<? extends ResourceInterface>)newValue);
            return;
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
            getSchedulingPolicies__ResourceRepository().clear();
            getSchedulingPolicies__ResourceRepository().addAll((Collection<? extends SchedulingPolicy>)newValue);
            return;
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
            getAvailableResourceTypes_ResourceRepository().clear();
            getAvailableResourceTypes_ResourceRepository().addAll((Collection<? extends ResourceType>)newValue);
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
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY:
            getResourceInterfaces__ResourceRepository().clear();
            return;
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
            getSchedulingPolicies__ResourceRepository().clear();
            return;
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
            getAvailableResourceTypes_ResourceRepository().clear();
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
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY:
            return resourceInterfaces__ResourceRepository != null && !resourceInterfaces__ResourceRepository.isEmpty();
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
            return schedulingPolicies__ResourceRepository != null && !schedulingPolicies__ResourceRepository.isEmpty();
         case Resourcetype_avPackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
            return availableResourceTypes_ResourceRepository != null && !availableResourceTypes_ResourceRepository.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ResourceRepositoryImpl
