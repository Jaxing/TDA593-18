/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.tests;

import junit.textui.TestRunner;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Check Out Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckOutEventTest extends AbstractEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CheckOutEventTest.class);
	}

	/**
	 * Constructs a new Check Out Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckOutEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Check Out Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CheckOutEvent getFixture() {
		return (CheckOutEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(BookingSystemFactory.eINSTANCE.createCheckOutEvent());
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

} //CheckOutEventTest
