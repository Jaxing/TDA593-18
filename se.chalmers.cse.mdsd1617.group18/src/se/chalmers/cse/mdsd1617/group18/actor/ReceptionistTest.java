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
	
	@Test
	public void createBooking () {		
		int id = bookingSystem.initiateBooking("FisrtName", "20161208", "20161223", "LastName");
		
		//TODO: Need a factory to create a booking with given paramenters.
		assertTrue((Booking)bookingSystem.listBooking().get(0) == bookingSystemFactory.createBooking() );
	}
	
	//*** List Bookings
	@Test
	public void listBookingsIsNotEmpty () {
		int id = bookingSystem.initiateBooking("FisrtName", "20161208", "20161223", "LastName");
		bookingSystem.checkInRoom("RoomType", id);
		
		assertTrue(!bookingSystem.listBooking().isEmpty());
	}
	
	
	//*** List Occupied Room For Specified Day
	@Test
	public void listOccupiedRoomsForSpecifiedDay () {
		
	}
	
	@Test
	public void unblockRoom () {
		
	}
}
