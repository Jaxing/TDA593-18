/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerFactory
 * @model kind="package"
 * @generated
 */
public interface RoomManagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roomManager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///se/chalmers/cse/mdsd1617/group18/roomManager.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.chalmers.cse.mdsd1617.group18.roomManager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoomManagerPackage eINSTANCE = se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType <em>IRoom Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIRoomType()
	 * @generated
	 */
	int IROOM_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IRoom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___GET_PRICE = 1;

	/**
	 * The operation id for the '<em>Get Number Of Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___GET_NUMBER_OF_BEDS = 2;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___GET_DESCRIPTION = 3;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___SET_NAME__STRING = 4;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___SET_PRICE__DOUBLE = 5;

	/**
	 * The operation id for the '<em>Set Number Of Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___SET_NUMBER_OF_BEDS__INT = 6;

	/**
	 * The number of operations of the '<em>IRoom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomTypeImpl
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE = IROOM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = IROOM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NUMBER_OF_BEDS = IROOM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = IROOM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = IROOM_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___GET_NAME = IROOM_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___GET_PRICE = IROOM_TYPE___GET_PRICE;

	/**
	 * The operation id for the '<em>Get Number Of Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___GET_NUMBER_OF_BEDS = IROOM_TYPE___GET_NUMBER_OF_BEDS;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___GET_DESCRIPTION = IROOM_TYPE___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___SET_NAME__STRING = IROOM_TYPE___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___SET_PRICE__DOUBLE = IROOM_TYPE___SET_PRICE__DOUBLE;

	/**
	 * The operation id for the '<em>Set Number Of Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___SET_NUMBER_OF_BEDS__INT = IROOM_TYPE___SET_NUMBER_OF_BEDS__INT;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = IROOM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies <em>IHotel Startup Provies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIHotelStartupProvies()
	 * @generated
	 */
	int IHOTEL_STARTUP_PROVIES = 3;

	/**
	 * The number of structural features of the '<em>IHotel Startup Provies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_STARTUP_PROVIES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Startup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_STARTUP_PROVIES___STARTUP__INT = 0;

	/**
	 * The number of operations of the '<em>IHotel Startup Provies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_STARTUP_PROVIES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerImpl <em>Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerImpl
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getRoomManager()
	 * @generated
	 */
	int ROOM_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Room Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER__ROOM_TYPES = IHOTEL_STARTUP_PROVIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER__ROOMS = IHOTEL_STARTUP_PROVIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_FEATURE_COUNT = IHOTEL_STARTUP_PROVIES_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Startup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___STARTUP__INT = IHOTEL_STARTUP_PROVIES___STARTUP__INT;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOMS = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___ADD_ROOM_TYPE__STRING_DOUBLE_INT = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___UPDATE_ROOM_TYPE__IROOMTYPE_STRING_DOUBLE_INT = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOM_TYPES = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___REMOVE_ROOM_TYPE__IROOMTYPE = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___ADD_ROOM__INT_IROOMTYPE = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Change Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___CHANGE_ROOM_TYPE__INT_IROOMTYPE = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___REMOVE_ROOM__INT = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Block Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___BLOCK_ROOM__INT = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Unblock Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___UNBLOCK_ROOM__INT = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_OPERATION_COUNT = IHOTEL_STARTUP_PROVIES_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider <em>IHotel Room Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIHotelRoomProvider()
	 * @generated
	 */
	int IHOTEL_ROOM_PROVIDER = 4;

	/**
	 * The number of structural features of the '<em>IHotel Room Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_PROVIDER___GET_ROOMS = 0;

	/**
	 * The number of operations of the '<em>IHotel Room Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager <em>IHotel Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIHotelRoomManager()
	 * @generated
	 */
	int IHOTEL_ROOM_MANAGER = 5;

	/**
	 * The number of structural features of the '<em>IHotel Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER_FEATURE_COUNT = IHOTEL_ROOM_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___GET_ROOMS = IHOTEL_ROOM_PROVIDER___GET_ROOMS;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_DOUBLE_INT = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___UPDATE_ROOM_TYPE__IROOMTYPE_STRING_DOUBLE_INT = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___GET_ROOM_TYPES = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___REMOVE_ROOM_TYPE__IROOMTYPE = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___ADD_ROOM__INT_IROOMTYPE = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Change Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___CHANGE_ROOM_TYPE__INT_IROOMTYPE = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___REMOVE_ROOM__INT = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Block Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___BLOCK_ROOM__INT = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Unblock Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER___UNBLOCK_ROOM__INT = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>IHotel Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ROOM_MANAGER_OPERATION_COUNT = IHOTEL_ROOM_PROVIDER_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom <em>IRoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIRoom()
	 * @generated
	 */
	int IROOM = 7;

	/**
	 * The number of structural features of the '<em>IRoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_ROOM_TYPE = 0;

	/**
	 * The operation id for the '<em>Get Room Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_ROOM_NUMBER = 1;

	/**
	 * The operation id for the '<em>Set Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___SET_ROOM_TYPE__IROOMTYPE = 2;

	/**
	 * The operation id for the '<em>Set Is Blocked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___SET_IS_BLOCKED__BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Is Blocked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___IS_BLOCKED = 4;

	/**
	 * The number of operations of the '<em>IRoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 6;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = IROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUMBER = IROOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BLOCKED = IROOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = IROOM_FEATURE_COUNT + 3;


	/**
	 * The operation id for the '<em>Get Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___GET_ROOM_TYPE = IROOM___GET_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Get Room Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___GET_ROOM_NUMBER = IROOM___GET_ROOM_NUMBER;

	/**
	 * The operation id for the '<em>Set Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___SET_ROOM_TYPE__IROOMTYPE = IROOM___SET_ROOM_TYPE__IROOMTYPE;

	/**
	 * The operation id for the '<em>Set Is Blocked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___SET_IS_BLOCKED__BOOLEAN = IROOM___SET_IS_BLOCKED__BOOLEAN;

	/**
	 * The operation id for the '<em>Is Blocked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___IS_BLOCKED = IROOM___IS_BLOCKED;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = IROOM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType <em>IRoom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Type</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType
	 * @generated
	 */
	EClass getIRoomType();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#getName()
	 * @generated
	 */
	EOperation getIRoomType__GetName();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#getPrice()
	 * @generated
	 */
	EOperation getIRoomType__GetPrice();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#getNumberOfBeds() <em>Get Number Of Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Of Beds</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#getNumberOfBeds()
	 * @generated
	 */
	EOperation getIRoomType__GetNumberOfBeds();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#getDescription()
	 * @generated
	 */
	EOperation getIRoomType__GetDescription();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#setName(java.lang.String)
	 * @generated
	 */
	EOperation getIRoomType__SetName__String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#setPrice(double) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#setPrice(double)
	 * @generated
	 */
	EOperation getIRoomType__SetPrice__double();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#setNumberOfBeds(int) <em>Set Number Of Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Number Of Beds</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType#setNumberOfBeds(int)
	 * @generated
	 */
	EOperation getIRoomType__SetNumberOfBeds__int();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomType#getPrice()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Price();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomType#getNumberOfBeds <em>Number Of Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Beds</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomType#getNumberOfBeds()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_NumberOfBeds();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manager</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager
	 * @generated
	 */
	EClass getRoomManager();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager#getRoomTypes <em>Room Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Types</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager#getRoomTypes()
	 * @see #getRoomManager()
	 * @generated
	 */
	EReference getRoomManager_RoomTypes();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager#getRooms()
	 * @see #getRoomManager()
	 * @generated
	 */
	EReference getRoomManager_Rooms();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies <em>IHotel Startup Provies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Startup Provies</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies
	 * @generated
	 */
	EClass getIHotelStartupProvies();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies#startup(int) <em>Startup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Startup</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies#startup(int)
	 * @generated
	 */
	EOperation getIHotelStartupProvies__Startup__int();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider <em>IHotel Room Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Room Provider</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider
	 * @generated
	 */
	EClass getIHotelRoomProvider();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider#getRooms() <em>Get Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider#getRooms()
	 * @generated
	 */
	EOperation getIHotelRoomProvider__GetRooms();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager <em>IHotel Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Room Manager</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager
	 * @generated
	 */
	EClass getIHotelRoomManager();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#addRoomType(java.lang.String, double, int) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#addRoomType(java.lang.String, double, int)
	 * @generated
	 */
	EOperation getIHotelRoomManager__AddRoomType__String_double_int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#updateRoomType(se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType, java.lang.String, double, int) <em>Update Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#updateRoomType(se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType, java.lang.String, double, int)
	 * @generated
	 */
	EOperation getIHotelRoomManager__UpdateRoomType__IRoomType_String_double_int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#getRoomTypes()
	 * @generated
	 */
	EOperation getIHotelRoomManager__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#removeRoomType(se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#removeRoomType(se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType)
	 * @generated
	 */
	EOperation getIHotelRoomManager__RemoveRoomType__IRoomType();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#addRoom(int, se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#addRoom(int, se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType)
	 * @generated
	 */
	EOperation getIHotelRoomManager__AddRoom__int_IRoomType();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#changeRoomType(int, se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType) <em>Change Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#changeRoomType(int, se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType)
	 * @generated
	 */
	EOperation getIHotelRoomManager__ChangeRoomType__int_IRoomType();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#removeRoom(int)
	 * @generated
	 */
	EOperation getIHotelRoomManager__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#blockRoom(int) <em>Block Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Block Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#blockRoom(int)
	 * @generated
	 */
	EOperation getIHotelRoomManager__BlockRoom__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#unblockRoom(int) <em>Unblock Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unblock Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager#unblockRoom(int)
	 * @generated
	 */
	EOperation getIHotelRoomManager__UnblockRoom__int();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#isBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.Room#isBlocked()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Blocked();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom <em>IRoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom</em>'.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom
	 * @generated
	 */
	EClass getIRoom();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#getRoomType() <em>Get Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#getRoomType()
	 * @generated
	 */
	EOperation getIRoom__GetRoomType();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#getRoomNumber() <em>Get Room Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Number</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#getRoomNumber()
	 * @generated
	 */
	EOperation getIRoom__GetRoomNumber();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#setRoomType(se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType) <em>Set Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#setRoomType(se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType)
	 * @generated
	 */
	EOperation getIRoom__SetRoomType__IRoomType();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#setIsBlocked(boolean) <em>Set Is Blocked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Blocked</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#setIsBlocked(boolean)
	 * @generated
	 */
	EOperation getIRoom__SetIsBlocked__boolean();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#isBlocked() <em>Is Blocked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Blocked</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom#isBlocked()
	 * @generated
	 */
	EOperation getIRoom__IsBlocked();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoomManagerFactory getRoomManagerFactory();

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
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType <em>IRoom Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIRoomType()
		 * @generated
		 */
		EClass IROOM_TYPE = eINSTANCE.getIRoomType();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___GET_NAME = eINSTANCE.getIRoomType__GetName();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___GET_PRICE = eINSTANCE.getIRoomType__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Get Number Of Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___GET_NUMBER_OF_BEDS = eINSTANCE.getIRoomType__GetNumberOfBeds();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___GET_DESCRIPTION = eINSTANCE.getIRoomType__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___SET_NAME__STRING = eINSTANCE.getIRoomType__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Set Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___SET_PRICE__DOUBLE = eINSTANCE.getIRoomType__SetPrice__double();

		/**
		 * The meta object literal for the '<em><b>Set Number Of Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___SET_NUMBER_OF_BEDS__INT = eINSTANCE.getIRoomType__SetNumberOfBeds__int();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomTypeImpl
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE = eINSTANCE.getRoomType_Price();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

		/**
		 * The meta object literal for the '<em><b>Number Of Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NUMBER_OF_BEDS = eINSTANCE.getRoomType_NumberOfBeds();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerImpl <em>Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerImpl
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getRoomManager()
		 * @generated
		 */
		EClass ROOM_MANAGER = eINSTANCE.getRoomManager();

		/**
		 * The meta object literal for the '<em><b>Room Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGER__ROOM_TYPES = eINSTANCE.getRoomManager_RoomTypes();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGER__ROOMS = eINSTANCE.getRoomManager_Rooms();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies <em>IHotel Startup Provies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIHotelStartupProvies()
		 * @generated
		 */
		EClass IHOTEL_STARTUP_PROVIES = eINSTANCE.getIHotelStartupProvies();

		/**
		 * The meta object literal for the '<em><b>Startup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_STARTUP_PROVIES___STARTUP__INT = eINSTANCE.getIHotelStartupProvies__Startup__int();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider <em>IHotel Room Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIHotelRoomProvider()
		 * @generated
		 */
		EClass IHOTEL_ROOM_PROVIDER = eINSTANCE.getIHotelRoomProvider();

		/**
		 * The meta object literal for the '<em><b>Get Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_PROVIDER___GET_ROOMS = eINSTANCE.getIHotelRoomProvider__GetRooms();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager <em>IHotel Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIHotelRoomManager()
		 * @generated
		 */
		EClass IHOTEL_ROOM_MANAGER = eINSTANCE.getIHotelRoomManager();

		/**
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_DOUBLE_INT = eINSTANCE.getIHotelRoomManager__AddRoomType__String_double_int();

		/**
		 * The meta object literal for the '<em><b>Update Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___UPDATE_ROOM_TYPE__IROOMTYPE_STRING_DOUBLE_INT = eINSTANCE.getIHotelRoomManager__UpdateRoomType__IRoomType_String_double_int();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___GET_ROOM_TYPES = eINSTANCE.getIHotelRoomManager__GetRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___REMOVE_ROOM_TYPE__IROOMTYPE = eINSTANCE.getIHotelRoomManager__RemoveRoomType__IRoomType();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___ADD_ROOM__INT_IROOMTYPE = eINSTANCE.getIHotelRoomManager__AddRoom__int_IRoomType();

		/**
		 * The meta object literal for the '<em><b>Change Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___CHANGE_ROOM_TYPE__INT_IROOMTYPE = eINSTANCE.getIHotelRoomManager__ChangeRoomType__int_IRoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___REMOVE_ROOM__INT = eINSTANCE.getIHotelRoomManager__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Block Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___BLOCK_ROOM__INT = eINSTANCE.getIHotelRoomManager__BlockRoom__int();

		/**
		 * The meta object literal for the '<em><b>Unblock Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ROOM_MANAGER___UNBLOCK_ROOM__INT = eINSTANCE.getIHotelRoomManager__UnblockRoom__int();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomImpl
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NUMBER = eINSTANCE.getRoom_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__BLOCKED = eINSTANCE.getRoom_Blocked();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom <em>IRoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom
		 * @see se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerPackageImpl#getIRoom()
		 * @generated
		 */
		EClass IROOM = eINSTANCE.getIRoom();

		/**
		 * The meta object literal for the '<em><b>Get Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_ROOM_TYPE = eINSTANCE.getIRoom__GetRoomType();

		/**
		 * The meta object literal for the '<em><b>Get Room Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_ROOM_NUMBER = eINSTANCE.getIRoom__GetRoomNumber();

		/**
		 * The meta object literal for the '<em><b>Set Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___SET_ROOM_TYPE__IROOMTYPE = eINSTANCE.getIRoom__SetRoomType__IRoomType();

		/**
		 * The meta object literal for the '<em><b>Set Is Blocked</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___SET_IS_BLOCKED__BOOLEAN = eINSTANCE.getIRoom__SetIsBlocked__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Blocked</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___IS_BLOCKED = eINSTANCE.getIRoom__IsBlocked();

	}

} //RoomManagerPackage
