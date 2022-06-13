package javab8.com.day6;

public class ArrayKonversi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] numb = new String[2];
		numb[0] = "200"; // -> int
		numb[1] = "300"; // -> double
		
		char[] data;
		
		System.out.println(Integer.valueOf(numb[0]));
		System.out.println(Double.valueOf(numb[1]));
		
		String panjang = numb[1];
		for (int i = 0; i < panjang.length(); i++) {
			
			System.out.print(Character.valueOf(numb[1].charAt(i))+" ");			
		}
		
		System.out.println("\n------------------------------");
		
		// data array assigment to array
		
		String[] tampunganArray = new String[2];
		tampunganArray[0] = numb[0];
		tampunganArray[1] = numb[1];
		
		int[] dataArrayInt;
		double[] dataArrayDouble;
		
		for (int i = 0; i < tampunganArray.length; i++) {
			System.out.println(tampunganArray[i]);
		}
	}

}
