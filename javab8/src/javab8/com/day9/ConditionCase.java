package javab8.com.day9;

public class ConditionCase {

	public static void main(String[] args) {

		// switch case / if else
		// switch-case lebih cepat dari kondisi if-else
		
		int warisan = 3;
		
		switch (warisan) {
		case 1:
			System.out.println("Emas 15gr");
			break;
		case 2:
			System.out.println("Perak 25gr");
			break;
		case 3:
			System.out.println("Motor");
			break;
		case 4:
			System.out.println("Sepeda");
			break;
		case 5:
			System.out.println("Rumah");
			break;

		default:
			System.out.println("Tidak dapat warisan");
			break;
		}

	}

}
