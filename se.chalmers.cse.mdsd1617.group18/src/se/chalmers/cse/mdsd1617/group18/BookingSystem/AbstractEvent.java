/**
 */
package se.chalmers.cse.mdsd1617.group18.BookingSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getBookingID <em>Booking ID</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getAbstractEvent()
 * @model abstract="true"
 * @generated
 */
public interface AbstractEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getAbstractEvent_Timestamp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType
	 * @see #setEventType(EventType)
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getAbstractEvent_EventType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.EventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(int)
	 * @see se.chalmers.cse.mdsd1617.group18.BookingSystem.BookingSystemPackage#getAbstractEvent_BookingID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBookingID();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.BookingSystem.AbstractEvent#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EventType getType();

} // AbstractEvent
