/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory
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
	String eNAME = "bookingSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///se/chalmers/cse/mdsd1617/group18/bookingSystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.chalmers.cse.mdsd1617.group18.bookingSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingSystemPackage eINSTANCE = se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent <em>IEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getIEvent()
	 * @generated
	 */
	int IEVENT = 2;

	/**
	 * The number of structural features of the '<em>IEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.AbstractEventImpl <em>Abstract Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.AbstractEventImpl
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getAbstractEvent()
	 * @generated
	 */
	int ABSTRACT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__TIMESTAMP = IEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__EVENT_TYPE = IEVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__BOOKING_ID = IEVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_FEATURE_COUNT = IEVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.CheckInEventImpl <em>Check In Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.CheckInEventImpl
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getCheckInEvent()
	 * @generated
	 */
	int CHECK_IN_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_EVENT__TIMESTAMP = ABSTRACT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_EVENT__EVENT_TYPE = ABSTRACT_EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_EVENT__BOOKING_ID = ABSTRACT_EVENT__BOOKING_ID;

	/**
	 * The number of structural features of the '<em>Check In Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_EVENT_FEATURE_COUNT = ABSTRACT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.CheckOutEventImpl <em>Check Out Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.CheckOutEventImpl
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getCheckOutEvent()
	 * @generated
	 */
	int CHECK_OUT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_EVENT__TIMESTAMP = ABSTRACT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_EVENT__EVENT_TYPE = ABSTRACT_EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_EVENT__BOOKING_ID = ABSTRACT_EVENT__BOOKING_ID;

	/**
	 * The number of structural features of the '<em>Check Out Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_EVENT_FEATURE_COUNT = ABSTRACT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getIHotelCustomerProvides()
	 * @generated
	 */
	int IHOTEL_CUSTOMER_PROVIDES = 7;

	/**
	 * The number of structural features of the '<em>IHotel Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager <em>IHotel Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getIHotelBookingManager()
	 * @generated
	 */
	int IHOTEL_BOOKING_MANAGER = 6;

	/**
	 * The number of structural features of the '<em>IHotel Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_BOOKING_MANAGER_FEATURE_COUNT = IHOTEL_CUSTOMER_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl <em>Booking System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getBookingSystem()
	 * @generated
	 */
	int BOOKING_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM__EVENTS = IHOTEL_BOOKING_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM__BOOKINGS = IHOTEL_BOOKING_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Room Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM__ROOM_PROVIDER = IHOTEL_BOOKING_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Booking System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SYSTEM_FEATURE_COUNT = IHOTEL_BOOKING_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking <em>IBooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getIBooking()
	 * @generated
	 */
	int IBOOKING = 5;

	/**
	 * The number of structural features of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.FreeRoomTypesDTOImpl
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getFreeRoomTypesDTO()
	 * @generated
	 */
	int FREE_ROOM_TYPES_DTO = 8;

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
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingImpl
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getBooking()
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
	int BOOKING__ID = IBOOKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__FIRST_NAME = IBOOKING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__LAST_NAME = IBOOKING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = IBOOKING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = IBOOKING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Room List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_LIST = IBOOKING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = IBOOKING_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent <em>Check In Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check In Event</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent
	 * @generated
	 */
	EClass getCheckInEvent();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Event</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent
	 * @generated
	 */
	EClass getAbstractEvent();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent#getTimestamp()
	 * @see #getAbstractEvent()
	 * @generated
	 */
	EAttribute getAbstractEvent_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent#getEventType()
	 * @see #getAbstractEvent()
	 * @generated
	 */
	EAttribute getAbstractEvent_EventType();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent#getBookingID()
	 * @see #getAbstractEvent()
	 * @generated
	 */
	EAttribute getAbstractEvent_BookingID();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent <em>IEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEvent</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent
	 * @generated
	 */
	EClass getIEvent();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent <em>Check Out Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Out Event</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent
	 * @generated
	 */
	EClass getCheckOutEvent();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem <em>Booking System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking System</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem
	 * @generated
	 */
	EClass getBookingSystem();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getEvents()
	 * @see #getBookingSystem()
	 * @generated
	 */
	EReference getBookingSystem_Events();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookings</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getBookings()
	 * @see #getBookingSystem()
	 * @generated
	 */
	EReference getBookingSystem_Bookings();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getRoomProvider <em>Room Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Provider</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem#getRoomProvider()
	 * @see #getBookingSystem()
	 * @generated
	 */
	EReference getBookingSystem_RoomProvider();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking
	 * @generated
	 */
	EClass getIBooking();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager <em>IHotel Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Booking Manager</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager
	 * @generated
	 */
	EClass getIHotelBookingManager();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Customer Provides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides
	 * @generated
	 */
	EClass getIHotelCustomerProvides();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO <em>Free Room Types DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Room Types DTO</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO
	 * @generated
	 */
	EClass getFreeRoomTypesDTO();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Description</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO#getRoomTypeDescription()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_RoomTypeDescription();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Beds</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO#getNumBeds()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_NumBeds();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Night</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO#getPricePerNight()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_PricePerNight();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Free Rooms</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO#getNumFreeRooms()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_NumFreeRooms();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Id();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getFirstName()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getLastName()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_LastName();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getRoomList <em>Room List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room List</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking#getRoomList()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomList();

	/**
	 * Returns the meta object for enum '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType
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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.CheckInEventImpl <em>Check In Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.CheckInEventImpl
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getCheckInEvent()
		 * @generated
		 */
		EClass CHECK_IN_EVENT = eINSTANCE.getCheckInEvent();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.AbstractEventImpl <em>Abstract Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.AbstractEventImpl
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getAbstractEvent()
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
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent <em>IEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getIEvent()
		 * @generated
		 */
		EClass IEVENT = eINSTANCE.getIEvent();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.CheckOutEventImpl <em>Check Out Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.CheckOutEventImpl
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getCheckOutEvent()
		 * @generated
		 */
		EClass CHECK_OUT_EVENT = eINSTANCE.getCheckOutEvent();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl <em>Booking System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getBookingSystem()
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
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking <em>IBooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getIBooking()
		 * @generated
		 */
		EClass IBOOKING = eINSTANCE.getIBooking();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager <em>IHotel Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getIHotelBookingManager()
		 * @generated
		 */
		EClass IHOTEL_BOOKING_MANAGER = eINSTANCE.getIHotelBookingManager();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getIHotelCustomerProvides()
		 * @generated
		 */
		EClass IHOTEL_CUSTOMER_PROVIDES = eINSTANCE.getIHotelCustomerProvides();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.FreeRoomTypesDTOImpl
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getFreeRoomTypesDTO()
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
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingImpl
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getBooking()
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
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType
		 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

	}

} //BookingSystemPackage
