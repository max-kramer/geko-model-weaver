/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.AssemblyContext;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.ProvidedDelegationConnector;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.util.Composition_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.OperationProvidedRole;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.ProvidedDelegationConnectorImpl#getInnerProvidedRole_ProvidedDelegationConnector <em>Inner Provided Role Provided Delegation Connector</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.ProvidedDelegationConnectorImpl#getOuterProvidedRole_ProvidedDelegationConnector <em>Outer Provided Role Provided Delegation Connector</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.ProvidedDelegationConnectorImpl#getAssemblyContext_ProvidedDelegationConnector <em>Assembly Context Provided Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedDelegationConnectorImpl extends DelegationConnectorImpl implements ProvidedDelegationConnector {
   /**
    * The cached value of the '{@link #getInnerProvidedRole_ProvidedDelegationConnector() <em>Inner Provided Role Provided Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInnerProvidedRole_ProvidedDelegationConnector()
    * @generated
    * @ordered
    */
   protected OperationProvidedRole innerProvidedRole_ProvidedDelegationConnector;

   /**
    * The cached value of the '{@link #getOuterProvidedRole_ProvidedDelegationConnector() <em>Outer Provided Role Provided Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOuterProvidedRole_ProvidedDelegationConnector()
    * @generated
    * @ordered
    */
   protected OperationProvidedRole outerProvidedRole_ProvidedDelegationConnector;

   /**
    * The cached value of the '{@link #getAssemblyContext_ProvidedDelegationConnector() <em>Assembly Context Provided Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssemblyContext_ProvidedDelegationConnector()
    * @generated
    * @ordered
    */
   protected AssemblyContext assemblyContext_ProvidedDelegationConnector;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ProvidedDelegationConnectorImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_av_pcPackage.Literals.PROVIDED_DELEGATION_CONNECTOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationProvidedRole getInnerProvidedRole_ProvidedDelegationConnector() {
      if (innerProvidedRole_ProvidedDelegationConnector != null && innerProvidedRole_ProvidedDelegationConnector.eIsProxy()) {
         InternalEObject oldInnerProvidedRole_ProvidedDelegationConnector = (InternalEObject)innerProvidedRole_ProvidedDelegationConnector;
         innerProvidedRole_ProvidedDelegationConnector = (OperationProvidedRole)eResolveProxy(oldInnerProvidedRole_ProvidedDelegationConnector);
         if (innerProvidedRole_ProvidedDelegationConnector != oldInnerProvidedRole_ProvidedDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR, oldInnerProvidedRole_ProvidedDelegationConnector, innerProvidedRole_ProvidedDelegationConnector));
         }
      }
      return innerProvidedRole_ProvidedDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationProvidedRole basicGetInnerProvidedRole_ProvidedDelegationConnector() {
      return innerProvidedRole_ProvidedDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInnerProvidedRole_ProvidedDelegationConnector(OperationProvidedRole newInnerProvidedRole_ProvidedDelegationConnector) {
      OperationProvidedRole oldInnerProvidedRole_ProvidedDelegationConnector = innerProvidedRole_ProvidedDelegationConnector;
      innerProvidedRole_ProvidedDelegationConnector = newInnerProvidedRole_ProvidedDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR, oldInnerProvidedRole_ProvidedDelegationConnector, innerProvidedRole_ProvidedDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationProvidedRole getOuterProvidedRole_ProvidedDelegationConnector() {
      if (outerProvidedRole_ProvidedDelegationConnector != null && outerProvidedRole_ProvidedDelegationConnector.eIsProxy()) {
         InternalEObject oldOuterProvidedRole_ProvidedDelegationConnector = (InternalEObject)outerProvidedRole_ProvidedDelegationConnector;
         outerProvidedRole_ProvidedDelegationConnector = (OperationProvidedRole)eResolveProxy(oldOuterProvidedRole_ProvidedDelegationConnector);
         if (outerProvidedRole_ProvidedDelegationConnector != oldOuterProvidedRole_ProvidedDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR, oldOuterProvidedRole_ProvidedDelegationConnector, outerProvidedRole_ProvidedDelegationConnector));
         }
      }
      return outerProvidedRole_ProvidedDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationProvidedRole basicGetOuterProvidedRole_ProvidedDelegationConnector() {
      return outerProvidedRole_ProvidedDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOuterProvidedRole_ProvidedDelegationConnector(OperationProvidedRole newOuterProvidedRole_ProvidedDelegationConnector) {
      OperationProvidedRole oldOuterProvidedRole_ProvidedDelegationConnector = outerProvidedRole_ProvidedDelegationConnector;
      outerProvidedRole_ProvidedDelegationConnector = newOuterProvidedRole_ProvidedDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR, oldOuterProvidedRole_ProvidedDelegationConnector, outerProvidedRole_ProvidedDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext getAssemblyContext_ProvidedDelegationConnector() {
      if (assemblyContext_ProvidedDelegationConnector != null && assemblyContext_ProvidedDelegationConnector.eIsProxy()) {
         InternalEObject oldAssemblyContext_ProvidedDelegationConnector = (InternalEObject)assemblyContext_ProvidedDelegationConnector;
         assemblyContext_ProvidedDelegationConnector = (AssemblyContext)eResolveProxy(oldAssemblyContext_ProvidedDelegationConnector);
         if (assemblyContext_ProvidedDelegationConnector != oldAssemblyContext_ProvidedDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR, oldAssemblyContext_ProvidedDelegationConnector, assemblyContext_ProvidedDelegationConnector));
         }
      }
      return assemblyContext_ProvidedDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext basicGetAssemblyContext_ProvidedDelegationConnector() {
      return assemblyContext_ProvidedDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAssemblyContext_ProvidedDelegationConnector(AssemblyContext newAssemblyContext_ProvidedDelegationConnector) {
      AssemblyContext oldAssemblyContext_ProvidedDelegationConnector = assemblyContext_ProvidedDelegationConnector;
      assemblyContext_ProvidedDelegationConnector = newAssemblyContext_ProvidedDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR, oldAssemblyContext_ProvidedDelegationConnector, assemblyContext_ProvidedDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Composition_av_pcValidator.DIAGNOSTIC_SOURCE,
                   Composition_av_pcValidator.PROVIDED_DELEGATION_CONNECTOR__PROVIDED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure", EObjectValidator.getObjectLabel(this, context) }),
                   new Object [] { this }));
         }
         return false;
      }
      return true;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Composition_av_pcValidator.DIAGNOSTIC_SOURCE,
                   Composition_av_pcValidator.PROVIDED_DELEGATION_CONNECTOR__COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_PROVIDING_COMPONENT_NEED_TO_BE_THE_SAME,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame", EObjectValidator.getObjectLabel(this, context) }),
                   new Object [] { this }));
         }
         return false;
      }
      return true;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
            if (resolve) return getInnerProvidedRole_ProvidedDelegationConnector();
            return basicGetInnerProvidedRole_ProvidedDelegationConnector();
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
            if (resolve) return getOuterProvidedRole_ProvidedDelegationConnector();
            return basicGetOuterProvidedRole_ProvidedDelegationConnector();
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR:
            if (resolve) return getAssemblyContext_ProvidedDelegationConnector();
            return basicGetAssemblyContext_ProvidedDelegationConnector();
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
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
            setInnerProvidedRole_ProvidedDelegationConnector((OperationProvidedRole)newValue);
            return;
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
            setOuterProvidedRole_ProvidedDelegationConnector((OperationProvidedRole)newValue);
            return;
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR:
            setAssemblyContext_ProvidedDelegationConnector((AssemblyContext)newValue);
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
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
            setInnerProvidedRole_ProvidedDelegationConnector((OperationProvidedRole)null);
            return;
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
            setOuterProvidedRole_ProvidedDelegationConnector((OperationProvidedRole)null);
            return;
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR:
            setAssemblyContext_ProvidedDelegationConnector((AssemblyContext)null);
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
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
            return innerProvidedRole_ProvidedDelegationConnector != null;
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
            return outerProvidedRole_ProvidedDelegationConnector != null;
         case Composition_av_pcPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR:
            return assemblyContext_ProvidedDelegationConnector != null;
      }
      return super.eIsSet(featureID);
   }

} //ProvidedDelegationConnectorImpl
