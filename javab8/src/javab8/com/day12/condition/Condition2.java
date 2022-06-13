package javab8.com.day12.condition;

public class Condition2 {
	
	public static void answer(int loop) {
		
		String text = "";
		
		if (loop % 2 == 0) {
			if (loop > 10) {
				text = "GENAP";
			} else {
				text = "genap";
			}
		} else {
			if (loop > 10) {
				text = "GANJIL";
			} else {
				text = "ganjil";
			}
		}
		
		for (int i = 1; i <= loop; i++) {
			
			if (i % 5 == 0) {
				System.out.println(i+" "+text+"!");				
			} else {
				System.out.println(i+" "+text);		
			}
		}
	}

	public static void main(String[] args) {

		answer(20);
		
	}

}
