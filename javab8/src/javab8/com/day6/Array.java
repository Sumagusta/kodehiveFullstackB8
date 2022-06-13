package javab8.com.day6;

public class Array {

	public static void main(String[] args) {
						//index :	//0		//1		//2
		String[] namaMahasiswa = {"Sulis", "Denok", "Sutejo", "Dora", "jackob"};
		
		namaMahasiswa[0] = "Sulistiana";
		
		for (int i = 0; i < namaMahasiswa.length; i++) {
			System.out.println(namaMahasiswa[i]);
		}
		
		double[] ipk = {2.4, 3.5, 3.2, 3.6, 4};
		System.out.println();
		
		for (int i = 0; i < ipk.length; i++) {
			System.out.println(namaMahasiswa[i]+", ipk = "+ ipk[i]);
		}
		
		double resultPerkalian= ipk[2]*ipk[4]; 
		
		System.out.println(resultPerkalian);
		
		// Denok, ipk = 3.5
		
	}
}
