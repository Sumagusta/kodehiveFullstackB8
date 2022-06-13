package javab8.com.day4.condition;

public class ElseIfNegasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int usia = 7;
		
		if (usia <= 3 && usia > 1) { // && kedua kondisi dalam satu expression harus terpenuhi
			System.out.println("Masuk Paud");
		}else if (usia >= 4 || usia != 7) { // || jika salah satu dari kondisi true, maka kondisi lain yang berada pada satu expresi tidak dihiraukan meskipun false
			System.out.println("TK");
		} else {

		}
		
	}

}
