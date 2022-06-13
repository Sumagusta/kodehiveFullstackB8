package javab8.com.day5;

public class LoopCondition2 {

	public static void main(String[] args) {

		int iterasi = 1;
		int resultTrue = 0;

		while (iterasi < 10) {

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

			iterasi++;
		}

	}

}
