package assignment_day5;
import java.util.*;

public class Power_Of_2 {

	public static void main(String[] args) {
		int n,a = 1;
		n=Integer.parseInt(args[0]);
		if(n>31) {
			System.out.println("The number must be lessser than 31");
			return;
		}
		else
		{
			System.out.println(a);
			for(int j=1;j<=n;j++) {
				a=a*2;
				System.out.println(a);
				
			}
		}
		
		
		

	}

}
