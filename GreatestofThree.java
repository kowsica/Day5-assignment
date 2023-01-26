package assignment_day5;
import java.util.*;

public class GreatestofThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		System.out.println("Enter 3 different numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		int temp,greatest;
		temp  =x>y?x:y;
		greatest=z>temp?z:temp;
		System.out.println("The greatest number is:" +greatest);
		
	}

}
