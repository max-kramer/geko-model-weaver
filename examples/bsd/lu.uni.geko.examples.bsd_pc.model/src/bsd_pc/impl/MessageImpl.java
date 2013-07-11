/**
 */
package bsd_pc.impl;

import bsd_pc.Bsd_pcPackage;
import bsd_pc.Message;
import bsd_pc.ReceiveEvent;
import bsd_pc.SendEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bsd_pc.impl.MessageImpl#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link bsd_pc.impl.MessageImpl#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link bsd_pc.impl.MessageImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link bsd_pc.impl.MessageImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message {
	/**
	 * The cached value of the '{@link #getSendEvent() <em>Send Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendEvent()
	 * @generated
	 * @ordered
	 */
	protected SendEvent sendEvent;

	/**
	 * The cached value of the '{@link #getReceiveEvent() <em>Receive Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEvent()
	 * @generated
	 * @ordered
	 */
	protected ReceiveEvent receiveEvent;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bsd_pcPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendEvent getSendEvent() {
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendEvent(SendEvent newSendEvent, NotificationChain msgs) {
		SendEvent oldSendEvent = sendEvent;
		sendEvent = newSendEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bsd_pcPackage.MESSAGE__SEND_EVENT, oldSendEvent, newSendEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendEvent(SendEvent newSendEvent) {
		if (newSendEvent != sendEvent) {
			NotificationChain msgs = null;
			if (sendEvent != null)
				msgs = ((InternalEObject)sendEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bsd_pcPackage.MESSAGE__SEND_EVENT, null, msgs);
			if (newSendEvent != null)
				msgs = ((InternalEObject)newSendEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bsd_pcPackage.MESSAGE__SEND_EVENT, null, msgs);
			msgs = basicSetSendEvent(newSendEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bsd_pcPackage.MESSAGE__SEND_EVENT, newSendEvent, newSendEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveEvent getReceiveEvent() {
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveEvent(ReceiveEvent newReceiveEvent, NotificationChain msgs) {
		ReceiveEvent oldReceiveEvent = receiveEvent;
		receiveEvent = newReceiveEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bsd_pcPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, newReceiveEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveEvent(ReceiveEvent newReceiveEvent) {
		if (newReceiveEvent != receiveEvent) {
			NotificationChain msgs = null;
			if (receiveEvent != null)
				msgs = ((InternalEObject)receiveEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bsd_pcPackage.MESSAGE__RECEIVE_EVENT, null, msgs);
			if (newReceiveEvent != null)
				msgs = ((InternalEObject)newReceiveEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bsd_pcPackage.MESSAGE__RECEIVE_EVENT, null, msgs);
			msgs = basicSetReceiveEvent(newReceiveEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bsd_pcPackage.MESSAGE__RECEIVE_EVENT, newReceiveEvent, newReceiveEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<String>(String.class, this, Bsd_pcPackage.MESSAGE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getType() {
		if (type == null) {
			type = new EDataTypeUniqueEList<String>(String.class, this, Bsd_pcPackage.MESSAGE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bsd_pcPackage.MESSAGE__SEND_EVENT:
				return basicSetSendEvent(null, msgs);
			case Bsd_pcPackage.MESSAGE__RECEIVE_EVENT:
				return basicSetReceiveEvent(null, msgs);
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
			case Bsd_pcPackage.MESSAGE__SEND_EVENT:
				return getSendEvent();
			case Bsd_pcPackage.MESSAGE__RECEIVE_EVENT:
				return getReceiveEvent();
			case Bsd_pcPackage.MESSAGE__PARAMETERS:
				return getParameters();
			case Bsd_pcPackage.MESSAGE__TYPE:
				return getType();
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
			case Bsd_pcPackage.MESSAGE__SEND_EVENT:
				setSendEvent((SendEvent)newValue);
				return;
			case Bsd_pcPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((ReceiveEvent)newValue);
				return;
			case Bsd_pcPackage.MESSAGE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case Bsd_pcPackage.MESSAGE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends String>)newValue);
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
			case Bsd_pcPackage.MESSAGE__SEND_EVENT:
				setSendEvent((SendEvent)null);
				return;
			case Bsd_pcPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((ReceiveEvent)null);
				return;
			case Bsd_pcPackage.MESSAGE__PARAMETERS:
				getParameters().clear();
				return;
			case Bsd_pcPackage.MESSAGE__TYPE:
				getType().clear();
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
			case Bsd_pcPackage.MESSAGE__SEND_EVENT:
				return sendEvent != null;
			case Bsd_pcPackage.MESSAGE__RECEIVE_EVENT:
				return receiveEvent != null;
			case Bsd_pcPackage.MESSAGE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Bsd_pcPackage.MESSAGE__TYPE:
				return type != null && !type.isEmpty();
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
