/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.BasicComponent;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.PassiveResource;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.util.Repository_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ServiceEffectSpecification;

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
 * An implementation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.BasicComponentImpl#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.BasicComponentImpl#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicComponentImpl extends ImplementationComponentTypeImpl implements BasicComponent {
   /**
    * The cached value of the '{@link #getServiceEffectSpecifications__BasicComponent() <em>Service Effect Specifications Basic Component</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getServiceEffectSpecifications__BasicComponent()
    * @generated
    * @ordered
    */
   protected EList<ServiceEffectSpecification> serviceEffectSpecifications__BasicComponent;

   /**
    * The cached value of the '{@link #getPassiveResource_BasicComponent() <em>Passive Resource Basic Component</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPassiveResource_BasicComponent()
    * @generated
    * @ordered
    */
   protected EList<PassiveResource> passiveResource_BasicComponent;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected BasicComponentImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_av_pcPackage.Literals.BASIC_COMPONENT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ServiceEffectSpecification> getServiceEffectSpecifications__BasicComponent() {
      if (serviceEffectSpecifications__BasicComponent == null) {
         serviceEffectSpecifications__BasicComponent = new EObjectContainmentWithInverseEList<ServiceEffectSpecification>(ServiceEffectSpecification.class, this, Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT, Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION);
      }
      return serviceEffectSpecifications__BasicComponent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<PassiveResource> getPassiveResource_BasicComponent() {
      if (passiveResource_BasicComponent == null) {
         passiveResource_BasicComponent = new EObjectContainmentWithInverseEList<PassiveResource>(PassiveResource.class, this, Repository_av_pcPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT, Repository_av_pcPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE);
      }
      return passiveResource_BasicComponent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean NoSeffTypeUsedTwice(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_av_pcValidator.DIAGNOSTIC_SOURCE,
                   Repository_av_pcValidator.BASIC_COMPONENT__NO_SEFF_TYPE_USED_TWICE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoSeffTypeUsedTwice", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean ProvideSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_av_pcValidator.DIAGNOSTIC_SOURCE,
                   Repository_av_pcValidator.BASIC_COMPONENT__PROVIDE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProvideSameInterfacesAsImplementationType", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean RequireSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_av_pcValidator.DIAGNOSTIC_SOURCE,
                   Repository_av_pcValidator.BASIC_COMPONENT__REQUIRE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RequireSameInterfacesAsImplementationType", EObjectValidator.getObjectLabel(this, context) }),
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
         case Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceEffectSpecifications__BasicComponent()).basicAdd(otherEnd, msgs);
         case Repository_av_pcPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveResource_BasicComponent()).basicAdd(otherEnd, msgs);
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
         case Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
            return ((InternalEList<?>)getServiceEffectSpecifications__BasicComponent()).basicRemove(otherEnd, msgs);
         case Repository_av_pcPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
            return ((InternalEList<?>)getPassiveResource_BasicComponent()).basicRemove(otherEnd, msgs);
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
         case Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
            return getServiceEffectSpecifications__BasicComponent();
         case Repository_av_pcPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
            return getPassiveResource_BasicComponent();
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
         case Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
            getServiceEffectSpecifications__BasicComponent().clear();
            getServiceEffectSpecifications__BasicComponent().addAll((Collection<? extends ServiceEffectSpecification>)newValue);
            return;
         case Repository_av_pcPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
            getPassiveResource_BasicComponent().clear();
            getPassiveResource_BasicComponent().addAll((Collection<? extends PassiveResource>)newValue);
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
         case Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
            getServiceEffectSpecifications__BasicComponent().clear();
            return;
         case Repository_av_pcPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
            getPassiveResource_BasicComponent().clear();
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
         case Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
            return serviceEffectSpecifications__BasicComponent != null && !serviceEffectSpecifications__BasicComponent.isEmpty();
         case Repository_av_pcPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
            return passiveResource_BasicComponent != null && !passiveResource_BasicComponent.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //BasicComponentImpl
