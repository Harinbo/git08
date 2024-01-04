package ex03;

public class Ex03 {
	
	class AA{
		public void doA() {
			System.out.println("doA");
		}
	}

public class Ex04 {

	public static void main(String[] args) {
// 	Interger i = new Integer(10);
		AA a2 = new AA();
		a2.doA();
		
	
		String a = new String("abcd");
		/*
		 * String만 new String이라고 구분짓지는 않아도 됨
		 * String a = "abcd";도 가능
		 */
		System.out.println(a.toUpperCase());
	}
