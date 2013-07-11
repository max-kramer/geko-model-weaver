/**
 */
package lts_pc.impl;

import java.util.Collection;

import lts_pc.LTS;
import lts_pc.Lts_pcPackage;
import lts_pc.State;
import lts_pc.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lts_pc.impl.StateImpl#getOwningLTS <em>Owning LTS</em>}</li>
 *   <li>{@link lts_pc.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link lts_pc.impl.StateImpl#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link lts_pc.impl.StateImpl#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingTransition() <em>Outgoing Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransition;

	/**
	 * The cached value of the '{@link #getIncomingTransition() <em>Incoming Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lts_pcPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTS getOwningLTS() {
		if (eContainerFeatureID() != Lts_pcPackage.STATE__OWNING_LTS) return null;
		return (LTS)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningLTS(LTS newOwningLTS, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningLTS, Lts_pcPackage.STATE__OWNING_LTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningLTS(LTS newOwningLTS) {
		if (newOwningLTS != eInternalContainer() || (eContainerFeatureID() != Lts_pcPackage.STATE__OWNING_LTS && newOwningLTS != null)) {
			if (EcoreUtil.isAncestor(this, newOwningLTS))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningLTS != null)
				msgs = ((InternalEObject)newOwningLTS).eInverseAdd(this, Lts_pcPackage.LTS__OWNED_STATE, LTS.class, msgs);
			msgs = basicSetOwningLTS(newOwningLTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lts_pcPackage.STATE__OWNING_LTS, newOwningLTS, newOwningLTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lts_pcPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransition() {
		if (outgoingTransition == null) {
			outgoingTransition = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, Lts_pcPackage.STATE__OUTGOING_TRANSITION, Lts_pcPackage.TRANSITION__SOURCE);
		}
		return outgoingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTransition() {
		if (incomingTransition == null) {
			incomingTransition = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, Lts_pcPackage.STATE__INCOMING_TRANSITION, Lts_pcPackage.TRANSITION__TARGET);
		}
		return incomingTransition;
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
			case Lts_pcPackage.STATE__OWNING_LTS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningLTS((LTS)otherEnd, msgs);
			case Lts_pcPackage.STATE__OUTGOING_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransition()).basicAdd(otherEnd, msgs);
			case Lts_pcPackage.STATE__INCOMING_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransition()).basicAdd(otherEnd, msgs);
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
			case Lts_pcPackage.STATE__OWNING_LTS:
				return basicSetOwningLTS(null, msgs);
			case Lts_pcPackage.STATE__OUTGOING_TRANSITION:
				return ((InternalEList<?>)getOutgoingTransition()).basicRemove(otherEnd, msgs);
			case Lts_pcPackage.STATE__INCOMING_TRANSITION:
				return ((InternalEList<?>)getIncomingTransition()).basicRemove(otherEnd, msgs);
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
			case Lts_pcPackage.STATE__OWNING_LTS:
				return eInternalContainer().eInverseRemove(this, Lts_pcPackage.LTS__OWNED_STATE, LTS.class, msgs);
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
			case Lts_pcPackage.STATE__OWNING_LTS:
				return getOwningLTS();
			case Lts_pcPackage.STATE__NAME:
				return getName();
			case Lts_pcPackage.STATE__OUTGOING_TRANSITION:
				return getOutgoingTransition();
			case Lts_pcPackage.STATE__INCOMING_TRANSITION:
				return getIncomingTransition();
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
			case Lts_pcPackage.STATE__OWNING_LTS:
				setOwningLTS((LTS)newValue);
				return;
			case Lts_pcPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case Lts_pcPackage.STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				getOutgoingTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case Lts_pcPackage.STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
				getIncomingTransition().addAll((Collection<? extends Transition>)newValue);
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
			case Lts_pcPackage.STATE__OWNING_LTS:
				setOwningLTS((LTS)null);
				return;
			case Lts_pcPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Lts_pcPackage.STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				return;
			case Lts_pcPackage.STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
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
			case Lts_pcPackage.STATE__OWNING_LTS:
				return getOwningLTS() != null;
			case Lts_pcPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Lts_pcPackage.STATE__OUTGOING_TRANSITION:
				return outgoingTransition != null && !outgoingTransition.isEmpty();
			case Lts_pcPackage.STATE__INCOMING_TRANSITION:
				return incomingTransition != null && !incomingTransition.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
