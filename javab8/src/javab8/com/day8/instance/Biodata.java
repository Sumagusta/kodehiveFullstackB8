package javab8.com.day8.instance;

public class Biodata {
	
	String nama;
	int nilai;
	
	public void printBio() {
		System.out.println("Nama : "+nama+"\nNilai: "+nilai);		
	}

	public static void main(String[] args) {
		
		Biodata bio = new Biodata();
		bio.nama = "Rizal Setyawan";
		bio.nilai = 85;
		
		bio.printBio();
		
	}

}
