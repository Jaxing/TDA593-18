/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Customer Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#getIHotelCustomerProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelCustomerProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" numBedsRequired="true" numBedsOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	EList<FreeRoomTypesDTO> getFreeRooms(int numBeds, String startDate, String endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" firstNameRequired="true" firstNameOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	int initiateBooking(String firstName, String startDate, String endDate, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeDescriptionRequired="true" roomTypeDescriptionOrdered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean addRoomToBooking(String roomTypeDescription, int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean confirmBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	double initiateCheckout(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean payDuringCheckout(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	double initiateRoomCheckout(int roomNumber, int bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean payRoomDuringCheckout(int roomNumber, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeDescriptionRequired="true" roomTypeDescriptionOrdered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	boolean checkInRoom(String roomTypeDescription, int bookingId);

} // IHotelCustomerProvides
