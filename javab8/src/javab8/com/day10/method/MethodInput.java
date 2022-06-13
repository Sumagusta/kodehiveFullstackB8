package javab8.com.day10.method;

public class MethodInput {
	
	public static void perkalian(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}

	public static void perkalian(int a, int b, String ucapan) {
		int result = a * b;
		System.out.println(ucapan);
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		perkalian(5, 2);
		
		perkalian(2, 10, "Hasil perkalian");
		
	}

}
