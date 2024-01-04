package ex04;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 형변환
		
		int a = 10;
		double b = 20.2;
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		int c = (int) b;
		double d =a;
		
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
		
		// 연산자
		
		System.out.println(a==b);
		System.out.println(b==c);
		
		System.out.println(a==d);
		
		System.out.println(a == d);
		
		System.out.println(a == b || a == d); // 둘 중 하나가 true면 됨
		System.out.println(a == b && a == d); // 둘다 true여야함
		
		System.out.println((b == c && a == b) || a == d );
		// 식이 길 때는 괄호로 구분지어주는 습관을 들이는 것이 좋음! 가독성 Up
	}

}
