package ex08;

/*
 * main 메소드와 함께 동작하는 Accumulator 클래스를 정의
 * 그리고 Accumulator클래스에 main 메소드를 함께 넣어서 컴파일 & 실행
 */
public class Ex01 {
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
	}

}
