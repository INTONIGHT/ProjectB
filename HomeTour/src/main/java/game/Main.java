package game;

import java.util.Scanner;

public class Main {

	//printRoom(player)
	//colelctInput()- use scanner to divide into multiple parts
	//an action target of the action
	//parse take output of collectinput
	private String collectInput() {
		Scanner userInput = new Scanner(System.in);
		String userCommand = userInput.nextLine();
		return userCommand;
	}
	private void parseInput(String userInput) {
		switch(userInput) {
		case "North":
			//change this
			System.out.println("The user goes north");
			break;
		case "South" :
			System.out.println("The user goes south");
			break;
		case "West" :
			System.out.println("Goes west");
			break;
		case "East":
			System.out.println("East");
			break;
		default :
			System.out.println("Please type in a valid input");
		}
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
}
