package ex03_1;

public class Ex02 {
	
	public static void main(String[] args) {
		// && || ! & | ^ ~
		// % : 나머지를 구하는 연산자
		// || 기호가 들어가있으면 둘 중 하나가 true이면 true
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 입력받은 값이 a와 b사이인지 확인하는 것 출력하세요
		// a<15<b
		int input = 15;
		System.out.println(a < input && input < b);
		
		// a > input  b > input
		// 문제 예시) 최소 공배수인가? or 최대 공약수인가? ex) 30/2 ==? 0
		// 30을 5로 나누었을때 나머지가 0인가요? or 30을 7으로 나누었을때 나머지가 0인가요?
		System.out.println(30%5==0 || 30%7==0);
		
		boolean aa = true;
		if(a < input && input < a) {
			System.out.println("aa 값은 참입니다.");
		}
		// false면 ""안의 문장이 출력되지 않음. true여야 출력됨
		// flase 시에도 "" 안의 문장을 출력하려면 else 사용
		
		else {
			System.out.println("aa 값은 거짓입니다.");
		}
		
	}
	
}
