package ex05;

public class Ex05 {
	
	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		
		System.out.println(a==b);
		
		String c = "abc";
		String d = new String("abc");
		System.out.println(d);
		
		System.out.println(c==d);
		System.out.println();
		System.out.println(c.equals(d));
		
		//문자열 비교연산자는 equals
		//new string은 equals로 비교해야함
		
	}

}
