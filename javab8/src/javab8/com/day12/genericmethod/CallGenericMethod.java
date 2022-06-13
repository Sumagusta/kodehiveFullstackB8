package javab8.com.day12.genericmethod;

public class CallGenericMethod {

	public static void main(String[] args) {
		
		GenericMethod<Integer> me = new GenericMethod<Integer>();
		me.set(900);
		
		System.out.println(me.get());
	}

}
