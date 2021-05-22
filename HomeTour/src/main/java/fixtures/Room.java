package fixtures;

public class Room extends Fixture{
//index 0 for north 1 for west 2 for south 3 for east.
	//instantiate a room with name exits and with 4 spaces to put directions
	private Room[] exits = new Room[4];
	public Room() {
		
	}
	public Room(String roomName, String shortDesciption, String longDescription) {
		super(roomName, shortDesciption, longDescription);
	}
	public Room[] getExits() {
		return exits;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	public void setExits(Room exit, int exitChoice) {
		this.exits[exitChoice] = exit;
	}
	//try to refactor here.
	//my order is north west south east
	
	public Room findExit(String userChoice) {
		int exitChoice = 0;
		switch(userChoice) {
		case "North":
			exitChoice = 0;
			break;
		case "West":
			exitChoice = 1;
			break;
		case "South":
			exitChoice = 2;
			break;
		case "East":
			exitChoice = 3;
			break;
		default :
			System.out.println("PLease type a valid option carefully");
		}
	
		if(exits[exitChoice] == null || exitChoice >= exits.length) {
			System.out.println("Please change your option nothing exists there");
			return this;
		}
		 
		return exits[exitChoice];
	}
	
}

