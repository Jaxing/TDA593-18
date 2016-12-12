package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IBooking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemFactoryImpl;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingImpl;;


public class ReceptionistTest {
	
	private BookingSystemFactory bookingSystemFactory;
	private BookingSystem bookingSystem;
	
	@Before
	public void initReceptionist () {
		bookingSystemFactory = BookingSystemFactoryImpl.init();
		bookingSystem = bookingSystemFactory.createBookingSystem();
	}
	
	//u.c. 2.1.1.  - make booking
	@Test
	public void createBooking () {		
		int id = bookingSystem.initiateBooking("FisrtName", "20161208", "20161223", "LastName");
		
		//TODO: Need a factory to create a booking with given parameters.
		assertTrue((Booking)bookingSystem.listBooking().get(0) == bookingSystemFactory.createBooking() );
	}
	
	//TODO:u.c. 2.1.2.  - search for free rooms
	
	//TODO:u.c. 2.1.3.  - check in booking
	
	//TODO:u.c. 2.1.4.  - check out booking
	
	//TODO:u.c. 2.1.5.  - edit a booking
	
	//TODO:u.c. 2.1.6.  - cancel a booking
	
	//u.c. 2.1.7.  - list bookings
	@Test
	public void listBookingsIsNotEmpty () {
		int id = bookingSystem.initiateBooking("FirstName", "20161208", "20161223", "LastName");
		bookingSystem.addRoomToBooking("A Room", id);
//		bookingSystem.checkInRoom("RoomType", id);
		
		assertTrue(!bookingSystem.listBooking().isEmpty());
	}
	
	@Test
	public void listBooking () {
		int id = bookingSystem.initiateBooking("FirstName", "20161212", "20161223",	"Last Name");
		bookingSystem.addRoomToBooking("First Room", id);
		
		assertTrue(bookingSystem.listBooking().size() == 1); 
		//Not Sure what to test.
	}
	
	//u.c. 2.1.8.  - list occupied rooms for specified day
	@Test
	public void listOccupiedRoomsForSpecifiedDay () {
		
	}
	
	//TODO:u.c. 2.1.9.  - list check in for specific day(s)
	
	//TODO:u.c. 2.1.10. - list check out for specific day(s)
	
	//TODO:u.c. 2.1.11. - check in room 
	
	//TODO:u.c. 2.1.12. - check out and pay
	
	//TODO:u.c. 2.1.13. - add extra cost to rooms
	
}
