package javab8.com.day11.polymorphism.overloading;

import java.util.ArrayList;
import java.util.List;

public class Overloading {
	
	public void perkalian(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	
	public void perkalian(int a, int b, int c) {
		int result = a * b * c;
		System.out.println(result);
	}
	
	public void perkalian() {
		int result = 2*3;
		System.out.println(result);
	}
	
	public void perkalian(int a, int b, String c) {
		int result = a * b;
		System.out.println(c);
		System.out.println(result);
	}

	public static void main(String[] args) {

		Overloading ov = new Overloading();
		
		ov.perkalian(2, 5, "Output");
		ov.perkalian(5, 5);
		
		List<Integer> db = new ArrayList<Integer>();
		db.add(1, 90);
		db.add(80);

	}

}
