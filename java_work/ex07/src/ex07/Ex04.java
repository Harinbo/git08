package ex07;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rowNum = scan.nextInt();
		
		// 5개의 별을 출력하고 싶다면?
		
	for (int i =0; i<rowNum ;i++) {
		
		System.out.println("i = "+i+"\t");
		for(int j =0; j< i+1 ;j++) {
			System.out.print("j = "+j);
			System.out.print("*");
			
			System.out.println();
			
		}
	}
		
	}

}
