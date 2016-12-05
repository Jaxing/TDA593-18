/**
 */
package se.chalmers.cse.mdsd1617.group18.RoomManager.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.group18.RoomManager.IRoom;
import se.chalmers.cse.mdsd1617.group18.RoomManager.IRoomType;
import se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManager;
import se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.impl.RoomManagerImpl#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.impl.RoomManagerImpl#getRooms <em>Rooms</em>}</li>
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
	 * @generated
	 * @ordered
	 */
	protected EList<IRoomType> roomTypes;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<IRoom> rooms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomManagerImpl() {
		super();
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
	 * @generated
	 */
	public EList<IRoomType> getRoomTypes() {
		if (roomTypes == null) {
			roomTypes = new EObjectResolvingEList<IRoomType>(IRoomType.class, this, RoomManagerPackage.ROOM_MANAGER__ROOM_TYPES);
		}
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IRoom> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<IRoom>(IRoom.class, this, RoomManagerPackage.ROOM_MANAGER__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startup(int numRoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RoomManagerPackage.ROOM_MANAGER___STARTUP__INT:
				startup((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagerImpl
