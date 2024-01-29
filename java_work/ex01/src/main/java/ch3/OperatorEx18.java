package ch3;



class OperatorEx18 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		// Math는 수학공식에 관련된 많은 함수 제공 ex)round
		
		/*
		 * Scanner scan = new Scanner();
		 * scan.nextInt();
		 * scan.next()
		 * scam.nextLine();
		 * 반올림, 함수 등
		 * Math.round()
		 * Math.random() : 랜덤으로 0< x < 1 사이의 값 구해줌		 
		*/

		System.out.println(shortPi);
	}
}
