package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.EList;
import org.junit.*;

import se.chalmers.cse.mdsd1617.group18.roomManager.*;
import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl;

public class AdministratorTests {
	
	private RoomManager roomManager;
	private RoomManagerFactory factory;

	@Before
	public void initializeAdminTests() {
		factory = RoomManagerFactoryImpl.init();
		roomManager = factory.createRoomManager();
		roomManager.startup(50);
	}
	
	// UC 2.2.1
	@Test
	public void testAdministratorAddRoomType() {
		double price = 1000.0;
		String name = "A room type";
		int numberOfBeds = 2;
		String desc = "Some description";
		roomManager.addRoomType(name, price, numberOfBeds, desc);
		EList<IRoomType> roomTypes = roomManager.getRoomTypes();
		boolean found = false;
		for (int i = 0; i < roomTypes.size(); i++) {
			IRoomType rT = roomTypes.get(i);
			if (rT.getName().equals(name) && rT.getPrice() == price 
					&& rT.getNumberOfBeds() == numberOfBeds && rT.getDescription().equals(desc)) {
				found = true;
			}
		}
		assertEquals(true, found);
	}
	
	// UC 2.2.2
	@Test
	public void testAdministratorUpdateRoomType() {
		roomManager.addRoomType("Old name", 999.9, 2, "Old desc");
		IRoomType rT = roomManager.getRoomTypes().get(0);
		roomManager.updateRoomType(rT, "New name", 200.0, 1, "New desc");
		rT = roomManager.getRoomTypes().get(0);
		boolean works = false;
		if (rT.getName().equals("New name") && rT.getPrice() == 200.0 
				&& rT.getNumberOfBeds() == 1 && rT.getDescription().equals("New desc")) {
			works = true;
		}
		assertEquals(true, works);
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
		IRoomType rT = factory.createRoomType(1000, "Basic room", 1, "A basic room");
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
	
	// UC 2.2.5
	@Test
	public void testAdministratorChangeRoomTypeOfRoom() {
		int roomNumber = 10;
		IRoomType oldType = factory.createRoomType(1000.0, "Room Type A", 2, "A description");
		IRoomType newType = factory.createRoomType(1500.0, "Room type B", 5, "A fancy room");
		roomManager.addRoom(roomNumber, oldType);
		roomManager.changeRoomType(roomNumber, newType);
		boolean works = false;
		EList<IRoom> rooms = roomManager.getRooms();
		for (int i = 0; i < rooms.size(); i++) {
			IRoom room = rooms.get(i);
			if (room.getRoomNumber() == roomNumber && room.getRoomType().equals(newType)) {
				works = true;
			}
		}
		assertEquals(true, works);
	}
	
	// UC 2.2.6
	@Test
	public void testAdministratorRemoveRoom() {
		int roomNumber = 999;
		IRoomType rT = factory.createRoomType(1000, "Basic room", 1, "A basic room");
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
	
	// UC 2.2.7
	@Test
	public void testAdministratorBlockRoom() {
		int roomNumber = 666;
		IRoomType rT = factory.createRoomType(1000, "Basic room", 1, "A basic room");
		roomManager.addRoom(roomNumber, rT);
		roomManager.blockRoom(roomNumber);
		EList<IRoom> rooms = roomManager.getRooms();
		boolean works = false;
		for (int i = 0; i < rooms.size(); i++) {
			IRoom room = rooms.get(i);
			if (room.getRoomNumber() == roomNumber && room.isBlocked()) {
				works = true;
			}
		}
		assertEquals(true, works);
	}
	
	// UC 2.2.8
	@Test
	public void testAdministratorUnblockRoom() {
		int roomNumber = 666;
		IRoomType rT = factory.createRoomType(1000, "Basic room", 1, "A basic room");
		roomManager.addRoom(roomNumber, rT);
		roomManager.blockRoom(roomNumber);
		roomManager.unblockRoom(roomNumber);
		EList<IRoom> rooms = roomManager.getRooms();
		boolean works = false;
		for (int i = 0; i < rooms.size(); i++) {
			IRoom room = rooms.get(i);
			if (room.getRoomNumber() == roomNumber && !room.isBlocked()) {
				works = true;
			}
		}
		assertEquals(true, works);
	}
	
	// UC 2.2.9
	@Test
	public void testStartupHotelSystem() {
		// Create some data that should be removed after startup
		roomManager.addRoomType("Random room type", 200.0, 3, "Test");
		IRoomType rT = roomManager.getRoomTypes().get(0);
		roomManager.addRoom(200, rT);
		roomManager.addRoom(201, rT);
		// Startup
		roomManager.startup(5);
		
		EList<IRoom> rooms = roomManager.getRooms();
		EList<IRoomType> rTypes = roomManager.getRoomTypes();
		boolean correctBeds = true;
		for (int i = 0; i < rTypes.size(); i++) {
			correctBeds = correctBeds && (rTypes.get(i).getNumberOfBeds() == 2);
		}
		for (int i = 0; i < rooms.size(); i++) {
			correctBeds = correctBeds && (rooms.get(i).getRoomType().getNumberOfBeds() == 2);
		}
		assertEquals(true, correctBeds && rooms.size() == 5);		
		
	}
}
