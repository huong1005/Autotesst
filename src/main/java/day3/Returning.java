package day3;

import java.util.Scanner;

public class Returning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ 1: ");
		int number1 = sc.nextInt();
		
		System.out.println("Nhập số thứ 2: ");
		int number2 = sc.nextInt();
		int result = printLargerNumber(number1, number2);
		System.out.println("Số lớn hơn là: "+ result);
		
	}
	public static int printLargerNumber(int number1, int number2) {
		if(number1 > number2) 
			return number1;
		else return number2;
	}

}
