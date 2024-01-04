package ex03;

/*
 * int -> char unicode A => 65 65 => A
 * 
 * 실수 -> 정수
 * 
 * double -> int 소수점을 버려서 형변환됩니다.
 * 
 * 정수 -> 실수
 * 10 -> 10.0
 * 20 -> 20.0
 */

public class Ex09 {
	
	public static void main(String[] args) {
		double d = 85.4d;
		int score = (int)d;
		// 실수 / 정수 형변환할 때 적어줘야함 double이면 d / float이면 f
		System.out.println("score = "+score);
		System.out.println("d = "+d);
		
		// (double) 안적는 이유? 비트 체계가 작은거에서 큰 걸로 바꿀때는 자료의 소실이 없기 때문에 안적어도 자동 형변환
		// double이 체계가 더 크기 때문. 자료의 소실이 일어나지 않으면 안 적어도 됨
		int aa = 10;
		double ee = aa;
		System.out.println("aa = "+aa);
		System.out.println("ee = "+ee);
	}
}
