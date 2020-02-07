package com.qa.swamp_world;

public class TheHero {
/**
 * 	This is public class TheHero, it is the representation of the player. They have a name (which you enter yourself)
 * 	and two coordinates: playerLocationX and playerLocationY. 
 */
	private String name;
	public int playerLocationY = 0;
	public int playerLocationX = 0;
	 
	/*
	 * Constructor - used when the player enter's the hero's name in the first scanner.
	 */
	
	public TheHero(String name, int playerLocationX, int playerLocationY) {
		
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayerLocationY(int i) {
		return playerLocationY;
	}

	public void setPlayerLocationY(int playerLocationY) {
		this.playerLocationY = playerLocationY;
	}

	public int getPlayerLocationX(int i) {
		return playerLocationX;
	}

	public void setPlayerLocationX(int playerLocationX) {
		this.playerLocationX = playerLocationX;
	}

	/*
	 * These are the processes that change the player's X and Y location along with the compass and a method that activates 
	 * when the player reaches the goal coordinates.
	 */
	public void moveNorth() {
		this.playerLocationY += 1;
		System.out.println("You trudge north, the mud is sticking to your boots...gross.");
	}

	public void moveSouth() {
		// TODO Auto-generated method stub
		this.playerLocationY -= 1;
		System.out.println("Going south you try and recollect your past...nothing comes to mind.");
	}

	public void moveEast() {
		// TODO Auto-generated method stub
		this.playerLocationX += 1;
		System.out.println("You move east, the smell of the swamp fills your nose - hopefully you'll get used to it.");
	}

	public void moveWest() {
		// TODO Auto-generated method stub
		this.playerLocationX -= 1;
		System.out.println("You slowly make your way west, you humm a tune to pass the time.");
	}

	public void compass() {
		System.out.println("The hero's position X is currenctly " + this.playerLocationX);
		System.out.println("The hero's position Y is currenctly " + this.playerLocationY);
		System.out.println("Compass is pointing you towards the location 5,3.");
	}

	public void winGame() {
		System.out.println("In the swamp you find a golden door, the aura of this door is quite plesent. You step through the door and escape the swamp. Well Done!!!");
	}

}


	 
		
		
