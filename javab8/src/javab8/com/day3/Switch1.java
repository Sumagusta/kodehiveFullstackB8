package javab8.com.day3;

public class Switch1 {

	public static void main(String[] args) {

		int pilihan = 2;
		int additionalCapcay = 1;
		
		switch (pilihan) {
		case 1:
			System.out.println("Capcay");
			
			switch (additionalCapcay) {
			case 1:
				System.out.println("Tambah kuahnya");				
				break;
			case 2:
				System.out.println("Tambah sambal");
				break;
			default:
				System.out.println("Tidak ada penambahan");
				break;
			}
				
			break;
		case 2:
			System.out.println("Nasi Padang");
			for (int i = 0; i < 5; i++) {
				switch (i) {
				case 1:
					System.out.println("Tambah Paha Ayam Bakar");
					break;
				case 2:
					System.out.println("Tambah Dada Ayam Bakar");
					break;
				case 3:
					System.out.println("Tambah Ceker Ayam Bakar");
					break;

				default:
					System.out.println("Tidak Nambah");
					break;
				}
			}
			break;
		case 3:
			System.out.println("Boba");
			break;
		default:
			System.out.println("Tidak ada yang sesuai dengan pilihan");
			break;
		}

	}

}
