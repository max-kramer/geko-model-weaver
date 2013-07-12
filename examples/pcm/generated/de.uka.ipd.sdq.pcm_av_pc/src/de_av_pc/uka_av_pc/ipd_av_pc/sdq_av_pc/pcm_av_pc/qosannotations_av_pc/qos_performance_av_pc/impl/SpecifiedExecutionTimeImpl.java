/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.Core_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.PCMRandomVariable;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.impl.SpecifiedQoSAnnotationImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.Qos_performance_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.SpecifiedExecutionTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specified Execution Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.impl.SpecifiedExecutionTimeImpl#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecifiedExecutionTimeImpl extends SpecifiedQoSAnnotationImpl implements SpecifiedExecutionTime {
   /**
    * The cached value of the '{@link #getSpecification_SpecifiedExecutionTime() <em>Specification Specified Execution Time</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSpecification_SpecifiedExecutionTime()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable specification_SpecifiedExecutionTime;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SpecifiedExecutionTimeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Qos_performance_av_pcPackage.Literals.SPECIFIED_EXECUTION_TIME;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getSpecification_SpecifiedExecutionTime() {
      return specification_SpecifiedExecutionTime;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSpecification_SpecifiedExecutionTime(PCMRandomVariable newSpecification_SpecifiedExecutionTime, NotificationChain msgs) {
      PCMRandomVariable oldSpecification_SpecifiedExecutionTime = specification_SpecifiedExecutionTime;
      specification_SpecifiedExecutionTime = newSpecification_SpecifiedExecutionTime;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME, oldSpecification_SpecifiedExecutionTime, newSpecification_SpecifiedExecutionTime);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSpecification_SpecifiedExecutionTime(PCMRandomVariable newSpecification_SpecifiedExecutionTime) {
      if (newSpecification_SpecifiedExecutionTime != specification_SpecifiedExecutionTime) {
         NotificationChain msgs = null;
         if (specification_SpecifiedExecutionTime != null)
            msgs = ((InternalEObject)specification_SpecifiedExecutionTime).eInverseRemove(this, Core_av_pcPackage.PCM_RANDOM_VARIABLE__SPECIFIED_EXECUTION_TIME_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newSpecification_SpecifiedExecutionTime != null)
            msgs = ((InternalEObject)newSpecification_SpecifiedExecutionTime).eInverseAdd(this, Core_av_pcPackage.PCM_RANDOM_VARIABLE__SPECIFIED_EXECUTION_TIME_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetSpecification_SpecifiedExecutionTime(newSpecification_SpecifiedExecutionTime, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME, newSpecification_SpecifiedExecutionTime, newSpecification_SpecifiedExecutionTime));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
            if (specification_SpecifiedExecutionTime != null)
               msgs = ((InternalEObject)specification_SpecifiedExecutionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME, null, msgs);
            return basicSetSpecification_SpecifiedExecutionTime((PCMRandomVariable)otherEnd, msgs);
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
         case Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
            return basicSetSpecification_SpecifiedExecutionTime(null, msgs);
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
         case Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
            return getSpecification_SpecifiedExecutionTime();
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
         case Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
            setSpecification_SpecifiedExecutionTime((PCMRandomVariable)newValue);
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
         case Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
            setSpecification_SpecifiedExecutionTime((PCMRandomVariable)null);
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
         case Qos_performance_av_pcPackage.SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
            return specification_SpecifiedExecutionTime != null;
      }
      return super.eIsSet(featureID);
   }

} //SpecifiedExecutionTimeImpl
