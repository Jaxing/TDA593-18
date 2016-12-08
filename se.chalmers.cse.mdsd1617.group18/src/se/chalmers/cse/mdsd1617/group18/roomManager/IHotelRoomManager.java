/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getIHotelRoomManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelRoomManager extends IHotelRoomProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false" numberOfBedsRequired="true" numberOfBedsOrdered="false"
	 * @generated
	 */
	void addRoomType(String name, double price, int numberOfBeds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false" numberOfBedsRequired="true" numberOfBedsOrdered="false" newNameRequired="true" newNameOrdered="false"
	 * @generated
	 */
	void updateRoomType(String name, double price, int numberOfBeds, String newName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<IRoomType> getRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void removeRoomType(IRoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void addRoom(int roomNumber, IRoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void changeRoomType(int roomNumber, IRoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void removeRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void blockRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void unblockRoom(int roomNumber);

} // IHotelRoomManager
