package javab8.com.day5;

public class NestedLooping1 {

	public static void main(String[] args) {
		
		int baris = 8;
		int kolom = 5;
		
		// Buat kondisi kolom akan dicetak jika iterasi baris habis dibagi 2
		for (int i = 0; i < baris; i++) {
			System.out.println("baris ke : "+i);
			for (int j = 0; j < kolom; j++) {
				System.out.println("\tkolom ke :"+j);
			}
		}
				
		
	}

}
