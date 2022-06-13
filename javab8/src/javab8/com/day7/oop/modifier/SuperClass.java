package javab8.com.day7.oop.modifier;

public class SuperClass {
	
	public void biodata() {
		System.out.println("Bahrul");
		System.out.println("Jln. Semangka No. 5");
	}
	
	protected void salary() {
		System.out.println("Rp. "+20000000);
	}
	
	private void security() {
		System.out.println("Password HP : xYZ890");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sc = new SuperClass();
		sc.security();
	}

}
