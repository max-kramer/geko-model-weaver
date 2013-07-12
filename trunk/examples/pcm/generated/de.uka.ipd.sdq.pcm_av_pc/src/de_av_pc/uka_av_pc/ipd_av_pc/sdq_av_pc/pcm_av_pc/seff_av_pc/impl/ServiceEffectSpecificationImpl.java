/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.BasicComponent;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Signature;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ServiceEffectSpecification;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.util.Seff_av_pcValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Effect Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.impl.ServiceEffectSpecificationImpl#getSeffTypeID <em>Seff Type ID</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.impl.ServiceEffectSpecificationImpl#getDescribedService__SEFF <em>Described Service SEFF</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.impl.ServiceEffectSpecificationImpl#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceEffectSpecificationImpl extends EObjectImpl implements ServiceEffectSpecification {
   /**
    * The default value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSeffTypeID()
    * @generated
    * @ordered
    */
   protected static final String SEFF_TYPE_ID_EDEFAULT = "1";

   /**
    * The cached value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSeffTypeID()
    * @generated
    * @ordered
    */
   protected String seffTypeID = SEFF_TYPE_ID_EDEFAULT;

   /**
    * The cached value of the '{@link #getDescribedService__SEFF() <em>Described Service SEFF</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDescribedService__SEFF()
    * @generated
    * @ordered
    */
   protected Signature describedService__SEFF;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ServiceEffectSpecificationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_av_pcPackage.Literals.SERVICE_EFFECT_SPECIFICATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getSeffTypeID() {
      return seffTypeID;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSeffTypeID(String newSeffTypeID) {
      String oldSeffTypeID = seffTypeID;
      seffTypeID = newSeffTypeID;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID, oldSeffTypeID, seffTypeID));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Signature getDescribedService__SEFF() {
      if (describedService__SEFF != null && describedService__SEFF.eIsProxy()) {
         InternalEObject oldDescribedService__SEFF = (InternalEObject)describedService__SEFF;
         describedService__SEFF = (Signature)eResolveProxy(oldDescribedService__SEFF);
         if (describedService__SEFF != oldDescribedService__SEFF) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF, oldDescribedService__SEFF, describedService__SEFF));
         }
      }
      return describedService__SEFF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Signature basicGetDescribedService__SEFF() {
      return describedService__SEFF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDescribedService__SEFF(Signature newDescribedService__SEFF) {
      Signature oldDescribedService__SEFF = describedService__SEFF;
      describedService__SEFF = newDescribedService__SEFF;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF, oldDescribedService__SEFF, describedService__SEFF));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BasicComponent getBasicComponent_ServiceEffectSpecification() {
      if (eContainerFeatureID() != Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION) return null;
      return (BasicComponent)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBasicComponent_ServiceEffectSpecification(BasicComponent newBasicComponent_ServiceEffectSpecification, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newBasicComponent_ServiceEffectSpecification, Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBasicComponent_ServiceEffectSpecification(BasicComponent newBasicComponent_ServiceEffectSpecification) {
      if (newBasicComponent_ServiceEffectSpecification != eInternalContainer() || (eContainerFeatureID() != Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION && newBasicComponent_ServiceEffectSpecification != null)) {
         if (EcoreUtil.isAncestor(this, newBasicComponent_ServiceEffectSpecification))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newBasicComponent_ServiceEffectSpecification != null)
            msgs = ((InternalEObject)newBasicComponent_ServiceEffectSpecification).eInverseAdd(this, Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT, BasicComponent.class, msgs);
         msgs = basicSetBasicComponent_ServiceEffectSpecification(newBasicComponent_ServiceEffectSpecification, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION, newBasicComponent_ServiceEffectSpecification, newBasicComponent_ServiceEffectSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_av_pcValidator.DIAGNOSTIC_SOURCE,
                   Seff_av_pcValidator.SERVICE_EFFECT_SPECIFICATION__REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole", EObjectValidator.getObjectLabel(this, context) }),
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
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetBasicComponent_ServiceEffectSpecification((BasicComponent)otherEnd, msgs);
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
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            return basicSetBasicComponent_ServiceEffectSpecification(null, msgs);
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
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            return eInternalContainer().eInverseRemove(this, Repository_av_pcPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT, BasicComponent.class, msgs);
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
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID:
            return getSeffTypeID();
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF:
            if (resolve) return getDescribedService__SEFF();
            return basicGetDescribedService__SEFF();
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            return getBasicComponent_ServiceEffectSpecification();
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
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID:
            setSeffTypeID((String)newValue);
            return;
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF:
            setDescribedService__SEFF((Signature)newValue);
            return;
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            setBasicComponent_ServiceEffectSpecification((BasicComponent)newValue);
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
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID:
            setSeffTypeID(SEFF_TYPE_ID_EDEFAULT);
            return;
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF:
            setDescribedService__SEFF((Signature)null);
            return;
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            setBasicComponent_ServiceEffectSpecification((BasicComponent)null);
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
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID:
            return SEFF_TYPE_ID_EDEFAULT == null ? seffTypeID != null : !SEFF_TYPE_ID_EDEFAULT.equals(seffTypeID);
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF:
            return describedService__SEFF != null;
         case Seff_av_pcPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            return getBasicComponent_ServiceEffectSpecification() != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (seffTypeID: ");
      result.append(seffTypeID);
      result.append(')');
      return result.toString();
   }

} //ServiceEffectSpecificationImpl
