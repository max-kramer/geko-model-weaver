/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyContext;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ComposedStructure;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Connector;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.EventChannel;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ResourceRequiredDelegationConnector;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.util.Composition_pc_avValidator;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ComposedProvidingRequiringEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.InterfaceProvidingEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.InterfaceProvidingRequiringEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.InterfaceRequiringEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceInterfaceRequiringEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceRequiredRole;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.EntityImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.util.Entity_pc_avValidator;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.QoSAnnotations;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.Qosannotations_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidedRole;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredRole;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.System_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.util.System_pc_avValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.SystemImpl#getAssemblyContexts__ComposedStructure <em>Assembly Contexts Composed Structure</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.SystemImpl#getResourceRequiredDelegationConnectors_ComposedStructure <em>Resource Required Delegation Connectors Composed Structure</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.SystemImpl#getEventChannel__ComposedStructure <em>Event Channel Composed Structure</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.SystemImpl#getConnectors__ComposedStructure <em>Connectors Composed Structure</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.SystemImpl#getProvidedRoles_InterfaceProvidingEntity <em>Provided Roles Interface Providing Entity</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.SystemImpl#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.SystemImpl#getRequiredRoles_InterfaceRequiringEntity <em>Required Roles Interface Requiring Entity</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.SystemImpl#getQosAnnotations_System <em>Qos Annotations System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends EntityImpl implements de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.System {
   /**
    * The cached value of the '{@link #getAssemblyContexts__ComposedStructure() <em>Assembly Contexts Composed Structure</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssemblyContexts__ComposedStructure()
    * @generated
    * @ordered
    */
   protected EList<AssemblyContext> assemblyContexts__ComposedStructure;

   /**
    * The cached value of the '{@link #getResourceRequiredDelegationConnectors_ComposedStructure() <em>Resource Required Delegation Connectors Composed Structure</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceRequiredDelegationConnectors_ComposedStructure()
    * @generated
    * @ordered
    */
   protected EList<ResourceRequiredDelegationConnector> resourceRequiredDelegationConnectors_ComposedStructure;

   /**
    * The cached value of the '{@link #getEventChannel__ComposedStructure() <em>Event Channel Composed Structure</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEventChannel__ComposedStructure()
    * @generated
    * @ordered
    */
   protected EList<EventChannel> eventChannel__ComposedStructure;

   /**
    * The cached value of the '{@link #getConnectors__ComposedStructure() <em>Connectors Composed Structure</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConnectors__ComposedStructure()
    * @generated
    * @ordered
    */
   protected EList<Connector> connectors__ComposedStructure;

   /**
    * The cached value of the '{@link #getProvidedRoles_InterfaceProvidingEntity() <em>Provided Roles Interface Providing Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProvidedRoles_InterfaceProvidingEntity()
    * @generated
    * @ordered
    */
   protected EList<ProvidedRole> providedRoles_InterfaceProvidingEntity;

   /**
    * The cached value of the '{@link #getResourceRequiredRoles__ResourceInterfaceRequiringEntity() <em>Resource Required Roles Resource Interface Requiring Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceRequiredRoles__ResourceInterfaceRequiringEntity()
    * @generated
    * @ordered
    */
   protected EList<ResourceRequiredRole> resourceRequiredRoles__ResourceInterfaceRequiringEntity;

   /**
    * The cached value of the '{@link #getRequiredRoles_InterfaceRequiringEntity() <em>Required Roles Interface Requiring Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredRoles_InterfaceRequiringEntity()
    * @generated
    * @ordered
    */
   protected EList<RequiredRole> requiredRoles_InterfaceRequiringEntity;

   /**
    * The cached value of the '{@link #getQosAnnotations_System() <em>Qos Annotations System</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getQosAnnotations_System()
    * @generated
    * @ordered
    */
   protected EList<QoSAnnotations> qosAnnotations_System;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SystemImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return System_pc_avPackage.Literals.SYSTEM;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<AssemblyContext> getAssemblyContexts__ComposedStructure() {
      if (assemblyContexts__ComposedStructure == null) {
         assemblyContexts__ComposedStructure = new EObjectContainmentWithInverseEList<AssemblyContext>(AssemblyContext.class, this, System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE, Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT);
      }
      return assemblyContexts__ComposedStructure;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceRequiredDelegationConnector> getResourceRequiredDelegationConnectors_ComposedStructure() {
      if (resourceRequiredDelegationConnectors_ComposedStructure == null) {
         resourceRequiredDelegationConnectors_ComposedStructure = new EObjectContainmentWithInverseEList<ResourceRequiredDelegationConnector>(ResourceRequiredDelegationConnector.class, this, System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE, Composition_pc_avPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
      }
      return resourceRequiredDelegationConnectors_ComposedStructure;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EventChannel> getEventChannel__ComposedStructure() {
      if (eventChannel__ComposedStructure == null) {
         eventChannel__ComposedStructure = new EObjectContainmentWithInverseEList<EventChannel>(EventChannel.class, this, System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE, Composition_pc_avPackage.EVENT_CHANNEL__PARENT_STRUCTURE_EVENT_CHANNEL);
      }
      return eventChannel__ComposedStructure;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Connector> getConnectors__ComposedStructure() {
      if (connectors__ComposedStructure == null) {
         connectors__ComposedStructure = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this, System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE, Composition_pc_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR);
      }
      return connectors__ComposedStructure;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ProvidedRole> getProvidedRoles_InterfaceProvidingEntity() {
      if (providedRoles_InterfaceProvidingEntity == null) {
         providedRoles_InterfaceProvidingEntity = new EObjectContainmentWithInverseEList<ProvidedRole>(ProvidedRole.class, this, System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY, Repository_pc_avPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE);
      }
      return providedRoles_InterfaceProvidingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceRequiredRole> getResourceRequiredRoles__ResourceInterfaceRequiringEntity() {
      if (resourceRequiredRoles__ResourceInterfaceRequiringEntity == null) {
         resourceRequiredRoles__ResourceInterfaceRequiringEntity = new EObjectContainmentWithInverseEList<ResourceRequiredRole>(ResourceRequiredRole.class, this, System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY, Entity_pc_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE);
      }
      return resourceRequiredRoles__ResourceInterfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<RequiredRole> getRequiredRoles_InterfaceRequiringEntity() {
      if (requiredRoles_InterfaceRequiringEntity == null) {
         requiredRoles_InterfaceRequiringEntity = new EObjectContainmentWithInverseEList<RequiredRole>(RequiredRole.class, this, System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY, Repository_pc_avPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE);
      }
      return requiredRoles_InterfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<QoSAnnotations> getQosAnnotations_System() {
      if (qosAnnotations_System == null) {
         qosAnnotations_System = new EObjectContainmentWithInverseEList<QoSAnnotations>(QoSAnnotations.class, this, System_pc_avPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM, Qosannotations_pc_avPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS);
      }
      return qosAnnotations_System;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean SystemMustHaveAtLeastOneProvidedRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   System_pc_avValidator.DIAGNOSTIC_SOURCE,
                   System_pc_avValidator.SYSTEM__SYSTEM_MUST_HAVE_AT_LEAST_ONE_PROVIDED_ROLE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SystemMustHaveAtLeastOneProvidedRole", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean ProvidedRolesMustBeBound(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Entity_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Entity_pc_avValidator.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_MUST_BE_BOUND,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProvidedRolesMustBeBound", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean MultipleConnectorsConstraint(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Composition_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Composition_pc_avValidator.COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultipleConnectorsConstraint", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean MultipleConnectorsConstraintForAssemblyConnectors(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Composition_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Composition_pc_avValidator.COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultipleConnectorsConstraintForAssemblyConnectors", EObjectValidator.getObjectLabel(this, context) }),
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
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssemblyContexts__ComposedStructure()).basicAdd(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceRequiredDelegationConnectors_ComposedStructure()).basicAdd(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getEventChannel__ComposedStructure()).basicAdd(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors__ComposedStructure()).basicAdd(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedRoles_InterfaceProvidingEntity()).basicAdd(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceRequiredRoles__ResourceInterfaceRequiringEntity()).basicAdd(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredRoles_InterfaceRequiringEntity()).basicAdd(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getQosAnnotations_System()).basicAdd(otherEnd, msgs);
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
         case System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            return ((InternalEList<?>)getAssemblyContexts__ComposedStructure()).basicRemove(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            return ((InternalEList<?>)getResourceRequiredDelegationConnectors_ComposedStructure()).basicRemove(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            return ((InternalEList<?>)getEventChannel__ComposedStructure()).basicRemove(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
            return ((InternalEList<?>)getConnectors__ComposedStructure()).basicRemove(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<?>)getProvidedRoles_InterfaceProvidingEntity()).basicRemove(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<?>)getResourceRequiredRoles__ResourceInterfaceRequiringEntity()).basicRemove(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<?>)getRequiredRoles_InterfaceRequiringEntity()).basicRemove(otherEnd, msgs);
         case System_pc_avPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
            return ((InternalEList<?>)getQosAnnotations_System()).basicRemove(otherEnd, msgs);
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
         case System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            return getAssemblyContexts__ComposedStructure();
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            return getResourceRequiredDelegationConnectors_ComposedStructure();
         case System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            return getEventChannel__ComposedStructure();
         case System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
            return getConnectors__ComposedStructure();
         case System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return getProvidedRoles_InterfaceProvidingEntity();
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return getResourceRequiredRoles__ResourceInterfaceRequiringEntity();
         case System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return getRequiredRoles_InterfaceRequiringEntity();
         case System_pc_avPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
            return getQosAnnotations_System();
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
         case System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            getAssemblyContexts__ComposedStructure().clear();
            getAssemblyContexts__ComposedStructure().addAll((Collection<? extends AssemblyContext>)newValue);
            return;
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            getResourceRequiredDelegationConnectors_ComposedStructure().clear();
            getResourceRequiredDelegationConnectors_ComposedStructure().addAll((Collection<? extends ResourceRequiredDelegationConnector>)newValue);
            return;
         case System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            getEventChannel__ComposedStructure().clear();
            getEventChannel__ComposedStructure().addAll((Collection<? extends EventChannel>)newValue);
            return;
         case System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
            getConnectors__ComposedStructure().clear();
            getConnectors__ComposedStructure().addAll((Collection<? extends Connector>)newValue);
            return;
         case System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            getProvidedRoles_InterfaceProvidingEntity().clear();
            getProvidedRoles_InterfaceProvidingEntity().addAll((Collection<? extends ProvidedRole>)newValue);
            return;
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().clear();
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().addAll((Collection<? extends ResourceRequiredRole>)newValue);
            return;
         case System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            getRequiredRoles_InterfaceRequiringEntity().clear();
            getRequiredRoles_InterfaceRequiringEntity().addAll((Collection<? extends RequiredRole>)newValue);
            return;
         case System_pc_avPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
            getQosAnnotations_System().clear();
            getQosAnnotations_System().addAll((Collection<? extends QoSAnnotations>)newValue);
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
         case System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            getAssemblyContexts__ComposedStructure().clear();
            return;
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            getResourceRequiredDelegationConnectors_ComposedStructure().clear();
            return;
         case System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            getEventChannel__ComposedStructure().clear();
            return;
         case System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
            getConnectors__ComposedStructure().clear();
            return;
         case System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            getProvidedRoles_InterfaceProvidingEntity().clear();
            return;
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().clear();
            return;
         case System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            getRequiredRoles_InterfaceRequiringEntity().clear();
            return;
         case System_pc_avPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
            getQosAnnotations_System().clear();
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
         case System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            return assemblyContexts__ComposedStructure != null && !assemblyContexts__ComposedStructure.isEmpty();
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            return resourceRequiredDelegationConnectors_ComposedStructure != null && !resourceRequiredDelegationConnectors_ComposedStructure.isEmpty();
         case System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            return eventChannel__ComposedStructure != null && !eventChannel__ComposedStructure.isEmpty();
         case System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
            return connectors__ComposedStructure != null && !connectors__ComposedStructure.isEmpty();
         case System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return providedRoles_InterfaceProvidingEntity != null && !providedRoles_InterfaceProvidingEntity.isEmpty();
         case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return resourceRequiredRoles__ResourceInterfaceRequiringEntity != null && !resourceRequiredRoles__ResourceInterfaceRequiringEntity.isEmpty();
         case System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return requiredRoles_InterfaceRequiringEntity != null && !requiredRoles_InterfaceRequiringEntity.isEmpty();
         case System_pc_avPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
            return qosAnnotations_System != null && !qosAnnotations_System.isEmpty();
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
      if (baseClass == ComposedStructure.class) {
         switch (derivedFeatureID) {
            case System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE: return Composition_pc_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;
            case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE: return Composition_pc_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;
            case System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE: return Composition_pc_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE;
            case System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE: return Composition_pc_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE;
            default: return -1;
         }
      }
      if (baseClass == InterfaceProvidingEntity.class) {
         switch (derivedFeatureID) {
            case System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY: return Entity_pc_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == ResourceInterfaceRequiringEntity.class) {
         switch (derivedFeatureID) {
            case System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY: return Entity_pc_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == InterfaceRequiringEntity.class) {
         switch (derivedFeatureID) {
            case System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY: return Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == InterfaceProvidingRequiringEntity.class) {
         switch (derivedFeatureID) {
            default: return -1;
         }
      }
      if (baseClass == ComposedProvidingRequiringEntity.class) {
         switch (derivedFeatureID) {
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
      if (baseClass == ComposedStructure.class) {
         switch (baseFeatureID) {
            case Composition_pc_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE: return System_pc_avPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;
            case Composition_pc_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE: return System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;
            case Composition_pc_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE: return System_pc_avPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE;
            case Composition_pc_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE: return System_pc_avPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE;
            default: return -1;
         }
      }
      if (baseClass == InterfaceProvidingEntity.class) {
         switch (baseFeatureID) {
            case Entity_pc_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY: return System_pc_avPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == ResourceInterfaceRequiringEntity.class) {
         switch (baseFeatureID) {
            case Entity_pc_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY: return System_pc_avPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == InterfaceRequiringEntity.class) {
         switch (baseFeatureID) {
            case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY: return System_pc_avPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      if (baseClass == InterfaceProvidingRequiringEntity.class) {
         switch (baseFeatureID) {
            default: return -1;
         }
      }
      if (baseClass == ComposedProvidingRequiringEntity.class) {
         switch (baseFeatureID) {
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} //SystemImpl
