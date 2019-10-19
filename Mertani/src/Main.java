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
		
		int counter = 0;
		int oszto = tomb[1] / tomb[0];
		
		for (int i = 0; i < tomb.length - 1; i++) {

			if (tomb[i+1] / tomb[i] == oszto) {
				counter++;
			}
		}

		if (counter == tomb.length-1) {
			System.out.println("Mertani");
		} else {
			System.out.println("NEm Mertani");
		}
		

	}

}

//1 2 4 8 16 32