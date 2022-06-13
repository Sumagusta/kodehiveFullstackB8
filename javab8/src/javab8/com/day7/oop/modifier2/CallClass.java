package javab8.com.day7.oop.modifier2;

import javab8.com.day7.oop.modifier.SuperClass;

public class CallClass {
	
	Double o = 0.0;

	public static void main(String[] args) {
		
		CallClass cc = new CallClass();
		System.out.println(cc.o);
		
		SuperClass sc = new SuperClass();
		sc.biodata();
		
	}

}
