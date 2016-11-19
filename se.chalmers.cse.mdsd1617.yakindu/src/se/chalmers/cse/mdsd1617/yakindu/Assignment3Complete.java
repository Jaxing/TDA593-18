package se.chalmers.cse.mdsd1617.yakindu;

import java.util.HashMap;
import java.util.Map;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;
	private Map<Long,Long> reservationToBookingId = new HashMap<Long,Long>(); 
	private Map<Long, Long> roomToReservation = new HashMap<Long,Long>();
	
	private final int MAX_ROOMS = 5;
	 
	public long initiateBooking() {
		return ++currentBookingId;
	}

	public boolean addRoomToBooking(long bookingId) {
		if (bookingId < 1 || bookingId > currentBookingId) {
			return false;
		} else if (currentReservationNumber >= MAX_ROOMS) {
			return false;
		} else {
			++currentReservationNumber;
			reservationToBookingId.put(currentReservationNumber, bookingId);
			return true;
		}
	}
	
	public boolean reservationMappedToBooking(long reservationID, long bookingId) {
		return reservationToBookingId.containsKey(reservationID) &&
				reservationToBookingId.get(reservationID) == bookingId;
	}
	
	public boolean confirmBooking(long bookingId){
		//If there is an entry with this booking id then there is a reservation connected to that booking.
		return reservationToBookingId.containsValue(bookingId);
	}
	
	public long getCurrentReservationNumber(){
		return currentReservationNumber;
	}
	 
	 public boolean checkInBooking(long bookingId) {
		 return reservationToBookingId.containsValue(bookingId);
	 }
	 
	 public boolean initiateCheckout(long bookingId) {
		 return false;
	 }
	 
	 public boolean payDuringCheckout(long bookingId) {
		 return false;
	 }
	 
	 public void connectRoomToReservation( long roomId, long reservationId) {
		 roomToReservation.put(roomId, reservationId);		 
	 }
	 
	 public boolean roomMappedToReservation(long roomId, long reservationId) {
		 return roomToReservation.containsKey(roomId) &&
				 roomToReservation.get(roomId) == reservationId;
	 }
	
}
