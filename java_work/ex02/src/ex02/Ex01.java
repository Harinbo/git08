package ex02;

public class Ex01 {
	
	// ctrl + d 한줄삭제
	// ctrl + z 뒤로 돌아가기
	// ctrl + y 앞으로 가기
	// ctrl + w 현재 창 닫기
	// ctrl + m 화면 최대화, 최소화
	// ctrl + f11 실행

	private static void doA() {
		int c = 30;
		int d = 40;
		System.out.println(c+d);
	}
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		doA();
	// 마지막 doA가 위 식과 만나서 실행
		
		System.out.println("종료됩니다.");
	}
	
}