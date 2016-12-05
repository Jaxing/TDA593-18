/**
 */
package se.chalmers.cse.mdsd1617.group18.BookingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import se.chalmers.cse.mdsd1617.group18.RoomManager.IRoom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getId <em>Id</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getFirstName <em>First Name</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getLastName <em>Last Name</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getRoomList <em>Room List</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBooking_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBooking_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBooking_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBooking_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBooking_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.Booking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Room List</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group18.RoomManager.IRoom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room List</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getBooking_RoomList()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IRoom> getRoomList();

} // Booking
