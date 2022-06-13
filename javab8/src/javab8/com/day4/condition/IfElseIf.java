package javab8.com.day4.condition;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kupon = 5;
		
		if (kupon <= 4) {
			System.out.println("Dapat hadiah 30%");
		}else if (kupon > 6) {
			System.out.println("Dapat Hadiah 50%");
		}else if (kupon != 11) {
			System.out.println("Masih bisa dapat hadiah");
		}else {
			System.out.println("Tidak dapat hadiah");
		} 
		
	}

}
