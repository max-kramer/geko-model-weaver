/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.impl.NamedElementImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.LinkingResource;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.ResourceContainer;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.ResourceEnvironment;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.Resourceenvironment_av_pcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.ResourceEnvironmentImpl#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.ResourceEnvironmentImpl#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceEnvironmentImpl extends NamedElementImpl implements ResourceEnvironment {
   /**
    * The cached value of the '{@link #getLinkingResources__ResourceEnvironment() <em>Linking Resources Resource Environment</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLinkingResources__ResourceEnvironment()
    * @generated
    * @ordered
    */
   protected EList<LinkingResource> linkingResources__ResourceEnvironment;

   /**
    * The cached value of the '{@link #getResourceContainer_ResourceEnvironment() <em>Resource Container Resource Environment</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceContainer_ResourceEnvironment()
    * @generated
    * @ordered
    */
   protected EList<ResourceContainer> resourceContainer_ResourceEnvironment;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceEnvironmentImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourceenvironment_av_pcPackage.Literals.RESOURCE_ENVIRONMENT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<LinkingResource> getLinkingResources__ResourceEnvironment() {
      if (linkingResources__ResourceEnvironment == null) {
         linkingResources__ResourceEnvironment = new EObjectContainmentWithInverseEList<LinkingResource>(LinkingResource.class, this, Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT, Resourceenvironment_av_pcPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE);
      }
      return linkingResources__ResourceEnvironment;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceContainer> getResourceContainer_ResourceEnvironment() {
      if (resourceContainer_ResourceEnvironment == null) {
         resourceContainer_ResourceEnvironment = new EObjectContainmentWithInverseEList<ResourceContainer>(ResourceContainer.class, this, Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER);
      }
      return resourceContainer_ResourceEnvironment;
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
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkingResources__ResourceEnvironment()).basicAdd(otherEnd, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceContainer_ResourceEnvironment()).basicAdd(otherEnd, msgs);
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
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
            return ((InternalEList<?>)getLinkingResources__ResourceEnvironment()).basicRemove(otherEnd, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
            return ((InternalEList<?>)getResourceContainer_ResourceEnvironment()).basicRemove(otherEnd, msgs);
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
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
            return getLinkingResources__ResourceEnvironment();
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
            return getResourceContainer_ResourceEnvironment();
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
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
            getLinkingResources__ResourceEnvironment().clear();
            getLinkingResources__ResourceEnvironment().addAll((Collection<? extends LinkingResource>)newValue);
            return;
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
            getResourceContainer_ResourceEnvironment().clear();
            getResourceContainer_ResourceEnvironment().addAll((Collection<? extends ResourceContainer>)newValue);
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
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
            getLinkingResources__ResourceEnvironment().clear();
            return;
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
            getResourceContainer_ResourceEnvironment().clear();
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
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
            return linkingResources__ResourceEnvironment != null && !linkingResources__ResourceEnvironment.isEmpty();
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
            return resourceContainer_ResourceEnvironment != null && !resourceContainer_ResourceEnvironment.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ResourceEnvironmentImpl
