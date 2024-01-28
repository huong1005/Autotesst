package btap_day5;

public class Application {

	public static void main(String[] args) {
		int luongCoBan = 19000000; 
//		TinhLuong tl1 = new TinhLuong("));
		System.out.println("Lương 1 la:" + TinhLuong.tinhLuong1(luongCoBan, 1.5));
		System.out.println("Lương 2 la:" + TinhLuong.tinhLuong2(luongCoBan, 1.5, 2));
		System.out.println("Lương 3 la:" + TinhLuong.tinhLuong3(luongCoBan, 1.5, 2, 1));
		
		
		
				
		

	}

}
