/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage
 * @generated
 */
public interface BookingSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingSystemFactory eINSTANCE = se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Check In Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check In Event</em>'.
	 * @generated
	 */
	CheckInEvent createCheckInEvent();

	/**
	 * Returns a new object of class '<em>Check Out Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Out Event</em>'.
	 * @generated
	 */
	CheckOutEvent createCheckOutEvent();

	/**
	 * Returns a new object of class '<em>Booking System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking System</em>'.
	 * @generated
	 */
	BookingSystem createBookingSystem();

	/**
	 * Returns a new object of class '<em>Free Room Types DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Room Types DTO</em>'.
	 * @generated
	 */
	FreeRoomTypesDTO createFreeRoomTypesDTO();

	/**
	 * Returns a new object of class '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking</em>'.
	 * @generated
	 */
	Booking createBooking();

	/**
	 * Returns a new object of class '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param string4 
	 * @param string3 
	 * @param string2 
	 * @param string 
	 * @param id 
	 * @return a new object of class '<em>Booking</em>'.
	 * @generated NOT
	 */
	Booking createBooking(int id, String string, String string2, String string3, String string4);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BookingSystemPackage getBookingSystemPackage();

} //BookingSystemFactory
