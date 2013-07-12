/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.impl.EntityImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.CollectionDataType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.DataType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.CollectionDataTypeImpl#getRepository__DataType <em>Repository Data Type</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.CollectionDataTypeImpl#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionDataTypeImpl extends EntityImpl implements CollectionDataType {
   /**
    * The cached value of the '{@link #getInnerType_CollectionDataType() <em>Inner Type Collection Data Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInnerType_CollectionDataType()
    * @generated
    * @ordered
    */
   protected DataType innerType_CollectionDataType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CollectionDataTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_pcPackage.Literals.COLLECTION_DATA_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Repository getRepository__DataType() {
      if (eContainerFeatureID() != Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE) return null;
      return (Repository)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRepository__DataType(Repository newRepository__DataType, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newRepository__DataType, Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRepository__DataType(Repository newRepository__DataType) {
      if (newRepository__DataType != eInternalContainer() || (eContainerFeatureID() != Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE && newRepository__DataType != null)) {
         if (EcoreUtil.isAncestor(this, newRepository__DataType))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newRepository__DataType != null)
            msgs = ((InternalEObject)newRepository__DataType).eInverseAdd(this, Repository_pc_pcPackage.REPOSITORY__DATA_TYPES_REPOSITORY, Repository.class, msgs);
         msgs = basicSetRepository__DataType(newRepository__DataType, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE, newRepository__DataType, newRepository__DataType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType getInnerType_CollectionDataType() {
      if (innerType_CollectionDataType != null && innerType_CollectionDataType.eIsProxy()) {
         InternalEObject oldInnerType_CollectionDataType = (InternalEObject)innerType_CollectionDataType;
         innerType_CollectionDataType = (DataType)eResolveProxy(oldInnerType_CollectionDataType);
         if (innerType_CollectionDataType != oldInnerType_CollectionDataType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_pc_pcPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE, oldInnerType_CollectionDataType, innerType_CollectionDataType));
         }
      }
      return innerType_CollectionDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType basicGetInnerType_CollectionDataType() {
      return innerType_CollectionDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInnerType_CollectionDataType(DataType newInnerType_CollectionDataType) {
      DataType oldInnerType_CollectionDataType = innerType_CollectionDataType;
      innerType_CollectionDataType = newInnerType_CollectionDataType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_pcPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE, oldInnerType_CollectionDataType, innerType_CollectionDataType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetRepository__DataType((Repository)otherEnd, msgs);
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
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
            return basicSetRepository__DataType(null, msgs);
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
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
            return eInternalContainer().eInverseRemove(this, Repository_pc_pcPackage.REPOSITORY__DATA_TYPES_REPOSITORY, Repository.class, msgs);
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
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
            return getRepository__DataType();
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
            if (resolve) return getInnerType_CollectionDataType();
            return basicGetInnerType_CollectionDataType();
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
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
            setRepository__DataType((Repository)newValue);
            return;
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
            setInnerType_CollectionDataType((DataType)newValue);
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
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
            setRepository__DataType((Repository)null);
            return;
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
            setInnerType_CollectionDataType((DataType)null);
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
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
            return getRepository__DataType() != null;
         case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
            return innerType_CollectionDataType != null;
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
      if (baseClass == DataType.class) {
         switch (derivedFeatureID) {
            case Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE: return Repository_pc_pcPackage.DATA_TYPE__REPOSITORY_DATA_TYPE;
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
      if (baseClass == DataType.class) {
         switch (baseFeatureID) {
            case Repository_pc_pcPackage.DATA_TYPE__REPOSITORY_DATA_TYPE: return Repository_pc_pcPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} //CollectionDataTypeImpl
