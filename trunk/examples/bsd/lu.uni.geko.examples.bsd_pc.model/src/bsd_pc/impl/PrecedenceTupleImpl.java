/**
 */
package bsd_pc.impl;

import bsd_pc.Bsd_pcPackage;
import bsd_pc.Event;
import bsd_pc.PrecedenceTuple;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bsd_pc.impl.PrecedenceTupleImpl#getPrecedingEvent <em>Preceding Event</em>}</li>
 *   <li>{@link bsd_pc.impl.PrecedenceTupleImpl#getSubsequentEvent <em>Subsequent Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceTupleImpl extends EObjectImpl implements PrecedenceTuple {
	/**
	 * The cached value of the '{@link #getPrecedingEvent() <em>Preceding Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingEvent()
	 * @generated
	 * @ordered
	 */
	protected Event precedingEvent;

	/**
	 * The cached value of the '{@link #getSubsequentEvent() <em>Subsequent Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentEvent()
	 * @generated
	 * @ordered
	 */
	protected Event subsequentEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceTupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bsd_pcPackage.Literals.PRECEDENCE_TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getPrecedingEvent() {
		if (precedingEvent != null && precedingEvent.eIsProxy()) {
			InternalEObject oldPrecedingEvent = (InternalEObject)precedingEvent;
			precedingEvent = (Event)eResolveProxy(oldPrecedingEvent);
			if (precedingEvent != oldPrecedingEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bsd_pcPackage.PRECEDENCE_TUPLE__PRECEDING_EVENT, oldPrecedingEvent, precedingEvent));
			}
		}
		return precedingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetPrecedingEvent() {
		return precedingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedingEvent(Event newPrecedingEvent) {
		Event oldPrecedingEvent = precedingEvent;
		precedingEvent = newPrecedingEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bsd_pcPackage.PRECEDENCE_TUPLE__PRECEDING_EVENT, oldPrecedingEvent, precedingEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getSubsequentEvent() {
		if (subsequentEvent != null && subsequentEvent.eIsProxy()) {
			InternalEObject oldSubsequentEvent = (InternalEObject)subsequentEvent;
			subsequentEvent = (Event)eResolveProxy(oldSubsequentEvent);
			if (subsequentEvent != oldSubsequentEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bsd_pcPackage.PRECEDENCE_TUPLE__SUBSEQUENT_EVENT, oldSubsequentEvent, subsequentEvent));
			}
		}
		return subsequentEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetSubsequentEvent() {
		return subsequentEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsequentEvent(Event newSubsequentEvent) {
		Event oldSubsequentEvent = subsequentEvent;
		subsequentEvent = newSubsequentEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bsd_pcPackage.PRECEDENCE_TUPLE__SUBSEQUENT_EVENT, oldSubsequentEvent, subsequentEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bsd_pcPackage.PRECEDENCE_TUPLE__PRECEDING_EVENT:
				if (resolve) return getPrecedingEvent();
				return basicGetPrecedingEvent();
			case Bsd_pcPackage.PRECEDENCE_TUPLE__SUBSEQUENT_EVENT:
				if (resolve) return getSubsequentEvent();
				return basicGetSubsequentEvent();
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
			case Bsd_pcPackage.PRECEDENCE_TUPLE__PRECEDING_EVENT:
				setPrecedingEvent((Event)newValue);
				return;
			case Bsd_pcPackage.PRECEDENCE_TUPLE__SUBSEQUENT_EVENT:
				setSubsequentEvent((Event)newValue);
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
			case Bsd_pcPackage.PRECEDENCE_TUPLE__PRECEDING_EVENT:
				setPrecedingEvent((Event)null);
				return;
			case Bsd_pcPackage.PRECEDENCE_TUPLE__SUBSEQUENT_EVENT:
				setSubsequentEvent((Event)null);
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
			case Bsd_pcPackage.PRECEDENCE_TUPLE__PRECEDING_EVENT:
				return precedingEvent != null;
			case Bsd_pcPackage.PRECEDENCE_TUPLE__SUBSEQUENT_EVENT:
				return subsequentEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //PrecedenceTupleImpl
