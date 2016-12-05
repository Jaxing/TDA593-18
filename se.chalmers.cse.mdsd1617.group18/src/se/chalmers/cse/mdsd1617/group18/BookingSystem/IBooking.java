/**
 */
package se.chalmers.cse.mdsd1617.group18.BookingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import se.chalmers.cse.mdsd1617.group18.RoomManager.IRoom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getIBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<IRoom> getRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomsMany="true" roomsOrdered="false"
	 * @generated
	 */
	void setRooms(EList<IRoom> rooms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startDateRequired="true" startDateOrdered="false"
	 * @generated
	 */
	void setStartDate(String startDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	void setEndDate(String endDate);

} // IBooking
