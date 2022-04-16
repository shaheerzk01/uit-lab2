package PROGRAMS;

import java.util.Scanner;

public class PROGRAM5 {
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		//create a scanner object for input
		System.out.print("Enter the number of rows: ");
		int rows=scan.nextInt();//reads rows from user
		int row=0;
		for(int i=rows/2; i>0; i--){    //print upper part
		    for(int j=0; j<=i; j++){
		      System.out.print(" ");//print space 
		}
		for(int j=0; j<=row; j++){
		      System.out.print(row+" ");
		}
		System.out.println();//move to next line
		row++;
		}
		for(int i=0; i<=rows/2; i++){ //print lower part
		  for(int j=0; j<=i; j++){
		      System.out.print(" "); //print space
		}
		for(int j=row; j>=0; j--){ 
		      System.out.print(row+" ");
		}
		System.out.println();//move to next line
		row--;
		        }
		    
		

	}

}
