/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomTypeImpl#getNumberOfBeds <em>Number Of Beds</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfBeds() <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfBeds() <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBeds()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBeds = NUMBER_OF_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomTypeImpl(double price, String name, int numberOfBeds, String description) {
		super();
		this.price = price;
		this.name = name;
		this.numberOfBeds = numberOfBeds;
		this.description = description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoomManagerPackage.Literals.ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBeds(int newNumberOfBeds) {
		int oldNumberOfBeds = numberOfBeds;
		numberOfBeds = newNumberOfBeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM_TYPE__NUMBER_OF_BEDS, oldNumberOfBeds, numberOfBeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomManagerPackage.ROOM_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoomManagerPackage.ROOM_TYPE__PRICE:
				return getPrice();
			case RoomManagerPackage.ROOM_TYPE__NAME:
				return getName();
			case RoomManagerPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				return getNumberOfBeds();
			case RoomManagerPackage.ROOM_TYPE__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoomManagerPackage.ROOM_TYPE__PRICE:
				setPrice((Double)newValue);
				return;
			case RoomManagerPackage.ROOM_TYPE__NAME:
				setName((String)newValue);
				return;
			case RoomManagerPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				setNumberOfBeds((Integer)newValue);
				return;
			case RoomManagerPackage.ROOM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RoomManagerPackage.ROOM_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case RoomManagerPackage.ROOM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RoomManagerPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				setNumberOfBeds(NUMBER_OF_BEDS_EDEFAULT);
				return;
			case RoomManagerPackage.ROOM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RoomManagerPackage.ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case RoomManagerPackage.ROOM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RoomManagerPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				return numberOfBeds != NUMBER_OF_BEDS_EDEFAULT;
			case RoomManagerPackage.ROOM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (price: ");
		result.append(price);
		result.append(", name: ");
		result.append(name);
		result.append(", numberOfBeds: ");
		result.append(numberOfBeds);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
