package javab8.com.day12.genericclass;

public class CallGeneric {

	public static void main(String[] args) {

		GenericClass<Integer> objInt = new GenericClass<Integer>(20);
		System.out.println(objInt.get());
		
		GenericClass<String> objString = new GenericClass<String>("Dua Puluh");
		System.out.println(objString.get());

	}

}
