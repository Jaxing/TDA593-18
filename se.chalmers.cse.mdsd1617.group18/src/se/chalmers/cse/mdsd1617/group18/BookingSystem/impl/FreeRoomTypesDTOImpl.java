/**
 */
package se.chalmers.cse.mdsd1617.group18.BookingSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage;
import se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Room Types DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.FreeRoomTypesDTOImpl#getRoomTypeDescription <em>Room Type Description</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.FreeRoomTypesDTOImpl#getNumBeds <em>Num Beds</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.FreeRoomTypesDTOImpl#getPricePerNight <em>Price Per Night</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.FreeRoomTypesDTOImpl#getNumFreeRooms <em>Num Free Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreeRoomTypesDTOImpl extends MinimalEObjectImpl.Container implements FreeRoomTypesDTO {
	/**
	 * The default value of the '{@link #getRoomTypeDescription() <em>Room Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomTypeDescription() <em>Room Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String roomTypeDescription = ROOM_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumBeds() <em>Num Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumBeds() <em>Num Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBeds()
	 * @generated
	 * @ordered
	 */
	protected int numBeds = NUM_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPricePerNight() <em>Price Per Night</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerNight()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_PER_NIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPricePerNight() <em>Price Per Night</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerNight()
	 * @generated
	 * @ordered
	 */
	protected double pricePerNight = PRICE_PER_NIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumFreeRooms() <em>Num Free Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFreeRooms()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_FREE_ROOMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumFreeRooms() <em>Num Free Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFreeRooms()
	 * @generated
	 * @ordered
	 */
	protected int numFreeRooms = NUM_FREE_ROOMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeRoomTypesDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingSystemPackage.Literals.FREE_ROOM_TYPES_DTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypeDescription() {
		return roomTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeDescription(String newRoomTypeDescription) {
		String oldRoomTypeDescription = roomTypeDescription;
		roomTypeDescription = newRoomTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingSystemPackage.FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION, oldRoomTypeDescription, roomTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumBeds() {
		return numBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumBeds(int newNumBeds) {
		int oldNumBeds = numBeds;
		numBeds = newNumBeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_BEDS, oldNumBeds, numBeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPricePerNight() {
		return pricePerNight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricePerNight(double newPricePerNight) {
		double oldPricePerNight = pricePerNight;
		pricePerNight = newPricePerNight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingSystemPackage.FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT, oldPricePerNight, pricePerNight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumFreeRooms() {
		return numFreeRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumFreeRooms(int newNumFreeRooms) {
		int oldNumFreeRooms = numFreeRooms;
		numFreeRooms = newNumFreeRooms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS, oldNumFreeRooms, numFreeRooms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION:
				return getRoomTypeDescription();
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_BEDS:
				return getNumBeds();
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT:
				return getPricePerNight();
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS:
				return getNumFreeRooms();
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
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION:
				setRoomTypeDescription((String)newValue);
				return;
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_BEDS:
				setNumBeds((Integer)newValue);
				return;
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT:
				setPricePerNight((Double)newValue);
				return;
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS:
				setNumFreeRooms((Integer)newValue);
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
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION:
				setRoomTypeDescription(ROOM_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_BEDS:
				setNumBeds(NUM_BEDS_EDEFAULT);
				return;
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT:
				setPricePerNight(PRICE_PER_NIGHT_EDEFAULT);
				return;
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS:
				setNumFreeRooms(NUM_FREE_ROOMS_EDEFAULT);
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
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION:
				return ROOM_TYPE_DESCRIPTION_EDEFAULT == null ? roomTypeDescription != null : !ROOM_TYPE_DESCRIPTION_EDEFAULT.equals(roomTypeDescription);
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_BEDS:
				return numBeds != NUM_BEDS_EDEFAULT;
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT:
				return pricePerNight != PRICE_PER_NIGHT_EDEFAULT;
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS:
				return numFreeRooms != NUM_FREE_ROOMS_EDEFAULT;
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
		result.append(" (roomTypeDescription: ");
		result.append(roomTypeDescription);
		result.append(", numBeds: ");
		result.append(numBeds);
		result.append(", pricePerNight: ");
		result.append(pricePerNight);
		result.append(", numFreeRooms: ");
		result.append(numFreeRooms);
		result.append(')');
		return result.toString();
	}

} //FreeRoomTypesDTOImpl
