package javab8.com.day5;

import java.util.Iterator;

public class LoopCondition3 {

	public static void main(String[] args) {

		int resultTrue = 0;

		for (int iterasi = 1; iterasi < 10; iterasi++) {
			if (iterasi % 2 == 0) {
				if (iterasi % 4 == 0) {
					System.out.println("Ini iterasi ke "+iterasi);
					resultTrue++;					
					System.out.println("True : "+ resultTrue);
				}else {
					System.out.println("Kondisi ke 2 False");
				}
				
			} else {
				System.out.println("Kondisi False");
			}
		}

			

	}

}
