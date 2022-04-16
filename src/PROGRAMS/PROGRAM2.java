package PROGRAMS;

import java.util.Arrays;
import java.util.Scanner;


public class PROGRAM2 {
	
	public static void main(String[] args) {
		
		
		int set1[][] = 
				{
					{1,3,5,7},
					{9,11,13,15},
					{17,19,21,23},
					{25,27,29,31}	
				};
	
		int set2[][]= 
			{
					{2,3,6,7},
					{10,11,14,15},
					{18,19,22,23},
					{26,27,30,31}
			};
		
		int set3[][] = {
				{4,5,6,7},
				{12,13,14,15},
				{20,21,22,23},
				{28,29,30,31}
		};
		
		int set4[][] = {
				{8,9,10,11},
				{12,13,14,15},
				{24,25,26,27},
				{28,29,30,31}
		};
		
		int set5[][] = {
				{16,17,18,19},
				{20,21,22,23},
				{24,25,26,27},
				{28,2930,31}
		};
		
		int day = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Is your birthday is set 1?\n");
		
		for (int i=0; i<set1.length; i++) {
			for(int j=0; j<set1[i].length; j++) {
				System.out.print(" " + set1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nEnter 0 for No and 1 for Yes: ");
		int answer = input.nextInt();
		
		if(answer==1) {
			day +=1;
		}
		
		System.out.println("Is your birthday is set 2?\n");
		for (int i=0; i<set2.length; i++) {
			for(int j=0; j<set2[i].length; j++) {
				System.out.print(" " + set2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if(answer==1) {
			day +=2;
		}
		
		System.out.println("Is your birthday is set 3?\n");
		for (int i=0; i<set3.length; i++) {
			for(int j=0; j<set3[i].length; j++) {
				System.out.print(" " + set3[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if(answer==1) {
			day +=4;
		}
		
		System.out.println("Is your birthday is set 4?\n");
		for (int i=0; i<set4.length; i++) {
			for(int j=0; j<set4[i].length; j++) {
				System.out.print(" " + set4[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if(answer==1) {
			day +=8;
		}
		
		System.out.println("Is your birthday is set 5?\n");
		for (int i=0; i<set5.length; i++) {
			for(int j=0; j<set5[i].length; j++) {
				System.out.print(" " + set5[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if(answer==1) {
			day +=2;
		}
		
		System.out.println("\nYour birthday is " + day + "!");
		
		
	}


}
