package ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		char a = 'a';
				
		for(int i =0; i<26;i++) {
//			System.out.println(i);
			//printf는(%d등등 들어감)
			System.out.println(i+"\t"+a++);
			//후증가 = 출력한 후 증가
		}
		
		a = 'A';
		
		for(int i =0; i<26;i++) {
			System.out.println(i+"\t"+a++);
		}
	}
	
}
