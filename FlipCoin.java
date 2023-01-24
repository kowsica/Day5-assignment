package flipcoinn;
import java.util.*;
public class FlipCoin {
	
	
	public static void main(String[] args) {
		int a, h_count=0, t_count=0;
		double heads, tails;
		Scanner n = new Scanner(System.in);
		System.out.println("enter the number of times to flip a coin:" );
		a = n.nextInt();
		for (int j = 0; j < a; j++) {
			double random = Math.random();
			if (random < 0.5)
				t_count++;
			else
				h_count++;
		}
		heads = h_count / (double) a * 100;
		tails = t_count/ (double) a * 100;
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");

	}
}

