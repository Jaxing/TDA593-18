/**
 */
package se.chalmers.cse.mdsd1617.group18.RoomManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManager#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManager#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoomManager()
 * @model
 * @generated
 */
public interface RoomManager extends IHotelStartupProvies {
	/**
	 * Returns the value of the '<em><b>Room Types</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group18.RoomManager.IRoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Types</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoomManager_RoomTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IRoomType> getRoomTypes();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group18.RoomManager.IRoom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoomManager_Rooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IRoom> getRooms();

} // RoomManager
