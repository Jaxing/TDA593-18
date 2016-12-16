/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem;

import org.eclipse.emf.common.util.EList;

import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoom;

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
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getRooms <em>Rooms</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getBookingId <em>Booking Id</em>}</li>
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
	 * @model ordered="false"
	 * @generated
	 */
	EList<IEvent> getEvents();

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
	 * @model ordered="false"
	 * @generated
	 */
	EList<IBooking> getBookings();

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

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#getBookingSystem_Rooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IRoom> getRooms();

	/**
	 * Returns the value of the '<em><b>Booking Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Id</em>' attribute.
	 * @see #setBookingId(int)
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#getBookingSystem_BookingId()
	 * @model default="0" required="true" ordered="false"
	 * @generated
	 */
	int getBookingId();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getBookingId <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Id</em>' attribute.
	 * @see #getBookingId()
	 * @generated
	 */
	void setBookingId(int value);

} // BookingSystem
