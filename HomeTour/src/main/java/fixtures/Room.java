package fixtures;

public class Room extends Fixture{
//index 0 for north 1 for west 2 for south 3 for east.
	//instantiate a room with name exits and with 4 spaces to put directions
	private Room[] exits = new Room[4];
	private Fixture[] stuff = new Fixture[2];
	public Room() {
		
	}
	public void setStuff(Fixture[] fixture) {
		this.stuff = fixture;
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
	//Im trying to figure out how to make sure exits.length is what it should be
	
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
		//currently exits.length is1.
		
		if(exits[exitChoice] == null || exitChoice > exits.length) {
			System.out.println("Please change your option nothing exists there");
			return this;
		}
		 
		return exits[exitChoice];
	}
	
}

