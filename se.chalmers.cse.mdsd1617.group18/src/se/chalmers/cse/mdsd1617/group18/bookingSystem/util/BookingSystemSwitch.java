/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage
 * @generated
 */
public class BookingSystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookingSystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingSystemSwitch() {
		if (modelPackage == null) {
			modelPackage = BookingSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BookingSystemPackage.CHECK_IN_EVENT: {
				CheckInEvent checkInEvent = (CheckInEvent)theEObject;
				T result = caseCheckInEvent(checkInEvent);
				if (result == null) result = caseAbstractEvent(checkInEvent);
				if (result == null) result = caseIEvent(checkInEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.ABSTRACT_EVENT: {
				AbstractEvent abstractEvent = (AbstractEvent)theEObject;
				T result = caseAbstractEvent(abstractEvent);
				if (result == null) result = caseIEvent(abstractEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.IEVENT: {
				IEvent iEvent = (IEvent)theEObject;
				T result = caseIEvent(iEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.CHECK_OUT_EVENT: {
				CheckOutEvent checkOutEvent = (CheckOutEvent)theEObject;
				T result = caseCheckOutEvent(checkOutEvent);
				if (result == null) result = caseAbstractEvent(checkOutEvent);
				if (result == null) result = caseIEvent(checkOutEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.BOOKING_SYSTEM: {
				BookingSystem bookingSystem = (BookingSystem)theEObject;
				T result = caseBookingSystem(bookingSystem);
				if (result == null) result = caseIHotelBookingManager(bookingSystem);
				if (result == null) result = caseIHotelCustomerProvides(bookingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.IBOOKING: {
				IBooking iBooking = (IBooking)theEObject;
				T result = caseIBooking(iBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.IHOTEL_BOOKING_MANAGER: {
				IHotelBookingManager iHotelBookingManager = (IHotelBookingManager)theEObject;
				T result = caseIHotelBookingManager(iHotelBookingManager);
				if (result == null) result = caseIHotelCustomerProvides(iHotelBookingManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.IHOTEL_CUSTOMER_PROVIDES: {
				IHotelCustomerProvides iHotelCustomerProvides = (IHotelCustomerProvides)theEObject;
				T result = caseIHotelCustomerProvides(iHotelCustomerProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO: {
				FreeRoomTypesDTO freeRoomTypesDTO = (FreeRoomTypesDTO)theEObject;
				T result = caseFreeRoomTypesDTO(freeRoomTypesDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingSystemPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				T result = caseBooking(booking);
				if (result == null) result = caseIBooking(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check In Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check In Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckInEvent(CheckInEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEvent(AbstractEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEvent(IEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Out Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Out Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckOutEvent(CheckOutEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingSystem(BookingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBooking(IBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHotel Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHotel Booking Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHotelBookingManager(IHotelBookingManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHotel Customer Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHotel Customer Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHotelCustomerProvides(IHotelCustomerProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Room Types DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Room Types DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeRoomTypesDTO(FreeRoomTypesDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BookingSystemSwitch
