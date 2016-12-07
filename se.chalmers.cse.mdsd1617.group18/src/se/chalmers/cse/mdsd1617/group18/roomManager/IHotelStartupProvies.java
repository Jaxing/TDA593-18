/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Startup Provies</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage#getIHotelStartupProvies()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelStartupProvies extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numRoomRequired="true" numRoomOrdered="false"
	 * @generated
	 */
	void startup(int numRoom);

} // IHotelStartupProvies
