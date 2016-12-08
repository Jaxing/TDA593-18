package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.junit.*;

import se.chalmers.cse.mdsd1617.group18.roomManager.*;
import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl;

public class AdministratorTests {

	@Test
	public void testAdministratorRemoveRoomType() {
		RoomManagerFactoryImpl.init();
		RoomManager rM = RoomManagerFactoryImpl.getInstance().createRoomManager(null, null);
		
		EList<IRoomType> roomTypes = rM.getRoomTypes();
		rM.removeRoomType(roomTypes.get(0).getName());
		EList<IRoomType> newRoomTypes = rM.getRoomTypes();
		assertEquals(false, newRoomTypes.contains(roomTypes.get(0)));
	}
	
	@Test
	public void testAdministratorAddRoom() {
		RoomManagerFactoryImpl.init();
		RoomManager rM = RoomManagerFactoryImpl.getInstance().createRoomManager(null, null);
		int roomNumber = 0;
		IRoomType rT = RoomManagerFactoryImpl.getInstance().createRoomType(1000, "Basic room", 1);
		rM.addRoom(roomNumber, rT);
		boolean found = false;
		EList<IRoom> rooms = rM.getRooms();
		for(int i = 0; i < rooms.size(); i++) {
			IRoom r = rooms.get(i);
			if (r.getRoomNumber() == roomNumber && r.getRoomType().equals(rT)) {
				found = true;
			}
		}
		assertEquals(true, found);
	}
	
	@Test
	public void testAdministratorCheckInRoom() {
		assertEquals(true, false);
	}
}
