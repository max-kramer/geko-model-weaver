/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.DataType;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.OperationInterface;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.OperationSignature;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Parameter;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.util.Repository_av_pcValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.OperationSignatureImpl#getInterface__OperationSignature <em>Interface Operation Signature</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.OperationSignatureImpl#getParameters__OperationSignature <em>Parameters Operation Signature</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.OperationSignatureImpl#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationSignatureImpl extends SignatureImpl implements OperationSignature {
   /**
    * The cached value of the '{@link #getParameters__OperationSignature() <em>Parameters Operation Signature</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameters__OperationSignature()
    * @generated
    * @ordered
    */
   protected EList<Parameter> parameters__OperationSignature;

   /**
    * The cached value of the '{@link #getReturnType__OperationSignature() <em>Return Type Operation Signature</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReturnType__OperationSignature()
    * @generated
    * @ordered
    */
   protected DataType returnType__OperationSignature;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected OperationSignatureImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_av_pcPackage.Literals.OPERATION_SIGNATURE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationInterface getInterface__OperationSignature() {
      if (eContainerFeatureID() != Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE) return null;
      return (OperationInterface)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInterface__OperationSignature(OperationInterface newInterface__OperationSignature, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newInterface__OperationSignature, Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInterface__OperationSignature(OperationInterface newInterface__OperationSignature) {
      if (newInterface__OperationSignature != eInternalContainer() || (eContainerFeatureID() != Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE && newInterface__OperationSignature != null)) {
         if (EcoreUtil.isAncestor(this, newInterface__OperationSignature))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newInterface__OperationSignature != null)
            msgs = ((InternalEObject)newInterface__OperationSignature).eInverseAdd(this, Repository_av_pcPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE, OperationInterface.class, msgs);
         msgs = basicSetInterface__OperationSignature(newInterface__OperationSignature, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE, newInterface__OperationSignature, newInterface__OperationSignature));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Parameter> getParameters__OperationSignature() {
      if (parameters__OperationSignature == null) {
         parameters__OperationSignature = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, Repository_av_pcPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE, Repository_av_pcPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER);
      }
      return parameters__OperationSignature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType getReturnType__OperationSignature() {
      if (returnType__OperationSignature != null && returnType__OperationSignature.eIsProxy()) {
         InternalEObject oldReturnType__OperationSignature = (InternalEObject)returnType__OperationSignature;
         returnType__OperationSignature = (DataType)eResolveProxy(oldReturnType__OperationSignature);
         if (returnType__OperationSignature != oldReturnType__OperationSignature) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_av_pcPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE, oldReturnType__OperationSignature, returnType__OperationSignature));
         }
      }
      return returnType__OperationSignature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType basicGetReturnType__OperationSignature() {
      return returnType__OperationSignature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setReturnType__OperationSignature(DataType newReturnType__OperationSignature) {
      DataType oldReturnType__OperationSignature = returnType__OperationSignature;
      returnType__OperationSignature = newReturnType__OperationSignature;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_av_pcPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE, oldReturnType__OperationSignature, returnType__OperationSignature));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean ParameterNamesHaveToBeUniqueForASignature(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                   Repository_av_pcValidator.OPERATION_SIGNATURE__PARAMETER_NAMES_HAVE_TO_BE_UNIQUE_FOR_ASIGNATURE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ParameterNamesHaveToBeUniqueForASignature", EObjectValidator.getObjectLabel(this, context) }),
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
         case Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInterface__OperationSignature((OperationInterface)otherEnd, msgs);
         case Repository_av_pcPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters__OperationSignature()).basicAdd(otherEnd, msgs);
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
         case Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
            return basicSetInterface__OperationSignature(null, msgs);
         case Repository_av_pcPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
            return ((InternalEList<?>)getParameters__OperationSignature()).basicRemove(otherEnd, msgs);
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
         case Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
            return eInternalContainer().eInverseRemove(this, Repository_av_pcPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE, OperationInterface.class, msgs);
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
         case Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
            return getInterface__OperationSignature();
         case Repository_av_pcPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
            return getParameters__OperationSignature();
         case Repository_av_pcPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE:
            if (resolve) return getReturnType__OperationSignature();
            return basicGetReturnType__OperationSignature();
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
         case Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
            setInterface__OperationSignature((OperationInterface)newValue);
            return;
         case Repository_av_pcPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
            getParameters__OperationSignature().clear();
            getParameters__OperationSignature().addAll((Collection<? extends Parameter>)newValue);
            return;
         case Repository_av_pcPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE:
            setReturnType__OperationSignature((DataType)newValue);
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
         case Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
            setInterface__OperationSignature((OperationInterface)null);
            return;
         case Repository_av_pcPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
            getParameters__OperationSignature().clear();
            return;
         case Repository_av_pcPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE:
            setReturnType__OperationSignature((DataType)null);
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
         case Repository_av_pcPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
            return getInterface__OperationSignature() != null;
         case Repository_av_pcPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
            return parameters__OperationSignature != null && !parameters__OperationSignature.isEmpty();
         case Repository_av_pcPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE:
            return returnType__OperationSignature != null;
      }
      return super.eIsSet(featureID);
   }

} //OperationSignatureImpl
