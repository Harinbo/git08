package ex06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 성적을 입력받아 90점 이상이면 A
 * 			  80점 이상이면 A
 * 		      70점 이상이면 C
 *			  그 외는 D		 		
 */

public class Ex04 {
	
	public static void solution(int a) {
		
		if( a>= 90 ) {
			System.out.println("90점 이상이라 A 입니다.");
		}
		
		else if ( a>= 80 ){
			System.out.println("80점 이상이라 B 입니다.");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("src/abc.txt"));
		
		int a = scan.nextInt();
		System.out.println("a = "+a);
		int b = scan.nextInt();
		System.out.println("b = "+b);
		
		
	}

}
