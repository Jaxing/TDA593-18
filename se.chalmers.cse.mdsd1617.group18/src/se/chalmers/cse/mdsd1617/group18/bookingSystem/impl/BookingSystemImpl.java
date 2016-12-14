/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IEvent;

import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomProvider;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoom;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType;
import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl#getRoomProvider <em>Room Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingSystemImpl extends MinimalEObjectImpl.Container implements BookingSystem {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<IEvent> events;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<IBooking> bookings;

	/**
	 * The cached value of the '{@link #getRoomProvider() <em>Room Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomProvider()
	 * @generated
	 * @ordered
	 */
	protected IHotelRoomProvider roomProvider;
	
	/**
	 * @generated NOT
	 */
	protected EList<FreeRoomTypesDTO> freeRooms;
	
	/**
	 * @generated NOT
	 * */
	protected int bookingId = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BookingSystemImpl() {
		super();
		this.events = new BasicEList<IEvent>();
		this.bookings = new BasicEList<IBooking>();
		this.roomProvider = (IHotelRoomProvider) RoomManagerFactoryImpl.init().createRoomManager();
		//TODO: How should we handle the IHotelRoomProvider? We can really just create a new since it will not be connected then.
		this.freeRooms = new BasicEList<FreeRoomTypesDTO>();
		updateFreeRooms();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingSystemPackage.Literals.BOOKING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IEvent> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<IEvent>(IEvent.class, this, BookingSystemPackage.BOOKING_SYSTEM__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IBooking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectResolvingEList<IBooking>(IBooking.class, this, BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelRoomProvider getRoomProvider() {
		if (roomProvider != null && roomProvider.eIsProxy()) {
			InternalEObject oldRoomProvider = (InternalEObject)roomProvider;
			roomProvider = (IHotelRoomProvider)eResolveProxy(oldRoomProvider);
			if (roomProvider != oldRoomProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER, oldRoomProvider, roomProvider));
			}
		}
		return roomProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelRoomProvider basicGetRoomProvider() {
		return roomProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomProvider(IHotelRoomProvider newRoomProvider) {
		IHotelRoomProvider oldRoomProvider = roomProvider;
		roomProvider = newRoomProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER, oldRoomProvider, roomProvider));
	}
	
	/**
	 * TODO: check start and end date
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FreeRoomTypesDTO> getFreeRooms(int numBeds, String startDate, String endDate) {
		
		if (freeRooms == null) {
			freeRooms = new BasicEList<FreeRoomTypesDTO>();
		}
		freeRooms.clear();
		updateFreeRooms();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date start = null;
		Date end = null;
		
		if (startDate == null || endDate == null) {
			return new BasicEList<FreeRoomTypesDTO>();
		}
		
		try {
			start = dateFormat.parse(startDate);
			end = dateFormat.parse(endDate);
		} catch (ParseException e) {
			return new BasicEList<FreeRoomTypesDTO>();
		}
		
		if(end.before(start)){
			return new BasicEList<FreeRoomTypesDTO>();
		}
		
		EList<FreeRoomTypesDTO> rooms = new BasicEList<FreeRoomTypesDTO>();
		for(int i = 0; i < freeRooms.size(); i++){
			if(freeRooms.get(i).getNumBeds() == numBeds){
				rooms.add(freeRooms.get(i));
			}
		}
	    return rooms;
	}
	
	/**
	 * @generated NOT
	 */
	private void updateFreeRooms(){
		EList<IRoom> rooms = roomProvider.getRooms();
		for(int i = 0; i < rooms.size(); i++){
			IRoomType roomType = rooms.get(i).getRoomType();
			FreeRoomTypesDTO types = BookingSystemFactoryImpl.init().createFreeRoomTypesDTO();
			types.setNumBeds(roomType.getNumberOfBeds());
			types.setPricePerNight(roomType.getPrice());
			types.setRoomTypeDescription(roomType.getDescription());
			if(freeRooms.contains(types)){
				types.setNumFreeRooms(types.getNumFreeRooms() + 1);
			} else {
				types.setNumFreeRooms(1);
				freeRooms.add(types);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Returns the booking id or -1 if empty
	 */

	public int initiateBooking(String firstName, String startDate, String endDate,  String lastName) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date start = null;
		Date end = null;
		
		if (startDate == null || endDate == null || firstName == null || firstName.equals("")  || lastName == null || lastName.equals("")) {
			return -1;
		}
		
		try {
			start = dateFormat.parse(startDate);
			end = dateFormat.parse(endDate);
		} catch (ParseException e) {
			return -1;
		}
		
		if(end.before(start)){
			return -1;
		}
		
        BookingImpl booking = new BookingImpl(bookingId, firstName, lastName, startDate, endDate);
		for(int i = 0;i < bookings.size();i++){
			if (bookings.get(i).getID() == bookingId){
				return -1;
			
			}
		}
		bookings.add(booking);
		return bookingId++;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoomToBooking(String roomTypeDescription, int bookingID) {
		freeRooms.clear();
		updateFreeRooms();
		EList<IRoom> rooms = this.roomProvider.getRooms();
		IRoom freeRoomOfType = null;
		IBooking theBooking = null;
		boolean typeExists = false;
		
		for (int i = 0; i < this.freeRooms.size(); i++) {
			FreeRoomTypesDTO freeRoomType = freeRooms.get(i); 
			if (freeRoomType.equals(roomTypeDescription) && freeRoomType.getNumFreeRooms() > 0) {
				for (int j = 0; j < rooms.size(); j++) {
					String description = rooms.get(j).getRoomType().getDescription();
					if (description.equals(roomTypeDescription)) {
						freeRoomOfType = rooms.get(j);
						freeRoomType.setNumFreeRooms(freeRoomType.getNumFreeRooms());
						typeExists = true;
						break;
					}
				}
				break;
			}
		}
		
		if (!typeExists) {
			return false;
		}
		
		theBooking = findBooking(bookingID);
		if (theBooking == null){
			return false;
		}else{
			return theBooking.addRoom(freeRoomOfType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean confirmBooking(int bookingID) {
		
		IBooking theBooking = findBooking(bookingID);
		if (theBooking == null){
			return false;
		}
		if (theBooking.getRooms().isEmpty()){
			return false;
		}else{
			return true;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double initiateCheckout(int bookingID) {
		IBooking theBooking = findBooking(bookingID);
		if(theBooking == null){
			return -1;
		} else {
			double price = 0;
			EList <IRoom> bookingRoomList = theBooking.getRooms();
			for (int i = 0; i < bookingRoomList.size();i++){
				price += bookingRoomList.get(i).getRoomType().getPrice();
				price += bookingRoomList.get(i).getExtraCostPrice();
			}
			return price;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean payDuringCheckout(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double initiateRoomCheckout(int roomNumber, int bookingId) {
		IBooking theBooking = findBooking(bookingId);
		if(theBooking == null){
			return -1;
		}
		EList <IRoom> bookingRoomList = theBooking.getRooms();
		IRoom currentRoom = null;
		for(int i = 0; i< bookingRoomList.size(); i++){
			currentRoom = bookingRoomList.get(i);
			if (currentRoom.getRoomNumber()==roomNumber){
				return currentRoom.getRoomType().getPrice() + currentRoom.getExtraCostPrice();
			}
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean payRoomDuringCheckout(int roomNumber, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Returns a non negative room number or -1 if unsuccessful
	 */
	public int checkInRoom(String roomTypeDescription, int bookingId) {
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FreeRoomTypesDTO> initiateCheckin(int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean editBookingPeriod(int bookingId, String startDate, String endDate) {
		IBooking booking = findBooking(bookingId);
		if(booking == null){
			return false;
		}else{
			booking.setStartDate(startDate);
			booking.setEndDate(endDate);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void cancelBooking(int bookingId) {
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IBooking> listBooking() {
		if (bookings == null) {
			bookings = new EObjectResolvingEList<IBooking>(IBooking.class, this, BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS);
		}
		return bookings; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object listOccupiedRooms(String date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IEvent> listCheckins(String startTime, String endTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IEvent> listCheckouts(String startTime, String endTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addExtraCostToRoom(int bookingId, int roomNumber, String descriptionOfCost, double priceOfCost) {
		IBooking theBooking = findBooking(bookingId);
		if (theBooking == null){
			return ; //pissy as hell
		}
		EList <IRoom> bookingRooms = theBooking.getRooms();
		IRoom theRoom = null;
		IRoom indexedRoom = null;
		for (int i = 0; i < bookingRooms.size(); i++){
			indexedRoom = bookingRooms.get(i);
			if (indexedRoom.getRoomNumber()==roomNumber){
				theRoom = indexedRoom;
				break;
			}
		}
		if(theRoom != null){
			theRoom.setExtraCostDescription(theRoom.getExtraCostDescription() 
					+ "\n" + descriptionOfCost);
			theRoom.addExtraCost(priceOfCost);
		}
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void editBookingRooms(int bookingID, int numOfRooms, IRoomType roomType) {
		IBooking theBooking = findBooking(bookingID);
		if (theBooking == null){
			return;
		}
		if (numOfRooms < 0){
			EList <IRoom> bookingRooms = theBooking.getRooms();
			for (int i = 0; i < bookingRooms.size(); i++){
				if(bookingRooms.get(i).getRoomType().equals(roomType)){
					bookingRooms.remove(i);
					numOfRooms++;
				}
			}
		}else{
			for (int i = 1; i <= numOfRooms;i++){
				if(!addRoomToBooking(roomType.getDescription(), bookingID))
					return; //How do we handle this??
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingSystemPackage.BOOKING_SYSTEM__EVENTS:
				return getEvents();
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS:
				return getBookings();
			case BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER:
				if (resolve) return getRoomProvider();
				return basicGetRoomProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BookingSystemPackage.BOOKING_SYSTEM__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends IEvent>)newValue);
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends IBooking>)newValue);
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER:
				setRoomProvider((IHotelRoomProvider)newValue);
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
			case BookingSystemPackage.BOOKING_SYSTEM__EVENTS:
				getEvents().clear();
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS:
				getBookings().clear();
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER:
				setRoomProvider((IHotelRoomProvider)null);
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
			case BookingSystemPackage.BOOKING_SYSTEM__EVENTS:
				return events != null && !events.isEmpty();
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case BookingSystemPackage.BOOKING_SYSTEM__ROOM_PROVIDER:
				return roomProvider != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingSystemPackage.BOOKING_SYSTEM___GET_FREE_ROOMS__INT_STRING_STRING:
				return getFreeRooms((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case BookingSystemPackage.BOOKING_SYSTEM___INITIATE_BOOKING__STRING_STRING_STRING_STRING:
				return initiateBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case BookingSystemPackage.BOOKING_SYSTEM___ADD_ROOM_TO_BOOKING__STRING_INT:
				return addRoomToBooking((String)arguments.get(0), (Integer)arguments.get(1));
			case BookingSystemPackage.BOOKING_SYSTEM___CONFIRM_BOOKING__INT:
				return confirmBooking((Integer)arguments.get(0));
			case BookingSystemPackage.BOOKING_SYSTEM___INITIATE_CHECKOUT__INT:
				return initiateCheckout((Integer)arguments.get(0));
			case BookingSystemPackage.BOOKING_SYSTEM___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING:
				return payDuringCheckout((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case BookingSystemPackage.BOOKING_SYSTEM___INITIATE_ROOM_CHECKOUT__INT_INT:
				return initiateRoomCheckout((Integer)arguments.get(0), (Integer)arguments.get(1));
			case BookingSystemPackage.BOOKING_SYSTEM___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING:
				return payRoomDuringCheckout((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
			case BookingSystemPackage.BOOKING_SYSTEM___CHECK_IN_ROOM__STRING_INT:
				return checkInRoom((String)arguments.get(0), (Integer)arguments.get(1));
			case BookingSystemPackage.BOOKING_SYSTEM___INITIATE_CHECKIN__INT:
				return initiateCheckin((Integer)arguments.get(0));
			case BookingSystemPackage.BOOKING_SYSTEM___EDIT_BOOKING_PERIOD__INT_STRING_STRING:
				return editBookingPeriod((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case BookingSystemPackage.BOOKING_SYSTEM___CANCEL_BOOKING__INT:
				cancelBooking((Integer)arguments.get(0));
				return null;
			case BookingSystemPackage.BOOKING_SYSTEM___LIST_BOOKING:
				return listBooking();
			case BookingSystemPackage.BOOKING_SYSTEM___LIST_OCCUPIED_ROOMS__STRING:
				return listOccupiedRooms((String)arguments.get(0));
			case BookingSystemPackage.BOOKING_SYSTEM___LIST_CHECKINS__STRING_STRING:
				return listCheckins((String)arguments.get(0), (String)arguments.get(1));
			case BookingSystemPackage.BOOKING_SYSTEM___LIST_CHECKOUTS__STRING_STRING:
				return listCheckouts((String)arguments.get(0), (String)arguments.get(1));
			case BookingSystemPackage.BOOKING_SYSTEM___ADD_EXTRA_COST_TO_ROOM__INT_INT_STRING_DOUBLE:
				addExtraCostToRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Double)arguments.get(3));
				return null;
			case BookingSystemPackage.BOOKING_SYSTEM___EDIT_BOOKING_ROOMS__INT_INT_IROOMTYPE:
				editBookingRooms((Integer)arguments.get(0), (Integer)arguments.get(1), (IRoomType)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	/**
	 * 
	 * @param bookingID
	 * @return The Booking the the matching ID
	 * @generated NOT
	 */
	private IBooking findBooking(int bookingID){
		IBooking currentBooking = null;
		for (int i = 0; i < bookings.size(); i++){
			currentBooking = bookings.get(i);
			if(currentBooking.getID() == bookingID)
				return currentBooking;
		}
		return currentBooking;
	}

} //BookingSystemImpl