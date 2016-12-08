/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Free Room Types DTO</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreeRoomTypesDTOTest extends TestCase {

	/**
	 * The fixture for this Free Room Types DTO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeRoomTypesDTO fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FreeRoomTypesDTOTest.class);
	}

	/**
	 * Constructs a new Free Room Types DTO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeRoomTypesDTOTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Free Room Types DTO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FreeRoomTypesDTO fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Free Room Types DTO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FreeRoomTypesDTO getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(BookingSystemFactory.eINSTANCE.createFreeRoomTypesDTO());
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

} //FreeRoomTypesDTOTest
