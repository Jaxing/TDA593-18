/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#getIHotelBookingManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelBookingManager extends IHotelCustomerProvides {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIdRequired="true" bookingIdOrdered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void initiateCheckin(int bookingId, Object room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" bookingIdRequired="true" bookingIdOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	void editBooking(String firstName, String lastName, int bookingId, String startDate, String endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	void cancelBooking(int bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking" ordered="false"
	 * @generated
	 */
	EList listBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	Object listOccupiedRooms(String date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent" ordered="false" startTimeRequired="true" startTimeOrdered="false" endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	EList listCheckins(String startTime, String endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent" ordered="false" startTimeRequired="true" startTimeOrdered="false" endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	EList listCheckouts(String startTime, String endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIdRequired="true" bookingIdOrdered="false" roomNumberRequired="true" roomNumberOrdered="false" descriptionOfCostRequired="true" descriptionOfCostOrdered="false" priceOfCostRequired="true" priceOfCostOrdered="false"
	 * @generated
	 */
	void addExtraCostToRoom(int bookingId, int roomNumber, String descriptionOfCost, double priceOfCost);

} // IHotelBookingManager
