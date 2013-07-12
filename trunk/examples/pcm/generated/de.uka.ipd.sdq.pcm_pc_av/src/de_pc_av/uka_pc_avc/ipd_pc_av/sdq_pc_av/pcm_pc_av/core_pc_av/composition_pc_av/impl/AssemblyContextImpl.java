/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyContext;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ComposedStructure;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.EntityImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.Parameter_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableUsage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RepositoryComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.impl.AssemblyContextImpl#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.impl.AssemblyContextImpl#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.impl.AssemblyContextImpl#getConfigParameterUsages__AssemblyContext <em>Config Parameter Usages Assembly Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyContextImpl extends EntityImpl implements AssemblyContext {
   /**
    * The cached value of the '{@link #getEncapsulatedComponent__AssemblyContext() <em>Encapsulated Component Assembly Context</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEncapsulatedComponent__AssemblyContext()
    * @generated
    * @ordered
    */
   protected RepositoryComponent encapsulatedComponent__AssemblyContext;

   /**
    * The cached value of the '{@link #getConfigParameterUsages__AssemblyContext() <em>Config Parameter Usages Assembly Context</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConfigParameterUsages__AssemblyContext()
    * @generated
    * @ordered
    */
   protected EList<VariableUsage> configParameterUsages__AssemblyContext;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AssemblyContextImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_pc_avPackage.Literals.ASSEMBLY_CONTEXT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComposedStructure getParentStructure__AssemblyContext() {
      if (eContainerFeatureID() != Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT) return null;
      return (ComposedStructure)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParentStructure__AssemblyContext(ComposedStructure newParentStructure__AssemblyContext, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newParentStructure__AssemblyContext, Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParentStructure__AssemblyContext(ComposedStructure newParentStructure__AssemblyContext) {
      if (newParentStructure__AssemblyContext != eInternalContainer() || (eContainerFeatureID() != Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT && newParentStructure__AssemblyContext != null)) {
         if (EcoreUtil.isAncestor(this, newParentStructure__AssemblyContext))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParentStructure__AssemblyContext != null)
            msgs = ((InternalEObject)newParentStructure__AssemblyContext).eInverseAdd(this, Composition_pc_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
         msgs = basicSetParentStructure__AssemblyContext(newParentStructure__AssemblyContext, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT, newParentStructure__AssemblyContext, newParentStructure__AssemblyContext));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RepositoryComponent getEncapsulatedComponent__AssemblyContext() {
      if (encapsulatedComponent__AssemblyContext != null && encapsulatedComponent__AssemblyContext.eIsProxy()) {
         InternalEObject oldEncapsulatedComponent__AssemblyContext = (InternalEObject)encapsulatedComponent__AssemblyContext;
         encapsulatedComponent__AssemblyContext = (RepositoryComponent)eResolveProxy(oldEncapsulatedComponent__AssemblyContext);
         if (encapsulatedComponent__AssemblyContext != oldEncapsulatedComponent__AssemblyContext) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_pc_avPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT, oldEncapsulatedComponent__AssemblyContext, encapsulatedComponent__AssemblyContext));
         }
      }
      return encapsulatedComponent__AssemblyContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RepositoryComponent basicGetEncapsulatedComponent__AssemblyContext() {
      return encapsulatedComponent__AssemblyContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEncapsulatedComponent__AssemblyContext(RepositoryComponent newEncapsulatedComponent__AssemblyContext) {
      RepositoryComponent oldEncapsulatedComponent__AssemblyContext = encapsulatedComponent__AssemblyContext;
      encapsulatedComponent__AssemblyContext = newEncapsulatedComponent__AssemblyContext;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pc_avPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT, oldEncapsulatedComponent__AssemblyContext, encapsulatedComponent__AssemblyContext));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<VariableUsage> getConfigParameterUsages__AssemblyContext() {
      if (configParameterUsages__AssemblyContext == null) {
         configParameterUsages__AssemblyContext = new EObjectContainmentWithInverseEList<VariableUsage>(VariableUsage.class, this, Composition_pc_avPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT, Parameter_pc_avPackage.VARIABLE_USAGE__ASSEMBLY_CONTEXT_VARIABLE_USAGE);
      }
      return configParameterUsages__AssemblyContext;
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
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentStructure__AssemblyContext((ComposedStructure)otherEnd, msgs);
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfigParameterUsages__AssemblyContext()).basicAdd(otherEnd, msgs);
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
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
            return basicSetParentStructure__AssemblyContext(null, msgs);
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
            return ((InternalEList<?>)getConfigParameterUsages__AssemblyContext()).basicRemove(otherEnd, msgs);
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
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
            return eInternalContainer().eInverseRemove(this, Composition_pc_avPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
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
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
            return getParentStructure__AssemblyContext();
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT:
            if (resolve) return getEncapsulatedComponent__AssemblyContext();
            return basicGetEncapsulatedComponent__AssemblyContext();
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
            return getConfigParameterUsages__AssemblyContext();
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
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
            setParentStructure__AssemblyContext((ComposedStructure)newValue);
            return;
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT:
            setEncapsulatedComponent__AssemblyContext((RepositoryComponent)newValue);
            return;
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
            getConfigParameterUsages__AssemblyContext().clear();
            getConfigParameterUsages__AssemblyContext().addAll((Collection<? extends VariableUsage>)newValue);
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
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
            setParentStructure__AssemblyContext((ComposedStructure)null);
            return;
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT:
            setEncapsulatedComponent__AssemblyContext((RepositoryComponent)null);
            return;
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
            getConfigParameterUsages__AssemblyContext().clear();
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
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
            return getParentStructure__AssemblyContext() != null;
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT:
            return encapsulatedComponent__AssemblyContext != null;
         case Composition_pc_avPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
            return configParameterUsages__AssemblyContext != null && !configParameterUsages__AssemblyContext.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //AssemblyContextImpl
