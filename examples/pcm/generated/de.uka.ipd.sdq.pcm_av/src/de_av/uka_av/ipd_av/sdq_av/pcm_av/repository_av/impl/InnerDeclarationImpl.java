/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.NamedElementImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.CompositeDataType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.DataType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.InnerDeclaration;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.InnerDeclarationImpl#getDatatype_InnerDeclaration <em>Datatype Inner Declaration</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.InnerDeclarationImpl#getCompositeDataType_InnerDeclaration <em>Composite Data Type Inner Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InnerDeclarationImpl extends NamedElementImpl implements InnerDeclaration {
   /**
    * The cached value of the '{@link #getDatatype_InnerDeclaration() <em>Datatype Inner Declaration</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDatatype_InnerDeclaration()
    * @generated
    * @ordered
    */
   protected DataType datatype_InnerDeclaration;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InnerDeclarationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_avPackage.Literals.INNER_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType getDatatype_InnerDeclaration() {
      if (datatype_InnerDeclaration != null && datatype_InnerDeclaration.eIsProxy()) {
         InternalEObject oldDatatype_InnerDeclaration = (InternalEObject)datatype_InnerDeclaration;
         datatype_InnerDeclaration = (DataType)eResolveProxy(oldDatatype_InnerDeclaration);
         if (datatype_InnerDeclaration != oldDatatype_InnerDeclaration) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_avPackage.INNER_DECLARATION__DATATYPE_INNER_DECLARATION, oldDatatype_InnerDeclaration, datatype_InnerDeclaration));
         }
      }
      return datatype_InnerDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType basicGetDatatype_InnerDeclaration() {
      return datatype_InnerDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDatatype_InnerDeclaration(DataType newDatatype_InnerDeclaration) {
      DataType oldDatatype_InnerDeclaration = datatype_InnerDeclaration;
      datatype_InnerDeclaration = newDatatype_InnerDeclaration;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.INNER_DECLARATION__DATATYPE_INNER_DECLARATION, oldDatatype_InnerDeclaration, datatype_InnerDeclaration));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompositeDataType getCompositeDataType_InnerDeclaration() {
      if (eContainerFeatureID() != Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION) return null;
      return (CompositeDataType)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetCompositeDataType_InnerDeclaration(CompositeDataType newCompositeDataType_InnerDeclaration, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newCompositeDataType_InnerDeclaration, Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCompositeDataType_InnerDeclaration(CompositeDataType newCompositeDataType_InnerDeclaration) {
      if (newCompositeDataType_InnerDeclaration != eInternalContainer() || (eContainerFeatureID() != Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION && newCompositeDataType_InnerDeclaration != null)) {
         if (EcoreUtil.isAncestor(this, newCompositeDataType_InnerDeclaration))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newCompositeDataType_InnerDeclaration != null)
            msgs = ((InternalEObject)newCompositeDataType_InnerDeclaration).eInverseAdd(this, Repository_avPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION_COMPOSITE_DATA_TYPE, CompositeDataType.class, msgs);
         msgs = basicSetCompositeDataType_InnerDeclaration(newCompositeDataType_InnerDeclaration, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION, newCompositeDataType_InnerDeclaration, newCompositeDataType_InnerDeclaration));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetCompositeDataType_InnerDeclaration((CompositeDataType)otherEnd, msgs);
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
         case Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION:
            return basicSetCompositeDataType_InnerDeclaration(null, msgs);
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
         case Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION:
            return eInternalContainer().eInverseRemove(this, Repository_avPackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION_COMPOSITE_DATA_TYPE, CompositeDataType.class, msgs);
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
         case Repository_avPackage.INNER_DECLARATION__DATATYPE_INNER_DECLARATION:
            if (resolve) return getDatatype_InnerDeclaration();
            return basicGetDatatype_InnerDeclaration();
         case Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION:
            return getCompositeDataType_InnerDeclaration();
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
         case Repository_avPackage.INNER_DECLARATION__DATATYPE_INNER_DECLARATION:
            setDatatype_InnerDeclaration((DataType)newValue);
            return;
         case Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION:
            setCompositeDataType_InnerDeclaration((CompositeDataType)newValue);
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
         case Repository_avPackage.INNER_DECLARATION__DATATYPE_INNER_DECLARATION:
            setDatatype_InnerDeclaration((DataType)null);
            return;
         case Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION:
            setCompositeDataType_InnerDeclaration((CompositeDataType)null);
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
         case Repository_avPackage.INNER_DECLARATION__DATATYPE_INNER_DECLARATION:
            return datatype_InnerDeclaration != null;
         case Repository_avPackage.INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION:
            return getCompositeDataType_InnerDeclaration() != null;
      }
      return super.eIsSet(featureID);
   }

} //InnerDeclarationImpl
