/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.impl;

import org.eclipse.emf.ecore.EClass;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check In Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CheckInEventImpl extends AbstractEventImpl implements CheckInEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckInEventImpl() {
		super();
		this.eventType = EventType.CHECK_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingSystemPackage.Literals.CHECK_IN_EVENT;
	}

} //CheckInEventImpl
