package game;

public class RoomManager {

	Room startingRoom;
	Room[] rooms;
	
	public void init() {
		Room foyer = new Room("Foyer","small foyer","beautiful room");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
	}
	
}
