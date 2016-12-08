/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Room Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getIHotelRoomProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelRoomProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="se.chalmers.cse.mdsd1617.group18.roomManager.IRoom" ordered="false"
	 * @generated
	 */
	EList getRooms();

} // IHotelRoomProvider
