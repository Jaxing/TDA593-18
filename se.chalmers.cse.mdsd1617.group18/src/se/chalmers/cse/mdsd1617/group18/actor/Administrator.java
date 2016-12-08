package se.chalmers.cse.mdsd1617.group18.actor;
import se.chalmers.cse.mdsd1617.group18.roomManager.IHotelRoomManager;
import se.chalmers.cse.mdsd1617.group18.roomManager.*;
public class Administrator {
	private final IHotelRoomManager roomManager;
	private final IHotelStartupProvies startupProvider;
	public Administrator(final IHotelRoomManager roomManager, final IHotelStartupProvies startupProvider) {
		this.roomManager = roomManager;
		this.startupProvider = startupProvider;
	}
	
	public IHotelRoomManager getRoomManager() {
		return this.roomManager;
	}
	
	public IHotelStartupProvies getStartupProvider() {
		return this.startupProvider;
	}
}
