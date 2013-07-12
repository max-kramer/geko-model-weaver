/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureInterface;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureSignature;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.InfrastructureInterfaceImpl#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureInterfaceImpl extends InterfaceImpl implements InfrastructureInterface {
   /**
    * The cached value of the '{@link #getInfrastructureSignatures__InfrastructureInterface() <em>Infrastructure Signatures Infrastructure Interface</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInfrastructureSignatures__InfrastructureInterface()
    * @generated
    * @ordered
    */
   protected EList<InfrastructureSignature> infrastructureSignatures__InfrastructureInterface;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InfrastructureInterfaceImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_pcPackage.Literals.INFRASTRUCTURE_INTERFACE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<InfrastructureSignature> getInfrastructureSignatures__InfrastructureInterface() {
      if (infrastructureSignatures__InfrastructureInterface == null) {
         infrastructureSignatures__InfrastructureInterface = new EObjectContainmentWithInverseEList<InfrastructureSignature>(InfrastructureSignature.class, this, Repository_pc_pcPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE, Repository_pc_pcPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE);
      }
      return infrastructureSignatures__InfrastructureInterface;
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfrastructureSignatures__InfrastructureInterface()).basicAdd(otherEnd, msgs);
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE:
            return ((InternalEList<?>)getInfrastructureSignatures__InfrastructureInterface()).basicRemove(otherEnd, msgs);
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE:
            return getInfrastructureSignatures__InfrastructureInterface();
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE:
            getInfrastructureSignatures__InfrastructureInterface().clear();
            getInfrastructureSignatures__InfrastructureInterface().addAll((Collection<? extends InfrastructureSignature>)newValue);
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE:
            getInfrastructureSignatures__InfrastructureInterface().clear();
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE:
            return infrastructureSignatures__InfrastructureInterface != null && !infrastructureSignatures__InfrastructureInterface.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //InfrastructureInterfaceImpl
