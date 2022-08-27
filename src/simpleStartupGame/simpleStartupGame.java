package simpleStartupGame;

import java.util.Scanner;

public class simpleStartupGame {
	
	public static int getUserInput(String prompt) {
		System.out.print(prompt + ": ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
		
	}
	
	public static void main(String [] args) {
		int numGuess = 0;
		
		
		
		int randomNum = (int) (Math.random() * 5);
		
		SimpleStartup startup = new SimpleStartup(new int []{randomNum, randomNum + 1, randomNum +2});
		
		while(startup.getNumberOfHits() != 3)
		{
			numGuess++;
			int guess = getUserInput("Enter a number");
			String result = startup.checkYourself(guess);
			System.out.println(result + "\n");
			
				
		}
		
		System.out.println("You took " +numGuess+ " guesses.\n");
		
		
	}
}
