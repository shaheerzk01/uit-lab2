package PROGRAMS;

import java.util.ArrayList;
import java.util.List;
public class PROGRAM1 {
	
	public static void main(String[] args) {
		
		List<String> obj  = new ArrayList<>();
		
		obj.add("Saturday");
		obj.add("Sunday");
		obj.add("Monday");
		obj.add("Tuesday");
		obj.add("Wednesday");
		obj.add("Thursday");
		obj.add("Friday");
		
		System.out.println(obj);
		
		int elapsed = 10;
		String today = obj.get(0);
		
		int sum;
		
		sum = elapsed + 1;
		
		int future = sum%7;
		
		System.out.println("Today is " + obj.get(0));
		System.out.println("Future day is " + obj.get(future));
		
		
		
		
		

	}


}
