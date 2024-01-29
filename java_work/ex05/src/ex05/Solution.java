package ex05;

/*
 * 문자열 my_string과 정수 k가 주어질 때,
 * my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class Solution {
	public static String Solution(String my_string, int k) {
		
		String result = "";
		for (int i = 0; i < k; i++) {
		result = result + my_string;
		}
		return result;
	}
		
//		String answer = "";
//		return answer;
	
	
	public static void main(String[] args) {
		String my_string = "abcde";
		int num = 10;
		
		String temp = Solution(my_string, num);
		System.out.println(temp);
		
	}
	}

