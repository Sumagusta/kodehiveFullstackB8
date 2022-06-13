package javab8.com.day11;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner baca = new Scanner(System.in);
		int n = baca.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=baca.nextInt();
		}
	}

}
