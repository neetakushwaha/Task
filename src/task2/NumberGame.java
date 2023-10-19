package task2;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------");
		System.out.println("               Pick a number, any number...");
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		//Generate  a random number between 0 to 100
		Random rand = new Random();
		int random_number = rand.nextInt(99) + 1;
		
		// we want to read the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number between 0 and 100 (you have 5 guesses):");
		int guess;
		int numberOfTries = 1;  //this is intial count of the number of guesses.
		boolean win = false;
		
		while (win == false)
		{
			guess = sc.nextInt();   //read the input of the user to see if it matches the random
			
		if(numberOfTries < 5)
		{
			if(guess == random_number)
			{
				// if the number is guessed, the while loop is terminated
				System.out.println();
				System.out.println("You got it! It is indeed: " + random_number);
				System.out.println("It only took you "+ numberOfTries + " guess to get it right! ");
				sc.close();
				win = true;
			}
			else if(guess < random_number) {
				
				//if the guess is too low, the program should tell us
				System.out.println("You are too low!");
				System.out.println();
				System.out.println("Guess again: ");
			}
			else if(guess > random_number) {
				
				//if the guess is too high, the program should tell us
				System.out.println("You are too high!");
				System.out.println();
				System.out.println("Guess again:");
			}
			
		}
		//output the closing message and information to the user depending on if they guessed right on thier final guess.
	   else if(numberOfTries == 5)
	   {
			if(guess == random_number) 
			{
				System.out.println();
				System.out.println("You got it! It is indeed:" + random_number);
				System.out.println("It only took you "+ numberOfTries + " guess to get it right! ");
				sc.close();
				win = true;
			}
			if(guess != random_number)
			{
				System.out.println();
				System.out.println("Sorry you ran out of attempts. The correct number is: "+random_number+" Better luck next time!");
				sc.close();
				break;
			}
		}
			
			numberOfTries = numberOfTries + 1;
	}

}
} 