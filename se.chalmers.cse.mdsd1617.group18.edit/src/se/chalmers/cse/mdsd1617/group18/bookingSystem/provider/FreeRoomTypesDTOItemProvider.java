/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO;

/**
 * This is the item provider adapter for a {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FreeRoomTypesDTOItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeRoomTypesDTOItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRoomTypeDescriptionPropertyDescriptor(object);
			addNumBedsPropertyDescriptor(object);
			addPricePerNightPropertyDescriptor(object);
			addNumFreeRoomsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Room Type Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoomTypeDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FreeRoomTypesDTO_roomTypeDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FreeRoomTypesDTO_roomTypeDescription_feature", "_UI_FreeRoomTypesDTO_type"),
				 BookingSystemPackage.Literals.FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Beds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumBedsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FreeRoomTypesDTO_numBeds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FreeRoomTypesDTO_numBeds_feature", "_UI_FreeRoomTypesDTO_type"),
				 BookingSystemPackage.Literals.FREE_ROOM_TYPES_DTO__NUM_BEDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Price Per Night feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricePerNightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FreeRoomTypesDTO_pricePerNight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FreeRoomTypesDTO_pricePerNight_feature", "_UI_FreeRoomTypesDTO_type"),
				 BookingSystemPackage.Literals.FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Free Rooms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumFreeRoomsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FreeRoomTypesDTO_numFreeRooms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FreeRoomTypesDTO_numFreeRooms_feature", "_UI_FreeRoomTypesDTO_type"),
				 BookingSystemPackage.Literals.FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FreeRoomTypesDTO.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FreeRoomTypesDTO"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((FreeRoomTypesDTO)object).getRoomTypeDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_FreeRoomTypesDTO_type") :
			getString("_UI_FreeRoomTypesDTO_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FreeRoomTypesDTO.class)) {
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION:
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_BEDS:
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT:
			case BookingSystemPackage.FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return ClassesEditPlugin.INSTANCE;
	}

}
