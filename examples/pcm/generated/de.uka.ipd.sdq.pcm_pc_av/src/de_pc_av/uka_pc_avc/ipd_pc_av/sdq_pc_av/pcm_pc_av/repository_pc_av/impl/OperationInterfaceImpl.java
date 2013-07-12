/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationInterface;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.util.Repository_pc_avValidator;

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
 * An implementation of the model object '<em><b>Operation Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationInterfaceImpl#getSignatures__OperationInterface <em>Signatures Operation Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationInterfaceImpl extends InterfaceImpl implements OperationInterface {
   /**
    * The cached value of the '{@link #getSignatures__OperationInterface() <em>Signatures Operation Interface</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSignatures__OperationInterface()
    * @generated
    * @ordered
    */
   protected EList<OperationSignature> signatures__OperationInterface;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected OperationInterfaceImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_avPackage.Literals.OPERATION_INTERFACE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<OperationSignature> getSignatures__OperationInterface() {
      if (signatures__OperationInterface == null) {
         signatures__OperationInterface = new EObjectContainmentWithInverseEList<OperationSignature>(OperationSignature.class, this, Repository_pc_avPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE, Repository_pc_avPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE);
      }
      return signatures__OperationInterface;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean SignaturesHaveToBeUniqueForAnInterface(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Repository_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Repository_pc_avValidator.OPERATION_INTERFACE__SIGNATURES_HAVE_TO_BE_UNIQUE_FOR_AN_INTERFACE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SignaturesHaveToBeUniqueForAnInterface", EObjectValidator.getObjectLabel(this, context) }),
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
         case Repository_pc_avPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignatures__OperationInterface()).basicAdd(otherEnd, msgs);
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
         case Repository_pc_avPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE:
            return ((InternalEList<?>)getSignatures__OperationInterface()).basicRemove(otherEnd, msgs);
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
         case Repository_pc_avPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE:
            return getSignatures__OperationInterface();
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
         case Repository_pc_avPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE:
            getSignatures__OperationInterface().clear();
            getSignatures__OperationInterface().addAll((Collection<? extends OperationSignature>)newValue);
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
         case Repository_pc_avPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE:
            getSignatures__OperationInterface().clear();
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
         case Repository_pc_avPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE:
            return signatures__OperationInterface != null && !signatures__OperationInterface.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //OperationInterfaceImpl
