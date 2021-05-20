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
		//directions want to be able to add null values n w s e is order of directions
		house.add(new Room("Foyer","A beautiful foyer with lovely paintings",1,null,null,null));
		house.add(new Room("Kitchen","A place to eat",null,null,1,1));
		house.add(new Room("Tv Room","A room to veg out",null,1,1,null));
	}
	

	
	
}
