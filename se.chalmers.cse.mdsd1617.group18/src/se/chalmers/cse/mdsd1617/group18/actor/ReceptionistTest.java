package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemFactoryImpl;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerFactory;
import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingImpl;;


public class ReceptionistTest {
	
	private BookingSystemFactory bookingSystemFactory;
	private RoomManagerFactory roomManagerFactory;
	private BookingSystem bookingSystem;
	private RoomManager roomManager;
	
	@Before
	public void initReceptionist() {
		bookingSystemFactory = BookingSystemFactoryImpl.init();
		roomManagerFactory = RoomManagerFactoryImpl.init();
		bookingSystem = bookingSystemFactory.createBookingSystem();
		roomManager = roomManagerFactory.createRoomManager();
		
		roomManager.startup(10);
	}
	
	//u.c. 2.1.1.  - make booking
	@Test
	public void createBooking() {		
		int id = bookingSystem.initiateBooking("FirstName", "LastName", "20161208", "20161223");
		
		//TODO: Need a factory to create a booking with given parameters.
		//assertTrue((Booking)bookingSystem.listBooking().get(0) == bookingSystemFactory.createBooking() );
		assertTrue(bookingSystemFactory.createBooking(id,"FirstName", "LastName","20161208", "20161223").equals(bookingSystem.listBooking().get(0)));
	}
	
	@Test
	public void createMultipleBooking() throws Exception {
		List<Integer> ids = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			Integer id = bookingSystem.initiateBooking("first"+i, "last"+i, "20161208", "20161223");
			if (id < 0) {
				throw new Exception("okay bookings returns -1");
			}
			
			if (!ids.contains(id)) {
				ids.add(id);
			} else {
				System.out.println(id);
				throw new Exception("Multiple bookings with same ids");
			}
		}
		
		assertFalse(bookingSystem.listBooking().isEmpty());
	}
	
	//TODO:u.c. 2.1.2.  - search for free rooms
	@Test
	public void searchForFreeRooms() {
		EList freeRooms = bookingSystem.getFreeRooms(2, "20170112", "20170118");
		
		assertFalse(freeRooms.isEmpty());
	}
	
	//TODO:u.c. 2.1.3.  - check in booking
	@Test
	public void checkInBooking() {
		int bookingId = bookingSystem.initiateBooking("First", "Last", "20161211", "20161223");
		
		//bookingSystem.checkInRoom("roomTypeDescription", id); //the input is only the booking id
		bookingSystem.initiateCheckin(bookingId);
		//marks the room as occupied and links that room to the booking id, returns true if successful
		boolean result = bookingSystem.addRoomToBooking("roomTypeDescription", bookingId);
		
		assertEquals(true, result);
		
		
	}
	
	//TODO:u.c. 2.1.4.  - check out booking
	@Test
	public void checkOutBooking() {
		int bookingId = bookingSystem.initiateBooking("FirstName", "LastName", "20161212", "20161214");
		bookingSystem.initiateCheckin(bookingId);
		bookingSystem.addRoomToBooking("roomTypeDescription", bookingId);
		bookingSystem.confirmBooking(bookingId);
		bookingSystem.initiateCheckout(bookingId);
		//boolean result = bookingSystem.payDuringCheckout("ccNumber", "ccv", 05, 2018, "firstName", "lastName");
		boolean result = bookingSystem.payRoomDuringCheckout(111, "ccNumber", "ccv", 05, 2018, "firstName", "lastName");
		assertEquals(true, result);
		
	}
	//TODO:u.c. 2.1.5.  - edit a booking
	@Test
	public void editBooking() {
		
	}
	//TODO:u.c. 2.1.6.  - cancel a booking
	@Test
	public void cancelBooking() {
		
	}
	//u.c. 2.1.7.  - list bookings
	@Test
	public void listBookingsIsNotEmpty () {
		int id = bookingSystem.initiateBooking("FirstName","LastName", "20161208", "20161223");
		//bookingSystem.addRoomToBooking("A Room", id);
       //bookingSystem.checkInRoom("RoomType", id);
		
		assertTrue(!bookingSystem.listBooking().isEmpty());
	}
	
	@Test
	public void listBooking () {
		int id = bookingSystem.initiateBooking("FirstName", "Last Name", "20161212", "20161223");
		//bookingSystem.addRoomToBooking("First Room", id);
		
		assertTrue(bookingSystem.listBooking().size() == 1); 
		//Not Sure what to test.
	}
	
	//u.c. 2.1.8.  - list occupied rooms for specified day
	@Test
	public void listOccupiedRoomsForSpecifiedDay () {
		
	}
	
	//TODO:u.c. 2.1.9.  - list check in for specific day(s)
	@Test
	public void listCheckinsForSpecificDay() {
		
	}
	//TODO:u.c. 2.1.10. - list check out for specific day(s)
	@Test
	public void listCheckoutForSpecificDay() {
		
	}
	//TODO:u.c. 2.1.11. - check in room 
	@Test
	public void checkInRoom() {
		int bookingId = bookingSystem.initiateBooking("FirstName", "LastName", "20161212", "20161214");
		int result = bookingSystem.checkInRoom("roomTypeDescription", bookingId);
		//boolean result = bookingSystem.addRoomToBooking("roomTypeDescription", bookingId);
		//bookingSystem.confirmBooking(bookingId);
		assertEquals(true, result!=-1);
		
	}
	//TODO:u.c. 2.1.12. - check out and pay
	@Test
	public void checkOutAndPay() {
		
	}
	//TODO:u.c. 2.1.13. - add extra cost to rooms
	@Test
	public void addExtraCostToRoom() {
		int roomNumber = 111;
		String descriptionOfCost = "laundry service";
		double priceOfCost = 50.00;
		int bookingId = bookingSystem.initiateBooking("FirstName", "LastName", "20161212", "20161214");
		bookingSystem.initiateCheckin(bookingId);
		bookingSystem.addRoomToBooking("roomTypeDescription", bookingId);
		bookingSystem.confirmBooking(bookingId);
		bookingSystem.addExtraCostToRoom(bookingId, roomNumber, descriptionOfCost, priceOfCost);
	}
	
}
