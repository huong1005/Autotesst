package day3;

import java.util.Scanner;

public class ReturnTesterLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tháng kn của Tester: ");
		int soThangKN = sc.nextInt();
		System.out.println("Level của Tester: "+ printLevel(soThangKN));

	}
	public static String printLevel(int soThangKN)
	{ 
		if(   soThangKN >= 6 && soThangKN <= 24)
			return "junior";
		if(   soThangKN > 0 && soThangKN < 6)
			return "fresher";
		if(   soThangKN > 24 && soThangKN <= 48)
			return "senior";
		if(   soThangKN > 48 )
			return "special list";
		return "Undefine";
	}

}
