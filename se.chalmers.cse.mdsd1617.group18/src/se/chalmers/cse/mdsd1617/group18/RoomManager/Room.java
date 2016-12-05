/**
 */
package se.chalmers.cse.mdsd1617.group18.RoomManager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.Room#isBlocked <em>Blocked</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(IRoomType)
	 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IRoomType getRoomType();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.RoomManager.Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(IRoomType value);

	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.RoomManager.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked</em>' attribute.
	 * @see #setBlocked(boolean)
	 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoom_Blocked()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBlocked();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.RoomManager.Room#isBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked</em>' attribute.
	 * @see #isBlocked()
	 * @generated
	 */
	void setBlocked(boolean value);

} // Room
