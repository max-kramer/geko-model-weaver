/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ComposedStructure;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Connector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannel;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ResourceRequiredDelegationConnector;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.util.Composition_av_avValidator;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.impl.EntityImpl;

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
 * An implementation of the model object '<em><b>Composed Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl.ComposedStructureImpl#getAssemblyContexts__ComposedStructure <em>Assembly Contexts Composed Structure</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl.ComposedStructureImpl#getResourceRequiredDelegationConnectors_ComposedStructure <em>Resource Required Delegation Connectors Composed Structure</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl.ComposedStructureImpl#getEventChannel__ComposedStructure <em>Event Channel Composed Structure</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl.ComposedStructureImpl#getConnectors__ComposedStructure <em>Connectors Composed Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComposedStructureImpl extends EntityImpl implements ComposedStructure {
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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ComposedStructureImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_av_avPackage.Literals.COMPOSED_STRUCTURE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<AssemblyContext> getAssemblyContexts__ComposedStructure() {
      if (assemblyContexts__ComposedStructure == null) {
         assemblyContexts__ComposedStructure = new EObjectContainmentWithInverseEList<AssemblyContext>(AssemblyContext.class, this, Composition_av_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE, Composition_av_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT);
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
         resourceRequiredDelegationConnectors_ComposedStructure = new EObjectContainmentWithInverseEList<ResourceRequiredDelegationConnector>(ResourceRequiredDelegationConnector.class, this, Composition_av_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE, Composition_av_avPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
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
         eventChannel__ComposedStructure = new EObjectContainmentWithInverseEList<EventChannel>(EventChannel.class, this, Composition_av_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE, Composition_av_avPackage.EVENT_CHANNEL__PARENT_STRUCTURE_EVENT_CHANNEL);
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
         connectors__ComposedStructure = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this, Composition_av_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE, Composition_av_avPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR);
      }
      return connectors__ComposedStructure;
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
                   Composition_av_avValidator.DIAGNOSTIC_SOURCE,
                   Composition_av_avValidator.COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT,
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
                   Composition_av_avValidator.DIAGNOSTIC_SOURCE,
                   Composition_av_avValidator.COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS,
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
         case Composition_av_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssemblyContexts__ComposedStructure()).basicAdd(otherEnd, msgs);
         case Composition_av_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceRequiredDelegationConnectors_ComposedStructure()).basicAdd(otherEnd, msgs);
         case Composition_av_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getEventChannel__ComposedStructure()).basicAdd(otherEnd, msgs);
         case Composition_av_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors__ComposedStructure()).basicAdd(otherEnd, msgs);
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
         case Composition_av_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            return ((InternalEList<?>)getAssemblyContexts__ComposedStructure()).basicRemove(otherEnd, msgs);
         case Composition_av_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            return ((InternalEList<?>)getResourceRequiredDelegationConnectors_ComposedStructure()).basicRemove(otherEnd, msgs);
         case Composition_av_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            return ((InternalEList<?>)getEventChannel__ComposedStructure()).basicRemove(otherEnd, msgs);
         case Composition_av_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE:
            return ((InternalEList<?>)getConnectors__ComposedStructure()).basicRemove(otherEnd, msgs);
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
         case Composition_av_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            return getAssemblyContexts__ComposedStructure();
         case Composition_av_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            return getResourceRequiredDelegationConnectors_ComposedStructure();
         case Composition_av_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            return getEventChannel__ComposedStructure();
         case Composition_av_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE:
            return getConnectors__ComposedStructure();
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
         case Composition_av_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            getAssemblyContexts__ComposedStructure().clear();
            getAssemblyContexts__ComposedStructure().addAll((Collection<? extends AssemblyContext>)newValue);
            return;
         case Composition_av_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            getResourceRequiredDelegationConnectors_ComposedStructure().clear();
            getResourceRequiredDelegationConnectors_ComposedStructure().addAll((Collection<? extends ResourceRequiredDelegationConnector>)newValue);
            return;
         case Composition_av_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            getEventChannel__ComposedStructure().clear();
            getEventChannel__ComposedStructure().addAll((Collection<? extends EventChannel>)newValue);
            return;
         case Composition_av_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE:
            getConnectors__ComposedStructure().clear();
            getConnectors__ComposedStructure().addAll((Collection<? extends Connector>)newValue);
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
         case Composition_av_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            getAssemblyContexts__ComposedStructure().clear();
            return;
         case Composition_av_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            getResourceRequiredDelegationConnectors_ComposedStructure().clear();
            return;
         case Composition_av_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            getEventChannel__ComposedStructure().clear();
            return;
         case Composition_av_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE:
            getConnectors__ComposedStructure().clear();
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
         case Composition_av_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
            return assemblyContexts__ComposedStructure != null && !assemblyContexts__ComposedStructure.isEmpty();
         case Composition_av_avPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
            return resourceRequiredDelegationConnectors_ComposedStructure != null && !resourceRequiredDelegationConnectors_ComposedStructure.isEmpty();
         case Composition_av_avPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE:
            return eventChannel__ComposedStructure != null && !eventChannel__ComposedStructure.isEmpty();
         case Composition_av_avPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE:
            return connectors__ComposedStructure != null && !connectors__ComposedStructure.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ComposedStructureImpl
