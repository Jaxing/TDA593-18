package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.junit.*;

import se.chalmers.cse.mdsd1617.group18.roomManager.*;
import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl;

public class AdministratorTests {
	
	private RoomManager roomManager;

	@Before
	public void initializeAdminTests() {
		RoomManagerFactoryImpl.init();
		roomManager = RoomManagerFactoryImpl.getInstance().createRoomManager(null, null);
	}
	
	// UC 2.2.3
	@Test
	public void testAdministratorRemoveRoomType() {
		EList<IRoomType> roomTypes = roomManager.getRoomTypes();
		roomManager.removeRoomType(roomTypes.get(0).getName());
		EList<IRoomType> newRoomTypes = roomManager.getRoomTypes();
		assertEquals(false, newRoomTypes.contains(roomTypes.get(0)));
	}
	
	// UC 2.2.4
	@Test
	public void testAdministratorAddRoom() {
		int roomNumber = 0;
		IRoomType rT = RoomManagerFactoryImpl.getInstance().createRoomType(1000, "Basic room", 1);
		roomManager.addRoom(roomNumber, rT);
		boolean found = false;
		EList<IRoom> rooms = roomManager.getRooms();
		for(int i = 0; i < rooms.size(); i++) {
			IRoom r = rooms.get(i);
			if (r.getRoomNumber() == roomNumber && r.getRoomType().equals(rT)) {
				found = true;
			}
		}
		assertEquals(true, found);
	}
	
	// UC 2.1.11
	@Test
	public void testAdministratorCheckInRoom() {
		assertEquals(true, false);
	}
}
