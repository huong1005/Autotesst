package day5_intertance;

public abstract class Nguoi {
	private String ten;
	private String tuoi;
	
	public abstract void diChoi();

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
}
