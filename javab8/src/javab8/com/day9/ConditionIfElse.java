package javab8.com.day9;

public class ConditionIfElse {

	public static void main(String[] args) {
		
		// == > < != <= >=

		int experience = 3;
			
			// expression.condition
		if (experience < 2) {
			System.out.println("Salary : Rp. "+5500000);
		} else if (experience > 2) { // else-if digunakan untuk membuat alternatif pilihan lain lain jika kondisi dalam expression sebelumnya salah
			System.out.println("Salary : Rp. "+7600000);
		} else {
			System.out.println("< 1 thn");
		}
		System.out.println();
		
		// kasus 1
		// Jika nilai roman diatas 80, ia akan dapat hadiah motor
		// Jika nilai diatas 80 dan sama dengan 100 dapat mobil
		// Jika nilai dibawah 70 dan diatas 40 ia dapat baju baru 
		// Namun jika dibawah itu ia tidak akan dapat hadiah
		// ---------------------------------
		
		// kasus 2
		// pasar
		// Jika harga daging dibawah 10000 per kilo atau 15000 per kilonya, 
			//cetak murah
		// Jika harga daging diatas 60000 atau 70000 per kilonya, cetak mahal
		 		
	}
}
