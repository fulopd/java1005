
public class main {

	public static void main(String[] args) {

		int[] tomb = new int[5];
		
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = i;			
		}
		
		
		for (int i : tomb) {
			System.out.println(i);
		}
		
	}
}
