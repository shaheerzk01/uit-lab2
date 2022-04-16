package PROGRAMS;

public class PROGRAM3 {
	
    public static void main(String[] args) {
		
		float t,n,temp1,temp2;
		int hour,minute,seconds;
		
		for(t=0;t<23;t++) {
			n = 720 * t/11;
			n = Math.round(n*100)/100;
			hour = (int) Math.floor(n/60);
			minute = (int) (Math.floor(n) % 60);
			
			temp1 = n * 100;
			temp2 = temp1 % 100;
			seconds = (int) Math.floor((temp2 * 60) / 100);
			
			System.out.println( (t+1) + ". time overlap occurs at " + hour + ":" + minute + ":" + seconds + "");
			
			
		}

	}

}
