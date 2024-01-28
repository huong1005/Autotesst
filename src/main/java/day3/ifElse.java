package day3;

import java.util.Scanner;

public class ifElse {
 public static void main(String[] args) {
	 String result;
	 System.out.println("Nhập số cần ktra:");
	 Scanner sc = new Scanner(System.in);
	 int number = sc.nextInt();
	 result = (number % 2 == 0)? "chia hết cho 2" : "không chia hết cho 2";
	 System.out.println(result);
 }
}
