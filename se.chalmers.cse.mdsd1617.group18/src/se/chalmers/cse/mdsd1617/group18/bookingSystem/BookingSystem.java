/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem;

import org.eclipse.emf.common.util.EList;

import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getEvents <em>Events</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getBookings <em>Bookings</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getRoomProvider <em>Room Provider</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#getBookingSystem()
 * @model
 * @generated
 */
public interface BookingSystem extends IHotelBookingManager, IHotelCustomerProvides {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#getBookingSystem_Events()
	 * @model type="se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent" ordered="false"
	 * @generated
	 */
	EList getEvents();

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#getBookingSystem_Bookings()
	 * @model type="se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking" ordered="false"
	 * @generated
	 */
	EList getBookings();

	/**
	 * Returns the value of the '<em><b>Room Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Provider</em>' reference.
	 * @see #setRoomProvider(IHotelRoomProvider)
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#getBookingSystem_RoomProvider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IHotelRoomProvider getRoomProvider();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getRoomProvider <em>Room Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Provider</em>' reference.
	 * @see #getRoomProvider()
	 * @generated
	 */
	void setRoomProvider(IHotelRoomProvider value);

} // BookingSystem
