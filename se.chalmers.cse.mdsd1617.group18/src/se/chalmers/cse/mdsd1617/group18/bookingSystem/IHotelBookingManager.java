/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem;

import org.eclipse.emf.common.util.EList;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType;

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
	 * @model ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	EList<FreeRoomTypesDTO> initiateCheckin(int bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIdRequired="true" bookingIdOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	void editBookingPeriod(int bookingId, String startDate, String endDate);

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
	 * @model ordered="false"
	 * @generated
	 */
	EList<IBooking> listBooking();

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
	 * @model ordered="false" startTimeRequired="true" startTimeOrdered="false" endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	EList<IEvent> listCheckins(String startTime, String endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" startTimeRequired="true" startTimeOrdered="false" endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	EList<IEvent> listCheckouts(String startTime, String endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIdRequired="true" bookingIdOrdered="false" roomNumberRequired="true" roomNumberOrdered="false" descriptionOfCostRequired="true" descriptionOfCostOrdered="false" priceOfCostRequired="true" priceOfCostOrdered="false"
	 * @generated
	 */
	void addExtraCostToRoom(int bookingId, int roomNumber, String descriptionOfCost, double priceOfCost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false" numOfRoomsRequired="true" numOfRoomsOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void editBookingRooms(int bookingID, int numOfRooms, IRoomType roomType);

} // IHotelBookingManager
