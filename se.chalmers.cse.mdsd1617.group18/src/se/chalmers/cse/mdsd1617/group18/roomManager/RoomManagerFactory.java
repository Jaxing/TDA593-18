/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage
 * @generated
 */
public interface RoomManagerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoomManagerFactory eINSTANCE = se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl.init();


	/**
	 * Returns a new object of class '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type</em>'.
	 * @generated NOT
	 */
	RoomType createRoomType(double price, String name, int numberOfBeds);

	/**
	 * Returns a new object of class '<em>Room Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Manager</em>'.
	 * @generated NOT
	 */
	RoomManager createRoomManager(EList roomTypes, EList rooms);

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated NOT
	 */
	Room createRoom(IRoomType roomType, int roomNumber);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RoomManagerPackage getRoomManagerPackage();

} //RoomManagerFactory
