/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType;
import se.chalmers.cse.mdsd1617.group18.roomManager.Room;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl#isBlocked <em>Blocked</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl#getExtraCostDescriptions <em>Extra Cost Descriptions</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl#getExtraCostPrice <em>Extra Cost Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected IRoomType roomType;

	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean blocked = BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraCostDescriptions() <em>Extra Cost Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraCostDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRA_COST_DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtraCostDescriptions() <em>Extra Cost Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraCostDescriptions()
	 * @generated
	 * @ordered
	 */
	protected String extraCostDescriptions = EXTRA_COST_DESCRIPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraCostPrice() <em>Extra Cost Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraCostPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTRA_COST_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExtraCostPrice() <em>Extra Cost Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraCostPrice()
	 * @generated
	 * @ordered
	 */
	protected double extraCostPrice = EXTRA_COST_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomImpl(IRoomType roomType, int roomNumber) {
		super();
		this.roomType = roomType;
		this.roomNumber = roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoomManagerPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (IRoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoomManagerPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(IRoomType newRoomType) {
		IRoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlocked() {
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocked(boolean newBlocked) {
		boolean oldBlocked = blocked;
		blocked = newBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM__BLOCKED, oldBlocked, blocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtraCostDescriptions() {
		return extraCostDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraCostDescriptions(String newExtraCostDescriptions) {
		String oldExtraCostDescriptions = extraCostDescriptions;
		extraCostDescriptions = newExtraCostDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM__EXTRA_COST_DESCRIPTIONS, oldExtraCostDescriptions, extraCostDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExtraCostPrice() {
		return extraCostPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraCostPrice(double newExtraCostPrice) {
		double oldExtraCostPrice = extraCostPrice;
		extraCostPrice = newExtraCostPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM__EXTRA_COST_PRICE, oldExtraCostPrice, extraCostPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getExtraCostDescription() {
		return getExtraCostDescriptions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setExtraCostDescription(String extraCostDescription) {
		this.setExtraCostDescriptions(extraCostDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addExtraCost(double extraCostPrice) {
		this.extraCostPrice += extraCostPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoomManagerPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case RoomManagerPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case RoomManagerPackage.ROOM__BLOCKED:
				return isBlocked();
			case RoomManagerPackage.ROOM__EXTRA_COST_DESCRIPTIONS:
				return getExtraCostDescriptions();
			case RoomManagerPackage.ROOM__EXTRA_COST_PRICE:
				return getExtraCostPrice();
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
			case RoomManagerPackage.ROOM__ROOM_TYPE:
				setRoomType((IRoomType)newValue);
				return;
			case RoomManagerPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case RoomManagerPackage.ROOM__BLOCKED:
				setBlocked((Boolean)newValue);
				return;
			case RoomManagerPackage.ROOM__EXTRA_COST_DESCRIPTIONS:
				setExtraCostDescriptions((String)newValue);
				return;
			case RoomManagerPackage.ROOM__EXTRA_COST_PRICE:
				setExtraCostPrice((Double)newValue);
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
			case RoomManagerPackage.ROOM__ROOM_TYPE:
				setRoomType((IRoomType)null);
				return;
			case RoomManagerPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case RoomManagerPackage.ROOM__BLOCKED:
				setBlocked(BLOCKED_EDEFAULT);
				return;
			case RoomManagerPackage.ROOM__EXTRA_COST_DESCRIPTIONS:
				setExtraCostDescriptions(EXTRA_COST_DESCRIPTIONS_EDEFAULT);
				return;
			case RoomManagerPackage.ROOM__EXTRA_COST_PRICE:
				setExtraCostPrice(EXTRA_COST_PRICE_EDEFAULT);
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
			case RoomManagerPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case RoomManagerPackage.ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case RoomManagerPackage.ROOM__BLOCKED:
				return blocked != BLOCKED_EDEFAULT;
			case RoomManagerPackage.ROOM__EXTRA_COST_DESCRIPTIONS:
				return EXTRA_COST_DESCRIPTIONS_EDEFAULT == null ? extraCostDescriptions != null : !EXTRA_COST_DESCRIPTIONS_EDEFAULT.equals(extraCostDescriptions);
			case RoomManagerPackage.ROOM__EXTRA_COST_PRICE:
				return extraCostPrice != EXTRA_COST_PRICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RoomManagerPackage.ROOM___SET_IS_BLOCKED__BOOLEAN:
				setIsBlocked((Boolean)arguments.get(0));
				return null;
			case RoomManagerPackage.ROOM___GET_EXTRA_COST_DESCRIPTION:
				return getExtraCostDescription();
			case RoomManagerPackage.ROOM___SET_EXTRA_COST_DESCRIPTION__STRING:
				setExtraCostDescription((String)arguments.get(0));
				return null;
			case RoomManagerPackage.ROOM___ADD_EXTRA_COST__DOUBLE:
				addExtraCost((Double)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", blocked: ");
		result.append(blocked);
		result.append(", extraCostDescriptions: ");
		result.append(extraCostDescriptions);
		result.append(", extraCostPrice: ");
		result.append(extraCostPrice);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
