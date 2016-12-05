/**
 */
package se.chalmers.cse.mdsd1617.group18.RoomManager;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage
 * @generated
 */
public interface RoomManagerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoomManagerFactory eINSTANCE = se.chalmers.cse.mdsd1617.group18.RoomManager.impl.RoomManagerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type</em>'.
	 * @generated
	 */
	RoomType createRoomType();

	/**
	 * Returns a new object of class '<em>Room Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Manager</em>'.
	 * @generated
	 */
	RoomManager createRoomManager();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RoomManagerPackage getRoomManagerPackage();

} //RoomManagerFactory
