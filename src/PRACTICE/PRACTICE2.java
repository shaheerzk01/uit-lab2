package PRACTICE;

import java.util.Scanner;

public class PRACTICE2 {
	
public static void main(String[] args) {
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() * 7 % 10);
		
		//create Scanner
		
		Scanner input = new Scanner(System.in);
		
		//generating question
		
		System.out.println("What is " + number1 + " + " + number2 + "?");
		
		int answer = input.nextInt();
		
		//generating answer
		
		System.out.println(number1 + " + " + number2 + " is " + (number1 + number2==answer));
		
		

	}

}
