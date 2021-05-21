package game;

import java.util.List;
import java.util.ArrayList;

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
		//constructor
		public RoomManager(int numRooms) {
			rooms = new Room[numRooms];
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
				
				Room[] foyerExits = {kitchen};
				foyer.setExits(foyerExits);
				Room[] kitchenExits = {foyer,tvRoom};
				kitchen.setExits(kitchenExits);
				Room[] tvRoomExits = {kitchen,guestRoom};
		}
	
	

	
	
}
