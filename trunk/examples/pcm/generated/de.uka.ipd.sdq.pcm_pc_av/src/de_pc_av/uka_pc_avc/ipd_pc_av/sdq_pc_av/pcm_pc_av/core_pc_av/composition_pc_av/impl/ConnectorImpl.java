/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ComposedStructure;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Connector;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.impl.ConnectorImpl#getParentStructure__Connector <em>Parent Structure Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EntityImpl implements Connector {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ConnectorImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_pc_avPackage.Literals.CONNECTOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComposedStructure getParentStructure__Connector() {
      if (eContainerFeatureID() != Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR) return null;
      return (ComposedStructure)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParentStructure__Connector(ComposedStructure newParentStructure__Connector, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newParentStructure__Connector, Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParentStructure__Connector(ComposedStructure newParentStructure__Connector) {
      if (newParentStructure__Connector != eInternalContainer() || (eContainerFeatureID() != Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR && newParentStructure__Connector != null)) {
         if (EcoreUtil.isAncestor(this, newParentStructure__Connector))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParentStructure__Connector != null)
            msgs = ((InternalEObject)newParentStructure__Connector).eInverseAdd(this, Composition_pc_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
         msgs = basicSetParentStructure__Connector(newParentStructure__Connector, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR, newParentStructure__Connector, newParentStructure__Connector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentStructure__Connector((ComposedStructure)otherEnd, msgs);
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
         case Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
            return basicSetParentStructure__Connector(null, msgs);
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
         case Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
            return eInternalContainer().eInverseRemove(this, Composition_pc_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
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
         case Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
            return getParentStructure__Connector();
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
         case Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
            setParentStructure__Connector((ComposedStructure)newValue);
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
         case Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
            setParentStructure__Connector((ComposedStructure)null);
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
         case Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
            return getParentStructure__Connector() != null;
      }
      return super.eIsSet(featureID);
   }

} //ConnectorImpl
