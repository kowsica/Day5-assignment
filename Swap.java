package assignment_day5;
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		int x,y,a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 2 numbers x and y:");
		x= s.nextInt();
		y=s.nextInt();
	    a=x;
	    x=y;
	    y=a;
	    System.out.println("The value of new x and y are:" +x + " " +y);
		
		
		

	}

}
