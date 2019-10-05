import java.util.Scanner;

public class main {

	static Scanner b = new Scanner(System.in);
	
	public static void main(String[] args) {
				
//		System.out.print("Kérek egy számot: ");
//		int a = b.nextInt();
//		System.out.println("Ezt a számot adtad meg: "+a);
				
//		System.out.print("Kérek egy szöveget: ");
//		String c = b.nextLine();
//		System.out.println("Ezt a szöveget adtad meg: "+c);
		
		try {
			System.out.print("Kérek egy számot: ");
			int szam = b.nextInt();
			float eredmeny = (float) 1 / szam;
			System.out.print("A szám recipoka: "+eredmeny);			
		} catch (Exception e) {
			System.err.println("Hibas szamformatum");
		}
		
	}

}
