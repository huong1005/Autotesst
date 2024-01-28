package day5_intertance;

public class GiaoVien extends Nguoi {
	public String maGV;
	@Override
	public void diChoi() {
		System.out.println("GV" + getTen()+" đi choi vao cuoi tuan");
		
	}
	public void diDay() {
		System.out.println("GV " + maGV + "di day auto vào t5 và chu nhat");
	}

}
