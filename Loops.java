package week5;

import java.util.Scanner;

public class Loops {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {

		int i;
		for (i = 1; i < 5000; i = 2 * i + 1) {
			System.out.println("Count is: " + i);

		}

	}
}
