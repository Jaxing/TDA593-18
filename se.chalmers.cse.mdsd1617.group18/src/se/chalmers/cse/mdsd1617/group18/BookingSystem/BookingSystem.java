/**
 */
package se.chalmers.cse.mdsd1617.group18.BookingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import se.chalmers.cse.mdsd1617.group18.RoomManager.IHotelRoomProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getEvents <em>Events</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getBookings <em>Bookings</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getRoomProvider <em>Room Provider</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBookingSystem()
 * @model
 * @generated
 */
public interface BookingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBookingSystem_Events()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBookingSystem_Bookings()
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
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBookingSystem_RoomProvider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IHotelRoomProvider getRoomProvider();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getRoomProvider <em>Room Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Provider</em>' reference.
	 * @see #getRoomProvider()
	 * @generated
	 */
	void setRoomProvider(IHotelRoomProvider value);

} // BookingSystem
