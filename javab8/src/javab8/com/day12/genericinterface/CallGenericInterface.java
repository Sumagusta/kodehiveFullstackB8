package javab8.com.day12.genericinterface;

public class CallGenericInterface implements GenericInterface<String> {
	
	public static void main(String[] args) {
		CallGenericInterface obj = new CallGenericInterface();
		System.out.println(obj.rumus(8, 9.5));
	}

	@Override
	public String rumus(int a, double b) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
