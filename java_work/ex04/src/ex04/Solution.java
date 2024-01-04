package ex04;

import java.util.Scanner;
/* 문자열 돌리기
 * 
 * 문자열 str이 주어집니다.
문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
	
 * Ex) 입력 abcde
 * Ex) 출력
 * a
 * b
 * c
 * d
 * e
 * 
 */
public class Solution {
	    	public static void main(String[] args) {
	            Scanner sc = new Scanner(System.in);
	            String a = sc.next();
	            
	            char[] chars = a.toCharArray();
	            
//	            System.out.println("chars[0] = "+chars[0]);
//	            System.out.println("chars[1] = "+chars[1]);
//	            System.out.println("chars[2] = "+chars[2]);
	            // i가 0부터 ~ 길이 미만까지...
	            for(int i = 0; i < chars.length; i++)
	            	System.out.println(chars[i]);
	        }
	    }
	     
	