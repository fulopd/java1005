import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner be = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.print("Adj meg egy számot ami osztható 2 -vel vagy 3 -mal: ");
			int szam = be.nextInt();
			if (szam % 2 == 0 || szam % 3 == 0) {
				System.out.println("A megadott szám osztható kettővel vagy hárommal!");
			} else {
				System.out.println("A megadott szám nem osztható kettővel vagy hárommal!");
			}

		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Egyéb hiba!");
		}

	}

}
