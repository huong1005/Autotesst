package day5_intertance;

public class Application {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		sv1.setTen("Huong");
		sv1.maSV = "01";
		sv1.diChoi();
		sv1.diThi();
		
		SinhVien sv2 = new SinhVien();
		sv2.setTen("Huong");
		sv2.maSV = "02";
		sv2.diChoi();
		sv2.diThi();
		
		GiaoVien gv1= new GiaoVien();
		gv1.maGV = "01";
		gv1.setTen("Giao vien A");
		gv1.diChoi();
		gv1.diDay();

	}

}
