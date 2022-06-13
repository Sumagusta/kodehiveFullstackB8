package javab8.com.day13.taskArray;

public class Array1 {
	
	public static void arr2d(int dimensi) {
		
		int [][] data = new int[dimensi][dimensi];
		
		for (int i = 0; i < dimensi; i++) {
			for (int j = 0; j < dimensi; j++) {
				 System.out.printf("%3s",data[i][j]=dimensi);
			}
			System.out.println();
		}		
	}

	public static void main(String[] args) {

		arr2d(6);

	}

}
