package ex03;

public class Ex10 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.printf("a = %d, b = %d\n", a, b);
		
		int c = 300;
		byte d = (byte) c;
		System.out.printf(" c = %d, d = %d", c, d);
		
		// %d 출력문자는 자동 줄바꿈이 안됨 but \n하면 바뀜
		// 자바에서는 printf 잘 쓰지 않음
	}
	
}
