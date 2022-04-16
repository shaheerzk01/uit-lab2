package PRACTICE;

import java.util.Scanner;

public class PRACTICE8 {
	
public static void main(String[] args) {
		
		// Generate a random number to be guessed
		double number = (Math.random());
		System.out.println(number);
		int number2 = (int) (number *101);
		System.out.println(number2);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 1 to 100");
		
		int guess = -1;
		while(guess!=number2) {
			// Prompt the user to guess the number
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			if(guess == number2) {
				System.out.println("Yes, the number is " + number2);
			}else if(guess > number2) {
				System.out.println("Your guess is too high");
			}else {
				System.out.println("Your guess is too low");
			}
			// End of loop
		}

	}

}
