/**
 */
package se.chalmers.cse.mdsd1617.group18.BookingSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemFactory
 * @model kind="package"
 * @generated
 */
public interface BookingSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BookingSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///se/chalmers/cse/mdsd1617/group18/BookingSystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.chalmers.cse.mdsd1617.group18.BookingSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingSystemPackage eINSTANCE = se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.CheckInEventImpl <em>Check In Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.CheckInEventImpl
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getCheckInEvent()
	 * @generated
	 */
	int CHECK_IN_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Check In Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Check In Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.CheckOutEventImpl <em>Check Out Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.CheckOutEventImpl
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getCheckOutEvent()
	 * @generated
	 */
	int CHECK_OUT_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Check Out Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Check Out Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemImpl <em>Booking System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemImpl
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getBookingSystem()
	 * @generated
	 */
	int BOOKING_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM__BOOKINGS = 1;

	/**
	 * The feature id for the '<em><b>Room Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM__ROOM_PROVIDER = 2;

	/**
	 * The number of structural features of the '<em>Booking System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Booking System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent <em>IEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getIEvent()
	 * @generated
	 */
	int IEVENT = 3;

	/**
	 * The number of structural features of the '<em>IEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT___GET_TIMESTAMP = 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT___GET_TYPE = 1;

	/**
	 * The operation id for the '<em>Get Booking Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT___GET_BOOKING_ID = 2;

	/**
	 * The number of operations of the '<em>IEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking <em>IBooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getIBooking()
	 * @generated
	 */
	int IBOOKING = 4;

	/**
	 * The number of structural features of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_ROOMS = 0;

	/**
	 * The operation id for the '<em>Get First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_FIRST_NAME = 1;

	/**
	 * The operation id for the '<em>Get Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_LAST_NAME = 2;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_ID = 3;

	/**
	 * The operation id for the '<em>Get Start Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_START_DATE = 4;

	/**
	 * The operation id for the '<em>Get End Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_END_DATE = 5;

	/**
	 * The operation id for the '<em>Set Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___SET_ROOMS__ELIST = 6;

	/**
	 * The operation id for the '<em>Set Start Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___SET_START_DATE__STRING = 7;

	/**
	 * The operation id for the '<em>Set End Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___SET_END_DATE__STRING = 8;

	/**
	 * The number of operations of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getIHotelCustomerProvides()
	 * @generated
	 */
	int IHOTEL_CUSTOMER_PROVIDES = 5;

	/**
	 * The number of structural features of the '<em>IHotel Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Initiate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Add Room To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT = 2;

	/**
	 * The operation id for the '<em>Confirm Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT = 3;

	/**
	 * The operation id for the '<em>Initiate Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT = 4;

	/**
	 * The operation id for the '<em>Pay During Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Initiate Room Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT = 6;

	/**
	 * The operation id for the '<em>Pay Room During Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Check In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT = 8;

	/**
	 * The number of operations of the '<em>IHotel Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.FreeRoomTypesDTOImpl
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getFreeRoomTypesDTO()
	 * @generated
	 */
	int FREE_ROOM_TYPES_DTO = 6;

	/**
	 * The feature id for the '<em><b>Room Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Num Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO__NUM_BEDS = 1;

	/**
	 * The feature id for the '<em><b>Price Per Night</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT = 2;

	/**
	 * The feature id for the '<em><b>Num Free Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS = 3;

	/**
	 * The number of structural features of the '<em>Free Room Types DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Free Room Types DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager <em>IHotel Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getIHotelBookingManager()
	 * @generated
	 */
	int IHOTEL_BOOKING_MANAGER = 7;

	/**
	 * The number of structural features of the '<em>IHotel Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER_FEATURE_COUNT = IHOTEL_CUSTOMER_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___GET_FREE_ROOMS__INT_STRING_STRING = IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Initiate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___INITIATE_BOOKING__STRING_STRING_STRING_STRING = IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Add Room To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___ADD_ROOM_TO_BOOKING__STRING_INT = IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT;

	/**
	 * The operation id for the '<em>Confirm Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___CONFIRM_BOOKING__INT = IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT;

	/**
	 * The operation id for the '<em>Initiate Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___INITIATE_CHECKOUT__INT = IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT;

	/**
	 * The operation id for the '<em>Pay During Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Initiate Room Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___INITIATE_ROOM_CHECKOUT__INT_INT = IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT;

	/**
	 * The operation id for the '<em>Pay Room During Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Check In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___CHECK_IN_ROOM__STRING_INT = IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT;

	/**
	 * The operation id for the '<em>Initiate Checkin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___INITIATE_CHECKIN__INT_OBJECT = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___EDIT_BOOKING__STRING_STRING_INT_STRING_STRING = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___CANCEL_BOOKING__INT = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>List Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___LIST_BOOKING = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>List Occupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___LIST_OCCUPIED_ROOMS__STRING = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>List Checkins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___LIST_CHECKINS__STRING_STRING = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>List Checkouts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___LIST_CHECKOUTS__STRING_STRING = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Add Extra Cost To Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER___ADD_EXTRA_COST_TO_ROOM__INT_INT_STRING_DOUBLE = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>IHotel Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER_OPERATION_COUNT = IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.AbstractEventImpl <em>Abstract Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.AbstractEventImpl
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getAbstractEvent()
	 * @generated
	 */
	int ABSTRACT_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__BOOKING_ID = 2;

	/**
	 * The number of structural features of the '<em>Abstract Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT___GET_TYPE = 0;

	/**
	 * The number of operations of the '<em>Abstract Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingImpl
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = 4;

	/**
	 * The feature id for the '<em><b>Room List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_LIST = 5;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.CheckInEvent <em>Check In Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check In Event</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.CheckInEvent
	 * @generated
	 */
	EClass getCheckInEvent();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.CheckOutEvent <em>Check Out Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Out Event</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.CheckOutEvent
	 * @generated
	 */
	EClass getCheckOutEvent();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem <em>Booking System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking System</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem
	 * @generated
	 */
	EClass getBookingSystem();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getEvents()
	 * @see #getBookingSystem()
	 * @generated
	 */
	EReference getBookingSystem_Events();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookings</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getBookings()
	 * @see #getBookingSystem()
	 * @generated
	 */
	EReference getBookingSystem_Bookings();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getRoomProvider <em>Room Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Provider</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystem#getRoomProvider()
	 * @see #getBookingSystem()
	 * @generated
	 */
	EReference getBookingSystem_RoomProvider();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent <em>IEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEvent</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent
	 * @generated
	 */
	EClass getIEvent();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent#getTimestamp() <em>Get Timestamp</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Timestamp</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent#getTimestamp()
	 * @generated
	 */
	EOperation getIEvent__GetTimestamp();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent#getType()
	 * @generated
	 */
	EOperation getIEvent__GetType();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent#getBookingId() <em>Get Booking Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Id</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent#getBookingId()
	 * @generated
	 */
	EOperation getIEvent__GetBookingId();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking
	 * @generated
	 */
	EClass getIBooking();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getRooms() <em>Get Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getRooms()
	 * @generated
	 */
	EOperation getIBooking__GetRooms();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getFirstName() <em>Get First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Name</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getFirstName()
	 * @generated
	 */
	EOperation getIBooking__GetFirstName();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getLastName() <em>Get Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Name</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getLastName()
	 * @generated
	 */
	EOperation getIBooking__GetLastName();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getID()
	 * @generated
	 */
	EOperation getIBooking__GetID();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getStartDate() <em>Get Start Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Date</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getStartDate()
	 * @generated
	 */
	EOperation getIBooking__GetStartDate();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getEndDate() <em>Get End Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Date</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#getEndDate()
	 * @generated
	 */
	EOperation getIBooking__GetEndDate();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#setRooms(org.eclipse.emf.common.util.EList) <em>Set Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#setRooms(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getIBooking__SetRooms__EList();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#setStartDate(java.lang.String) <em>Set Start Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Start Date</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#setStartDate(java.lang.String)
	 * @generated
	 */
	EOperation getIBooking__SetStartDate__String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#setEndDate(java.lang.String) <em>Set End Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set End Date</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking#setEndDate(java.lang.String)
	 * @generated
	 */
	EOperation getIBooking__SetEndDate__String();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Customer Provides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides
	 * @generated
	 */
	EClass getIHotelCustomerProvides();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#getFreeRooms(int, java.lang.String, java.lang.String) <em>Get Free Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Free Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#getFreeRooms(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__GetFreeRooms__int_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#initiateBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Initiate Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#initiateBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateBooking__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#addRoomToBooking(java.lang.String, int) <em>Add Room To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room To Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#addRoomToBooking(java.lang.String, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__AddRoomToBooking__String_int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#confirmBooking(int) <em>Confirm Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#confirmBooking(int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__ConfirmBooking__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#initiateCheckout(int) <em>Initiate Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Checkout</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#initiateCheckout(int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateCheckout__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#payDuringCheckout(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay During Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay During Checkout</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#payDuringCheckout(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#initiateRoomCheckout(int, int) <em>Initiate Room Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Room Checkout</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#initiateRoomCheckout(int, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateRoomCheckout__int_int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#payRoomDuringCheckout(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay Room During Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Room During Checkout</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#payRoomDuringCheckout(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#checkInRoom(java.lang.String, int) <em>Check In Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides#checkInRoom(java.lang.String, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__CheckInRoom__String_int();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO <em>Free Room Types DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Room Types DTO</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO
	 * @generated
	 */
	EClass getFreeRoomTypesDTO();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Description</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO#getRoomTypeDescription()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_RoomTypeDescription();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Beds</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO#getNumBeds()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_NumBeds();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Night</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO#getPricePerNight()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_PricePerNight();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Free Rooms</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.FreeRoomTypesDTO#getNumFreeRooms()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_NumFreeRooms();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager <em>IHotel Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Booking Manager</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager
	 * @generated
	 */
	EClass getIHotelBookingManager();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#initiateCheckin(int, java.lang.Object) <em>Initiate Checkin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Checkin</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#initiateCheckin(int, java.lang.Object)
	 * @generated
	 */
	EOperation getIHotelBookingManager__InitiateCheckin__int_Object();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#editBooking(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#editBooking(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelBookingManager__EditBooking__String_String_int_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#cancelBooking(int) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#cancelBooking(int)
	 * @generated
	 */
	EOperation getIHotelBookingManager__CancelBooking__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#listBooking() <em>List Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#listBooking()
	 * @generated
	 */
	EOperation getIHotelBookingManager__ListBooking();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#listOccupiedRooms(java.lang.String) <em>List Occupied Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Occupied Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#listOccupiedRooms(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelBookingManager__ListOccupiedRooms__String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#listCheckins(java.lang.String, java.lang.String) <em>List Checkins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Checkins</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#listCheckins(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelBookingManager__ListCheckins__String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#listCheckouts(java.lang.String, java.lang.String) <em>List Checkouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Checkouts</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#listCheckouts(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelBookingManager__ListCheckouts__String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#addExtraCostToRoom(int, int, java.lang.String, double) <em>Add Extra Cost To Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Extra Cost To Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager#addExtraCostToRoom(int, int, java.lang.String, double)
	 * @generated
	 */
	EOperation getIHotelBookingManager__AddExtraCostToRoom__int_int_String_double();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Event</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent
	 * @generated
	 */
	EClass getAbstractEvent();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getTimestamp()
	 * @see #getAbstractEvent()
	 * @generated
	 */
	EAttribute getAbstractEvent_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getEventType()
	 * @see #getAbstractEvent()
	 * @generated
	 */
	EAttribute getAbstractEvent_EventType();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getBookingID()
	 * @see #getAbstractEvent()
	 * @generated
	 */
	EAttribute getAbstractEvent_BookingID();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getType()
	 * @generated
	 */
	EOperation getAbstractEvent__GetType();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Id();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getFirstName()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getLastName()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_LastName();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getRoomList <em>Room List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room List</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getRoomList()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomList();

	/**
	 * Returns the meta object for enum '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BookingSystemFactory getBookingSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.CheckInEventImpl <em>Check In Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.CheckInEventImpl
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getCheckInEvent()
		 * @generated
		 */
		EClass CHECK_IN_EVENT = eINSTANCE.getCheckInEvent();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.CheckOutEventImpl <em>Check Out Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.CheckOutEventImpl
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getCheckOutEvent()
		 * @generated
		 */
		EClass CHECK_OUT_EVENT = eINSTANCE.getCheckOutEvent();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemImpl <em>Booking System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemImpl
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getBookingSystem()
		 * @generated
		 */
		EClass BOOKING_SYSTEM = eINSTANCE.getBookingSystem();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_SYSTEM__EVENTS = eINSTANCE.getBookingSystem_Events();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_SYSTEM__BOOKINGS = eINSTANCE.getBookingSystem_Bookings();

		/**
		 * The meta object literal for the '<em><b>Room Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_SYSTEM__ROOM_PROVIDER = eINSTANCE.getBookingSystem_RoomProvider();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent <em>IEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IEvent
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getIEvent()
		 * @generated
		 */
		EClass IEVENT = eINSTANCE.getIEvent();

		/**
		 * The meta object literal for the '<em><b>Get Timestamp</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEVENT___GET_TIMESTAMP = eINSTANCE.getIEvent__GetTimestamp();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEVENT___GET_TYPE = eINSTANCE.getIEvent__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Booking Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEVENT___GET_BOOKING_ID = eINSTANCE.getIEvent__GetBookingId();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking <em>IBooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IBooking
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getIBooking()
		 * @generated
		 */
		EClass IBOOKING = eINSTANCE.getIBooking();

		/**
		 * The meta object literal for the '<em><b>Get Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_ROOMS = eINSTANCE.getIBooking__GetRooms();

		/**
		 * The meta object literal for the '<em><b>Get First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_FIRST_NAME = eINSTANCE.getIBooking__GetFirstName();

		/**
		 * The meta object literal for the '<em><b>Get Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_LAST_NAME = eINSTANCE.getIBooking__GetLastName();

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_ID = eINSTANCE.getIBooking__GetID();

		/**
		 * The meta object literal for the '<em><b>Get Start Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_START_DATE = eINSTANCE.getIBooking__GetStartDate();

		/**
		 * The meta object literal for the '<em><b>Get End Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_END_DATE = eINSTANCE.getIBooking__GetEndDate();

		/**
		 * The meta object literal for the '<em><b>Set Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___SET_ROOMS__ELIST = eINSTANCE.getIBooking__SetRooms__EList();

		/**
		 * The meta object literal for the '<em><b>Set Start Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___SET_START_DATE__STRING = eINSTANCE.getIBooking__SetStartDate__String();

		/**
		 * The meta object literal for the '<em><b>Set End Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___SET_END_DATE__STRING = eINSTANCE.getIBooking__SetEndDate__String();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelCustomerProvides
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getIHotelCustomerProvides()
		 * @generated
		 */
		EClass IHOTEL_CUSTOMER_PROVIDES = eINSTANCE.getIHotelCustomerProvides();

		/**
		 * The meta object literal for the '<em><b>Get Free Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__GetFreeRooms__int_String_String();

		/**
		 * The meta object literal for the '<em><b>Initiate Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__InitiateBooking__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT = eINSTANCE.getIHotelCustomerProvides__AddRoomToBooking__String_int();

		/**
		 * The meta object literal for the '<em><b>Confirm Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT = eINSTANCE.getIHotelCustomerProvides__ConfirmBooking__int();

		/**
		 * The meta object literal for the '<em><b>Initiate Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT = eINSTANCE.getIHotelCustomerProvides__InitiateCheckout__int();

		/**
		 * The meta object literal for the '<em><b>Pay During Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Initiate Room Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT = eINSTANCE.getIHotelCustomerProvides__InitiateRoomCheckout__int_int();

		/**
		 * The meta object literal for the '<em><b>Pay Room During Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Check In Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT = eINSTANCE.getIHotelCustomerProvides__CheckInRoom__String_int();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.FreeRoomTypesDTOImpl
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getFreeRoomTypesDTO()
		 * @generated
		 */
		EClass FREE_ROOM_TYPES_DTO = eINSTANCE.getFreeRoomTypesDTO();

		/**
		 * The meta object literal for the '<em><b>Room Type Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION = eINSTANCE.getFreeRoomTypesDTO_RoomTypeDescription();

		/**
		 * The meta object literal for the '<em><b>Num Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ROOM_TYPES_DTO__NUM_BEDS = eINSTANCE.getFreeRoomTypesDTO_NumBeds();

		/**
		 * The meta object literal for the '<em><b>Price Per Night</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT = eINSTANCE.getFreeRoomTypesDTO_PricePerNight();

		/**
		 * The meta object literal for the '<em><b>Num Free Rooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS = eINSTANCE.getFreeRoomTypesDTO_NumFreeRooms();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager <em>IHotel Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.IHotelBookingManager
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getIHotelBookingManager()
		 * @generated
		 */
		EClass IHOTEL_BOOKING_MANAGER = eINSTANCE.getIHotelBookingManager();

		/**
		 * The meta object literal for the '<em><b>Initiate Checkin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_BOOKING_MANAGER___INITIATE_CHECKIN__INT_OBJECT = eINSTANCE.getIHotelBookingManager__InitiateCheckin__int_Object();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_BOOKING_MANAGER___EDIT_BOOKING__STRING_STRING_INT_STRING_STRING = eINSTANCE.getIHotelBookingManager__EditBooking__String_String_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_BOOKING_MANAGER___CANCEL_BOOKING__INT = eINSTANCE.getIHotelBookingManager__CancelBooking__int();

		/**
		 * The meta object literal for the '<em><b>List Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_BOOKING_MANAGER___LIST_BOOKING = eINSTANCE.getIHotelBookingManager__ListBooking();

		/**
		 * The meta object literal for the '<em><b>List Occupied Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_BOOKING_MANAGER___LIST_OCCUPIED_ROOMS__STRING = eINSTANCE.getIHotelBookingManager__ListOccupiedRooms__String();

		/**
		 * The meta object literal for the '<em><b>List Checkins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_BOOKING_MANAGER___LIST_CHECKINS__STRING_STRING = eINSTANCE.getIHotelBookingManager__ListCheckins__String_String();

		/**
		 * The meta object literal for the '<em><b>List Checkouts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_BOOKING_MANAGER___LIST_CHECKOUTS__STRING_STRING = eINSTANCE.getIHotelBookingManager__ListCheckouts__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Extra Cost To Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_BOOKING_MANAGER___ADD_EXTRA_COST_TO_ROOM__INT_INT_STRING_DOUBLE = eINSTANCE.getIHotelBookingManager__AddExtraCostToRoom__int_int_String_double();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.AbstractEventImpl <em>Abstract Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.AbstractEventImpl
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getAbstractEvent()
		 * @generated
		 */
		EClass ABSTRACT_EVENT = eINSTANCE.getAbstractEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EVENT__TIMESTAMP = eINSTANCE.getAbstractEvent_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EVENT__EVENT_TYPE = eINSTANCE.getAbstractEvent_EventType();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EVENT__BOOKING_ID = eINSTANCE.getAbstractEvent_BookingID();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EVENT___GET_TYPE = eINSTANCE.getAbstractEvent__GetType();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingImpl
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ID = eINSTANCE.getBooking_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__FIRST_NAME = eINSTANCE.getBooking_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__LAST_NAME = eINSTANCE.getBooking_LastName();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Room List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_LIST = eINSTANCE.getBooking_RoomList();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType
		 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.impl.BookingSystemPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

	}

} //BookingSystemPackage
