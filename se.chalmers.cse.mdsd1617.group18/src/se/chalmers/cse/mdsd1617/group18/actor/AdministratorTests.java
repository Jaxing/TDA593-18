package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.EList;
import org.junit.*;

import se.chalmers.cse.mdsd1617.group18.roomManager.*;
import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl;

public class AdministratorTests {
	
	private RoomManager roomManager;

	@Before
	public void initializeAdminTests() {
		RoomManagerFactoryImpl.init();
		roomManager = RoomManagerFactoryImpl.init().createRoomManager();
		roomManager.startup(50);
	}
	
	// UC 2.2.1
	@Test
	public void testAdministratorAddRoomType() {
		double price = 1000.0;
		String name = "A room type";
		int numberOfBeds = 2;
		roomManager.addRoomType(name, price, numberOfBeds);
		EList<IRoomType> roomTypes = roomManager.getRoomTypes();
		boolean found = false;
		for (int i = 0; i < roomTypes.size(); i++) {
			IRoomType rT = roomTypes.get(i);
			if (rT.getName().equals(name) && rT.getPrice() == price && rT.getNumberOfBeds() == numberOfBeds) {
				found = true;
			}
		}
		assertEquals(true, found);
	}
	
	// UC 2.2.3
	@Test
	public void testAdministratorRemoveRoomType() {
		EList<IRoomType> roomTypes = roomManager.getRoomTypes();
		IRoomType rT = roomTypes.get(0);
		roomManager.removeRoomType(rT);
		EList<IRoomType> newRoomTypes = roomManager.getRoomTypes();
		assertEquals(false, newRoomTypes.contains(rT));
	}
	
	// UC 2.2.4
	@Test
	public void testAdministratorAddRoom() {
		int roomNumber = 0;
		IRoomType rT = RoomManagerFactoryImpl.init().createRoomType(1000, "Basic room", 1, "A basic room");
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
	
	// UC 2.2.6
	@Test
	public void testAdministratorRemoveRoom() {
		int roomNumber = 999;
		IRoomType rT = RoomManagerFactoryImpl.init().createRoomType(1000, "Basic room", 1, "A basic room");
		roomManager.addRoom(roomNumber, rT);
		roomManager.removeRoom(roomNumber);
		boolean found = false;
		EList<IRoom> rooms = roomManager.getRooms();
		for(int i = 0; i < rooms.size(); i++) {
			IRoom r = rooms.get(i);
			if (r.getRoomNumber() == roomNumber && r.getRoomType().equals(rT)) {
				found = true;
			}
		}
		
		assertEquals(false, found);
	}
}
