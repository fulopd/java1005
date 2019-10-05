import java.util.Scanner;

public class Main {

	static Scanner be = new Scanner(System.in);
	
	public static void main(String[] args) {

		int szam = 0;
		int szamlalo =0;

		while(szam != 11) {
			
			System.out.print("Adj meg egy számot: ");
			
			try {
				szam = be.nextInt();
				szamlalo++;
				
			} catch (Exception e) {
				System.err.println("Nem számot adtál meg!");
			}
			
			
		}
		
		System.out.println("Siker: " + szamlalo);

	}

}
