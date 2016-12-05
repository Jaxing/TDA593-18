/**
 */
package se.chalmers.cse.mdsd1617.group18.RoomManager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getIRoom()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoom extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	IRoomType getRoomType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void setRoomType(IRoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model blockedRequired="true" blockedOrdered="false"
	 * @generated
	 */
	void setIsBlocked(boolean blocked);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isBlocked();

} // IRoom
