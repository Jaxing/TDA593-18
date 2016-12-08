/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.util.BookingSystemAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingSystemItemProviderAdapterFactory extends BookingSystemAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingSystemItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckInEventItemProvider checkInEventItemProvider;

	/**
	 * This creates an adapter for a {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckInEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCheckInEventAdapter() {
		if (checkInEventItemProvider == null) {
			checkInEventItemProvider = new CheckInEventItemProvider(this);
		}

		return checkInEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckOutEventItemProvider checkOutEventItemProvider;

	/**
	 * This creates an adapter for a {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.CheckOutEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCheckOutEventAdapter() {
		if (checkOutEventItemProvider == null) {
			checkOutEventItemProvider = new CheckOutEventItemProvider(this);
		}

		return checkOutEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingSystemItemProvider bookingSystemItemProvider;

	/**
	 * This creates an adapter for a {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBookingSystemAdapter() {
		if (bookingSystemItemProvider == null) {
			bookingSystemItemProvider = new BookingSystemItemProvider(this);
		}

		return bookingSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeRoomTypesDTOItemProvider freeRoomTypesDTOItemProvider;

	/**
	 * This creates an adapter for a {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFreeRoomTypesDTOAdapter() {
		if (freeRoomTypesDTOItemProvider == null) {
			freeRoomTypesDTOItemProvider = new FreeRoomTypesDTOItemProvider(this);
		}

		return freeRoomTypesDTOItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingItemProvider bookingItemProvider;

	/**
	 * This creates an adapter for a {@link se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		if (bookingItemProvider == null) {
			bookingItemProvider = new BookingItemProvider(this);
		}

		return bookingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (checkInEventItemProvider != null) checkInEventItemProvider.dispose();
		if (checkOutEventItemProvider != null) checkOutEventItemProvider.dispose();
		if (bookingSystemItemProvider != null) bookingSystemItemProvider.dispose();
		if (freeRoomTypesDTOItemProvider != null) freeRoomTypesDTOItemProvider.dispose();
		if (bookingItemProvider != null) bookingItemProvider.dispose();
	}

}
