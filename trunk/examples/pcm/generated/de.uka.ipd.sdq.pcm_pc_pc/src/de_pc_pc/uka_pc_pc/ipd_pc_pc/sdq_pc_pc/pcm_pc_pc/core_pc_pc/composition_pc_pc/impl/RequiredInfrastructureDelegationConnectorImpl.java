/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyContext;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredInfrastructureDelegationConnector;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureRequiredRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Infrastructure Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.impl.RequiredInfrastructureDelegationConnectorImpl#getInnerRequiredRole__RequiredInfrastructureDelegationConnector <em>Inner Required Role Required Infrastructure Delegation Connector</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.impl.RequiredInfrastructureDelegationConnectorImpl#getOuterRequiredRole__RequiredInfrastructureDelegationConnector <em>Outer Required Role Required Infrastructure Delegation Connector</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.impl.RequiredInfrastructureDelegationConnectorImpl#getAssemblyContext__RequiredInfrastructureDelegationConnector <em>Assembly Context Required Infrastructure Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredInfrastructureDelegationConnectorImpl extends DelegationConnectorImpl implements RequiredInfrastructureDelegationConnector {
   /**
    * The cached value of the '{@link #getInnerRequiredRole__RequiredInfrastructureDelegationConnector() <em>Inner Required Role Required Infrastructure Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInnerRequiredRole__RequiredInfrastructureDelegationConnector()
    * @generated
    * @ordered
    */
   protected InfrastructureRequiredRole innerRequiredRole__RequiredInfrastructureDelegationConnector;

   /**
    * The cached value of the '{@link #getOuterRequiredRole__RequiredInfrastructureDelegationConnector() <em>Outer Required Role Required Infrastructure Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOuterRequiredRole__RequiredInfrastructureDelegationConnector()
    * @generated
    * @ordered
    */
   protected InfrastructureRequiredRole outerRequiredRole__RequiredInfrastructureDelegationConnector;

   /**
    * The cached value of the '{@link #getAssemblyContext__RequiredInfrastructureDelegationConnector() <em>Assembly Context Required Infrastructure Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssemblyContext__RequiredInfrastructureDelegationConnector()
    * @generated
    * @ordered
    */
   protected AssemblyContext assemblyContext__RequiredInfrastructureDelegationConnector;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RequiredInfrastructureDelegationConnectorImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_pc_pcPackage.Literals.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole getInnerRequiredRole__RequiredInfrastructureDelegationConnector() {
      if (innerRequiredRole__RequiredInfrastructureDelegationConnector != null && innerRequiredRole__RequiredInfrastructureDelegationConnector.eIsProxy()) {
         InternalEObject oldInnerRequiredRole__RequiredInfrastructureDelegationConnector = (InternalEObject)innerRequiredRole__RequiredInfrastructureDelegationConnector;
         innerRequiredRole__RequiredInfrastructureDelegationConnector = (InfrastructureRequiredRole)eResolveProxy(oldInnerRequiredRole__RequiredInfrastructureDelegationConnector);
         if (innerRequiredRole__RequiredInfrastructureDelegationConnector != oldInnerRequiredRole__RequiredInfrastructureDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR, oldInnerRequiredRole__RequiredInfrastructureDelegationConnector, innerRequiredRole__RequiredInfrastructureDelegationConnector));
         }
      }
      return innerRequiredRole__RequiredInfrastructureDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole basicGetInnerRequiredRole__RequiredInfrastructureDelegationConnector() {
      return innerRequiredRole__RequiredInfrastructureDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInnerRequiredRole__RequiredInfrastructureDelegationConnector(InfrastructureRequiredRole newInnerRequiredRole__RequiredInfrastructureDelegationConnector) {
      InfrastructureRequiredRole oldInnerRequiredRole__RequiredInfrastructureDelegationConnector = innerRequiredRole__RequiredInfrastructureDelegationConnector;
      innerRequiredRole__RequiredInfrastructureDelegationConnector = newInnerRequiredRole__RequiredInfrastructureDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR, oldInnerRequiredRole__RequiredInfrastructureDelegationConnector, innerRequiredRole__RequiredInfrastructureDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole getOuterRequiredRole__RequiredInfrastructureDelegationConnector() {
      if (outerRequiredRole__RequiredInfrastructureDelegationConnector != null && outerRequiredRole__RequiredInfrastructureDelegationConnector.eIsProxy()) {
         InternalEObject oldOuterRequiredRole__RequiredInfrastructureDelegationConnector = (InternalEObject)outerRequiredRole__RequiredInfrastructureDelegationConnector;
         outerRequiredRole__RequiredInfrastructureDelegationConnector = (InfrastructureRequiredRole)eResolveProxy(oldOuterRequiredRole__RequiredInfrastructureDelegationConnector);
         if (outerRequiredRole__RequiredInfrastructureDelegationConnector != oldOuterRequiredRole__RequiredInfrastructureDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR, oldOuterRequiredRole__RequiredInfrastructureDelegationConnector, outerRequiredRole__RequiredInfrastructureDelegationConnector));
         }
      }
      return outerRequiredRole__RequiredInfrastructureDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole basicGetOuterRequiredRole__RequiredInfrastructureDelegationConnector() {
      return outerRequiredRole__RequiredInfrastructureDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOuterRequiredRole__RequiredInfrastructureDelegationConnector(InfrastructureRequiredRole newOuterRequiredRole__RequiredInfrastructureDelegationConnector) {
      InfrastructureRequiredRole oldOuterRequiredRole__RequiredInfrastructureDelegationConnector = outerRequiredRole__RequiredInfrastructureDelegationConnector;
      outerRequiredRole__RequiredInfrastructureDelegationConnector = newOuterRequiredRole__RequiredInfrastructureDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR, oldOuterRequiredRole__RequiredInfrastructureDelegationConnector, outerRequiredRole__RequiredInfrastructureDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext getAssemblyContext__RequiredInfrastructureDelegationConnector() {
      if (assemblyContext__RequiredInfrastructureDelegationConnector != null && assemblyContext__RequiredInfrastructureDelegationConnector.eIsProxy()) {
         InternalEObject oldAssemblyContext__RequiredInfrastructureDelegationConnector = (InternalEObject)assemblyContext__RequiredInfrastructureDelegationConnector;
         assemblyContext__RequiredInfrastructureDelegationConnector = (AssemblyContext)eResolveProxy(oldAssemblyContext__RequiredInfrastructureDelegationConnector);
         if (assemblyContext__RequiredInfrastructureDelegationConnector != oldAssemblyContext__RequiredInfrastructureDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR, oldAssemblyContext__RequiredInfrastructureDelegationConnector, assemblyContext__RequiredInfrastructureDelegationConnector));
         }
      }
      return assemblyContext__RequiredInfrastructureDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext basicGetAssemblyContext__RequiredInfrastructureDelegationConnector() {
      return assemblyContext__RequiredInfrastructureDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAssemblyContext__RequiredInfrastructureDelegationConnector(AssemblyContext newAssemblyContext__RequiredInfrastructureDelegationConnector) {
      AssemblyContext oldAssemblyContext__RequiredInfrastructureDelegationConnector = assemblyContext__RequiredInfrastructureDelegationConnector;
      assemblyContext__RequiredInfrastructureDelegationConnector = newAssemblyContext__RequiredInfrastructureDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR, oldAssemblyContext__RequiredInfrastructureDelegationConnector, assemblyContext__RequiredInfrastructureDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            if (resolve) return getInnerRequiredRole__RequiredInfrastructureDelegationConnector();
            return basicGetInnerRequiredRole__RequiredInfrastructureDelegationConnector();
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            if (resolve) return getOuterRequiredRole__RequiredInfrastructureDelegationConnector();
            return basicGetOuterRequiredRole__RequiredInfrastructureDelegationConnector();
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            if (resolve) return getAssemblyContext__RequiredInfrastructureDelegationConnector();
            return basicGetAssemblyContext__RequiredInfrastructureDelegationConnector();
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
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            setInnerRequiredRole__RequiredInfrastructureDelegationConnector((InfrastructureRequiredRole)newValue);
            return;
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            setOuterRequiredRole__RequiredInfrastructureDelegationConnector((InfrastructureRequiredRole)newValue);
            return;
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            setAssemblyContext__RequiredInfrastructureDelegationConnector((AssemblyContext)newValue);
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
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            setInnerRequiredRole__RequiredInfrastructureDelegationConnector((InfrastructureRequiredRole)null);
            return;
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            setOuterRequiredRole__RequiredInfrastructureDelegationConnector((InfrastructureRequiredRole)null);
            return;
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            setAssemblyContext__RequiredInfrastructureDelegationConnector((AssemblyContext)null);
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
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            return innerRequiredRole__RequiredInfrastructureDelegationConnector != null;
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            return outerRequiredRole__RequiredInfrastructureDelegationConnector != null;
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
            return assemblyContext__RequiredInfrastructureDelegationConnector != null;
      }
      return super.eIsSet(featureID);
   }

} //RequiredInfrastructureDelegationConnectorImpl
