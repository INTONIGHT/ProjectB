package fixtures;

public class Room extends Fixture{
//index 0 for north 1 for west 2 for south 3 for east.
	Room[] exits;
	public Room(String name, String shortDescription,String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[3];
	}
	public Room[] getExits() {
		
	}
	public Room getExit(String direction) {
		
	}
	
}
