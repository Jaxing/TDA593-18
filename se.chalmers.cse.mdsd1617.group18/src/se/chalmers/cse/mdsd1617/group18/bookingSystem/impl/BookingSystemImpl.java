/**
 */
package se.chalmers.cse.mdsd1617.group18.bookingSystem.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.banking.customerRequires.CustomerRequires;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.AbstractEvent;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemPackage;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.EventType;
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
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl#getBookingId <em>Booking Id</em>}</li>
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
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<IRoom> rooms;

	/**
	 * The default value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected int bookingId = BOOKING_ID_EDEFAULT;

	/**
	 * @generated NOT
	 */
	protected IBooking bookingInCheckout = null;
	
	/**
	 * @generated NOT
	 */

	
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
		this.rooms = new BasicEList<IRoom>();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IRoom> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<IRoom>(IRoom.class, this, BookingSystemPackage.BOOKING_SYSTEM__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingId(int newBookingId) {
		int oldBookingId = bookingId;
		bookingId = newBookingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingSystemPackage.BOOKING_SYSTEM__BOOKING_ID, oldBookingId, bookingId));
	}

	/**
	 * TODO: check start and end date
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FreeRoomTypesDTO> getFreeRooms(int numBeds, String startDate, String endDate) {
		EList<IRoom> freeRooms = getFreeRooms(startDate, endDate);
		
		EList<FreeRoomTypesDTO> freeRoomsTypes = new BasicEList<FreeRoomTypesDTO>();
		
		for(int i = 0; i < freeRooms.size(); i++) {
			IRoom room = freeRooms.get(i);
			if (room.getRoomType().getNumberOfBeds() == numBeds) {
				FreeRoomTypesDTO freeRoomType = BookingSystemFactoryImpl.init().createFreeRoomTypesDTO();
				
				freeRoomType.setNumBeds(room.getRoomType().getNumberOfBeds());
				freeRoomType.setPricePerNight(room.getRoomType().getPrice());
				freeRoomType.setRoomTypeDescription(room.getRoomType().getDescription());
				
				if(freeRoomsTypes.contains(freeRoomType)) {
					FreeRoomTypesDTO actualType = freeRoomsTypes.get(freeRoomsTypes.indexOf(freeRoomType));
					actualType.setNumFreeRooms(actualType.getNumFreeRooms() + 1);
				} else {
					freeRoomType.setNumFreeRooms(1);
					freeRoomsTypes.add(freeRoomType);
				}
			}
		}
		
	    return freeRoomsTypes;
	}
	
	/**
	 * TODO: check start and end date
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IRoom> getFreeRooms(String startDate, String endDate) {
		this.rooms = this.roomProvider.getRooms();
		Date start = null;
		Date end = null;
		EList<IRoom> bookedRooms = null;
		
		if (startDate == null || endDate == null) {
			return new BasicEList<IRoom>();
		}
		
		try {
			start = parseDate(startDate);
			end = parseDate(endDate);
			bookedRooms = getBookedRooms(startDate, endDate);
		} catch (ParseException e) {
			return new BasicEList<IRoom>();
		}
		
		if(end.before(start)){
			return new BasicEList<IRoom>();
		}
		
		EList<IRoom> freeRooms = new BasicEList<IRoom>();
		for(int i = 0; i < this.rooms.size(); i++){
			IRoom room = rooms.get(i);
			if (!bookedRooms.contains(room)) {
				freeRooms.add(room);
			}
		}
	    return freeRooms;
	}
	
	/**
	 * Returns the combined roomList of all bookings
	 * @throws ParseException 
	 * @generated NOT
	 */
	private EList<IRoom> getBookedRooms(String startDate, String endDate) throws ParseException {
		EList<IRoom> rooms = new BasicEList<IRoom>();
		
		for (int i = 0; i < this.bookings.size(); i++) {
			IBooking booking = this.bookings.get(i);
			Date start = parseDate(startDate);
			Date end = parseDate(endDate);
			
			int startComp = start.compareTo(parseDate(booking.getStartDate()));
			int endComp = end.compareTo(parseDate(booking.getEndDate()));
			
			if ((startComp <= 0) && (endComp >= 0)) {
				EList<IRoom> assignedRooms = booking.getRooms();
				EList<IRoom> checkedInRooms = booking.getCheckedInRooms();
				
				if(assignedRooms != null) {
					rooms.addAll(assignedRooms);
				}
				
				if(checkedInRooms != null) {
					rooms.addAll(checkedInRooms);
				}
			}
		}
		
		return rooms;
	}

	/**
	 * @throws ParseException 
	 * @generated NOT
	 */
	private Date parseDate (String date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		
		return dateFormat.parse(date);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Returns the booking id or -1 if empty
	 */

	public int initiateBooking(String firstName, String startDate, String endDate,  String lastName) {
		Date start = null;
		Date end = null;
		
		if (startDate == null || endDate == null || firstName == null || firstName.equals("")  || lastName == null || lastName.equals("")) {
			return -1;
		}
		
		try {
			start = parseDate(startDate);
			end = parseDate(endDate);
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
		IBooking theBooking = findBooking(bookingID);
		if (theBooking == null) {
			return false;
		}
		EList<IRoom> rooms = getFreeRooms(theBooking.getStartDate(), theBooking.getEndDate());
		
		for (int i = 0; i < rooms.size(); i++) {
			IRoom freeRoom = rooms.get(i); 
			if (freeRoom.getRoomType().getDescription().equals(roomTypeDescription)) {
				return theBooking.addRoom(freeRoom);
			}
		}
		return false;

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
		if(bookingInCheckout != null){
			return -1;
		}
		bookingInCheckout = theBooking;
		if(theBooking == null){
			return -1;
		} else {
			double price = 0;
			EList <IRoom> bookingRoomList = theBooking.getCheckedInRooms();
			for (int i = 0; i < bookingRoomList.size();i++){
				price += bookingRoomList.get(i).getRoomType().getPrice();
				price += bookingRoomList.get(i).getExtraCostPrice();
			}
			
	    	AbstractEvent event = BookingSystemFactoryImpl.init().createCheckOutEvent();
	    	event.setBookingID(theBooking.getID());
	    	event.setTimestamp(LocalDate.now().toEpochDay());
	    	this.events.add(event);
    	   
			return price;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean payDuringCheckout(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		if (bookingInCheckout == null){
			return false;
		}
		EList<IRoom>theRooms = bookingInCheckout.getCheckedInRooms();
		for (int i = 0; i < theRooms.size(); i++){
			if (!payRoomDuringCheckout(theRooms.get(i).getRoomNumber(), 
					ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName))
				return false;
		
		}
		bookingInCheckout = null;
		return true;
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
		EList <IRoom> bookingRoomList = theBooking.getCheckedInRooms();
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
	 * @generated NOT
	 */
	public boolean payRoomDuringCheckout(int roomNumber, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		
		for(int i = 0; i < rooms.size(); i++) {
			IRoom tempRoom = rooms.get(i);
			if (tempRoom.getRoomNumber() == roomNumber) {
				for(int j = 0; j < bookings.size(); j++) {
					IBooking booking = bookings.get(j);
					
					if(booking.getCheckedInRooms().contains(tempRoom)) {
						
						if (booking.checkOutRoom(tempRoom)) {
							/*try {
								CustomerRequires customerRequires = CustomerRequires.instance();
								boolean isValid = customerRequires.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
								return isValid && customerRequires.makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, tempRoom.getExtraCostPrice() + tempRoom.getRoomType().getPrice());
								
							} catch (SOAPException e) {
								return false;
							}*/
							try {
								CustomerRequires cr = initCustomerRequires();
								if (cr == null){
									return false;
								}
									return cr.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)&&
									cr.makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, 
											tempRoom.getExtraCostPrice() + tempRoom.getRoomType().getPrice());
							}catch(SOAPException soap){
								return false;
							}
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Returns a non negative room number or -1 if unsuccessful
	 */
	public int checkInRoom(String roomTypeDescription, int bookingId) {
		IBooking booking = findBooking(bookingId);
		
		if (booking != null) {
			for (int i = 0; i < booking.getRooms().size(); i++) {
				IRoomType roomType = booking.getRooms().get(i).getRoomType();
				
				if (roomType.getDescription().equals(roomTypeDescription)) {
					IRoom room = booking.getRooms().get(i);
					if (booking.checkInRoom(room)) {
						return room.getRoomNumber();
					}
				}
			}
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IRoom> initiateCheckin(int bookingId) {
		IBooking booking = this.findBooking(bookingId);
		              
       if (booking != null) {
    	   AbstractEvent event = BookingSystemFactoryImpl.init().createCheckInEvent();
    	   event.setBookingID(booking.getID());
    	   event.setTimestamp(LocalDate.now().toEpochDay());
    	   this.events.add(event);
    	   return booking.getRooms();
       }
		               
       return null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean editBookingPeriod(int bookingId, String startDate, String endDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date start = null;
		Date end = null;
		IBooking booking = findBooking(bookingId);
		
		try {
			start = dateFormat.parse(startDate);
			end = dateFormat.parse(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
			
		if(booking == null || startDate == null || endDate == null){
			return false;
		}if(end.before(start)){
			return false;
		}
		else{
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
		
		for(int i = 0; i < bookings.size(); i++){
			if(bookings.get(i).getID() == bookingId){
				bookings.get(i).getRooms().clear();
				bookings.remove(i);
			}
		}
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
	 * @generated NOT
	 */
	public EList<IRoom> listOccupiedRooms(String date) {
		EList<IRoom> rooms = new BasicEList<IRoom>();
		
		for (int i = 0; i < bookings.size(); i++) {
			if (bookings.get(i).getStartDate().compareTo(date) <= 0 && date.compareTo(bookings.get(i).getEndDate()) <= 0) {
				rooms.addAll(bookings.get(i).getCheckedInRooms());
			}
		}
		
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IEvent> listCheckins(String startTime, String endTime) {
		EList<IEvent> checkIns = new BasicEList<IEvent>();
		
		long startDate;
		long endDate;
		long hoursOfDay = 24;
		long minutesOfHour = 60;
		long secondsOfMinutes = 60;
		long milliSecondsOfSeconds = 1000;
		long milliSecondsOfDay = hoursOfDay * minutesOfHour * secondsOfMinutes * milliSecondsOfSeconds;
		
		try {
			startDate = this.parseDate(startTime).getTime()/milliSecondsOfDay;
			endDate = this.parseDate(endTime).getTime()/milliSecondsOfDay;
		} catch (ParseException e) {
			return checkIns;
		}
		
		for(int i = 0; i < events.size(); i++) {
			if(events.get(i).getType() == EventType.CHECK_IN) {				
				if (startDate <= events.get(i).getTimestamp() && events.get(i).getTimestamp() <= endDate) {
					checkIns.add(events.get(i));
				}
			}
		}
		
		return checkIns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IEvent> listCheckouts(String startTime, String endTime) {
		EList<IEvent> checkIns = new BasicEList<IEvent>();
		
		long startDate;
		long endDate;
		long hoursOfDay = 24;
		long minutesOfHour = 60;
		long secondsOfMinutes = 60;
		long milliSecondsOfSeconds = 1000;
		long milliSecondsOfDay = hoursOfDay * minutesOfHour * secondsOfMinutes * milliSecondsOfSeconds;
		
		try {
			startDate = this.parseDate(startTime).getTime()/milliSecondsOfDay;
			endDate = this.parseDate(endTime).getTime()/milliSecondsOfDay;
		} catch (ParseException e) {
			return checkIns;
		}
		
		for(int i = 0; i < events.size(); i++) {
			if(events.get(i).getType() == EventType.CHECK_OUT) {				
				if (startDate <= events.get(i).getTimestamp() && events.get(i).getTimestamp() <= endDate) {
					checkIns.add(events.get(i));
				}
			}
		}
		
		return checkIns;
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
			for (int i = 0; i < bookingRooms.size() && numOfRooms < 0; i++){
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
			case BookingSystemPackage.BOOKING_SYSTEM__ROOMS:
				return getRooms();
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKING_ID:
				return getBookingId();
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
			case BookingSystemPackage.BOOKING_SYSTEM__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends IRoom>)newValue);
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKING_ID:
				setBookingId((Integer)newValue);
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
			case BookingSystemPackage.BOOKING_SYSTEM__ROOMS:
				getRooms().clear();
				return;
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKING_ID:
				setBookingId(BOOKING_ID_EDEFAULT);
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
			case BookingSystemPackage.BOOKING_SYSTEM__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case BookingSystemPackage.BOOKING_SYSTEM__BOOKING_ID:
				return bookingId != BOOKING_ID_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bookingId: ");
		result.append(bookingId);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 * @param bookingID
	 * @return The Booking the the matching ID
	 * @generated NOT
	 */
	public IBooking findBooking(int bookingID){
		IBooking currentBooking = null;
		for (int i = 0; i < bookings.size(); i++){
			currentBooking = bookings.get(i);
			if(currentBooking.getID() == bookingID)
				return currentBooking;
		}
		return null;
	}
	private CustomerRequires initCustomerRequires(){
		try {
			return CustomerRequires.instance();
		}catch(SOAPException soap){
			soap.printStackTrace();
			System.out.print("Something went wrong");
			return null;
		}
		
	}

} //BookingSystemImpl