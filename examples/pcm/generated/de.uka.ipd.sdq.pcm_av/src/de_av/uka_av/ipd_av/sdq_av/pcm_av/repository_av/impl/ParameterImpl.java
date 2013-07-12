/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.DataType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.EventType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.InfrastructureSignature;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.OperationSignature;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Parameter;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.ParameterModifier;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceSignature;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.ParameterImpl#getDataType__Parameter <em>Data Type Parameter</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.ParameterImpl#getInfrastructureSignature__Parameter <em>Infrastructure Signature Parameter</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.ParameterImpl#getOperationSignature__Parameter <em>Operation Signature Parameter</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.ParameterImpl#getEventType__Parameter <em>Event Type Parameter</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.ParameterImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.ParameterImpl#getModifier__Parameter <em>Modifier Parameter</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.ParameterImpl#getResourceSignature__Parameter <em>Resource Signature Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
   /**
    * The cached value of the '{@link #getDataType__Parameter() <em>Data Type Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDataType__Parameter()
    * @generated
    * @ordered
    */
   protected DataType dataType__Parameter;

   /**
    * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameterName()
    * @generated
    * @ordered
    */
   protected static final String PARAMETER_NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameterName()
    * @generated
    * @ordered
    */
   protected String parameterName = PARAMETER_NAME_EDEFAULT;

   /**
    * The default value of the '{@link #getModifier__Parameter() <em>Modifier Parameter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getModifier__Parameter()
    * @generated
    * @ordered
    */
   protected static final ParameterModifier MODIFIER_PARAMETER_EDEFAULT = ParameterModifier.NONE;

   /**
    * The cached value of the '{@link #getModifier__Parameter() <em>Modifier Parameter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getModifier__Parameter()
    * @generated
    * @ordered
    */
   protected ParameterModifier modifier__Parameter = MODIFIER_PARAMETER_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ParameterImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_avPackage.Literals.PARAMETER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType getDataType__Parameter() {
      if (dataType__Parameter != null && dataType__Parameter.eIsProxy()) {
         InternalEObject oldDataType__Parameter = (InternalEObject)dataType__Parameter;
         dataType__Parameter = (DataType)eResolveProxy(oldDataType__Parameter);
         if (dataType__Parameter != oldDataType__Parameter) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_avPackage.PARAMETER__DATA_TYPE_PARAMETER, oldDataType__Parameter, dataType__Parameter));
         }
      }
      return dataType__Parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType basicGetDataType__Parameter() {
      return dataType__Parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDataType__Parameter(DataType newDataType__Parameter) {
      DataType oldDataType__Parameter = dataType__Parameter;
      dataType__Parameter = newDataType__Parameter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.PARAMETER__DATA_TYPE_PARAMETER, oldDataType__Parameter, dataType__Parameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureSignature getInfrastructureSignature__Parameter() {
      if (eContainerFeatureID() != Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER) return null;
      return (InfrastructureSignature)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInfrastructureSignature__Parameter(InfrastructureSignature newInfrastructureSignature__Parameter, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newInfrastructureSignature__Parameter, Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInfrastructureSignature__Parameter(InfrastructureSignature newInfrastructureSignature__Parameter) {
      if (newInfrastructureSignature__Parameter != eInternalContainer() || (eContainerFeatureID() != Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER && newInfrastructureSignature__Parameter != null)) {
         if (EcoreUtil.isAncestor(this, newInfrastructureSignature__Parameter))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newInfrastructureSignature__Parameter != null)
            msgs = ((InternalEObject)newInfrastructureSignature__Parameter).eInverseAdd(this, Repository_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE, InfrastructureSignature.class, msgs);
         msgs = basicSetInfrastructureSignature__Parameter(newInfrastructureSignature__Parameter, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER, newInfrastructureSignature__Parameter, newInfrastructureSignature__Parameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationSignature getOperationSignature__Parameter() {
      if (eContainerFeatureID() != Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER) return null;
      return (OperationSignature)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOperationSignature__Parameter(OperationSignature newOperationSignature__Parameter, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newOperationSignature__Parameter, Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOperationSignature__Parameter(OperationSignature newOperationSignature__Parameter) {
      if (newOperationSignature__Parameter != eInternalContainer() || (eContainerFeatureID() != Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER && newOperationSignature__Parameter != null)) {
         if (EcoreUtil.isAncestor(this, newOperationSignature__Parameter))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newOperationSignature__Parameter != null)
            msgs = ((InternalEObject)newOperationSignature__Parameter).eInverseAdd(this, Repository_avPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE, OperationSignature.class, msgs);
         msgs = basicSetOperationSignature__Parameter(newOperationSignature__Parameter, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER, newOperationSignature__Parameter, newOperationSignature__Parameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventType getEventType__Parameter() {
      if (eContainerFeatureID() != Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER) return null;
      return (EventType)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetEventType__Parameter(EventType newEventType__Parameter, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newEventType__Parameter, Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEventType__Parameter(EventType newEventType__Parameter) {
      if (newEventType__Parameter != eInternalContainer() || (eContainerFeatureID() != Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER && newEventType__Parameter != null)) {
         if (EcoreUtil.isAncestor(this, newEventType__Parameter))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newEventType__Parameter != null)
            msgs = ((InternalEObject)newEventType__Parameter).eInverseAdd(this, Repository_avPackage.EVENT_TYPE__PARAMETER_EVENT_TYPE, EventType.class, msgs);
         msgs = basicSetEventType__Parameter(newEventType__Parameter, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER, newEventType__Parameter, newEventType__Parameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getParameterName() {
      return parameterName;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParameterName(String newParameterName) {
      String oldParameterName = parameterName;
      parameterName = newParameterName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.PARAMETER__PARAMETER_NAME, oldParameterName, parameterName));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ParameterModifier getModifier__Parameter() {
      return modifier__Parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setModifier__Parameter(ParameterModifier newModifier__Parameter) {
      ParameterModifier oldModifier__Parameter = modifier__Parameter;
      modifier__Parameter = newModifier__Parameter == null ? MODIFIER_PARAMETER_EDEFAULT : newModifier__Parameter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.PARAMETER__MODIFIER_PARAMETER, oldModifier__Parameter, modifier__Parameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceSignature getResourceSignature__Parameter() {
      if (eContainerFeatureID() != Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER) return null;
      return (ResourceSignature)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceSignature__Parameter(ResourceSignature newResourceSignature__Parameter, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceSignature__Parameter, Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceSignature__Parameter(ResourceSignature newResourceSignature__Parameter) {
      if (newResourceSignature__Parameter != eInternalContainer() || (eContainerFeatureID() != Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER && newResourceSignature__Parameter != null)) {
         if (EcoreUtil.isAncestor(this, newResourceSignature__Parameter))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceSignature__Parameter != null)
            msgs = ((InternalEObject)newResourceSignature__Parameter).eInverseAdd(this, Resourcetype_avPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE, ResourceSignature.class, msgs);
         msgs = basicSetResourceSignature__Parameter(newResourceSignature__Parameter, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER, newResourceSignature__Parameter, newResourceSignature__Parameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInfrastructureSignature__Parameter((InfrastructureSignature)otherEnd, msgs);
         case Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetOperationSignature__Parameter((OperationSignature)otherEnd, msgs);
         case Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetEventType__Parameter((EventType)otherEnd, msgs);
         case Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceSignature__Parameter((ResourceSignature)otherEnd, msgs);
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
         case Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER:
            return basicSetInfrastructureSignature__Parameter(null, msgs);
         case Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER:
            return basicSetOperationSignature__Parameter(null, msgs);
         case Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER:
            return basicSetEventType__Parameter(null, msgs);
         case Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER:
            return basicSetResourceSignature__Parameter(null, msgs);
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
         case Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER:
            return eInternalContainer().eInverseRemove(this, Repository_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE, InfrastructureSignature.class, msgs);
         case Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER:
            return eInternalContainer().eInverseRemove(this, Repository_avPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE, OperationSignature.class, msgs);
         case Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER:
            return eInternalContainer().eInverseRemove(this, Repository_avPackage.EVENT_TYPE__PARAMETER_EVENT_TYPE, EventType.class, msgs);
         case Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER:
            return eInternalContainer().eInverseRemove(this, Resourcetype_avPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE, ResourceSignature.class, msgs);
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
         case Repository_avPackage.PARAMETER__DATA_TYPE_PARAMETER:
            if (resolve) return getDataType__Parameter();
            return basicGetDataType__Parameter();
         case Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER:
            return getInfrastructureSignature__Parameter();
         case Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER:
            return getOperationSignature__Parameter();
         case Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER:
            return getEventType__Parameter();
         case Repository_avPackage.PARAMETER__PARAMETER_NAME:
            return getParameterName();
         case Repository_avPackage.PARAMETER__MODIFIER_PARAMETER:
            return getModifier__Parameter();
         case Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER:
            return getResourceSignature__Parameter();
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
         case Repository_avPackage.PARAMETER__DATA_TYPE_PARAMETER:
            setDataType__Parameter((DataType)newValue);
            return;
         case Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER:
            setInfrastructureSignature__Parameter((InfrastructureSignature)newValue);
            return;
         case Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER:
            setOperationSignature__Parameter((OperationSignature)newValue);
            return;
         case Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER:
            setEventType__Parameter((EventType)newValue);
            return;
         case Repository_avPackage.PARAMETER__PARAMETER_NAME:
            setParameterName((String)newValue);
            return;
         case Repository_avPackage.PARAMETER__MODIFIER_PARAMETER:
            setModifier__Parameter((ParameterModifier)newValue);
            return;
         case Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER:
            setResourceSignature__Parameter((ResourceSignature)newValue);
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
         case Repository_avPackage.PARAMETER__DATA_TYPE_PARAMETER:
            setDataType__Parameter((DataType)null);
            return;
         case Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER:
            setInfrastructureSignature__Parameter((InfrastructureSignature)null);
            return;
         case Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER:
            setOperationSignature__Parameter((OperationSignature)null);
            return;
         case Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER:
            setEventType__Parameter((EventType)null);
            return;
         case Repository_avPackage.PARAMETER__PARAMETER_NAME:
            setParameterName(PARAMETER_NAME_EDEFAULT);
            return;
         case Repository_avPackage.PARAMETER__MODIFIER_PARAMETER:
            setModifier__Parameter(MODIFIER_PARAMETER_EDEFAULT);
            return;
         case Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER:
            setResourceSignature__Parameter((ResourceSignature)null);
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
         case Repository_avPackage.PARAMETER__DATA_TYPE_PARAMETER:
            return dataType__Parameter != null;
         case Repository_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER:
            return getInfrastructureSignature__Parameter() != null;
         case Repository_avPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER:
            return getOperationSignature__Parameter() != null;
         case Repository_avPackage.PARAMETER__EVENT_TYPE_PARAMETER:
            return getEventType__Parameter() != null;
         case Repository_avPackage.PARAMETER__PARAMETER_NAME:
            return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
         case Repository_avPackage.PARAMETER__MODIFIER_PARAMETER:
            return modifier__Parameter != MODIFIER_PARAMETER_EDEFAULT;
         case Repository_avPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER:
            return getResourceSignature__Parameter() != null;
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
      result.append(" (parameterName: ");
      result.append(parameterName);
      result.append(", modifier__Parameter: ");
      result.append(modifier__Parameter);
      result.append(')');
      return result.toString();
   }

} //ParameterImpl
