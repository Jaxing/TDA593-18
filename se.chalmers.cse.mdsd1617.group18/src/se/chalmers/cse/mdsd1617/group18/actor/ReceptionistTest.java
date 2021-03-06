package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.FreeRoomTypesDTO;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemFactoryImpl;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl;
import se.chalmers.cse.mdsd1617.group18.roomManager.IRoom;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManagerFactory;
import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl;


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
	public void createMultipleBooking() throws Exception {
		List<Integer> ids = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			Integer id = bookingSystem.initiateBooking("first"+i, "20161208", "20161223", "last"+i);
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
	
	@Test
	public void createBookingWithEmptyNames() {
		int id = bookingSystem.initiateBooking("", "20161208", "20161223", "");
		
		assertTrue(id == -1);
	}
	
	@Test
	public void createBookingWithNames() {
		int id = bookingSystem.initiateBooking("First", "20161208", "20161223", "last");
		
		assertFalse(id == -1);
	}
	
	
	@Test
	public void addRoomWithNonExistingRoomType () {
		int id = bookingSystem.initiateBooking("a", "20201012", "20201112", "b");
		assertFalse(bookingSystem.addRoomToBooking("ugyg;l", id));
	}
	
	@Test
	public void addRoomWithExistingRoomType () {
		int id = bookingSystem.initiateBooking("a", "20201012", "20201112", "b");
		assertTrue(bookingSystem.addRoomToBooking("A basic room", id));
	}
	
	@Test
	public void addRoomWithInvalidId(){
		assertFalse(bookingSystem.addRoomToBooking("A basic room", 999));
	}
	
	@Test
	public void addRoomMultipleRoomWithValidId(){
		int id = bookingSystem.initiateBooking("a", "20201012", "20201112", "b");
		bookingSystem.addRoomToBooking("A basic room", id);
		bookingSystem.addRoomToBooking("A basic room", id);
		IBooking booking = ((BookingSystemImpl)bookingSystem).findBooking(id);
		assertTrue(booking.getRooms().size() == 2);
	}
	
	@Test
	public void addTooManyRooms () {
		int id = bookingSystem.initiateBooking("a", "20201012", "20201112", "b");
		
		//should add all rooms available
		for (int i = 0; i < 10; i++) {
			bookingSystem.addRoomToBooking("A basic room", id);
		}
		
		assertFalse(bookingSystem.addRoomToBooking("A basic room", id));
	}
		
	@Test	
	public void confirmBooking () {
		assertFalse(bookingSystem.confirmBooking(6));
		int id = bookingSystem.initiateBooking("a", "20201012", "20201112", "b");
		
		assertFalse(bookingSystem.confirmBooking(id));
		bookingSystem.addRoomToBooking("A basic room", id);
		
		assertTrue(bookingSystem.confirmBooking(id));
	}
	
	//TODO:u.c. 2.1.2.  - search for free rooms
	@Test
	public void searchForFreeRooms() {
		EList<FreeRoomTypesDTO> freeRooms = bookingSystem.getFreeRooms(2, "20170112", "20170118");
		
		assertFalse(freeRooms.isEmpty());
	}
	
	// UC 2.1.3.  - check in booking
	@Test
	public void checkInBooking() {
		int bookingId = bookingSystem.initiateBooking("First", "20161211", "20161223", "Last");
		boolean result = bookingSystem.addRoomToBooking("A basic room", bookingId);
		result = result && bookingSystem.addRoomToBooking("A basic room", bookingId);
		bookingSystem.confirmBooking(bookingId);
		EList<IRoom> rooms = bookingSystem.initiateCheckin(bookingId);
		for (IRoom room : rooms) {
			bookingSystem.checkInRoom(room.getRoomType().getDescription(), bookingId);
		}
		
		int checkedInCount = 0;
		for (IBooking booking : bookingSystem.getBookings()) {
			if (booking.getID() == bookingId) {
				checkedInCount += booking.getCheckedInRooms().size();
				break;
			}
		}		
		assertTrue(result && checkedInCount == 2);
		
		
	}
	
	// u.c. 2.1.4.  - check out booking
	@Test
	public void checkOutBooking() {	
		// First check in a booking 
		double expectedPrice = 800 * 2; // The default room costs 800
		int bookingId = bookingSystem.initiateBooking("First", "20161211", "20161223", "Last");
		bookingSystem.addRoomToBooking("A basic room", bookingId);
		bookingSystem.addRoomToBooking("A basic room", bookingId);
		bookingSystem.confirmBooking(bookingId);
		EList<IRoom> rooms = bookingSystem.initiateCheckin(bookingId);
		for (IRoom room : rooms) {
			bookingSystem.checkInRoom(room.getRoomType().getDescription(), bookingId);
		}
		
		// Then check it out again
		double price = bookingSystem.initiateCheckout(bookingId);
		//boolean result = bookingSystem.payDuringCheckout("5105105105105100", "123", 12, 2020, "John", "Doe");
		assertTrue(price == expectedPrice);
		
		
	}
	//TODO:u.c. 2.1.5.  - edit a booking
	@Test
	public void editBooking() {
		int bookingId = bookingSystem.initiateBooking("FirstName", "20161212", "20161214", "LastName");
		//bookingSystem.initiateCheckin(BookingId);

		bookingSystem.editBookingPeriod(bookingId, "20161214" , "20161216");
			
		String newStartDate= bookingSystem.listBooking().get(0).getStartDate();
		String newEndDate = bookingSystem.listBooking().get(0).getEndDate();
		assertEquals("20161214", newStartDate);
		assertEquals("20161216", newEndDate);
		
	}
	//TODO:u.c. 2.1.6.  - cancel a booking
	@Test
	public void cancelBooking() {
		int bookingId = bookingSystem.initiateBooking("FirstName", "20161212", "20161214", "LastName");
		//bookingSystem.initiateCheckin(bookingId);
		bookingSystem.addRoomToBooking("A basic room", bookingId);
		
		EList <IRoom> freeRoomList = ((BookingSystemImpl)bookingSystem).getFreeRooms("20161212", "20161214");
		int listSize = freeRoomList.size();
		bookingSystem.cancelBooking(bookingId);
		
		EList <IRoom> freeRoomList2 = ((BookingSystemImpl)bookingSystem).getFreeRooms("20161212", "20161214");
		int listSize2 = freeRoomList2.size();
		//System.out.println(listSize + " " + listSize2);
		
	    assertTrue(listSize == listSize2 -1);
		assertTrue(bookingSystem.listBooking().isEmpty());
		
	}
	//u.c. 2.1.7.  - list bookings
	@Test
	public void listBookingsIsNotEmpty () {
		int id = bookingSystem.initiateBooking("FirstName", "20161208", "20161223","LastName");
		//bookingSystem.addRoomToBooking("A Room", id);
       //bookingSystem.checkInRoom("RoomType", id);
		
		assertTrue(!bookingSystem.listBooking().isEmpty());
	}
	
	@Test
	public void listBooking () {
		int id = bookingSystem.initiateBooking("FirstName", "20161212", "20161223", "Last Name");
		//bookingSystem.addRoomToBooking("First Room", id);
		
		assertTrue(bookingSystem.listBooking().size() == 1); 
		//Not Sure what to test.
	}
	
	//u.c. 2.1.8.  - list occupied rooms for specified day
	@Test
	public void listOccupiedRoomsForSpecifiedDay () {
		int id = bookingSystem.initiateBooking("FirstName", "20161212", "20161223", "Last Name");
		bookingSystem.addRoomToBooking("A basic room", id);
		bookingSystem.initiateCheckin(id);
		bookingSystem.checkInRoom("A basic room", id);
		
		assertFalse(bookingSystem.listOccupiedRooms("20161213").isEmpty());
		
	}
	
	//TODO:u.c. 2.1.9.  - list check in for specific day(s)
	@Test
	public void listCheckinsForSpecificDay() {
		int id = bookingSystem.initiateBooking("FirstName", "20161212", "20161223", "Last Name");
		bookingSystem.addRoomToBooking("A basic room", id);
		bookingSystem.initiateCheckin(id);
		bookingSystem.checkInRoom("A basic room", id);
		
		LocalDate now = LocalDate.now();
		assertFalse(bookingSystem.listCheckins(now.minusDays(1).format(DateTimeFormatter.ofPattern("yyyyMMdd")), now.plusDays(1).format(DateTimeFormatter.ofPattern("yyyyMMdd"))).isEmpty());
	}
	//TODO:u.c. 2.1.10. - list check out for specific day(s)
	@Test
	public void listCheckoutForSpecificDay() {
		int id = bookingSystem.initiateBooking("FirstName", "20161212", "20161223", "Last Name");
		bookingSystem.addRoomToBooking("A basic room", id);
		bookingSystem.initiateCheckin(id);
		int roomNbr = bookingSystem.checkInRoom("A basic room", id);
		bookingSystem.initiateCheckout(id);
		
		LocalDate now = LocalDate.now();
		assertFalse(bookingSystem.listCheckouts(now.minusDays(1).format(DateTimeFormatter.ofPattern("yyyyMMdd")), now.plusDays(1).format(DateTimeFormatter.ofPattern("yyyyMMdd"))).isEmpty());		
	}
	//TODO:u.c. 2.1.11. - check in room 
	@Test
	public void checkInRoom() {
		int bookingId = bookingSystem.initiateBooking("FirstName", "20161212", "20161214", "LastName");
		bookingSystem.addRoomToBooking("A basic room", bookingId);
		bookingSystem.confirmBooking(bookingId);
		int result = bookingSystem.checkInRoom("A basic room", bookingId);
		
		assertEquals(true, result!=-1);
		
	}
	//TODO:u.c. 2.1.12. - check out and pay room
	@Test
	public void checkOutAndPayRoom() {
		int bookingId = bookingSystem.initiateBooking("FirstName", "20161212", "20161214", "LastName");
		int result1 = bookingSystem.checkInRoom("roomTypeDescription", bookingId);
		double result2 = bookingSystem.initiateRoomCheckout(bookingId,12);
		//boolean result = bookingSystem.addRoomToBooking("roomTypeDescription", bookingId);
		//bookingSystem.confirmBooking(bookingId);
		assertEquals(true, result2==-1 && result1==-1);
	}
	
	//TODO:u.c. 2.1.13. - add extra cost to rooms
	@Test
	public void addExtraCostToRoom() {
		int roomNumber = 111;
		String descriptionOfCost = "laundry service";
		double priceOfCost = 50.00;
		int bookingId = bookingSystem.initiateBooking("FirstName", "20161212", "20161214", "LastName");
		bookingSystem.initiateCheckin(bookingId);
		bookingSystem.addRoomToBooking("roomTypeDescription", bookingId);
		bookingSystem.confirmBooking(bookingId);
		bookingSystem.addExtraCostToRoom(bookingId, roomNumber, descriptionOfCost, priceOfCost);
	}
	
}
