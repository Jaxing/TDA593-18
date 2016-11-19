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
	 
	 public boolean connectRoomToReservation(long reservationId) {
		 return null == roomToReservation.put(this.getSmallestFreeId(), reservationId);
	 }
	 
	 public boolean roomMappedToReservation(long roomId) {
		 return roomToReservation.containsKey(roomId);
	 }
	 
	 /**
	  * Since the number of reservations always are equal to the number of rooms, if this method is called ther will be a room yet not occupied, i.e. not in the map.
	  * @return
	  */
	 private synchronized long getSmallestFreeId() {
		 for (long i = 1; i <= MAX_ROOMS; i++) {
			 if (!roomToReservation.containsKey(i)) {
				 return i;
			 }
		 }
		 return -1;
	 }
	
}
