package javab8.com.day10.method;

public class Static1 {

	// suatu tipe method yang tidak memerlukan instance
	// jika dipanggil di method yang bertipe static juga

	// Static hanya menggunakan 1 memory

	static int harga; // global var

	static class Main {
		public static void main(String[] args) {

			Static1 st = new Static1();
			Static1 st2 = new Static1();

			st.harga = 90000;
			st2.harga = 99000;
			
			harga = 75000;
			
			Static1 st3 = new Static1();
			st3.harga = 40000;
			
			st.harga = 100;
			
			System.out.println("harga st : " + st.harga + "\nharga st2 : " + st2.harga);
			System.out.println(st3.harga);
		}
	}

}
