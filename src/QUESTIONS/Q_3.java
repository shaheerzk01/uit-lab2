package QUESTIONS;

import java.util.Scanner;

public class Q_3 {
	
	public class Q3 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			double x;
			double y;
			double z;
			
			x = input.nextDouble();
			y = input.nextDouble();
			z = input.nextDouble();
			
			System.out.println("(x < y && y < z) is " + (x < y && y < z));
			System.out.println("(x < y || y < z) is " + (x < y || y< z));
			System.out.println("!(x < y) is " + !(x < y));
			System.out.println("(x + y < z) is " + (x + y < z));
			System.out.println("(x + y < z) is " + (x + y < z));
			
			

		}
	}
}
