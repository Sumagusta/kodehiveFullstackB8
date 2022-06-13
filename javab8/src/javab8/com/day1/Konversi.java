package javab8.com.day1;

public class Konversi {

	public static void main(String[] args) {
		
		//format penulisan variable : type variableName = value;
		
		String data = "Selamat Malam Kodehive";		
		
		int angkaAsli = 5; // konversikan angka asli ke data decimal float/double		
		String angkaString = "900";
		
		
		
		//rumus konversi : tujuanKonversi.valueOf(dataYangInginDiKonversi)
		
		System.out.println(Integer.valueOf(angkaString) + angkaAsli);
		
	}
}
