package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
//making it static to access in main method
	private static RoomManager roomManager = new RoomManager(4);
	private static boolean gameRunning = true;

	
	public static void main(String[] args) {
		roomManager.init();
		
		Player tyler = new Player();
		System.out.println("Welcome to my room manager program where you"
				+"\n can traverse a house"
				+"\n Please type your directions carefully"
				+ "\n Type Quit to leave");
		tyler.setCurrentRoom(roomManager.getStartingRoom());
		while(gameRunning) {
			roomDesc(tyler);
			String[] userChoice = userInput();
			parse(userChoice,tyler);
		}
		if(!gameRunning) {
			System.out.println("Have a good day");
			
		}
	}
	private static void roomDesc(Player tyler) {
		System.out.println("The current room is: " 
				+ tyler.getCurrentRoom().getName() 
				+"The short description is: "				
				+ tyler.getCurrentRoom().getShortDescription()
				+"The long description is: "
				+ tyler.getCurrentRoom().getLongDescription());
	}
	private static String[] userInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] choice = input.split(" ");
		return choice;
	}
	private static void parse(String[] choice,Player tyler) {
	
		String userChoice = choice[0].toString();
		String direction = null;	
		direction = userChoice;
		
		if(userChoice == "Quit") {
			gameRunning = false;
		} else {
			System.out.println("You are attempting to move in the "
					+ direction + " Direction");
			Room attemptMove = tyler.getCurrentRoom().findExit(direction);
			
			tyler.setCurrentRoom(attemptMove);
		}
		
	}
	
}
