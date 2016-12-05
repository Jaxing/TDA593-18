/**
 */
package se.chalmers.cse.mdsd1617.group18.RoomManager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.RoomType#getPrice <em>Price</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.RoomType#getName <em>Name</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.RoomManager.RoomType#getNumberOfBeds <em>Number Of Beds</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoomType_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.RoomManager.RoomType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoomType_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.RoomManager.RoomType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Beds</em>' attribute.
	 * @see #setNumberOfBeds(int)
	 * @see se.chalmers.cse.mdsd1617.group18.RoomManager.RoomManagerPackage#getRoomType_NumberOfBeds()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfBeds();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group18.RoomManager.RoomType#getNumberOfBeds <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Beds</em>' attribute.
	 * @see #getNumberOfBeds()
	 * @generated
	 */
	void setNumberOfBeds(int value);

} // RoomType
