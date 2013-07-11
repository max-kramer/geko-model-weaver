/**
 */
package bsd_pc.impl;

import bsd_pc.BSD;
import bsd_pc.Bsd_pcPackage;
import bsd_pc.Lifeline;
import bsd_pc.Message;
import bsd_pc.PrecedenceTuple;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bsd_pc.impl.BSDImpl#getPrecendenceTuples <em>Precendence Tuples</em>}</li>
 *   <li>{@link bsd_pc.impl.BSDImpl#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link bsd_pc.impl.BSDImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BSDImpl extends NamedElementImpl implements BSD {
	/**
	 * The cached value of the '{@link #getPrecendenceTuples() <em>Precendence Tuples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecendenceTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<PrecedenceTuple> precendenceTuples;

	/**
	 * The cached value of the '{@link #getLifelines() <em>Lifelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifelines()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> lifelines;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bsd_pcPackage.Literals.BSD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrecedenceTuple> getPrecendenceTuples() {
		if (precendenceTuples == null) {
			precendenceTuples = new EObjectContainmentEList<PrecedenceTuple>(PrecedenceTuple.class, this, Bsd_pcPackage.BSD__PRECENDENCE_TUPLES);
		}
		return precendenceTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getLifelines() {
		if (lifelines == null) {
			lifelines = new EObjectContainmentEList<Lifeline>(Lifeline.class, this, Bsd_pcPackage.BSD__LIFELINES);
		}
		return lifelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this, Bsd_pcPackage.BSD__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bsd_pcPackage.BSD__PRECENDENCE_TUPLES:
				return ((InternalEList<?>)getPrecendenceTuples()).basicRemove(otherEnd, msgs);
			case Bsd_pcPackage.BSD__LIFELINES:
				return ((InternalEList<?>)getLifelines()).basicRemove(otherEnd, msgs);
			case Bsd_pcPackage.BSD__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
			case Bsd_pcPackage.BSD__PRECENDENCE_TUPLES:
				return getPrecendenceTuples();
			case Bsd_pcPackage.BSD__LIFELINES:
				return getLifelines();
			case Bsd_pcPackage.BSD__MESSAGES:
				return getMessages();
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
			case Bsd_pcPackage.BSD__PRECENDENCE_TUPLES:
				getPrecendenceTuples().clear();
				getPrecendenceTuples().addAll((Collection<? extends PrecedenceTuple>)newValue);
				return;
			case Bsd_pcPackage.BSD__LIFELINES:
				getLifelines().clear();
				getLifelines().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case Bsd_pcPackage.BSD__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
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
			case Bsd_pcPackage.BSD__PRECENDENCE_TUPLES:
				getPrecendenceTuples().clear();
				return;
			case Bsd_pcPackage.BSD__LIFELINES:
				getLifelines().clear();
				return;
			case Bsd_pcPackage.BSD__MESSAGES:
				getMessages().clear();
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
			case Bsd_pcPackage.BSD__PRECENDENCE_TUPLES:
				return precendenceTuples != null && !precendenceTuples.isEmpty();
			case Bsd_pcPackage.BSD__LIFELINES:
				return lifelines != null && !lifelines.isEmpty();
			case Bsd_pcPackage.BSD__MESSAGES:
				return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BSDImpl
