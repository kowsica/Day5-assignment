package assignment_day5;
import java.util.*;

public class Leapyear {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		int year;
		System.out.println("Enter a year in form of xxxx:" + " ");
		year=y.nextInt();
		if(year %4 == 0  ) {
			System.out.println("The year"+" " +year +" " +"is a leap year");
		}
			else {
				System.out.println("The year"+" " +year + " " +  "is not a leap year");
			}
		}

	}


