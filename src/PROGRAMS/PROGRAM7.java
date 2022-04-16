package PROGRAMS;

public class PROGRAM7 {
	
	public static void main(String[] args) {
    	
		double n = 50000;
		
		//Loop from Left to right..
		double LTR = 0;
		for(double i=1; i<=n; i++) {
			LTR = LTR + 1.0/i;
		}
		
		//Loop from right to left..
		double RTL = 0;
		for(double i=n; i>=1; i--) {
			RTL = RTL +1.0/i;
		}
		
		//Printing summation series of right to left and left to right..
		System.out.println("Summation of series from Left to right: " + LTR);
		System.out.println("Summation of series from Right to Left: " + RTL);
}


}
