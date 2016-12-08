/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import se.chalmers.cse.mdsd1617.group18.roomManager.tests.RoomManagerTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Classes</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassesAllTests extends TestSuite {

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
		TestSuite suite = new ClassesAllTests("Classes Tests");
		suite.addTest(BookingSystemTests.suite());
		suite.addTest(RoomManagerTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesAllTests(String name) {
		super(name);
	}

} //ClassesAllTests
