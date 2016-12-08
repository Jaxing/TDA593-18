/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.tests;

import junit.textui.TestRunner;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Check In Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckInEventTest extends AbstractEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CheckInEventTest.class);
	}

	/**
	 * Constructs a new Check In Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckInEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Check In Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CheckInEvent getFixture() {
		return (CheckInEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(BookingSystemFactory.eINSTANCE.createCheckInEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CheckInEventTest
