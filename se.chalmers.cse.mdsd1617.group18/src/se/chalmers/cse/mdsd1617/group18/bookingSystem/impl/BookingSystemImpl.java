/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent;

import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl#getRoomProvider <em>Room Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingSystemImpl extends MinimalEObjectImpl.Container implements BookingSystem {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList events;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList bookings;

	/**
	 * The cached value of the '{@link #getRoomProvider() <em>Room Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomProvider()
	 * @generated
	 * @ordered
	 */
	protected IHotelRoomProvider roomProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BookingSystemPackage.Literals.BOOKING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList(IEvent.class, this, BookingSystemPackage.BOOKING_SYSTEM__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBookings() {
		if (bookings == null) {
			bookings = new EObjectResolvingEList(IBooking.class, this, BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelRoomProvider getRoomProvider() {
		if (roomProvider != null && roomProvider.eIsProxy()) {
			InternalEObject oldRoomProvider = (InternalEObject)roomProvider;
			roomProvider = (IHotelRoomProvider)eResolveProxy(oldRoomProvider);
			if (roomProvider != oldRoomProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER, oldRoomProvider, roomProvider));
			}
		}
		return roomProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelRoomProvider basicGetRoomProvider() {
		return roomProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomProvider(IHotelRoomProvider newRoomProvider) {
		IHotelRoomProvider oldRoomProvider = roomProvider;
		roomProvider = newRoomProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER, oldRoomProvider, roomProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFreeRooms(int numBeds, String startDate, String endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int initiateBooking(String firstName, String startDate, String endDate, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoomToBooking(String roomTypeDescription, int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean confirmBooking(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double initiateCheckout(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean payDuringCheckout(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double initiateRoomCheckout(int roomNumber, int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean payRoomDuringCheckout(int roomNumber, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkInRoom(String roomTypeDescription, int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initiateCheckin(int bookingId, Object room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editBooking(String firstName, String lastName, int bookingId, String startDate, String endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList listBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object listOccupiedRooms(String date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList listCheckins(String startTime, String endTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList listCheckouts(String startTime, String endTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addExtraCostToRoom(int bookingId, int roomNumber, String descriptionOfCost, double priceOfCost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingSystemPackage.BOOKING_SYSTEM__EVENTS:
				return getEvents();
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS:
				return getBookings();
			case BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER:
				if (resolve) return getRoomProvider();
				return basicGetRoomProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BookingSystemPackage.BOOKING_SYSTEM__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection)newValue);
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection)newValue);
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER:
				setRoomProvider((IHotelRoomProvider)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case BookingSystemPackage.BOOKING_SYSTEM__EVENTS:
				getEvents().clear();
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS:
				getBookings().clear();
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER:
				setRoomProvider((IHotelRoomProvider)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BookingSystemPackage.BOOKING_SYSTEM__EVENTS:
				return events != null && !events.isEmpty();
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER:
				return roomProvider != null;
		}
		return super.eIsSet(featureID);
	}

} //BookingSystemImpl
