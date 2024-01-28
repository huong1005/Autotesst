package btap_day5;

public class TinhLuong {
	
	
	    private int luongCoBan = 19000000;
	    private double heSoLuong;
	    private int soNamKinhNghiem;
	    private int loai;
	    
	    public static double tinhLuong1(int luongCoBan, double heSoLuong){
	        return luongCoBan * heSoLuong;
	        
	    }
	    public static double tinhLuong2(int luongCoBan, double heSoLuong, int soNamKinhNghiem){
	        return luongCoBan * heSoLuong* soNamKinhNghiem;
	        
	    }
	    public static double tinhLuong3(int luongCoBan, double heSoLuong, int soNamKinhNghiem, int loai){
	    	if(loai == 1) {
	    		return luongCoBan * heSoLuong * soNamKinhNghiem * 0.2;
	    	}else
	        return luongCoBan * heSoLuong* soNamKinhNghiem* 0.45 ;
	        
	    }
	    
}
