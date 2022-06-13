package javab8.com.day7;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {

		List<Integer> nomor = new ArrayList<Integer>();
		
		nomor.add(1);
		nomor.add(1, 50);
		
		nomor.remove(1);
		for (int i = 0; i < nomor.size(); i++) {
			System.out.println(nomor.get(i)+" ");
		}
		
		
	}

}
