package ex07;

public class Ex01 {
	
	public static void doA() {
		
		System.out.println("doA 매개변수 없는 함수");
		return;
		// return : 함수종료
		
	}

	public static void doB(int a) {
		
		System.out.println("doA 매개변수 a = "+a);
		if ( a == 10) {
			return;
		}
		else if (a==8) {
			System.out.println("종료됩니다.");
			return;
		}
	System.out.println("if구문 else구문 못갔다.");
		
	}
	
	//void String int boolean char
	public static int doC(int a) {
		return a*a;
		
	}
	
	
		
	public static void main(String[] args) {
		doA();
		doB(7);
		int a = doC(10);
		System.out.println(doC(10));
		System.out.println(doC(20));
		System.out.println(doC(30));
	}

}
