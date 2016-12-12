/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager;
import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoom;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType;
import se.chalmers.cse.mdsd1617.group18.roomManager.Room;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomType;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerFactory;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerImpl#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomManagerImpl extends MinimalEObjectImpl.Container implements RoomManager {
	/**
	 * The cached value of the '{@link #getRoomTypes() <em>Room Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypes()
	 * @generated NOT
	 * @ordered
	 */
	protected EList roomTypes;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated NOT
	 * @ordered
	 */
	protected EList rooms;
	
	/**
	 * @generated NOT 
	 */
	private String[] roomTypesNames = {"Small Deluxe","Medium Deluxe","Large Deluxe", "First class suite", "Economy Suite", "Medium Standard", "Small Standard", "Large Standard"};
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomManagerImpl() {
		super();
		rooms = new BasicEList();
		roomTypes = new BasicEList();
	}

	/**
	 * @generated NOT
	 */
	protected RoomManagerFactory factory;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomManagerImpl(EList roomTypes, EList rooms) {
		super();
		this.roomTypes = roomTypes;
		this.rooms = rooms;
		factory = RoomManagerFactoryImpl.getInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoomManagerPackage.Literals.ROOM_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRoomTypes() {
		if (roomTypes == null) {
			roomTypes = new EObjectResolvingEList(IRoomType.class, this, RoomManagerPackage.ROOM_MANAGER__ROOM_TYPES);
		}
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList(IRoom.class, this, RoomManagerPackage.ROOM_MANAGER__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void startup(int numRoom) {
		rooms.clear();
		roomTypes.clear();
		
		Random names = new Random(roomTypesNames.length-1);
		Random price = new Random(1500);
		Random nmbrOfBeds = new Random(9);
		for(int i = 1; i <= numRoom; i++){
			String roomTypeName = roomTypesNames[names.nextInt()];
			double p = 500 + price.nextDouble();
			int nmbrOfBed = 1 + nmbrOfBeds.nextInt();
			IRoomType roomType = factory.createRoomType(p, roomTypeName, nmbrOfBed);
			roomTypes.add(roomType);
		}
		
		Random roomType = new Random(roomTypes.size()-1);
		for(int i = 1; i <= numRoom; i++){
			IRoomType rt = (IRoomType)roomTypes.get(roomType.nextInt());
			IRoom room = factory.createRoom(rt, i);
			rooms.add(room);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRoomType(String name, double price, int numberOfBeds) {
		roomTypes.add(factory.createRoomType(price, name, numberOfBeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateRoomType(IRoomType roomType, String name, double price, int numberOfBeds) {
		for(int i = 0; i < roomTypes.size(); i++){
			if (roomTypes.get(i) == roomType){
				roomType.setName(name);
				roomType.setPrice(price);
				roomType.setNumberOfBeds(numberOfBeds);
				roomTypes.set(i,roomType);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRoomType(IRoomType roomType) {
		for(int i = 0; i < roomTypes.size(); i++){
			if (roomTypes.get(i) == roomType){
				roomTypes.remove(i);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRoom(int roomNumber, IRoomType roomType) {
		for(int i = 0; i < rooms.size(); i++){
			if (((Room)(rooms.get(i))).getRoomNumber() == roomNumber){
				return;
			}
		}
		rooms.add(roomNumber, roomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeRoomType(int roomNumber, IRoomType roomType) {
		for(int i = 0; i < rooms.size(); i++){
			if (((Room)(rooms.get(i))).getRoomNumber() == roomNumber){
				((Room)(rooms.get(i))).setRoomType(roomType);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRoom(int roomNumber) {
		for(int i = 0; i < rooms.size(); i++){
			if (((Room)(rooms.get(i))).getRoomNumber() == roomNumber){
				rooms.remove(i);
			}
		}
	}

	
	/**
	 * 
	 * @param roomNumber
	 * @param block
	 * @generated NOT
	 */
	private void setRoomBlock(int roomNumber, boolean block){
		for(int i = 0; i < rooms.size(); i++){
			if(((Room) rooms.get(i)).getRoomNumber()==roomNumber){
				((Room) rooms.get(i)).setBlocked(block);
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void blockRoom(int roomNumber) {
		setRoomBlock(roomNumber, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unblockRoom(int roomNumber) {
		setRoomBlock(roomNumber, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoomManagerPackage.ROOM_MANAGER__ROOM_TYPES:
				return getRoomTypes();
			case RoomManagerPackage.ROOM_MANAGER__ROOMS:
				return getRooms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoomManagerPackage.ROOM_MANAGER__ROOM_TYPES:
				getRoomTypes().clear();
				getRoomTypes().addAll((Collection<? extends IRoomType>)newValue);
				return;
			case RoomManagerPackage.ROOM_MANAGER__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends IRoom>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RoomManagerPackage.ROOM_MANAGER__ROOM_TYPES:
				getRoomTypes().clear();
				return;
			case RoomManagerPackage.ROOM_MANAGER__ROOMS:
				getRooms().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RoomManagerPackage.ROOM_MANAGER__ROOM_TYPES:
				return roomTypes != null && !roomTypes.isEmpty();
			case RoomManagerPackage.ROOM_MANAGER__ROOMS:
				return rooms != null && !rooms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IHotelRoomProvider.class) {
			switch (baseOperationID) {
				case RoomManagerPackage.IHOTEL_ROOM_PROVIDER___GET_ROOMS: return RoomManagerPackage.ROOM_MANAGER___GET_ROOMS;
				default: return -1;
			}
		}
		if (baseClass == IHotelRoomManager.class) {
			switch (baseOperationID) {
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_DOUBLE_INT: return RoomManagerPackage.ROOM_MANAGER___ADD_ROOM_TYPE__STRING_DOUBLE_INT;
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___UPDATE_ROOM_TYPE__IROOMTYPE_STRING_DOUBLE_INT: return RoomManagerPackage.ROOM_MANAGER___UPDATE_ROOM_TYPE__IROOMTYPE_STRING_DOUBLE_INT;
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___GET_ROOM_TYPES: return RoomManagerPackage.ROOM_MANAGER___GET_ROOM_TYPES;
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___REMOVE_ROOM_TYPE__IROOMTYPE: return RoomManagerPackage.ROOM_MANAGER___REMOVE_ROOM_TYPE__IROOMTYPE;
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___ADD_ROOM__INT_IROOMTYPE: return RoomManagerPackage.ROOM_MANAGER___ADD_ROOM__INT_IROOMTYPE;
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___CHANGE_ROOM_TYPE__INT_IROOMTYPE: return RoomManagerPackage.ROOM_MANAGER___CHANGE_ROOM_TYPE__INT_IROOMTYPE;
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___REMOVE_ROOM__INT: return RoomManagerPackage.ROOM_MANAGER___REMOVE_ROOM__INT;
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___BLOCK_ROOM__INT: return RoomManagerPackage.ROOM_MANAGER___BLOCK_ROOM__INT;
				case RoomManagerPackage.IHOTEL_ROOM_MANAGER___UNBLOCK_ROOM__INT: return RoomManagerPackage.ROOM_MANAGER___UNBLOCK_ROOM__INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RoomManagerPackage.ROOM_MANAGER___STARTUP__INT:
				startup((Integer)arguments.get(0));
				return null;
			case RoomManagerPackage.ROOM_MANAGER___ADD_ROOM_TYPE__STRING_DOUBLE_INT:
				addRoomType((String)arguments.get(0), (Double)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case RoomManagerPackage.ROOM_MANAGER___UPDATE_ROOM_TYPE__IROOMTYPE_STRING_DOUBLE_INT:
				updateRoomType((IRoomType)arguments.get(0), (String)arguments.get(1), (Double)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case RoomManagerPackage.ROOM_MANAGER___REMOVE_ROOM_TYPE__IROOMTYPE:
				removeRoomType((IRoomType)arguments.get(0));
				return null;
			case RoomManagerPackage.ROOM_MANAGER___ADD_ROOM__INT_IROOMTYPE:
				addRoom((Integer)arguments.get(0), (IRoomType)arguments.get(1));
				return null;
			case RoomManagerPackage.ROOM_MANAGER___CHANGE_ROOM_TYPE__INT_IROOMTYPE:
				changeRoomType((Integer)arguments.get(0), (IRoomType)arguments.get(1));
				return null;
			case RoomManagerPackage.ROOM_MANAGER___REMOVE_ROOM__INT:
				removeRoom((Integer)arguments.get(0));
				return null;
			case RoomManagerPackage.ROOM_MANAGER___BLOCK_ROOM__INT:
				blockRoom((Integer)arguments.get(0));
				return null;
			case RoomManagerPackage.ROOM_MANAGER___UNBLOCK_ROOM__INT:
				unblockRoom((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagerImpl
