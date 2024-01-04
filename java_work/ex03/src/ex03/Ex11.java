package ex03;

import java.util.Scanner;

/*
 * 조건 : 실수는 숫자를 입력받아 소수 둘째자리까지만 보여줘
 * 
 * ex) 23.456 -> 23.45
 * ex2) 11.1356712 -> 11.13
 */

public class Ex11 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		
		// next() 문자열 입력! 빈공백 전까지
		// nextline() 문자열 한줄
		// nextInt() 정수입력
		// nextDouble() 실수입력
		double d = scan.nextDouble();
		
		System.out.println("d = "+ d);
		
		// 45.123123123*100
		// 4512.123123 -> Int
		// 4512 / 100.0 -> Double
		// 45.12
		
		//	double trans_d = (int)(d*100)/100.0;
		//	System.out.println("trans_d = "+ trans_d);
		// 아니면 아래 형식으로도 출력 가능
		
		System.out.println("trans_d = "+(int)(d*100)/100.0);
		
	}
	
}
