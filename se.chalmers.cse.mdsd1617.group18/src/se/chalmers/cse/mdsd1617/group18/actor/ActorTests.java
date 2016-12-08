package se.chalmers.cse.mdsd1617.group18.actor;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.EList;
import org.junit.*;

import se.chalmers.cse.mdsd1617.group18.roomManager.*;
import se.chalmers.cse.mdsd1617.group18.roomManager.impl.RoomManagerFactoryImpl;

public class ActorTests {

	@Test
	public void testAdministratorRemoveRoomType() {
		RoomManagerFactoryImpl.init();
		RoomManager rM = RoomManagerFactoryImpl.getInstance().createRoomManager(null, null);
		Administrator admin = new Administrator(rM, rM);
		EList<RoomType> roomTypes = admin.getRoomManager().getRoomTypes();
		admin.getRoomManager().removeRoomType(roomTypes.get(0).getName());
		EList<RoomType> newRoomTypes = admin.getRoomManager().getRoomTypes();
		assertEquals(false, newRoomTypes.contains(roomTypes.get(0)));
	}
}
