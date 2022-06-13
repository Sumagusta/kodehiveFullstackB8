package javab8.com.day6;

public class ArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array size
		double[] usia = new double[5];
		usia[0] = 25;
		usia[2] = 28;
		usia[3] = 29;
		usia[4] = 22;
		
		for (int i = 0; i < usia.length; i++) {
			System.out.println(usia[i]);
		}
		
		String[] pangkat = new String[2];
		pangkat[0] = "Mayor";
		
		System.out.println();
		for (int i = 0; i < pangkat.length; i++) {
			System.out.println(pangkat[i]);
		}
		
	}

}
