package javab8.com.day10.method;

public class MethodFunction {
	
	// method procedure
	public void penjumlahan() {
		int a=5, b=10;
		int result = a + b;
		System.out.println(result);
	}
	
	// method output
	public int pengurangan() {
		int a=5, b=7;
		
		int result = b - a;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodFunction mf = new MethodFunction();
		//int hasil = mf.penjumlahan()*2;
		
		int hasilOutput = mf.pengurangan()/2*3;
		
		int result = mf.pengurangan()*2/3;
		
		System.out.println(hasilOutput);
//		System.out.println();
//		System.out.println(result*2%2);
		
		
		// Buatlah method output dengan nama methodnya perkalian (a * b)
		// Kemudian panggil method output tersebut dan terapkan dalam aritmatika berikut :
		// methodOutput / 2
		// cetak, berapa hasil nya ?
		
	}

}
