/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.impl.EntityImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.FailureType;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.ExceptionType;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Signature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.SignatureImpl#getExceptions__Signature <em>Exceptions Signature</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.SignatureImpl#getFailureType <em>Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureImpl extends EntityImpl implements Signature {
   /**
    * The cached value of the '{@link #getExceptions__Signature() <em>Exceptions Signature</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExceptions__Signature()
    * @generated
    * @ordered
    */
   protected EList<ExceptionType> exceptions__Signature;

   /**
    * The cached value of the '{@link #getFailureType() <em>Failure Type</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureType()
    * @generated
    * @ordered
    */
   protected EList<FailureType> failureType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SignatureImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_av_avPackage.Literals.SIGNATURE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ExceptionType> getExceptions__Signature() {
      if (exceptions__Signature == null) {
         exceptions__Signature = new EObjectContainmentEList<ExceptionType>(ExceptionType.class, this, Repository_av_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE);
      }
      return exceptions__Signature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<FailureType> getFailureType() {
      if (failureType == null) {
         failureType = new EObjectResolvingEList<FailureType>(FailureType.class, this, Repository_av_avPackage.SIGNATURE__FAILURE_TYPE);
      }
      return failureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_av_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            return ((InternalEList<?>)getExceptions__Signature()).basicRemove(otherEnd, msgs);
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
         case Repository_av_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            return getExceptions__Signature();
         case Repository_av_avPackage.SIGNATURE__FAILURE_TYPE:
            return getFailureType();
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
         case Repository_av_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            getExceptions__Signature().clear();
            getExceptions__Signature().addAll((Collection<? extends ExceptionType>)newValue);
            return;
         case Repository_av_avPackage.SIGNATURE__FAILURE_TYPE:
            getFailureType().clear();
            getFailureType().addAll((Collection<? extends FailureType>)newValue);
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
         case Repository_av_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            getExceptions__Signature().clear();
            return;
         case Repository_av_avPackage.SIGNATURE__FAILURE_TYPE:
            getFailureType().clear();
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
         case Repository_av_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            return exceptions__Signature != null && !exceptions__Signature.isEmpty();
         case Repository_av_avPackage.SIGNATURE__FAILURE_TYPE:
            return failureType != null && !failureType.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //SignatureImpl
