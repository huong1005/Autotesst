package day5_tinhDienTichHinh;

public class Application {

	public static void main(String[] args) {
		HinhTron ht1 = new HinhTron();
		ht1.setTenHinh("Hình tròn nhỏ");
		ht1.banKinh = 10;
		double dientich1 = ht1.tinhDT();
		System.out.println(ht1.getTenHinh()+ "có Dt la:" + dientich1);
		
//		HinhChuNhat hcn1 = new HinhChuNhat();
//		hcn1.setTenHinh("HCN nhỏ");
//		hcn1.chieuDai = 3;
//		hcn1.chieuRong = 2;
//		System.out.println(hcn1.getTenHinh()+ "có Dt la:" + hcn1.tinhDT());
		
		HinhVuong hv1 = new HinhVuong();
		hv1.setTenHinh("Hinh vuong");
		hv1.chieuDaiMotCanh = 4;
		
		System.out.println(hv1.getTenHinh()+ "có Dt la:" + hv1.tinhDT());
		
		

	}

}
