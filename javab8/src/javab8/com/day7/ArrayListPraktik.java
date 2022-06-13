package javab8.com.day7;

import java.util.ArrayList;

public class ArrayListPraktik {

	public static void main(String[] args) {
		// instance
		ArrayList<String> namaMahasiswa = new ArrayList<String>();
		
		namaMahasiswa.add("Sujiwo"); // menambahkan data ke dalam object arrayList
		namaMahasiswa.add("Sujiwo2");
		namaMahasiswa.add("Sujiwo3");
		
		for (int i = 0; i < namaMahasiswa.size(); i++) {
			System.out.println(namaMahasiswa.get(i)+" ");
		}
		
		System.out.println();
		
		namaMahasiswa.remove(1);
		for (int i = 0; i < namaMahasiswa.size(); i++) {
			System.out.println(namaMahasiswa.get(i)+" ");
		}
		
		System.out.println();
		
		namaMahasiswa.add(1, "SujiwoBaru");
		for (int i = 0; i < namaMahasiswa.size(); i++) {
			System.out.println(namaMahasiswa.get(i)+" ");
		}
		
		
	}
}
