package PROGRAMS;

import java.util.Scanner;

public class PROGRAM4 {
	
	public static void main(String[] args) {
		
		int min = 0;
		int max = 2;
		String bot = "";
		String user_choice = "";
		String result = "";
		
		while(true) {
		     int number = (int)Math.floor(Math.random()*(max - min+1) + min);
		     
		     Scanner input = new Scanner(System.in);
		     System.out.println("Enter 0 for scissor 1 for rock and 2 for paper and 3 to exit");
		     
		     int user = input.nextInt();
		     
		     if(user==number) {
		    	 System.out.println(user);
		    	 if(user==0) {
		    		 user_choice = "scissor";
		    		 System.out.println("scissor");
		    	 }else if(user==1){
		    		 user_choice = "rock";
		    		 System.out.println("rock");
		    	 }else if(user==2){
		    		 user_choice = "paper";
		    		 System.out.println("paper");
		    	 }
		    	 if(number==0) {
			    	 bot = "scissor";
			     }
			     else if(number == 1) {
			    	 bot = "rock";
			     }
			     else if (number == 2) {
			    	 bot = "paper";
			     }
		    	 System.out.println(" user choose " + user_choice + " computer choose " + bot);
		    	 System.out.println("Its a draw!!!");
		     }
		     
		     else {
		    	 if ( user==1 && number==0) {
		    		 result="The computer is scissor and you are rock, You Won!!!!";
		    		 System.out.println(result);
		    	 }else if(user==2 && number==1) {
		    		 result="The computer is rock and you are paper, You Won!!!!";
		    		 System.out.println(result);
		    	 }else if(user==0 && number==2) {
		    		 result="The computer is paper and you are scissor, Computer Won!!!!";
		    		 System.out.println(result);
		    	 }else if(number==1 && user==0) {
		    		 result="The computer is rock and you are scissor, Computer Won!!!!";
		    		 System.out.println(result);
		    	 }else if (number==2 && user==1) {
		    		 result="The computer is paper and you are rock, Computer Won!!!!";
		    		 System.out.println(result);
		    	 }else if(number==0 && user==2) {
		    		 result="The computer is scissor and you are paper, Computer Won!!!!";
		    		 System.out.println(result);
		    	 }
		     }if(user==3) {
		    	 break;
		     }
		
		}
	}

}
