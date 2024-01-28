package day5_intertance;

public class SinhVien extends Nguoi {
	public String maSV;
	@Override
	public void diChoi() {
		System.out.println("SV có mã" + maSV +" học xong thì đi choi");
		
	}
	public void diThi() {
		System.out.println("SV" + getTen() + "học xong thì đi choi");
		
	}

}
