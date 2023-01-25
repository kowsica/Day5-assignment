package assignment_day5;
import java.util.*;

public class Alphebet {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter a alphebet in Capital or small:");
		 char ch = sc.next().charAt(0);
		 if(ch == 'a'||ch == 'e' || ch== 'i'|| ch == 'o' || ch == 'u'|| ch=='A' || ch =='E'|| ch == 'I'|| ch=='O'|| ch=='U')
		 {
			 System.out.println("The entered value is a vowel");
		 }
		 else if (ch>='a' && ch<='z'|| ch>='A' && ch<='Z'){
			 
			 
			 System.out.println("The entered value is a consonant");
			 
		 }
		 else {
			 System.out.println("The enteed value is not a alphebet");
		 }

	}

}
