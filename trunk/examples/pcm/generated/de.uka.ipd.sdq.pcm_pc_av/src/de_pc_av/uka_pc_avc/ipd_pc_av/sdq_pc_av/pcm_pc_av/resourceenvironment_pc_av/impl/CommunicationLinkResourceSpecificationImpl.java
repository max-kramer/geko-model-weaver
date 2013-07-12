/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.impl.IdentifierImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.Core_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.CommunicationLinkResourceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl#getFailureProbability <em>Failure Probability</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationLinkResourceSpecificationImpl extends IdentifierImpl implements CommunicationLinkResourceSpecification {
   /**
    * The default value of the '{@link #getFailureProbability() <em>Failure Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureProbability()
    * @generated
    * @ordered
    */
   protected static final double FAILURE_PROBABILITY_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getFailureProbability() <em>Failure Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureProbability()
    * @generated
    * @ordered
    */
   protected double failureProbability = FAILURE_PROBABILITY_EDEFAULT;

   /**
    * The cached value of the '{@link #getCommunicationLinkResourceType_CommunicationLinkResourceSpecification() <em>Communication Link Resource Type Communication Link Resource Specification</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()
    * @generated
    * @ordered
    */
   protected CommunicationLinkResourceType communicationLinkResourceType_CommunicationLinkResourceSpecification;

   /**
    * The cached value of the '{@link #getLatency_CommunicationLinkResourceSpecification() <em>Latency Communication Link Resource Specification</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLatency_CommunicationLinkResourceSpecification()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable latency_CommunicationLinkResourceSpecification;

   /**
    * The cached value of the '{@link #getThroughput_CommunicationLinkResourceSpecification() <em>Throughput Communication Link Resource Specification</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getThroughput_CommunicationLinkResourceSpecification()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable throughput_CommunicationLinkResourceSpecification;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CommunicationLinkResourceSpecificationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourceenvironment_pc_avPackage.Literals.COMMUNICATION_LINK_RESOURCE_SPECIFICATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public LinkingResource getLinkingResource_CommunicationLinkResourceSpecification() {
      if (eContainerFeatureID() != Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION) return null;
      return (LinkingResource)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLinkingResource_CommunicationLinkResourceSpecification(LinkingResource newLinkingResource_CommunicationLinkResourceSpecification, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newLinkingResource_CommunicationLinkResourceSpecification, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLinkingResource_CommunicationLinkResourceSpecification(LinkingResource newLinkingResource_CommunicationLinkResourceSpecification) {
      if (newLinkingResource_CommunicationLinkResourceSpecification != eInternalContainer() || (eContainerFeatureID() != Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION && newLinkingResource_CommunicationLinkResourceSpecification != null)) {
         if (EcoreUtil.isAncestor(this, newLinkingResource_CommunicationLinkResourceSpecification))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newLinkingResource_CommunicationLinkResourceSpecification != null)
            msgs = ((InternalEObject)newLinkingResource_CommunicationLinkResourceSpecification).eInverseAdd(this, Resourceenvironment_pc_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, LinkingResource.class, msgs);
         msgs = basicSetLinkingResource_CommunicationLinkResourceSpecification(newLinkingResource_CommunicationLinkResourceSpecification, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, newLinkingResource_CommunicationLinkResourceSpecification, newLinkingResource_CommunicationLinkResourceSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getFailureProbability() {
      return failureProbability;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setFailureProbability(double newFailureProbability) {
      double oldFailureProbability = failureProbability;
      failureProbability = newFailureProbability;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY, oldFailureProbability, failureProbability));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType getCommunicationLinkResourceType_CommunicationLinkResourceSpecification() {
      if (communicationLinkResourceType_CommunicationLinkResourceSpecification != null && communicationLinkResourceType_CommunicationLinkResourceSpecification.eIsProxy()) {
         InternalEObject oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification = (InternalEObject)communicationLinkResourceType_CommunicationLinkResourceSpecification;
         communicationLinkResourceType_CommunicationLinkResourceSpecification = (CommunicationLinkResourceType)eResolveProxy(oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification);
         if (communicationLinkResourceType_CommunicationLinkResourceSpecification != oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification, communicationLinkResourceType_CommunicationLinkResourceSpecification));
         }
      }
      return communicationLinkResourceType_CommunicationLinkResourceSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType basicGetCommunicationLinkResourceType_CommunicationLinkResourceSpecification() {
      return communicationLinkResourceType_CommunicationLinkResourceSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCommunicationLinkResourceType_CommunicationLinkResourceSpecification(CommunicationLinkResourceType newCommunicationLinkResourceType_CommunicationLinkResourceSpecification) {
      CommunicationLinkResourceType oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification = communicationLinkResourceType_CommunicationLinkResourceSpecification;
      communicationLinkResourceType_CommunicationLinkResourceSpecification = newCommunicationLinkResourceType_CommunicationLinkResourceSpecification;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification, communicationLinkResourceType_CommunicationLinkResourceSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getLatency_CommunicationLinkResourceSpecification() {
      return latency_CommunicationLinkResourceSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLatency_CommunicationLinkResourceSpecification(PCMRandomVariable newLatency_CommunicationLinkResourceSpecification, NotificationChain msgs) {
      PCMRandomVariable oldLatency_CommunicationLinkResourceSpecification = latency_CommunicationLinkResourceSpecification;
      latency_CommunicationLinkResourceSpecification = newLatency_CommunicationLinkResourceSpecification;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, oldLatency_CommunicationLinkResourceSpecification, newLatency_CommunicationLinkResourceSpecification);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLatency_CommunicationLinkResourceSpecification(PCMRandomVariable newLatency_CommunicationLinkResourceSpecification) {
      if (newLatency_CommunicationLinkResourceSpecification != latency_CommunicationLinkResourceSpecification) {
         NotificationChain msgs = null;
         if (latency_CommunicationLinkResourceSpecification != null)
            msgs = ((InternalEObject)latency_CommunicationLinkResourceSpecification).eInverseRemove(this, Core_pc_avPackage.PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFICATION_LATENCY_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newLatency_CommunicationLinkResourceSpecification != null)
            msgs = ((InternalEObject)newLatency_CommunicationLinkResourceSpecification).eInverseAdd(this, Core_pc_avPackage.PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFICATION_LATENCY_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetLatency_CommunicationLinkResourceSpecification(newLatency_CommunicationLinkResourceSpecification, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, newLatency_CommunicationLinkResourceSpecification, newLatency_CommunicationLinkResourceSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getThroughput_CommunicationLinkResourceSpecification() {
      return throughput_CommunicationLinkResourceSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable newThroughput_CommunicationLinkResourceSpecification, NotificationChain msgs) {
      PCMRandomVariable oldThroughput_CommunicationLinkResourceSpecification = throughput_CommunicationLinkResourceSpecification;
      throughput_CommunicationLinkResourceSpecification = newThroughput_CommunicationLinkResourceSpecification;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, oldThroughput_CommunicationLinkResourceSpecification, newThroughput_CommunicationLinkResourceSpecification);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable newThroughput_CommunicationLinkResourceSpecification) {
      if (newThroughput_CommunicationLinkResourceSpecification != throughput_CommunicationLinkResourceSpecification) {
         NotificationChain msgs = null;
         if (throughput_CommunicationLinkResourceSpecification != null)
            msgs = ((InternalEObject)throughput_CommunicationLinkResourceSpecification).eInverseRemove(this, Core_pc_avPackage.PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFCATION_THROUGHPUT_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newThroughput_CommunicationLinkResourceSpecification != null)
            msgs = ((InternalEObject)newThroughput_CommunicationLinkResourceSpecification).eInverseAdd(this, Core_pc_avPackage.PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFCATION_THROUGHPUT_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetThroughput_CommunicationLinkResourceSpecification(newThroughput_CommunicationLinkResourceSpecification, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, newThroughput_CommunicationLinkResourceSpecification, newThroughput_CommunicationLinkResourceSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetLinkingResource_CommunicationLinkResourceSpecification((LinkingResource)otherEnd, msgs);
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            if (latency_CommunicationLinkResourceSpecification != null)
               msgs = ((InternalEObject)latency_CommunicationLinkResourceSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, null, msgs);
            return basicSetLatency_CommunicationLinkResourceSpecification((PCMRandomVariable)otherEnd, msgs);
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            if (throughput_CommunicationLinkResourceSpecification != null)
               msgs = ((InternalEObject)throughput_CommunicationLinkResourceSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, null, msgs);
            return basicSetThroughput_CommunicationLinkResourceSpecification((PCMRandomVariable)otherEnd, msgs);
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
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return basicSetLinkingResource_CommunicationLinkResourceSpecification(null, msgs);
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return basicSetLatency_CommunicationLinkResourceSpecification(null, msgs);
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return basicSetThroughput_CommunicationLinkResourceSpecification(null, msgs);
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
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return eInternalContainer().eInverseRemove(this, Resourceenvironment_pc_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, LinkingResource.class, msgs);
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
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return getLinkingResource_CommunicationLinkResourceSpecification();
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY:
            return getFailureProbability();
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            if (resolve) return getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
            return basicGetCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return getLatency_CommunicationLinkResourceSpecification();
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return getThroughput_CommunicationLinkResourceSpecification();
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
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            setLinkingResource_CommunicationLinkResourceSpecification((LinkingResource)newValue);
            return;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY:
            setFailureProbability((Double)newValue);
            return;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            setCommunicationLinkResourceType_CommunicationLinkResourceSpecification((CommunicationLinkResourceType)newValue);
            return;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            setLatency_CommunicationLinkResourceSpecification((PCMRandomVariable)newValue);
            return;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            setThroughput_CommunicationLinkResourceSpecification((PCMRandomVariable)newValue);
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
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            setLinkingResource_CommunicationLinkResourceSpecification((LinkingResource)null);
            return;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY:
            setFailureProbability(FAILURE_PROBABILITY_EDEFAULT);
            return;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            setCommunicationLinkResourceType_CommunicationLinkResourceSpecification((CommunicationLinkResourceType)null);
            return;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            setLatency_CommunicationLinkResourceSpecification((PCMRandomVariable)null);
            return;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            setThroughput_CommunicationLinkResourceSpecification((PCMRandomVariable)null);
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
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return getLinkingResource_CommunicationLinkResourceSpecification() != null;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY:
            return failureProbability != FAILURE_PROBABILITY_EDEFAULT;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return communicationLinkResourceType_CommunicationLinkResourceSpecification != null;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return latency_CommunicationLinkResourceSpecification != null;
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
            return throughput_CommunicationLinkResourceSpecification != null;
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
      result.append(" (failureProbability: ");
      result.append(failureProbability);
      result.append(')');
      return result.toString();
   }

} //CommunicationLinkResourceSpecificationImpl
