package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

		public static void main(String[] args) {
		//Create Random class instance
			Random random = new Random();
			int number = Math.abs(random.nextInt()%100)+1;
			
		//Input Guesses Count
			int guesses = 0;
		//Store the User Inout
			int guess;
		//Scanner Instance to Read User Input
			Scanner input = new Scanner(System.in);
			
		//Loop Until 5 Guesses are Met
			while (guesses < 5) {
				System.out.println("Pick a number between 1 and 100: ");
				guess = input.nextInt();
				
		//Validate the User Input to See if Within Range
		//If Input is Out Of Bounds, Print Message and Increase Guess Count by 1
			if (guess < 1 || guess > 100) {
				System.out.println("Your Guess is Not Between 1 and 100. Please Try Again");
				guesses++;
			}
				
		// If Input is Below Generated Number, Print Message and Increase Guess Count by 1
			else if (guess < number) {
				System.out.println("Please Pick a Higher Number");
				guesses++;
			}
			
		//If Input is Above Generated Number, Print Message and Increase Guess Count by 1
			else if (guess > number) {
				System.out.println("Please Pick a Lower Number");
				guesses++;
			}
		//If Input Matches Generated Number, Break Loop
			else {
				break;
			}
		}
			input.close();
			
		//If Guesses Count is Reached, Means Not Guessed
				if (guesses == 5) {
					System.out.println("You Lose, the Number to Guess Was " + number);
			}
				else {
					System.out.println("You Win!");
			}
		}
}
