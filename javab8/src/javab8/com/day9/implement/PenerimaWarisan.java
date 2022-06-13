package javab8.com.day9.implement;

public class PenerimaWarisan implements Warisan {

	public static void main(String[] args) {
		
		PenerimaWarisan p = new PenerimaWarisan();
		System.out.println(p.warisan1());

	}

	@Override
	public String warisan1() {
		// TODO Auto-generated method stub
		return "Emas";
	}

	@Override
	public String warisan2() {
		// TODO Auto-generated method stub
		return "rumah";
	}

	@Override
	public String warisan3() {
		// TODO Auto-generated method stub
		return "saham";
	}

	@Override
	public String warisan4() {
		// TODO Auto-generated method stub
		return "motor";
	}

	@Override
	public String warisan5() {
		// TODO Auto-generated method stub
		return "kos kos an";
	}

}
