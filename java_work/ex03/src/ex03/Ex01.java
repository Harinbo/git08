package ex03;

import java.util.Scanner;

/*
 * string : 5
 */

public class Ex01 {
	
	public static void main(String[] args) {
		// 참조 변수 선언
		Scanner scan = new Scanner(System.in);
		// 문자열 입력 출력처리
		//	System.out.println("문자열입력");
		// 입력 받아라... next 함수는 빈공백 String 5
		//	String str = scan.next();
		//	System.out.println("반복횟수 입력");
		//	int n = scan.nextInt();
		//		
		//	System.out.println("str="+str);
		//	System.out.println("n = "+n);
		
		/*
		 * i=0일 때 for구문 안에 있는 것을 반복해라
		 */
		for (int i = 0; i<5 ; i++) {
			System.out.println(i);
		}
		
		/*
		 * 0, 2, 4로 하고 싶으면 i=i+2
		 */
		
		System.out.println("일로 옵니다.");
		
	}

}
