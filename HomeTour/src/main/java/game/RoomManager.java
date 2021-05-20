package game;

import java.util.List;
import java.util.ArrayList;

import fixtures.Room;

public class RoomManager {

	private ArrayList<Room> house;
	List<String> directions = new ArrayList<String>();
	
	public RoomManager() {
		directions.add("North");
		directions.add("West");
		directions.add("South");
		directions.add("East");
		this.house = new ArrayList<Room>();
		// n w s e is order of directions
		//-1 means that direciton is not valid
		house.add(new Room("Foyer","A beautiful foyer with lovely paintings",1,-1,-1,-1));
		house.add(new Room("Kitchen","A place to eat",-1,-1,1,1));
		house.add(new Room("Tv Room","A room to veg out",-1,1,1,-1));
	}
	

	
	
}
