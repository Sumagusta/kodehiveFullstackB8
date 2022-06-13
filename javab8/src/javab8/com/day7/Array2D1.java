package javab8.com.day7;

import java.util.Iterator;

public class Array2D1 {

	public static void main(String[] args) {
		
		int baris = 7;
		int kolom = 2;
		
		String[][] absensi = new String[baris][kolom];
		// Nama - Kelas
		absensi[0][0] = "Sujiwo";
		absensi[1][0] = "Rizka";
		absensi[2][0] = "Gugun";
		absensi[3][0] = "Sinta";
		absensi[4][0] = "Reza";
		absensi[5][0] = "Reza1";
		absensi[6][0] = "Reza2";
		
		absensi[0][1] = "Kelas A";
		absensi[1][1] = "Kelas B";
		absensi[2][1] = "Kelas C";
		absensi[3][1] = "Kelas C";
		absensi[4][1] = "Kelas C";
		absensi[5][1] = "Kelas C";
		absensi[6][1] = "Kelas C";
				
		
		for (int i = 0; i < baris; i++) {
			System.out.println();
			for (int j = 0; j < kolom; j++) {
				System.out.println(absensi[i][j]);
			}
		}
	}

}
