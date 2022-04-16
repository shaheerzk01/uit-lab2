package PRACTICE;

public class PRACTICE6 {
	
	public static void main(String[] args) {
		int status = 1;
		
		String message;
		
		switch(status) {
		case 0:
			message = "compute taxes for single filers";
			System.out.println(message);
			break;
		case 1:
			message = "compute taxes for married filed jointly";
			System.out.println(message);
			break;
		case 2:
			message = "compute taxes for married filing separately";
			System.out.println(message);
			break;
		case 3:
			message = "compute taxes for head of household";
			System.out.println(message);
			break;
		default:
			System.out.println("Error: invalid status");
			System.exit(0);
		}
	}

}
