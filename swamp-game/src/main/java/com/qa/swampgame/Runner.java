package com.qa.swampgame;

import com.qa.swamp_world.TheHero;

public class Runner {

	/*
	 * This is the main, it has opening text and a scanner that prompts theHero constructor. The player starts with an X and Y
	 * coordinate of 2,2 - i figured that since we cannot go below 0, the middle of a 5 x 5 grid would be 2,2.
	 */
	public static void main(String[] args) {

		System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n"
				+ "Some black plants barely poke out of the shallow water. \r\n"
				+ "You reach into the back of your mind and try to remember your name... ENTER NAME:");
		String name = Utils.scanner1.nextLine();
		TheHero hero1 = new TheHero("'" + name + "'", 2, 2);
		System.out.println("After some deliberation you realise that your name is '" + name + "'. \r\n"
				+ "In your pocket you feel a cirular object, you recognise it to be a compass. \r\n"
				+ "Follow the compass and escape the swamp.");
		
	
		/*
		 * Basic for loop acting like a menu similar to how i did a calculator once, uses scanner to ask for a prompt 
		 * like movements or compass. To trigger wingame() you have to "wait"/error prompt to reiterate the loop
		 * and get the victory message.
		 */
		for (int i = 0; i < 100; i++) {
			System.out.println("What would you like to do? Type NORTH,SOUTH,EAST or WEST to move. \r\n"
					+ "Or type COMPASS to look at the compass.");
			String action = Utils.scanner2.nextLine();
			
			if ((hero1.playerLocationX == 5) && (hero1.playerLocationY == 3)) {
				hero1.winGame();
				break;
			} else if (action.equals("NORTH")) {
				hero1.moveNorth();
			} else if (action.equals("SOUTH")) {
				hero1.moveSouth();
			} else if (action.equals("EAST")) {
				hero1.moveEast();
			} else if (action.equals("WEST")) {
				hero1.moveWest();
			} else if (action.equals("COMPASS")) {
				hero1.compass();
			} else
				System.out.println("You rest a while, it's kinda boring in the swamp.");
		
		
		
		}
	}
	

}
