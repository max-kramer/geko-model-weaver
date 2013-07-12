/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.AssemblyContext;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.RequiredResourceDelegationConnector;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceRequiredRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Resource Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.impl.RequiredResourceDelegationConnectorImpl#getAssemblyContext__RequiredResourceDelegationConnector <em>Assembly Context Required Resource Delegation Connector</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.impl.RequiredResourceDelegationConnectorImpl#getInnerRequiredRole__RequiredResourceDelegationConnector <em>Inner Required Role Required Resource Delegation Connector</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.impl.RequiredResourceDelegationConnectorImpl#getOuterRequiredRole__RequiredResourceDelegationConnector <em>Outer Required Role Required Resource Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredResourceDelegationConnectorImpl extends DelegationConnectorImpl implements RequiredResourceDelegationConnector {
   /**
    * The cached value of the '{@link #getAssemblyContext__RequiredResourceDelegationConnector() <em>Assembly Context Required Resource Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssemblyContext__RequiredResourceDelegationConnector()
    * @generated
    * @ordered
    */
   protected AssemblyContext assemblyContext__RequiredResourceDelegationConnector;

   /**
    * The cached value of the '{@link #getInnerRequiredRole__RequiredResourceDelegationConnector() <em>Inner Required Role Required Resource Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInnerRequiredRole__RequiredResourceDelegationConnector()
    * @generated
    * @ordered
    */
   protected ResourceRequiredRole innerRequiredRole__RequiredResourceDelegationConnector;

   /**
    * The cached value of the '{@link #getOuterRequiredRole__RequiredResourceDelegationConnector() <em>Outer Required Role Required Resource Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOuterRequiredRole__RequiredResourceDelegationConnector()
    * @generated
    * @ordered
    */
   protected ResourceRequiredRole outerRequiredRole__RequiredResourceDelegationConnector;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RequiredResourceDelegationConnectorImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_avPackage.Literals.REQUIRED_RESOURCE_DELEGATION_CONNECTOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext getAssemblyContext__RequiredResourceDelegationConnector() {
      if (assemblyContext__RequiredResourceDelegationConnector != null && assemblyContext__RequiredResourceDelegationConnector.eIsProxy()) {
         InternalEObject oldAssemblyContext__RequiredResourceDelegationConnector = (InternalEObject)assemblyContext__RequiredResourceDelegationConnector;
         assemblyContext__RequiredResourceDelegationConnector = (AssemblyContext)eResolveProxy(oldAssemblyContext__RequiredResourceDelegationConnector);
         if (assemblyContext__RequiredResourceDelegationConnector != oldAssemblyContext__RequiredResourceDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR, oldAssemblyContext__RequiredResourceDelegationConnector, assemblyContext__RequiredResourceDelegationConnector));
         }
      }
      return assemblyContext__RequiredResourceDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext basicGetAssemblyContext__RequiredResourceDelegationConnector() {
      return assemblyContext__RequiredResourceDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAssemblyContext__RequiredResourceDelegationConnector(AssemblyContext newAssemblyContext__RequiredResourceDelegationConnector) {
      AssemblyContext oldAssemblyContext__RequiredResourceDelegationConnector = assemblyContext__RequiredResourceDelegationConnector;
      assemblyContext__RequiredResourceDelegationConnector = newAssemblyContext__RequiredResourceDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR, oldAssemblyContext__RequiredResourceDelegationConnector, assemblyContext__RequiredResourceDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole getInnerRequiredRole__RequiredResourceDelegationConnector() {
      if (innerRequiredRole__RequiredResourceDelegationConnector != null && innerRequiredRole__RequiredResourceDelegationConnector.eIsProxy()) {
         InternalEObject oldInnerRequiredRole__RequiredResourceDelegationConnector = (InternalEObject)innerRequiredRole__RequiredResourceDelegationConnector;
         innerRequiredRole__RequiredResourceDelegationConnector = (ResourceRequiredRole)eResolveProxy(oldInnerRequiredRole__RequiredResourceDelegationConnector);
         if (innerRequiredRole__RequiredResourceDelegationConnector != oldInnerRequiredRole__RequiredResourceDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR, oldInnerRequiredRole__RequiredResourceDelegationConnector, innerRequiredRole__RequiredResourceDelegationConnector));
         }
      }
      return innerRequiredRole__RequiredResourceDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole basicGetInnerRequiredRole__RequiredResourceDelegationConnector() {
      return innerRequiredRole__RequiredResourceDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInnerRequiredRole__RequiredResourceDelegationConnector(ResourceRequiredRole newInnerRequiredRole__RequiredResourceDelegationConnector) {
      ResourceRequiredRole oldInnerRequiredRole__RequiredResourceDelegationConnector = innerRequiredRole__RequiredResourceDelegationConnector;
      innerRequiredRole__RequiredResourceDelegationConnector = newInnerRequiredRole__RequiredResourceDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR, oldInnerRequiredRole__RequiredResourceDelegationConnector, innerRequiredRole__RequiredResourceDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole getOuterRequiredRole__RequiredResourceDelegationConnector() {
      if (outerRequiredRole__RequiredResourceDelegationConnector != null && outerRequiredRole__RequiredResourceDelegationConnector.eIsProxy()) {
         InternalEObject oldOuterRequiredRole__RequiredResourceDelegationConnector = (InternalEObject)outerRequiredRole__RequiredResourceDelegationConnector;
         outerRequiredRole__RequiredResourceDelegationConnector = (ResourceRequiredRole)eResolveProxy(oldOuterRequiredRole__RequiredResourceDelegationConnector);
         if (outerRequiredRole__RequiredResourceDelegationConnector != oldOuterRequiredRole__RequiredResourceDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR, oldOuterRequiredRole__RequiredResourceDelegationConnector, outerRequiredRole__RequiredResourceDelegationConnector));
         }
      }
      return outerRequiredRole__RequiredResourceDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole basicGetOuterRequiredRole__RequiredResourceDelegationConnector() {
      return outerRequiredRole__RequiredResourceDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOuterRequiredRole__RequiredResourceDelegationConnector(ResourceRequiredRole newOuterRequiredRole__RequiredResourceDelegationConnector) {
      ResourceRequiredRole oldOuterRequiredRole__RequiredResourceDelegationConnector = outerRequiredRole__RequiredResourceDelegationConnector;
      outerRequiredRole__RequiredResourceDelegationConnector = newOuterRequiredRole__RequiredResourceDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR, oldOuterRequiredRole__RequiredResourceDelegationConnector, outerRequiredRole__RequiredResourceDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            if (resolve) return getAssemblyContext__RequiredResourceDelegationConnector();
            return basicGetAssemblyContext__RequiredResourceDelegationConnector();
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            if (resolve) return getInnerRequiredRole__RequiredResourceDelegationConnector();
            return basicGetInnerRequiredRole__RequiredResourceDelegationConnector();
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            if (resolve) return getOuterRequiredRole__RequiredResourceDelegationConnector();
            return basicGetOuterRequiredRole__RequiredResourceDelegationConnector();
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
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            setAssemblyContext__RequiredResourceDelegationConnector((AssemblyContext)newValue);
            return;
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            setInnerRequiredRole__RequiredResourceDelegationConnector((ResourceRequiredRole)newValue);
            return;
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            setOuterRequiredRole__RequiredResourceDelegationConnector((ResourceRequiredRole)newValue);
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
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            setAssemblyContext__RequiredResourceDelegationConnector((AssemblyContext)null);
            return;
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            setInnerRequiredRole__RequiredResourceDelegationConnector((ResourceRequiredRole)null);
            return;
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            setOuterRequiredRole__RequiredResourceDelegationConnector((ResourceRequiredRole)null);
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
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            return assemblyContext__RequiredResourceDelegationConnector != null;
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            return innerRequiredRole__RequiredResourceDelegationConnector != null;
         case Composition_avPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
            return outerRequiredRole__RequiredResourceDelegationConnector != null;
      }
      return super.eIsSet(featureID);
   }

} //RequiredResourceDelegationConnectorImpl
