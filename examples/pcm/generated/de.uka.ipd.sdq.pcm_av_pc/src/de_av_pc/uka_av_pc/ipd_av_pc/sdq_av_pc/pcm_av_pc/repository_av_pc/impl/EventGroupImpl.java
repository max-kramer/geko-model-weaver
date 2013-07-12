/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.EventGroup;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.EventType;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.EventGroupImpl#getEventTypes__EventGroup <em>Event Types Event Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventGroupImpl extends InterfaceImpl implements EventGroup {
   /**
    * The cached value of the '{@link #getEventTypes__EventGroup() <em>Event Types Event Group</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEventTypes__EventGroup()
    * @generated
    * @ordered
    */
   protected EList<EventType> eventTypes__EventGroup;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EventGroupImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_av_pcPackage.Literals.EVENT_GROUP;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EventType> getEventTypes__EventGroup() {
      if (eventTypes__EventGroup == null) {
         eventTypes__EventGroup = new EObjectContainmentWithInverseEList<EventType>(EventType.class, this, Repository_av_pcPackage.EVENT_GROUP__EVENT_TYPES_EVENT_GROUP, Repository_av_pcPackage.EVENT_TYPE__EVENT_GROUP_EVENT_TYPE);
      }
      return eventTypes__EventGroup;
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
         case Repository_av_pcPackage.EVENT_GROUP__EVENT_TYPES_EVENT_GROUP:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getEventTypes__EventGroup()).basicAdd(otherEnd, msgs);
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
         case Repository_av_pcPackage.EVENT_GROUP__EVENT_TYPES_EVENT_GROUP:
            return ((InternalEList<?>)getEventTypes__EventGroup()).basicRemove(otherEnd, msgs);
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
         case Repository_av_pcPackage.EVENT_GROUP__EVENT_TYPES_EVENT_GROUP:
            return getEventTypes__EventGroup();
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
         case Repository_av_pcPackage.EVENT_GROUP__EVENT_TYPES_EVENT_GROUP:
            getEventTypes__EventGroup().clear();
            getEventTypes__EventGroup().addAll((Collection<? extends EventType>)newValue);
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
         case Repository_av_pcPackage.EVENT_GROUP__EVENT_TYPES_EVENT_GROUP:
            getEventTypes__EventGroup().clear();
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
         case Repository_av_pcPackage.EVENT_GROUP__EVENT_TYPES_EVENT_GROUP:
            return eventTypes__EventGroup != null && !eventTypes__EventGroup.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //EventGroupImpl
