package week5;

import java.util.Scanner;

public class AdditionTable {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {

		int row, col, answer, bound;

		System.out.println("Enter a number 3-20 --> ");
		bound = userinput.nextInt();

		for (row = 0; row <= bound; row++) {
			for (col = 0; col <= bound; col++) {
				answer = row + col;
				System.out.format("%2d ", answer);
			}
			System.out.println(" ");
		}

	}

}
