package se.chalmers.cse.mdsd1617.group18.roomManager.impl;

import org.eclipse.emf.common.util.EList;

import se.chalmers.cse.mdsd1617.group18.roomManager.IRoom;
import se.chalmers.cse.mdsd1617.group18.roomManager.RoomManager;

public class simpleTest {
	
	
	public static void main(String[] args){
		RoomManagerImpl manager = new RoomManagerImpl();
		manager.startup(10);
		EList rooms = manager.getRooms();
		System.out.println(rooms.size());
		for(int i = 0; i < rooms.size(); i++){
			System.out.println(((IRoom)rooms.get(i)).getRoomType().getNumberOfBeds());
		}
	
	}
}
