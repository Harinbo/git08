package ex04;

// 논리연산자 !

public class Ex02 {
	
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = !a; // !는 부정할 때 사용
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		int c = 10;
		int d =+ c;
		
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
		
		d += c; // d = d+c; 식과 동일 (둘 중 아무거나 상관없음)
		// 오른쪽꺼를 계산해서 왼쪽에 넣는다 (증가대입연산자)
		
		System.out.println("d = "+ d);
		
	}

}
