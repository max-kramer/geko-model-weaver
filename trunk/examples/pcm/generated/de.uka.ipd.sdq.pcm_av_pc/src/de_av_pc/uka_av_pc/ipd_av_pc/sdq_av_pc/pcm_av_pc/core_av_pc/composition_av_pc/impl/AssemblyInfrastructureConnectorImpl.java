/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.AssemblyContext;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.AssemblyInfrastructureConnector;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.InfrastructureProvidedRole;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.InfrastructureRequiredRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Infrastructure Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.AssemblyInfrastructureConnectorImpl#getProvidedRole__AssemblyInfrastructureConnector <em>Provided Role Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.AssemblyInfrastructureConnectorImpl#getRequiredRole__AssemblyInfrastructureConnector <em>Required Role Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.AssemblyInfrastructureConnectorImpl#getProvidingAssemblyContext__AssemblyInfrastructureConnector <em>Providing Assembly Context Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.AssemblyInfrastructureConnectorImpl#getRequiringAssemblyContext__AssemblyInfrastructureConnector <em>Requiring Assembly Context Assembly Infrastructure Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyInfrastructureConnectorImpl extends ConnectorImpl implements AssemblyInfrastructureConnector {
   /**
    * The cached value of the '{@link #getProvidedRole__AssemblyInfrastructureConnector() <em>Provided Role Assembly Infrastructure Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProvidedRole__AssemblyInfrastructureConnector()
    * @generated
    * @ordered
    */
   protected InfrastructureProvidedRole providedRole__AssemblyInfrastructureConnector;

   /**
    * The cached value of the '{@link #getRequiredRole__AssemblyInfrastructureConnector() <em>Required Role Assembly Infrastructure Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredRole__AssemblyInfrastructureConnector()
    * @generated
    * @ordered
    */
   protected InfrastructureRequiredRole requiredRole__AssemblyInfrastructureConnector;

   /**
    * The cached value of the '{@link #getProvidingAssemblyContext__AssemblyInfrastructureConnector() <em>Providing Assembly Context Assembly Infrastructure Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProvidingAssemblyContext__AssemblyInfrastructureConnector()
    * @generated
    * @ordered
    */
   protected AssemblyContext providingAssemblyContext__AssemblyInfrastructureConnector;

   /**
    * The cached value of the '{@link #getRequiringAssemblyContext__AssemblyInfrastructureConnector() <em>Requiring Assembly Context Assembly Infrastructure Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiringAssemblyContext__AssemblyInfrastructureConnector()
    * @generated
    * @ordered
    */
   protected AssemblyContext requiringAssemblyContext__AssemblyInfrastructureConnector;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AssemblyInfrastructureConnectorImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_av_pcPackage.Literals.ASSEMBLY_INFRASTRUCTURE_CONNECTOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureProvidedRole getProvidedRole__AssemblyInfrastructureConnector() {
      if (providedRole__AssemblyInfrastructureConnector != null && providedRole__AssemblyInfrastructureConnector.eIsProxy()) {
         InternalEObject oldProvidedRole__AssemblyInfrastructureConnector = (InternalEObject)providedRole__AssemblyInfrastructureConnector;
         providedRole__AssemblyInfrastructureConnector = (InfrastructureProvidedRole)eResolveProxy(oldProvidedRole__AssemblyInfrastructureConnector);
         if (providedRole__AssemblyInfrastructureConnector != oldProvidedRole__AssemblyInfrastructureConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR, oldProvidedRole__AssemblyInfrastructureConnector, providedRole__AssemblyInfrastructureConnector));
         }
      }
      return providedRole__AssemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureProvidedRole basicGetProvidedRole__AssemblyInfrastructureConnector() {
      return providedRole__AssemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProvidedRole__AssemblyInfrastructureConnector(InfrastructureProvidedRole newProvidedRole__AssemblyInfrastructureConnector) {
      InfrastructureProvidedRole oldProvidedRole__AssemblyInfrastructureConnector = providedRole__AssemblyInfrastructureConnector;
      providedRole__AssemblyInfrastructureConnector = newProvidedRole__AssemblyInfrastructureConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR, oldProvidedRole__AssemblyInfrastructureConnector, providedRole__AssemblyInfrastructureConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole getRequiredRole__AssemblyInfrastructureConnector() {
      if (requiredRole__AssemblyInfrastructureConnector != null && requiredRole__AssemblyInfrastructureConnector.eIsProxy()) {
         InternalEObject oldRequiredRole__AssemblyInfrastructureConnector = (InternalEObject)requiredRole__AssemblyInfrastructureConnector;
         requiredRole__AssemblyInfrastructureConnector = (InfrastructureRequiredRole)eResolveProxy(oldRequiredRole__AssemblyInfrastructureConnector);
         if (requiredRole__AssemblyInfrastructureConnector != oldRequiredRole__AssemblyInfrastructureConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR, oldRequiredRole__AssemblyInfrastructureConnector, requiredRole__AssemblyInfrastructureConnector));
         }
      }
      return requiredRole__AssemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole basicGetRequiredRole__AssemblyInfrastructureConnector() {
      return requiredRole__AssemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiredRole__AssemblyInfrastructureConnector(InfrastructureRequiredRole newRequiredRole__AssemblyInfrastructureConnector) {
      InfrastructureRequiredRole oldRequiredRole__AssemblyInfrastructureConnector = requiredRole__AssemblyInfrastructureConnector;
      requiredRole__AssemblyInfrastructureConnector = newRequiredRole__AssemblyInfrastructureConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR, oldRequiredRole__AssemblyInfrastructureConnector, requiredRole__AssemblyInfrastructureConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext getProvidingAssemblyContext__AssemblyInfrastructureConnector() {
      if (providingAssemblyContext__AssemblyInfrastructureConnector != null && providingAssemblyContext__AssemblyInfrastructureConnector.eIsProxy()) {
         InternalEObject oldProvidingAssemblyContext__AssemblyInfrastructureConnector = (InternalEObject)providingAssemblyContext__AssemblyInfrastructureConnector;
         providingAssemblyContext__AssemblyInfrastructureConnector = (AssemblyContext)eResolveProxy(oldProvidingAssemblyContext__AssemblyInfrastructureConnector);
         if (providingAssemblyContext__AssemblyInfrastructureConnector != oldProvidingAssemblyContext__AssemblyInfrastructureConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR, oldProvidingAssemblyContext__AssemblyInfrastructureConnector, providingAssemblyContext__AssemblyInfrastructureConnector));
         }
      }
      return providingAssemblyContext__AssemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext basicGetProvidingAssemblyContext__AssemblyInfrastructureConnector() {
      return providingAssemblyContext__AssemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProvidingAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext newProvidingAssemblyContext__AssemblyInfrastructureConnector) {
      AssemblyContext oldProvidingAssemblyContext__AssemblyInfrastructureConnector = providingAssemblyContext__AssemblyInfrastructureConnector;
      providingAssemblyContext__AssemblyInfrastructureConnector = newProvidingAssemblyContext__AssemblyInfrastructureConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR, oldProvidingAssemblyContext__AssemblyInfrastructureConnector, providingAssemblyContext__AssemblyInfrastructureConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext getRequiringAssemblyContext__AssemblyInfrastructureConnector() {
      if (requiringAssemblyContext__AssemblyInfrastructureConnector != null && requiringAssemblyContext__AssemblyInfrastructureConnector.eIsProxy()) {
         InternalEObject oldRequiringAssemblyContext__AssemblyInfrastructureConnector = (InternalEObject)requiringAssemblyContext__AssemblyInfrastructureConnector;
         requiringAssemblyContext__AssemblyInfrastructureConnector = (AssemblyContext)eResolveProxy(oldRequiringAssemblyContext__AssemblyInfrastructureConnector);
         if (requiringAssemblyContext__AssemblyInfrastructureConnector != oldRequiringAssemblyContext__AssemblyInfrastructureConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR, oldRequiringAssemblyContext__AssemblyInfrastructureConnector, requiringAssemblyContext__AssemblyInfrastructureConnector));
         }
      }
      return requiringAssemblyContext__AssemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext basicGetRequiringAssemblyContext__AssemblyInfrastructureConnector() {
      return requiringAssemblyContext__AssemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiringAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext newRequiringAssemblyContext__AssemblyInfrastructureConnector) {
      AssemblyContext oldRequiringAssemblyContext__AssemblyInfrastructureConnector = requiringAssemblyContext__AssemblyInfrastructureConnector;
      requiringAssemblyContext__AssemblyInfrastructureConnector = newRequiringAssemblyContext__AssemblyInfrastructureConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR, oldRequiringAssemblyContext__AssemblyInfrastructureConnector, requiringAssemblyContext__AssemblyInfrastructureConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            if (resolve) return getProvidedRole__AssemblyInfrastructureConnector();
            return basicGetProvidedRole__AssemblyInfrastructureConnector();
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            if (resolve) return getRequiredRole__AssemblyInfrastructureConnector();
            return basicGetRequiredRole__AssemblyInfrastructureConnector();
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            if (resolve) return getProvidingAssemblyContext__AssemblyInfrastructureConnector();
            return basicGetProvidingAssemblyContext__AssemblyInfrastructureConnector();
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            if (resolve) return getRequiringAssemblyContext__AssemblyInfrastructureConnector();
            return basicGetRequiringAssemblyContext__AssemblyInfrastructureConnector();
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
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            setProvidedRole__AssemblyInfrastructureConnector((InfrastructureProvidedRole)newValue);
            return;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            setRequiredRole__AssemblyInfrastructureConnector((InfrastructureRequiredRole)newValue);
            return;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            setProvidingAssemblyContext__AssemblyInfrastructureConnector((AssemblyContext)newValue);
            return;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            setRequiringAssemblyContext__AssemblyInfrastructureConnector((AssemblyContext)newValue);
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
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            setProvidedRole__AssemblyInfrastructureConnector((InfrastructureProvidedRole)null);
            return;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            setRequiredRole__AssemblyInfrastructureConnector((InfrastructureRequiredRole)null);
            return;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            setProvidingAssemblyContext__AssemblyInfrastructureConnector((AssemblyContext)null);
            return;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            setRequiringAssemblyContext__AssemblyInfrastructureConnector((AssemblyContext)null);
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
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            return providedRole__AssemblyInfrastructureConnector != null;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            return requiredRole__AssemblyInfrastructureConnector != null;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            return providingAssemblyContext__AssemblyInfrastructureConnector != null;
         case Composition_av_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
            return requiringAssemblyContext__AssemblyInfrastructureConnector != null;
      }
      return super.eIsSet(featureID);
   }

} //AssemblyInfrastructureConnectorImpl
