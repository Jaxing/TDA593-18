/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemPackageImpl;

import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager;
import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider;
import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoom;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType;
import se.chalmers.cse.mdsd1617.group18.roomManager.Room;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerFactory;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomManagerPackageImpl extends EPackageImpl implements RoomManagerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelStartupProviesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelRoomProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelRoomManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomEClass = null;

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
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RoomManagerPackageImpl() {
		super(eNS_URI, RoomManagerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RoomManagerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RoomManagerPackage init() {
		if (isInited) return (RoomManagerPackage)EPackage.Registry.INSTANCE.getEPackage(RoomManagerPackage.eNS_URI);

		// Obtain or create and register package
		RoomManagerPackageImpl theRoomManagerPackage = (RoomManagerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RoomManagerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RoomManagerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookingSystemPackageImpl theBookingSystemPackage = (BookingSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingSystemPackage.eNS_URI) instanceof BookingSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingSystemPackage.eNS_URI) : BookingSystemPackage.eINSTANCE);

		// Create package meta-data objects
		theRoomManagerPackage.createPackageContents();
		theBookingSystemPackage.createPackageContents();

		// Initialize created meta-data
		theRoomManagerPackage.initializePackageContents();
		theBookingSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRoomManagerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RoomManagerPackage.eNS_URI, theRoomManagerPackage);
		return theRoomManagerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomType() {
		return iRoomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomType__GetName() {
		return iRoomTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomType__GetPrice() {
		return iRoomTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomType__GetNumberOfBeds() {
		return iRoomTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomType__GetDescription() {
		return iRoomTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomType__SetName__String() {
		return iRoomTypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomType__SetPrice__double() {
		return iRoomTypeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomType__SetNumberOfBeds__int() {
		return iRoomTypeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Price() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Name() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_NumberOfBeds() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManager() {
		return roomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManager_RoomTypes() {
		return (EReference)roomManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManager_Rooms() {
		return (EReference)roomManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelStartupProvies() {
		return iHotelStartupProviesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelStartupProvies__Startup__int() {
		return iHotelStartupProviesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelRoomProvider() {
		return iHotelRoomProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomProvider__GetRooms() {
		return iHotelRoomProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelRoomManager() {
		return iHotelRoomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__AddRoomType__String_double_int() {
		return iHotelRoomManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__ChangeRoomType__String_double_int() {
		return iHotelRoomManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__GetRoomTypes() {
		return iHotelRoomManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__RemoveRoomType__String() {
		return iHotelRoomManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__AddRoom__int_IRoomType() {
		return iHotelRoomManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__UpdateRoom__int_IRoomType() {
		return iHotelRoomManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__RemoveRoom__int() {
		return iHotelRoomManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__BlockRoom__int() {
		return iHotelRoomManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelRoomManager__UnblockRoom__int() {
		return iHotelRoomManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomType() {
		return (EReference)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomNumber() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Blocked() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoom() {
		return iRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__GetRoomType() {
		return iRoomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__GetRoomNumber() {
		return iRoomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__SetRoomType__IRoomType() {
		return iRoomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__SetIsBlocked__boolean() {
		return iRoomEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoom__IsBlocked() {
		return iRoomEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagerFactory getRoomManagerFactory() {
		return (RoomManagerFactory)getEFactoryInstance();
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
		iRoomTypeEClass = createEClass(IROOM_TYPE);
		createEOperation(iRoomTypeEClass, IROOM_TYPE___GET_NAME);
		createEOperation(iRoomTypeEClass, IROOM_TYPE___GET_PRICE);
		createEOperation(iRoomTypeEClass, IROOM_TYPE___GET_NUMBER_OF_BEDS);
		createEOperation(iRoomTypeEClass, IROOM_TYPE___GET_DESCRIPTION);
		createEOperation(iRoomTypeEClass, IROOM_TYPE___SET_NAME__STRING);
		createEOperation(iRoomTypeEClass, IROOM_TYPE___SET_PRICE__DOUBLE);
		createEOperation(iRoomTypeEClass, IROOM_TYPE___SET_NUMBER_OF_BEDS__INT);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NUMBER_OF_BEDS);

		roomManagerEClass = createEClass(ROOM_MANAGER);
		createEReference(roomManagerEClass, ROOM_MANAGER__ROOM_TYPES);
		createEReference(roomManagerEClass, ROOM_MANAGER__ROOMS);

		iHotelStartupProviesEClass = createEClass(IHOTEL_STARTUP_PROVIES);
		createEOperation(iHotelStartupProviesEClass, IHOTEL_STARTUP_PROVIES___STARTUP__INT);

		iHotelRoomProviderEClass = createEClass(IHOTEL_ROOM_PROVIDER);
		createEOperation(iHotelRoomProviderEClass, IHOTEL_ROOM_PROVIDER___GET_ROOMS);

		iHotelRoomManagerEClass = createEClass(IHOTEL_ROOM_MANAGER);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_DOUBLE_INT);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___CHANGE_ROOM_TYPE__STRING_DOUBLE_INT);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___GET_ROOM_TYPES);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___REMOVE_ROOM_TYPE__STRING);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___ADD_ROOM__INT_IROOMTYPE);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___UPDATE_ROOM__INT_IROOMTYPE);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___REMOVE_ROOM__INT);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___BLOCK_ROOM__INT);
		createEOperation(iHotelRoomManagerEClass, IHOTEL_ROOM_MANAGER___UNBLOCK_ROOM__INT);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__ROOM_TYPE);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);
		createEAttribute(roomEClass, ROOM__BLOCKED);

		iRoomEClass = createEClass(IROOM);
		createEOperation(iRoomEClass, IROOM___GET_ROOM_TYPE);
		createEOperation(iRoomEClass, IROOM___GET_ROOM_NUMBER);
		createEOperation(iRoomEClass, IROOM___SET_ROOM_TYPE__IROOMTYPE);
		createEOperation(iRoomEClass, IROOM___SET_IS_BLOCKED__BOOLEAN);
		createEOperation(iRoomEClass, IROOM___IS_BLOCKED);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roomTypeEClass.getESuperTypes().add(this.getIRoomType());
		roomManagerEClass.getESuperTypes().add(this.getIHotelStartupProvies());
		roomManagerEClass.getESuperTypes().add(this.getIHotelRoomProvider());
		roomManagerEClass.getESuperTypes().add(this.getIHotelRoomManager());
		iHotelRoomManagerEClass.getESuperTypes().add(this.getIHotelRoomProvider());
		roomEClass.getESuperTypes().add(this.getIRoom());

		// Initialize classes, features, and operations; add parameters
		initEClass(iRoomTypeEClass, IRoomType.class, "IRoomType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRoomType__GetName(), ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomType__GetPrice(), ecorePackage.getEDouble(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomType__GetNumberOfBeds(), ecorePackage.getEInt(), "getNumberOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomType__GetDescription(), ecorePackage.getEString(), "getDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIRoomType__SetName__String(), null, "setName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomType__SetPrice__double(), null, "setPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomType__SetNumberOfBeds__int(), null, "setNumberOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "beds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_NumberOfBeds(), ecorePackage.getEInt(), "numberOfBeds", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomManagerEClass, RoomManager.class, "RoomManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomManager_RoomTypes(), this.getIRoomType(), null, "roomTypes", null, 0, -1, RoomManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomManager_Rooms(), this.getIRoom(), null, "rooms", null, 0, -1, RoomManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iHotelStartupProviesEClass, IHotelStartupProvies.class, "IHotelStartupProvies", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelStartupProvies__Startup__int(), null, "startup", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelRoomProviderEClass, IHotelRoomProvider.class, "IHotelRoomProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIHotelRoomProvider__GetRooms(), this.getIRoom(), "getRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelRoomManagerEClass, IHotelRoomManager.class, "IHotelRoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelRoomManager__AddRoomType__String_double_int(), null, "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelRoomManager__ChangeRoomType__String_double_int(), null, "changeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIHotelRoomManager__GetRoomTypes(), this.getIRoomType(), "getRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelRoomManager__RemoveRoomType__String(), null, "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelRoomManager__AddRoom__int_IRoomType(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelRoomManager__UpdateRoom__int_IRoomType(), null, "updateRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelRoomManager__RemoveRoom__int(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelRoomManager__BlockRoom__int(), null, "blockRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelRoomManager__UnblockRoom__int(), null, "unblockRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_RoomType(), this.getIRoomType(), null, "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Blocked(), ecorePackage.getEBoolean(), "blocked", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iRoomEClass, IRoom.class, "IRoom", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRoom__GetRoomType(), this.getIRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoom__GetRoomNumber(), ecorePackage.getEInt(), "getRoomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoom__SetRoomType__IRoomType(), null, "setRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoom__SetIsBlocked__boolean(), null, "setIsBlocked", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "blocked", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoom__IsBlocked(), ecorePackage.getEBoolean(), "isBlocked", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RoomManagerPackageImpl
