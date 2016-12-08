/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage
 * @generated
 */
public class BookingSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookingSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BookingSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingSystemSwitch modelSwitch =
		new BookingSystemSwitch() {
			public Object caseCheckInEvent(CheckInEvent object) {
				return createCheckInEventAdapter();
			}
			public Object caseAbstractEvent(AbstractEvent object) {
				return createAbstractEventAdapter();
			}
			public Object caseIEvent(IEvent object) {
				return createIEventAdapter();
			}
			public Object caseCheckOutEvent(CheckOutEvent object) {
				return createCheckOutEventAdapter();
			}
			public Object caseBookingSystem(BookingSystem object) {
				return createBookingSystemAdapter();
			}
			public Object caseIBooking(IBooking object) {
				return createIBookingAdapter();
			}
			public Object caseIHotelBookingManager(IHotelBookingManager object) {
				return createIHotelBookingManagerAdapter();
			}
			public Object caseIHotelCustomerProvides(IHotelCustomerProvides object) {
				return createIHotelCustomerProvidesAdapter();
			}
			public Object caseFreeRoomTypesDTO(FreeRoomTypesDTO object) {
				return createFreeRoomTypesDTOAdapter();
			}
			public Object caseBooking(Booking object) {
				return createBookingAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent <em>Check In Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent
	 * @generated
	 */
	public Adapter createCheckInEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent
	 * @generated
	 */
	public Adapter createAbstractEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent <em>IEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent
	 * @generated
	 */
	public Adapter createIEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent <em>Check Out Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent
	 * @generated
	 */
	public Adapter createCheckOutEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem <em>Booking System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem
	 * @generated
	 */
	public Adapter createBookingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking
	 * @generated
	 */
	public Adapter createIBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager <em>IHotel Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager
	 * @generated
	 */
	public Adapter createIHotelBookingManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelCustomerProvides
	 * @generated
	 */
	public Adapter createIHotelCustomerProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO <em>Free Room Types DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO
	 * @generated
	 */
	public Adapter createFreeRoomTypesDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BookingSystemAdapterFactory
