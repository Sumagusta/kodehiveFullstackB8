package javab8.com.day4.condition;

public class ConditionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bulan = "Januari";
		
		if (bulan == "januari") {
			System.out.println("Awal Bulan");
		} else {
			System.out.println("Bukan awal bulan");
		}
		System.out.println();
		
		if (bulan.toLowerCase().equals("januari")) {
			System.out.println("Awal Bulan");
		} else {
			System.out.println("Bukan awal bulan");
		}

	}

}
