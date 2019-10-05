import java.util.Scanner;

public class Main {

	static Scanner be = new Scanner(System.in);

	public static void main(String[] args) {

		int[] tomb = new int[3];
		System.out.println("Adj meg három számot: ");
		for (int i = 0; i < tomb.length; i++) {
			System.out.print(i + 1 + ". szam: ");
			tomb[i] = be.nextInt();
		}

		int max = 0;
		int oszthato = 0;
		for (int i : tomb) {
			if (i > max) {
				max = i;
			}
			if (i % 3 == 0) {
				oszthato++;
			}

		}

		System.out.println("A legnagyobb megadott szám: " + max);

		if (oszthato == 3) {
			System.out.println("Mind a három szám osztható hárommal");
		} else {
			System.out.println("Nem mind a három szám osztható hárommal");
		}

	}

}
