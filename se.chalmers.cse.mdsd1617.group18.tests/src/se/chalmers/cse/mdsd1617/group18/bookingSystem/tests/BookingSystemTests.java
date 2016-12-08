/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>bookingSystem</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingSystemTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new BookingSystemTests("bookingSystem Tests");
		suite.addTestSuite(CheckInEventTest.class);
		suite.addTestSuite(CheckOutEventTest.class);
		suite.addTestSuite(BookingSystemTest.class);
		suite.addTestSuite(BookingTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingSystemTests(String name) {
		super(name);
	}

} //BookingSystemTests
