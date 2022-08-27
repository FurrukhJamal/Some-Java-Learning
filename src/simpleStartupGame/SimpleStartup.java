package simpleStartupGame;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SimpleStartup {
	private int[] locationCells;
	private int numberOfHits = 0;
	private Set<Integer> usedGuesses = new HashSet<>();
	
	public SimpleStartup(int [] location) {
		this.locationCells = location;
	}
	
	public void setLocationCells(int [] loc)
	{
		this.locationCells = loc;
	}
	
	public int [] getLocations() {
		return this.locationCells;
	}
 	
	
	public int getNumberOfHits()
	{
		return this.numberOfHits;
	}
	
	private void incrementNumberOfHits() {
		this.numberOfHits++;
	}
	
	/**param : an int value of user's guess
	 * @return : a String valued "Miss", "Hit" or "Kill" based on if the guess is in the locationCell and if it was the last one*/
	public String checkYourself(int UserGuess) {
		for(int val : this.locationCells)
		{
			if(val == UserGuess)
			{
				
				
				if(this.numberOfHits == 2 && !this.usedGuesses.contains(val))
				{
					this.incrementNumberOfHits();
					return "Kill";
				}
				else if(this.numberOfHits < this.locationCells.length  && !this.usedGuesses.contains(val))
				{
					this.usedGuesses.add(val);
					this.incrementNumberOfHits();
					return "Hit";
					
				}
			}
			
		}
		return "Miss";
	}
	
	public static void main(String [] args) {
		int [] test = {1 , 2 , 3};
		System.out.println("array : " +test[0]);
		
		
	}

}
