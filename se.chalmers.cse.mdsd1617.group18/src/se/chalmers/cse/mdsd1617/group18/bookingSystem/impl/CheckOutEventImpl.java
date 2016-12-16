/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.impl;

import org.eclipse.emf.ecore.EClass;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Out Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CheckOutEventImpl extends AbstractEventImpl implements CheckOutEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckOutEventImpl() {
		super();
		this.eventType = EventType.CHECK_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingSystemPackage.Literals.CHECK_OUT_EVENT;
	}

} //CheckOutEventImpl
