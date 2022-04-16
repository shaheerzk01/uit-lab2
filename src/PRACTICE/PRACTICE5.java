package PRACTICE;

import java.util.Scanner;

public class PRACTICE5 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int score;
			System.out.println("Enter your score");
			score = input.nextInt();
			
			String grade;
			
			if (score >= 90.0) {
				grade = "A";
			}else if(score >= 80.0){
				grade = "B";
			}else if(score >= 70.0) {
				grade = "C";
			}else if(score >= 60.0) {
				grade = "D";
			}else {
				grade = "F";
			}
			System.out.println(grade);
			
			
			
			


		}


}
