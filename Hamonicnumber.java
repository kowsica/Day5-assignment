package assignment_day5;
import java.util.*;

public class Hamonicnumber {

	public static void main(String[] args) {
		double result = 0, a = 0;
		int n;
		Scanner u = new Scanner(System.in);

	
		System.out.print("enter the harmonic you want to find: ");
		n = u.nextInt();

	
		for (int j = 1; j <= n; j++) {
			a = a + (1 / j);
			result = a;
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);

	}


		
	

	}


