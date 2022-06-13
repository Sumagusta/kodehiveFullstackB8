package javab8.com.day4.console;

import java.util.Scanner;

public class ConsoleApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PENDAFTARAN KODEHIVE ACADEMY");
		
		System.out.print("Masukkan Nama 	: ");
		String nama = scan.nextLine(); // baca inputan string yang support dengan space
		
		System.out.println("Masukkan Alamat : ");
		String alamat = scan.nextLine();
		
		System.out.print("Masukkan Usia 	: ");
		int usia = scan.nextInt(); // baca inputan int/angka
		
		System.out.println("OUTPUT");
		
		System.out.println("Nama 	: ");
		System.out.println("Alamat 	: ");
		System.out.println("Usia 	: ");
	}

}
