package javab8.com.day11.polymorphism.overriding;

public class SubClass extends SuperClass {
	
	public void menu() {
		System.out.println("Ayam Geprek");
	}
	
	public void ayam() {
		super.menu();
	}

	public static void main(String[] args) {

		SuperClass sp = new SubClass();
		sp.menu();
		
		SubClass sb = new SubClass();
		sb.ayam();
		sb.menu2();

	}

}
