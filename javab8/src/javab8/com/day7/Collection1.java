package javab8.com.day7;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	
	public void book() {
		System.out.println("book1");
	}

	public static void main(String[] args) {
		
		Collection1 collEx = new Collection1(); 

		Collection<Integer> dataCollection = new ArrayList<Integer>();
		
		dataCollection.add(1);
		dataCollection.add(2);
		dataCollection.remove(1);
		System.out.println(dataCollection);
		
		Collection<String> dataCollectionString = new ArrayList<String>();
		
		dataCollectionString.add("Kh");
		dataCollectionString.add("Kho");
		dataCollectionString.remove("Kh");
		System.out.println(dataCollectionString);
	}

}
