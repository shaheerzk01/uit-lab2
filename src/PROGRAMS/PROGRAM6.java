package PROGRAMS;

import java.util.Scanner;

public class PROGRAM6 {
	

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int number;
			
			System.out.println("Enter any integer ");
			number = input.nextInt();
			
			int i = 1;
			
			for ( int j=1; j<number; j++) {
				i = i*(j+1);
			}
			System.out.println(i);
			

		}


}
