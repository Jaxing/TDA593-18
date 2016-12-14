/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.chalmers.cse.mdsd1617.group18.roomManager.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomManagerFactoryImpl extends EFactoryImpl implements RoomManagerFactory {
	
	private static RoomManager roomManagerInstance;
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomManagerFactory init() {
		try {
			RoomManagerFactory theRoomManagerFactory = (RoomManagerFactory)EPackage.Registry.INSTANCE.getEFactory(RoomManagerPackage.eNS_URI);
			if (theRoomManagerFactory != null) {
				return theRoomManagerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoomManagerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RoomManagerPackage.ROOM_TYPE: return createRoomType();
			case RoomManagerPackage.ROOM_MANAGER: return createRoomManager();
			case RoomManagerPackage.ROOM: return createRoom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManager createRoomManager() {
		if(roomManagerInstance == null){
			roomManagerInstance = new RoomManagerImpl();
		}
		return roomManagerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomType createRoomType(double price, String name, int numberOfBeds, String description) {
		RoomTypeImpl roomType = new RoomTypeImpl(price, name, numberOfBeds, description);
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomManager createRoomManager(EList roomTypes, EList rooms) {
		RoomManagerImpl roomManager = new RoomManagerImpl(roomTypes, rooms);
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room createRoom(IRoomType roomType, int roomNumber) {
		RoomImpl room = new RoomImpl(roomType, roomNumber);
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagerPackage getRoomManagerPackage() {
		return (RoomManagerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoomManagerPackage getPackage() {
		return RoomManagerPackage.eINSTANCE;
	}

} //RoomManagerFactoryImpl
