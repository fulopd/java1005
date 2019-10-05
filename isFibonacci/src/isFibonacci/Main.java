package isFibonacci;

import java.util.Scanner;

public class Main {

	static Scanner be = new Scanner(System.in);

	public static void main(String[] args) {

		int[] tomb = new int[5];
		System.out.println("Adj meg öt számot: ");
		for (int i = 0; i < tomb.length; i++) {
			System.out.print(i + 1 + ". szam: ");
			tomb[i] = be.nextInt();
		}

		int fibo = 0;

		for (int i = 0; i < tomb.length - 2; i++) {

			if (tomb[i] + tomb[i + 1] == tomb[i + 2]) {
				fibo++;
			}
		}

		if (fibo == 3) {
			System.out.println("Fibonacci");
		} else {
			System.out.println("NEm Fibonacci");
		}

	}

}
