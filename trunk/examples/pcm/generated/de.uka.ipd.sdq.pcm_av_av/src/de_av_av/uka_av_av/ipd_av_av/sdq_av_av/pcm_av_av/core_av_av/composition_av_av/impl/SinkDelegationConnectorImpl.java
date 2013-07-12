/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.SinkDelegationConnector;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.SinkRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sink Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl.SinkDelegationConnectorImpl#getAssemblyContext__SinkDelegationConnector <em>Assembly Context Sink Delegation Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl.SinkDelegationConnectorImpl#getInnerSinkRole__SinkRole <em>Inner Sink Role Sink Role</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl.SinkDelegationConnectorImpl#getOuterSinkRole__SinkRole <em>Outer Sink Role Sink Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SinkDelegationConnectorImpl extends DelegationConnectorImpl implements SinkDelegationConnector {
   /**
    * The cached value of the '{@link #getAssemblyContext__SinkDelegationConnector() <em>Assembly Context Sink Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssemblyContext__SinkDelegationConnector()
    * @generated
    * @ordered
    */
   protected AssemblyContext assemblyContext__SinkDelegationConnector;

   /**
    * The cached value of the '{@link #getInnerSinkRole__SinkRole() <em>Inner Sink Role Sink Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInnerSinkRole__SinkRole()
    * @generated
    * @ordered
    */
   protected SinkRole innerSinkRole__SinkRole;

   /**
    * The cached value of the '{@link #getOuterSinkRole__SinkRole() <em>Outer Sink Role Sink Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOuterSinkRole__SinkRole()
    * @generated
    * @ordered
    */
   protected SinkRole outerSinkRole__SinkRole;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SinkDelegationConnectorImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_av_avPackage.Literals.SINK_DELEGATION_CONNECTOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext getAssemblyContext__SinkDelegationConnector() {
      if (assemblyContext__SinkDelegationConnector != null && assemblyContext__SinkDelegationConnector.eIsProxy()) {
         InternalEObject oldAssemblyContext__SinkDelegationConnector = (InternalEObject)assemblyContext__SinkDelegationConnector;
         assemblyContext__SinkDelegationConnector = (AssemblyContext)eResolveProxy(oldAssemblyContext__SinkDelegationConnector);
         if (assemblyContext__SinkDelegationConnector != oldAssemblyContext__SinkDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR, oldAssemblyContext__SinkDelegationConnector, assemblyContext__SinkDelegationConnector));
         }
      }
      return assemblyContext__SinkDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext basicGetAssemblyContext__SinkDelegationConnector() {
      return assemblyContext__SinkDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAssemblyContext__SinkDelegationConnector(AssemblyContext newAssemblyContext__SinkDelegationConnector) {
      AssemblyContext oldAssemblyContext__SinkDelegationConnector = assemblyContext__SinkDelegationConnector;
      assemblyContext__SinkDelegationConnector = newAssemblyContext__SinkDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR, oldAssemblyContext__SinkDelegationConnector, assemblyContext__SinkDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SinkRole getInnerSinkRole__SinkRole() {
      if (innerSinkRole__SinkRole != null && innerSinkRole__SinkRole.eIsProxy()) {
         InternalEObject oldInnerSinkRole__SinkRole = (InternalEObject)innerSinkRole__SinkRole;
         innerSinkRole__SinkRole = (SinkRole)eResolveProxy(oldInnerSinkRole__SinkRole);
         if (innerSinkRole__SinkRole != oldInnerSinkRole__SinkRole) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE, oldInnerSinkRole__SinkRole, innerSinkRole__SinkRole));
         }
      }
      return innerSinkRole__SinkRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SinkRole basicGetInnerSinkRole__SinkRole() {
      return innerSinkRole__SinkRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInnerSinkRole__SinkRole(SinkRole newInnerSinkRole__SinkRole) {
      SinkRole oldInnerSinkRole__SinkRole = innerSinkRole__SinkRole;
      innerSinkRole__SinkRole = newInnerSinkRole__SinkRole;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE, oldInnerSinkRole__SinkRole, innerSinkRole__SinkRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SinkRole getOuterSinkRole__SinkRole() {
      if (outerSinkRole__SinkRole != null && outerSinkRole__SinkRole.eIsProxy()) {
         InternalEObject oldOuterSinkRole__SinkRole = (InternalEObject)outerSinkRole__SinkRole;
         outerSinkRole__SinkRole = (SinkRole)eResolveProxy(oldOuterSinkRole__SinkRole);
         if (outerSinkRole__SinkRole != oldOuterSinkRole__SinkRole) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE, oldOuterSinkRole__SinkRole, outerSinkRole__SinkRole));
         }
      }
      return outerSinkRole__SinkRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SinkRole basicGetOuterSinkRole__SinkRole() {
      return outerSinkRole__SinkRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOuterSinkRole__SinkRole(SinkRole newOuterSinkRole__SinkRole) {
      SinkRole oldOuterSinkRole__SinkRole = outerSinkRole__SinkRole;
      outerSinkRole__SinkRole = newOuterSinkRole__SinkRole;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE, oldOuterSinkRole__SinkRole, outerSinkRole__SinkRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR:
            if (resolve) return getAssemblyContext__SinkDelegationConnector();
            return basicGetAssemblyContext__SinkDelegationConnector();
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE:
            if (resolve) return getInnerSinkRole__SinkRole();
            return basicGetInnerSinkRole__SinkRole();
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE:
            if (resolve) return getOuterSinkRole__SinkRole();
            return basicGetOuterSinkRole__SinkRole();
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
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR:
            setAssemblyContext__SinkDelegationConnector((AssemblyContext)newValue);
            return;
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE:
            setInnerSinkRole__SinkRole((SinkRole)newValue);
            return;
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE:
            setOuterSinkRole__SinkRole((SinkRole)newValue);
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
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR:
            setAssemblyContext__SinkDelegationConnector((AssemblyContext)null);
            return;
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE:
            setInnerSinkRole__SinkRole((SinkRole)null);
            return;
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE:
            setOuterSinkRole__SinkRole((SinkRole)null);
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
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR:
            return assemblyContext__SinkDelegationConnector != null;
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE:
            return innerSinkRole__SinkRole != null;
         case Composition_av_avPackage.SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE:
            return outerSinkRole__SinkRole != null;
      }
      return super.eIsSet(featureID);
   }

} //SinkDelegationConnectorImpl
