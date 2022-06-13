package javab8.com.day11.bahasTaskLoop;

public class No1 {

	public static void main(String[] args) {
		
		int jumlahBaris = 4;
		int jumlahKolom = 3;
		 int value = jumlahBaris * jumlahKolom;
		    for(int i = 0; i < jumlahBaris; i++){
		    	
		        for(int j = 0; j < jumlahKolom; j++){
		            //System.out.print(value+" ");
		            System.out.print(value-=1);
		        }
		        
		        System.out.println();
		    }


	}

}
