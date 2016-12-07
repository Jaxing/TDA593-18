/**
 */
package se.chalmers.cse.mdsd1617.group18.roomManager.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.chalmers.cse.mdsd1617.group18.roomManager.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerPackage
 * @generated
 */
public class RoomManagerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RoomManagerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RoomManagerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomManagerSwitch<Adapter> modelSwitch =
		new RoomManagerSwitch<Adapter>() {
			@Override
			public Adapter caseIRoomType(IRoomType object) {
				return createIRoomTypeAdapter();
			}
			@Override
			public Adapter caseRoomType(RoomType object) {
				return createRoomTypeAdapter();
			}
			@Override
			public Adapter caseRoomManager(RoomManager object) {
				return createRoomManagerAdapter();
			}
			@Override
			public Adapter caseIHotelStartupProvies(IHotelStartupProvies object) {
				return createIHotelStartupProviesAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseIHotelRoomProvider(IHotelRoomProvider object) {
				return createIHotelRoomProviderAdapter();
			}
			@Override
			public Adapter caseIHotelRoomManager(IHotelRoomManager object) {
				return createIHotelRoomManagerAdapter();
			}
			@Override
			public Adapter caseIRoom(IRoom object) {
				return createIRoomAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType <em>IRoom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType
	 * @generated
	 */
	public Adapter createIRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager
	 * @generated
	 */
	public Adapter createRoomManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies <em>IHotel Startup Provies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelStartupProvies
	 * @generated
	 */
	public Adapter createIHotelStartupProviesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider <em>IHotel Room Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider
	 * @generated
	 */
	public Adapter createIHotelRoomProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager <em>IHotel Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager
	 * @generated
	 */
	public Adapter createIHotelRoomManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group18.roomManager.IRoom <em>IRoom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.chalmers.cse.mdsd1617.group18.roomManager.IRoom
	 * @generated
	 */
	public Adapter createIRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RoomManagerAdapterFactory
