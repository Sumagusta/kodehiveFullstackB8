package javab8.com.day5;

public class LoopCondition1 {

	public static void main(String[] args) {

		int iterasi = 0;
		
		while (iterasi < 5) {
			
			if (iterasi % 2 != 1) {
				System.out.println("Ini iterasi ketiga");
			} else {
				System.out.println("Bukan iterasi ketiga");
			}
			
			iterasi++;
		}

	}

}
