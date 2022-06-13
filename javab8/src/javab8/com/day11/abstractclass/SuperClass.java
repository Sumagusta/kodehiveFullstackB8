package javab8.com.day11.abstractclass;

public abstract class SuperClass {

	// bisa mendeklarasikan abstract method maupun concrete method
	
	public int rumus1(int a, int b) {
		int result = (a * b)/2;
		return result;
	}
	
	public abstract int rumus2();
	
}
