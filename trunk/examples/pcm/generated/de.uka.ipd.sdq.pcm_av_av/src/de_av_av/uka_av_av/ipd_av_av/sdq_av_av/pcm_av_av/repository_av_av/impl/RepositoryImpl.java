/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.impl.EntityImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.FailureType;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.Reliability_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.DataType;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Interface;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.RepositoryComponent;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.RepositoryImpl#getRepositoryDescription <em>Repository Description</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.RepositoryImpl#getComponents__Repository <em>Components Repository</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.RepositoryImpl#getInterfaces__Repository <em>Interfaces Repository</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.RepositoryImpl#getFailureTypes__Repository <em>Failure Types Repository</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.RepositoryImpl#getDataTypes__Repository <em>Data Types Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends EntityImpl implements Repository {
   /**
    * The default value of the '{@link #getRepositoryDescription() <em>Repository Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRepositoryDescription()
    * @generated
    * @ordered
    */
   protected static final String REPOSITORY_DESCRIPTION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getRepositoryDescription() <em>Repository Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRepositoryDescription()
    * @generated
    * @ordered
    */
   protected String repositoryDescription = REPOSITORY_DESCRIPTION_EDEFAULT;

   /**
    * The cached value of the '{@link #getComponents__Repository() <em>Components Repository</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getComponents__Repository()
    * @generated
    * @ordered
    */
   protected EList<RepositoryComponent> components__Repository;

   /**
    * The cached value of the '{@link #getInterfaces__Repository() <em>Interfaces Repository</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInterfaces__Repository()
    * @generated
    * @ordered
    */
   protected EList<Interface> interfaces__Repository;

   /**
    * The cached value of the '{@link #getFailureTypes__Repository() <em>Failure Types Repository</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureTypes__Repository()
    * @generated
    * @ordered
    */
   protected EList<FailureType> failureTypes__Repository;

   /**
    * The cached value of the '{@link #getDataTypes__Repository() <em>Data Types Repository</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDataTypes__Repository()
    * @generated
    * @ordered
    */
   protected EList<DataType> dataTypes__Repository;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RepositoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_av_avPackage.Literals.REPOSITORY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getRepositoryDescription() {
      return repositoryDescription;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRepositoryDescription(String newRepositoryDescription) {
      String oldRepositoryDescription = repositoryDescription;
      repositoryDescription = newRepositoryDescription;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_av_avPackage.REPOSITORY__REPOSITORY_DESCRIPTION, oldRepositoryDescription, repositoryDescription));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<RepositoryComponent> getComponents__Repository() {
      if (components__Repository == null) {
         components__Repository = new EObjectContainmentWithInverseEList<RepositoryComponent>(RepositoryComponent.class, this, Repository_av_avPackage.REPOSITORY__COMPONENTS_REPOSITORY, Repository_av_avPackage.REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT);
      }
      return components__Repository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Interface> getInterfaces__Repository() {
      if (interfaces__Repository == null) {
         interfaces__Repository = new EObjectContainmentWithInverseEList<Interface>(Interface.class, this, Repository_av_avPackage.REPOSITORY__INTERFACES_REPOSITORY, Repository_av_avPackage.INTERFACE__REPOSITORY_INTERFACE);
      }
      return interfaces__Repository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<FailureType> getFailureTypes__Repository() {
      if (failureTypes__Repository == null) {
         failureTypes__Repository = new EObjectContainmentWithInverseEList<FailureType>(FailureType.class, this, Repository_av_avPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY, Reliability_av_avPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE);
      }
      return failureTypes__Repository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<DataType> getDataTypes__Repository() {
      if (dataTypes__Repository == null) {
         dataTypes__Repository = new EObjectContainmentWithInverseEList<DataType>(DataType.class, this, Repository_av_avPackage.REPOSITORY__DATA_TYPES_REPOSITORY, Repository_av_avPackage.DATA_TYPE__REPOSITORY_DATA_TYPE);
      }
      return dataTypes__Repository;
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
         case Repository_av_avPackage.REPOSITORY__COMPONENTS_REPOSITORY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents__Repository()).basicAdd(otherEnd, msgs);
         case Repository_av_avPackage.REPOSITORY__INTERFACES_REPOSITORY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaces__Repository()).basicAdd(otherEnd, msgs);
         case Repository_av_avPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getFailureTypes__Repository()).basicAdd(otherEnd, msgs);
         case Repository_av_avPackage.REPOSITORY__DATA_TYPES_REPOSITORY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataTypes__Repository()).basicAdd(otherEnd, msgs);
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
         case Repository_av_avPackage.REPOSITORY__COMPONENTS_REPOSITORY:
            return ((InternalEList<?>)getComponents__Repository()).basicRemove(otherEnd, msgs);
         case Repository_av_avPackage.REPOSITORY__INTERFACES_REPOSITORY:
            return ((InternalEList<?>)getInterfaces__Repository()).basicRemove(otherEnd, msgs);
         case Repository_av_avPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY:
            return ((InternalEList<?>)getFailureTypes__Repository()).basicRemove(otherEnd, msgs);
         case Repository_av_avPackage.REPOSITORY__DATA_TYPES_REPOSITORY:
            return ((InternalEList<?>)getDataTypes__Repository()).basicRemove(otherEnd, msgs);
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
         case Repository_av_avPackage.REPOSITORY__REPOSITORY_DESCRIPTION:
            return getRepositoryDescription();
         case Repository_av_avPackage.REPOSITORY__COMPONENTS_REPOSITORY:
            return getComponents__Repository();
         case Repository_av_avPackage.REPOSITORY__INTERFACES_REPOSITORY:
            return getInterfaces__Repository();
         case Repository_av_avPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY:
            return getFailureTypes__Repository();
         case Repository_av_avPackage.REPOSITORY__DATA_TYPES_REPOSITORY:
            return getDataTypes__Repository();
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
         case Repository_av_avPackage.REPOSITORY__REPOSITORY_DESCRIPTION:
            setRepositoryDescription((String)newValue);
            return;
         case Repository_av_avPackage.REPOSITORY__COMPONENTS_REPOSITORY:
            getComponents__Repository().clear();
            getComponents__Repository().addAll((Collection<? extends RepositoryComponent>)newValue);
            return;
         case Repository_av_avPackage.REPOSITORY__INTERFACES_REPOSITORY:
            getInterfaces__Repository().clear();
            getInterfaces__Repository().addAll((Collection<? extends Interface>)newValue);
            return;
         case Repository_av_avPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY:
            getFailureTypes__Repository().clear();
            getFailureTypes__Repository().addAll((Collection<? extends FailureType>)newValue);
            return;
         case Repository_av_avPackage.REPOSITORY__DATA_TYPES_REPOSITORY:
            getDataTypes__Repository().clear();
            getDataTypes__Repository().addAll((Collection<? extends DataType>)newValue);
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
         case Repository_av_avPackage.REPOSITORY__REPOSITORY_DESCRIPTION:
            setRepositoryDescription(REPOSITORY_DESCRIPTION_EDEFAULT);
            return;
         case Repository_av_avPackage.REPOSITORY__COMPONENTS_REPOSITORY:
            getComponents__Repository().clear();
            return;
         case Repository_av_avPackage.REPOSITORY__INTERFACES_REPOSITORY:
            getInterfaces__Repository().clear();
            return;
         case Repository_av_avPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY:
            getFailureTypes__Repository().clear();
            return;
         case Repository_av_avPackage.REPOSITORY__DATA_TYPES_REPOSITORY:
            getDataTypes__Repository().clear();
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
         case Repository_av_avPackage.REPOSITORY__REPOSITORY_DESCRIPTION:
            return REPOSITORY_DESCRIPTION_EDEFAULT == null ? repositoryDescription != null : !REPOSITORY_DESCRIPTION_EDEFAULT.equals(repositoryDescription);
         case Repository_av_avPackage.REPOSITORY__COMPONENTS_REPOSITORY:
            return components__Repository != null && !components__Repository.isEmpty();
         case Repository_av_avPackage.REPOSITORY__INTERFACES_REPOSITORY:
            return interfaces__Repository != null && !interfaces__Repository.isEmpty();
         case Repository_av_avPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY:
            return failureTypes__Repository != null && !failureTypes__Repository.isEmpty();
         case Repository_av_avPackage.REPOSITORY__DATA_TYPES_REPOSITORY:
            return dataTypes__Repository != null && !dataTypes__Repository.isEmpty();
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
      result.append(" (repositoryDescription: ");
      result.append(repositoryDescription);
      result.append(')');
      return result.toString();
   }

} //RepositoryImpl
