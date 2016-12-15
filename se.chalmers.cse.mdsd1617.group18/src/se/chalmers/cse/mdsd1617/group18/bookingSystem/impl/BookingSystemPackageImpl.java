/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides;

import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage;

import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingSystemPackageImpl extends EPackageImpl implements BookingSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkInEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkOutEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelBookingManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelCustomerProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeRoomTypesDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BookingSystemPackageImpl() {
		super(eNS_URI, BookingSystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BookingSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BookingSystemPackage init() {
		if (isInited) return (BookingSystemPackage)EPackage.Registry.INSTANCE.getEPackage(BookingSystemPackage.eNS_URI);

		// Obtain or create and register package
		BookingSystemPackageImpl theBookingSystemPackage = (BookingSystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BookingSystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BookingSystemPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RoomManagerPackageImpl theRoomManagerPackage = (RoomManagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoomManagerPackage.eNS_URI) instanceof RoomManagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoomManagerPackage.eNS_URI) : RoomManagerPackage.eINSTANCE);

		// Create package meta-data objects
		theBookingSystemPackage.createPackageContents();
		theRoomManagerPackage.createPackageContents();

		// Initialize created meta-data
		theBookingSystemPackage.initializePackageContents();
		theRoomManagerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBookingSystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BookingSystemPackage.eNS_URI, theBookingSystemPackage);
		return theBookingSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckInEvent() {
		return checkInEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEvent() {
		return abstractEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEvent_Timestamp() {
		return (EAttribute)abstractEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEvent_EventType() {
		return (EAttribute)abstractEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEvent_BookingID() {
		return (EAttribute)abstractEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEvent() {
		return iEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIEvent__GetTimestamp() {
		return iEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIEvent__GetType() {
		return iEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIEvent__GetBookingId() {
		return iEventEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckOutEvent() {
		return checkOutEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingSystem() {
		return bookingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingSystem_Events() {
		return (EReference)bookingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingSystem_Bookings() {
		return (EReference)bookingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingSystem_RoomProvider() {
		return (EReference)bookingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBooking() {
		return iBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetRooms() {
		return iBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetFirstName() {
		return iBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetLastName() {
		return iBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetID() {
		return iBookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetStartDate() {
		return iBookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetEndDate() {
		return iBookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__SetRooms__EList() {
		return iBookingEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__SetStartDate__String() {
		return iBookingEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__SetEndDate__String() {
		return iBookingEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__AddRoom__IRoom() {
		return iBookingEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelBookingManager() {
		return iHotelBookingManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__InitiateCheckin__int() {
		return iHotelBookingManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__EditBookingPeriod__int_String_String() {
		return iHotelBookingManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__CancelBooking__int() {
		return iHotelBookingManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__ListBooking() {
		return iHotelBookingManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__ListOccupiedRooms__String() {
		return iHotelBookingManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__ListCheckins__String_String() {
		return iHotelBookingManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__ListCheckouts__String_String() {
		return iHotelBookingManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__AddExtraCostToRoom__int_int_String_double() {
		return iHotelBookingManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelBookingManager__EditBookingRooms__int_int_IRoomType() {
		return iHotelBookingManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelCustomerProvides() {
		return iHotelCustomerProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__GetFreeRooms__int_String_String() {
		return iHotelCustomerProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__InitiateBooking__String_String_String_String() {
		return iHotelCustomerProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__AddRoomToBooking__String_int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__ConfirmBooking__int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__InitiateCheckout__int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String() {
		return iHotelCustomerProvidesEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__InitiateRoomCheckout__int_int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String() {
		return iHotelCustomerProvidesEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__CheckInRoom__String_int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeRoomTypesDTO() {
		return freeRoomTypesDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeRoomTypesDTO_RoomTypeDescription() {
		return (EAttribute)freeRoomTypesDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeRoomTypesDTO_NumBeds() {
		return (EAttribute)freeRoomTypesDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeRoomTypesDTO_PricePerNight() {
		return (EAttribute)freeRoomTypesDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeRoomTypesDTO_NumFreeRooms() {
		return (EAttribute)freeRoomTypesDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Id() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_FirstName() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_LastName() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_StartDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_EndDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomList() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingSystemFactory getBookingSystemFactory() {
		return (BookingSystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		checkInEventEClass = createEClass(CHECK_IN_EVENT);

		abstractEventEClass = createEClass(ABSTRACT_EVENT);
		createEAttribute(abstractEventEClass, ABSTRACT_EVENT__TIMESTAMP);
		createEAttribute(abstractEventEClass, ABSTRACT_EVENT__EVENT_TYPE);
		createEAttribute(abstractEventEClass, ABSTRACT_EVENT__BOOKING_ID);

		iEventEClass = createEClass(IEVENT);
		createEOperation(iEventEClass, IEVENT___GET_TIMESTAMP);
		createEOperation(iEventEClass, IEVENT___GET_TYPE);
		createEOperation(iEventEClass, IEVENT___GET_BOOKING_ID);

		checkOutEventEClass = createEClass(CHECK_OUT_EVENT);

		bookingSystemEClass = createEClass(BOOKING_SYSTEM);
		createEReference(bookingSystemEClass, BOOKING_SYSTEM__EVENTS);
		createEReference(bookingSystemEClass, BOOKING_SYSTEM__BOOKINGS);
		createEReference(bookingSystemEClass, BOOKING_SYSTEM__ROOM_PROVIDER);

		iBookingEClass = createEClass(IBOOKING);
		createEOperation(iBookingEClass, IBOOKING___GET_ROOMS);
		createEOperation(iBookingEClass, IBOOKING___GET_FIRST_NAME);
		createEOperation(iBookingEClass, IBOOKING___GET_LAST_NAME);
		createEOperation(iBookingEClass, IBOOKING___GET_ID);
		createEOperation(iBookingEClass, IBOOKING___GET_START_DATE);
		createEOperation(iBookingEClass, IBOOKING___GET_END_DATE);
		createEOperation(iBookingEClass, IBOOKING___SET_ROOMS__ELIST);
		createEOperation(iBookingEClass, IBOOKING___SET_START_DATE__STRING);
		createEOperation(iBookingEClass, IBOOKING___SET_END_DATE__STRING);
		createEOperation(iBookingEClass, IBOOKING___ADD_ROOM__IROOM);

		iHotelBookingManagerEClass = createEClass(IHOTEL_BOOKING_MANAGER);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___INITIATE_CHECKIN__INT);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___EDIT_BOOKING_PERIOD__INT_STRING_STRING);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___CANCEL_BOOKING__INT);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___LIST_BOOKING);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___LIST_OCCUPIED_ROOMS__STRING);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___LIST_CHECKINS__STRING_STRING);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___LIST_CHECKOUTS__STRING_STRING);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___ADD_EXTRA_COST_TO_ROOM__INT_INT_STRING_DOUBLE);
		createEOperation(iHotelBookingManagerEClass, IHOTEL_BOOKING_MANAGER___EDIT_BOOKING_ROOMS__INT_INT_IROOMTYPE);

		iHotelCustomerProvidesEClass = createEClass(IHOTEL_CUSTOMER_PROVIDES);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT);

		freeRoomTypesDTOEClass = createEClass(FREE_ROOM_TYPES_DTO);
		createEAttribute(freeRoomTypesDTOEClass, FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION);
		createEAttribute(freeRoomTypesDTOEClass, FREE_ROOM_TYPES_DTO__NUM_BEDS);
		createEAttribute(freeRoomTypesDTOEClass, FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT);
		createEAttribute(freeRoomTypesDTOEClass, FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__ID);
		createEAttribute(bookingEClass, BOOKING__FIRST_NAME);
		createEAttribute(bookingEClass, BOOKING__LAST_NAME);
		createEAttribute(bookingEClass, BOOKING__START_DATE);
		createEAttribute(bookingEClass, BOOKING__END_DATE);
		createEReference(bookingEClass, BOOKING__ROOM_LIST);

		// Create enums
		eventTypeEEnum = createEEnum(EVENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RoomManagerPackage theRoomManagerPackage = (RoomManagerPackage)EPackage.Registry.INSTANCE.getEPackage(RoomManagerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		checkInEventEClass.getESuperTypes().add(this.getAbstractEvent());
		abstractEventEClass.getESuperTypes().add(this.getIEvent());
		checkOutEventEClass.getESuperTypes().add(this.getAbstractEvent());
		bookingSystemEClass.getESuperTypes().add(this.getIHotelBookingManager());
		bookingSystemEClass.getESuperTypes().add(this.getIHotelCustomerProvides());
		iHotelBookingManagerEClass.getESuperTypes().add(this.getIHotelCustomerProvides());
		bookingEClass.getESuperTypes().add(this.getIBooking());

		// Initialize classes, features, and operations; add parameters
		initEClass(checkInEventEClass, CheckInEvent.class, "CheckInEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractEventEClass, AbstractEvent.class, "AbstractEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractEvent_Timestamp(), ecorePackage.getELong(), "timestamp", null, 1, 1, AbstractEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractEvent_EventType(), this.getEventType(), "eventType", null, 1, 1, AbstractEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractEvent_BookingID(), ecorePackage.getEInt(), "bookingID", null, 1, 1, AbstractEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iEventEClass, IEvent.class, "IEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIEvent__GetTimestamp(), ecorePackage.getELong(), "getTimestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIEvent__GetType(), this.getEventType(), "getType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIEvent__GetBookingId(), ecorePackage.getEInt(), "getBookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(checkOutEventEClass, CheckOutEvent.class, "CheckOutEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bookingSystemEClass, BookingSystem.class, "BookingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingSystem_Events(), this.getIEvent(), null, "events", null, 0, -1, BookingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingSystem_Bookings(), this.getIBooking(), null, "bookings", null, 0, -1, BookingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingSystem_RoomProvider(), theRoomManagerPackage.getIHotelRoomProvider(), null, "roomProvider", null, 1, 1, BookingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingEClass, IBooking.class, "IBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBooking__GetRooms(), theRoomManagerPackage.getIRoom(), "getRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetFirstName(), ecorePackage.getEString(), "getFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetLastName(), ecorePackage.getEString(), "getLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetID(), ecorePackage.getEInt(), "getID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetStartDate(), ecorePackage.getEString(), "getStartDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBooking__GetEndDate(), ecorePackage.getEString(), "getEndDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIBooking__SetRooms__EList(), null, "setRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theRoomManagerPackage.getIRoom(), "rooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__SetStartDate__String(), null, "setStartDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__SetEndDate__String(), null, "setEndDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__AddRoom__IRoom(), ecorePackage.getEBoolean(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theRoomManagerPackage.getIRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelBookingManagerEClass, IHotelBookingManager.class, "IHotelBookingManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelBookingManager__InitiateCheckin__int(), theRoomManagerPackage.getIRoom(), "initiateCheckin", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelBookingManager__EditBookingPeriod__int_String_String(), ecorePackage.getEBoolean(), "editBookingPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelBookingManager__CancelBooking__int(), null, "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIHotelBookingManager__ListBooking(), this.getIBooking(), "listBooking", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelBookingManager__ListOccupiedRooms__String(), ecorePackage.getEJavaObject(), "listOccupiedRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelBookingManager__ListCheckins__String_String(), this.getIEvent(), "listCheckins", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelBookingManager__ListCheckouts__String_String(), this.getIEvent(), "listCheckouts", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelBookingManager__AddExtraCostToRoom__int_int_String_double(), null, "addExtraCostToRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "descriptionOfCost", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "priceOfCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelBookingManager__EditBookingRooms__int_int_IRoomType(), null, "editBookingRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theRoomManagerPackage.getIRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelCustomerProvidesEClass, IHotelCustomerProvides.class, "IHotelCustomerProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelCustomerProvides__GetFreeRooms__int_String_String(), this.getFreeRoomTypesDTO(), "getFreeRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__InitiateBooking__String_String_String_String(), ecorePackage.getEInt(), "initiateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__AddRoomToBooking__String_int(), ecorePackage.getEBoolean(), "addRoomToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomTypeDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__ConfirmBooking__int(), ecorePackage.getEBoolean(), "confirmBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__InitiateCheckout__int(), ecorePackage.getEDouble(), "initiateCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "payDuringCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__InitiateRoomCheckout__int_int(), ecorePackage.getEDouble(), "initiateRoomCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String(), ecorePackage.getEBoolean(), "payRoomDuringCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__CheckInRoom__String_int(), ecorePackage.getEInt(), "checkInRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomTypeDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(freeRoomTypesDTOEClass, FreeRoomTypesDTO.class, "FreeRoomTypesDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeRoomTypesDTO_RoomTypeDescription(), ecorePackage.getEString(), "roomTypeDescription", null, 1, 1, FreeRoomTypesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFreeRoomTypesDTO_NumBeds(), ecorePackage.getEInt(), "numBeds", null, 1, 1, FreeRoomTypesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFreeRoomTypesDTO_PricePerNight(), ecorePackage.getEDouble(), "pricePerNight", null, 1, 1, FreeRoomTypesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFreeRoomTypesDTO_NumFreeRooms(), ecorePackage.getEInt(), "numFreeRooms", null, 1, 1, FreeRoomTypesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_StartDate(), ecorePackage.getEString(), "startDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_EndDate(), ecorePackage.getEString(), "endDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomList(), theRoomManagerPackage.getIRoom(), null, "roomList", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.CHECK_IN);
		addEEnumLiteral(eventTypeEEnum, EventType.CHECK_OUT);

		// Create resource
		createResource(eNS_URI);
	}
	
} //BookingSystemPackageImpl
