/**
 */
package se.chalmers.cse.mdsd1617.group18.RoomManager.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1617.group18.RoomManager.IRoomType;
import se.chalmers.cse.mdsd1617.group18.RoomManager.Room;
import se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.impl.RoomImpl#isBlocked <em>Blocked</em>}</li>
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
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", blocked: ");
		result.append(blocked);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
