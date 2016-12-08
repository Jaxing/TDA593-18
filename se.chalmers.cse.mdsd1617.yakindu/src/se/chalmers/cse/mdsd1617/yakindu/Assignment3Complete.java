package se.chalmers.cse.mdsd1617.yakindu;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;
	private long currentReservationId = 0;
	private long reservationToCheckin = 0;
	private long reservationToCheckout = 0;
	private long assignedRooms = 0;
	private long smallestAssignedRoom = 0;
	private Map<Long,Long> reservationToBookingId = new HashMap<Long,Long>(); 
	private Map<Long, Long> roomToReservation = new HashMap<Long,Long>();
	private List<Long> idToCheckIn = new ArrayList<Long>();
	private List<Long> idToCheckOut = new ArrayList<Long>();
	
	
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
			idToCheckIn.add(currentReservationId);
			this.assignedRooms++;
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
			if (reservationMappedToBooking(reservationID, bookingId) &&
					idToCheckOut.contains(reservationID)) {
				
				return true;
			}
			return false;
	}
	
	public boolean reservationMappedToBookingForCheckout(long reservationID, long bookingId) {
		
		if ( reservationMappedToBooking(reservationID, bookingId) && !this.idToCheckOut.contains(reservationID)) {
			return true;
		}
		
		return false;
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
		for(Long id : idToCheckIn) {
			if (reservationToBookingId.get(id) == bookingId) {
				this.connectRoomToReservation(id);
				idToCheckIn.remove(id);
				idToCheckOut.add(id);
				return true;
			}
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
		 for(Long id : idToCheckOut) {
			if (reservationToBookingId.get(id) == bookingId) {
				this.checkOutReservation(id);
				return true;
			}
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
		 
		 
		 this.assignedRooms--;
		 roomToReservation.put(this.smallestAssignedRoom, reservationId);
		 this.smallestAssignedRoom++;
		 if (this.smallestAssignedRoom > this.assignedRooms) {
			 this.smallestAssignedRoom = 0;
		 }
		 
	 }
	 
	 public boolean roomNotMappedToRes(long roomId) {
		 return !this.roomToReservation.containsKey(roomId);
	 }
	 
	 public boolean roomMappedToReservation(long roomId, long bookingId) {
		 for (Map.Entry<Long, Long> e2 : this.reservationToBookingId.entrySet()) {
			 if (e2.getValue() == bookingId) {
				 if (e2.getKey() == this.roomToReservation.get(roomId)) {
					 return true;
				 }
			 }
		 }
		 return false;
	 }
	 
	 private void checkOutReservation(long reservationId) {
		 for (long id : this.idToCheckOut) {
			 if (id == reservationId) {
				 for (Map.Entry<Long, Long> e : this.roomToReservation.entrySet()) {
					 if (e.getValue() == id) {
						 this.roomToReservation.remove(e.getKey());
						 this.idToCheckOut.remove(reservationId);
						 return;
					 }
				 }				 
			 }
		 }
	 }
	 
	 //Should return current highest id, therefore currentReservationId needs to be one smaller.
	 public long getCurrentReservationId() {
		return this.currentReservationId - 1; 
	 }
	
}
