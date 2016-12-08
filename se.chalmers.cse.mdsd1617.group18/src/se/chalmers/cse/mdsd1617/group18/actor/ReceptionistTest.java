package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import se.chalmers.cse.mdsd1617.group18.bookingSystem.Booking;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystem;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.BookingSystemFactory;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemFactoryImpl;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingSystemImpl;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.impl.BookingImpl;;


public class ReceptionistTest {
	
	@Test
	public void createBooking () {
		BookingSystemFactory bookingSystemFactory = BookingSystemFactoryImpl.init();
		BookingSystem bookingSystem = bookingSystemFactory.createBookingSystem();
		
		int id = bookingSystem.initiateBooking("FisrtName", "20161208", "20161223", "LastName");
		
		assertTrue((Booking)bookingSystem.listBooking().get(0) == bookingSystemFactory.createBooking() );
	}
}
