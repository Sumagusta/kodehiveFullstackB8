package javab8.com.day10.method;

import java.util.ArrayList;
import java.util.List;

public class MethodOutputMoreThan1Var {
	
	public static String[] kota() {
		
		String[] tampunganKota = new String[3];
		tampunganKota[0] = "Bekasi";
		tampunganKota[1] = "Jakarta";
		tampunganKota[2] = "Surabaya";
		
		return tampunganKota;
	}
	
	public static List<Double> Decimal() {
	
		List<Double> tampunganDecimal = new ArrayList<Double>();
		tampunganDecimal.add(20.5);
		tampunganDecimal.add(22.5);
		tampunganDecimal.add(21.5);
		tampunganDecimal.add(25.5);
		return tampunganDecimal;
		
	}
	

	public static void main(String[] args) {

		for (int i = 0; i < kota().length; i++) {
			System.out.println(kota()[i]);
		}
		System.out.println();
		for (int i = 0; i < Decimal().size(); i++) {
			System.out.println(Decimal().get(i));
		}

	}

}
