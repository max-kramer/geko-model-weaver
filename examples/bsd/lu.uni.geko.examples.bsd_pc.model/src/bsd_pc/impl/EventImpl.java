/**
 */
package bsd_pc.impl;

import bsd_pc.Bsd_pcPackage;
import bsd_pc.Event;
import bsd_pc.Lifeline;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bsd_pc.impl.EventImpl#getOwningLifeline <em>Owning Lifeline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends NamedElementImpl implements Event {
	/**
	 * The cached value of the '{@link #getOwningLifeline() <em>Owning Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningLifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline owningLifeline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bsd_pcPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getOwningLifeline() {
		if (owningLifeline != null && owningLifeline.eIsProxy()) {
			InternalEObject oldOwningLifeline = (InternalEObject)owningLifeline;
			owningLifeline = (Lifeline)eResolveProxy(oldOwningLifeline);
			if (owningLifeline != oldOwningLifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bsd_pcPackage.EVENT__OWNING_LIFELINE, oldOwningLifeline, owningLifeline));
			}
		}
		return owningLifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetOwningLifeline() {
		return owningLifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningLifeline(Lifeline newOwningLifeline) {
		Lifeline oldOwningLifeline = owningLifeline;
		owningLifeline = newOwningLifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bsd_pcPackage.EVENT__OWNING_LIFELINE, oldOwningLifeline, owningLifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bsd_pcPackage.EVENT__OWNING_LIFELINE:
				if (resolve) return getOwningLifeline();
				return basicGetOwningLifeline();
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
			case Bsd_pcPackage.EVENT__OWNING_LIFELINE:
				setOwningLifeline((Lifeline)newValue);
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
			case Bsd_pcPackage.EVENT__OWNING_LIFELINE:
				setOwningLifeline((Lifeline)null);
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
			case Bsd_pcPackage.EVENT__OWNING_LIFELINE:
				return owningLifeline != null;
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
