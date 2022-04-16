package PRACTICE;

public class PRACTICE11 {
	
public static void main(String[] args) {
		
		// Display the table heading
		System.out.println(" Multiplication Table");
		
		// Display the number title
		System.out.print(" ");
		for(int j=1; j<=9; j++) {
			System.out.print(" " + j);
			System.out.print(" | ");
			for(int i=1;i<=9;i++) {
				// Display the product and align properly
				System.out.printf("%4d", j * i);
			}
			System.out.println("\n-------------------------------------------------");
			System.out.println();
		}

	}

}
