package ex03;

public class Ex08 {
	
	// 1byte : -128 ~ +127
	
	public static void main(String[] args) {
		char aa = 'A';
		System.out.println(aa);
		//System.out.println((int)aa);
		int bb = (int) aa;
		// int bb = (int)aa;로 해도 출력 가능
		// int = 형변환 (casting)
		System.out.println(bb);
		char cc = (char) bb;
		System.out.println(cc);
		
		// (int) = int로 변환하고 싶다
		// (char) = char로 변환하고 싶다
		
		byte kk = 127;
		System.out.println(kk+1); // int형 연산
		System.out.println((byte)(kk+1)); // 오버플로우 8bit
		
	}

}
