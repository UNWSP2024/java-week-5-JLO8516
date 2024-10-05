package week5;

import java.util.Scanner;

public class Dice {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		String x;
		int a, b;

		System.out.println("Would you like to roll 2 dice? Yes/No --> ");
		x = userinput.nextLine();

		while (x.equals("Yes")) {
			a = ((int) (Math.random() * 6 + 1));
			b = ((int) (Math.random() * 6 + 1));

			System.out.println("You rolled " + a + " and " + b);
			System.out.println("Total: " + (a + b));

			System.out.println("Would you like to roll 2 dice? Yes/No --> ");
			x = userinput.nextLine();
		}

	}

}
