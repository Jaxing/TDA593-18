/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#isBlocked <em>Blocked</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getExtraCostDescriptions <em>Extra Cost Descriptions</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getExtraCostPrice <em>Extra Cost Price</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#isOccupied <em>Occupied</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends IRoom {
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
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IRoomType getRoomType();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getRoomType <em>Room Type</em>}' reference.
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
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getRoomNumber <em>Room Number</em>}' attribute.
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
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getRoom_Blocked()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBlocked();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#isBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked</em>' attribute.
	 * @see #isBlocked()
	 * @generated
	 */
	void setBlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Extra Cost Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Cost Descriptions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Cost Descriptions</em>' attribute.
	 * @see #setExtraCostDescriptions(String)
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getRoom_ExtraCostDescriptions()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getExtraCostDescriptions();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getExtraCostDescriptions <em>Extra Cost Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Cost Descriptions</em>' attribute.
	 * @see #getExtraCostDescriptions()
	 * @generated
	 */
	void setExtraCostDescriptions(String value);

	/**
	 * Returns the value of the '<em><b>Extra Cost Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Cost Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Cost Price</em>' attribute.
	 * @see #setExtraCostPrice(double)
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getRoom_ExtraCostPrice()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getExtraCostPrice();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#getExtraCostPrice <em>Extra Cost Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Cost Price</em>' attribute.
	 * @see #getExtraCostPrice()
	 * @generated
	 */
	void setExtraCostPrice(double value);

	/**
	 * Returns the value of the '<em><b>Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupied</em>' attribute.
	 * @see #setOccupied(boolean)
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getRoom_Occupied()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOccupied();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room#isOccupied <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupied</em>' attribute.
	 * @see #isOccupied()
	 * @generated
	 */
	void setOccupied(boolean value);

} // Room
