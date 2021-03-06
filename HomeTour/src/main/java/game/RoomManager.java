package game;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import fixtures.Fixture;
import fixtures.LightSwitch;
import fixtures.Room;
//consider using arrayList
public class RoomManager {
		//default constructor probably dont need this but just in case.
		public RoomManager() {
			
		}
		//
		Room startingRoom;
		//consider making this arraylist so that it can dynamically change
		
		Room[] rooms ;
		Fixture[] fixtures;
		//constructor
		public RoomManager(int numRooms) {
			rooms = new Room[numRooms];
		}
		public void FixtureManager(int numFixtures) {
			fixtures = new Fixture[numFixtures];
		}
		public void init() {
			Room foyer = new Room("Foyer","A nice gathering place",
					"Theres a wooden desk,some painintngs and drawers"
					+ "with an exit north of you"
					);
			Room kitchen = new Room("Kitchen","A room to eat and cook in",
					"There is a food stained counter with an older table"
					+" There is an exit to your east and to your south"
					);
			Room tvRoom = new Room("TV Room","A room with some tvs",
					"This room has a flatscreen tv in it an exit to the west and south");
			Room guestRoom = new Room("Guest Room","A room for visitors to stay",
					"This room is a small room with a bed and desk"
					+ "It only has one way to leave and that is through the west"
					);
				rooms[0] = foyer;
				rooms[1] = kitchen;
				rooms[2] = tvRoom;
				rooms[3] = guestRoom;
				startingRoom = foyer;
				LightSwitch light = new LightSwitch("This is a light","you can turn it on and off");
				fixtures[0] = light;
				//I think I have to change this.
				Room[] foyerExits = {kitchen};
				foyer.setExits(foyerExits);
				//trying something different here.
				//0 north 1 -west 2 -south 3 0east
				kitchen.setExits(foyer,2);
				kitchen.setExits(tvRoom,3);
				
				tvRoom.setExits(foyer,1);
				tvRoom.setExits(guestRoom,2);
				
				guestRoom.setExits(tvRoom,1);
				kitchen.setStuff(fixtures);
		}
	
	
		public Room getRoom(int roomNumber) {
			return rooms[roomNumber];
		}
		public Room getStartingRoom() {
			return startingRoom;
		}
		public void setStartingRoom(Room startingRoom) {
			this.startingRoom = startingRoom;
		}
		public Room[] getRooms() {
			return rooms;
		}
		public void setRooms(Room[] rooms) {
			this.rooms = rooms;
		}
	
	

	
	
}
