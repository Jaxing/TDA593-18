package se.chalmers.cse.mdsd1617.group18.actor;
import se.chalmers.cse.mdsd1617.group18.bookingSystem.IHotelBookingManager;

public class Receptionist {
	private final IHotelBookingManager bookingManager;
	
	public Receptionist(final IHotelBookingManager bookingManager) {
		this.bookingManager = bookingManager;
	}
	
	public IHotelBookingManager getBookingManager() {
		return this.bookingManager;
	}
}
