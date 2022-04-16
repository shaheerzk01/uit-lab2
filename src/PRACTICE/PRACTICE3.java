package PRACTICE;

import java.math.*;

public class PRACTICE3 {
	
public static void main(String[] args) {
		
		double radius = 10;
		
		double area;
		
		// checking condition.
		
		if(radius>=0) {
			area = radius*radius*Math.PI;
			System.out.println("The area of the given radius is " + area);
	
			
		}else {
			System.out.println("Negative input");
		}

	}


}
