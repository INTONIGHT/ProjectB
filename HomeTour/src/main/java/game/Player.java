package game;

import fixtures.Room;

public class Player {
	//the room the player is currently in
	private Room currentRoom;

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	
}
