/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>roomManager</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomManagerTests extends TestSuite {

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
		TestSuite suite = new RoomManagerTests("roomManager Tests");
		suite.addTestSuite(RoomTypeTest.class);
		suite.addTestSuite(RoomManagerTest.class);
		suite.addTestSuite(RoomTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagerTests(String name) {
		super(name);
	}

} //RoomManagerTests
