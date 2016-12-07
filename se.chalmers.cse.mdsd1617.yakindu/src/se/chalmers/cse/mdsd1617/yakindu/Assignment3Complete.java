package se.chalmers.cse.mdsd1617.yakindu;

import java.util.HashMap;
import java.util.Map;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;
	private long currentReservationId = 0;
	private long reservationToCheckin = 0;
	private long reservationToCheckout = 0;
	private Map<Long,Long> reservationToBookingId = new HashMap<Long,Long>(); 
	private Map<Long, Long> roomToReservation = new HashMap<Long,Long>();
	
	private final int MAX_ROOMS = 5;
	 
	public long initiateBooking() {
		return ++currentBookingId;
	}
	
	public long getMaxRooms() {
		return (long)MAX_ROOMS;
	}

	public boolean addRoomToBooking(long bookingId) {
		if (bookingId < 1 || bookingId > currentBookingId) {
			return false;
		} else if (currentReservationNumber >= MAX_ROOMS) {
			return false;
		} else {
			++currentReservationNumber;
			reservationToBookingId.put(currentReservationId, bookingId);
			++currentReservationId;
			return true;
		}
	}
	
	public boolean reservationMappedToBooking(long reservationID, long bookingId) {
		return reservationToBookingId.containsKey(reservationID) &&
				reservationToBookingId.get(reservationID) == bookingId;
	}
	
	public boolean reservationMappedToBookingForCheckin(long reservationID, long bookingId) {
			return  reservationToBookingId.get(reservationID) == bookingId &&
					reservationID == reservationToCheckin - 1;
	}
	
	public boolean reservationMappedToBookingForCheckout(long reservationID, long bookingId) {
		return  reservationToBookingId.get(reservationID) == bookingId &&
				reservationID == reservationToCheckout - 1;
}
	
	public boolean confirmBooking(long bookingId){
		//If there is an entry with this booking id then there is a reservation connected to that booking.
		return reservationToBookingId.containsValue(bookingId);
	}
	
	public long getCurrentReservationNumber(){
		return currentReservationNumber - 1;
	}
	
	public boolean initiateCheckin(long bookingId) {
		if(reservationToBookingId.containsValue(bookingId))
			return true;
		
		return false;
	}
	
	// **************************** //
	public boolean checkInOneBooking(long bookingId) {
		//System.out.printf("booking: %v, contains: %v, reservationToBooking: %v, reservationToCheckIn: %v", bookingId, this.reservationToBookingId.containsKey(this.reservationToCheckin), this.reservationToBookingId.get(this.reservationToCheckin), this.reservationToCheckin);
		System.out.println(this.reservationToCheckin);
		System.out.println(this.reservationToBookingId.get(this.reservationToCheckin));
		if (this.reservationToBookingId.containsKey(this.reservationToCheckin) 
				&& this.reservationToBookingId.get(this.reservationToCheckin) == bookingId) {
			this.connectRoomToReservation(this.reservationToCheckin++);
			return true;
		}
		return false;
	 }
	
	public boolean checkInBooking(long bookingId) {
		if(this.reservationToBookingId.containsValue(bookingId)) {
			long firstToFail = 0;
			boolean hasFailed = false;
			for (long i = this.reservationToCheckin; i < this.currentReservationNumber; i++) {
				boolean works = this.checkInOneBooking(bookingId);
				if (!hasFailed && !works) {
					firstToFail = i;
					hasFailed = true;
				}
			}
			if (hasFailed) {
				this.reservationToCheckin = firstToFail;
			}
			return true;
		} else {
			return false;
		}
	}
	// **************************** //
	 
	public boolean initiateCheckout(long bookingId) {
		if (reservationToBookingId.containsValue(bookingId)) {
			return true;
		}
		return false;
	}
	 
	 // **************************** //
	 public boolean checkOutOneBooking(long bookingId) {
		//System.out.printf("booking: %v, contains: %v, reservationToBooking: %v, reservationToCheckIn: %v", bookingId, this.reservationToBookingId.containsKey(this.reservationToCheckin), this.reservationToBookingId.get(this.reservationToCheckin), this.reservationToCheckin);
			System.out.println(this.reservationToCheckout);
			System.out.println(this.reservationToBookingId.get(this.reservationToCheckout));
			if (this.reservationToBookingId.containsKey(this.reservationToCheckout) 
					&& this.reservationToBookingId.get(this.reservationToCheckout) == bookingId) {
				this.checkOutReservation(this.reservationToCheckout++);
				this.currentReservationNumber--;
				return true;
			}
			return false;
	 }
	 
	 public boolean checkOutBooking(long bookingId) {
		 if(this.reservationToBookingId.containsValue(bookingId)) {
				long firstToFail = 0;
				boolean hasFailed = false;
				for (long i = this.reservationToCheckout; i < this.currentReservationNumber; i++) {
					boolean works = this.checkOutOneBooking(bookingId);
					if (!hasFailed && !works) {
						firstToFail = i;
						hasFailed = true;
					}
				}
				if (hasFailed) {
					this.reservationToCheckout = firstToFail;
				}
				return true;
			} else {
				return false;
			}
	 }
	// **************************** //
	 
	 public boolean payDuringCheckout(long bookingId) {
		 return false;
	 }
	 
	 private void connectRoomToReservation(long reservationId) {
		 roomToReservation.put(this.getSmallestFreeId(), reservationId);
	 }
	 
	 public boolean roomMappedToReservation(long roomId) {
		 return roomToReservation.containsKey(roomId);
	 }
	 
	 private void checkOutReservation(long reservationId) {
		 for (Map.Entry<Long, Long> e : roomToReservation.entrySet()) {
			 if (e.getValue() == reservationId && reservationId == reservationToCheckout) {
				 roomToReservation.remove(e.getKey());
				 return;
			 }
		 }
	 }
	 
	 /**
	  * Since the number of reservations always are equal to the number of rooms, if this method is called there will be a room yet not occupied, i.e. not in the map.
	  * @return
	  */
	 private long getSmallestFreeId() {
		 for (long i = 0; i < MAX_ROOMS; i++) {
			 if (!roomToReservation.containsKey(i)) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	 //Should return current highest id, therefore currentReservationId needs to be one smaller.
	 public long getCurrentReservationId() {
		return this.currentReservationId - 1; 
	 }
	
}
