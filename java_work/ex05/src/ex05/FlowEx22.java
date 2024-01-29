package ex05;


class FlowEx22 {
	
	
	public static void main(String[] args) { 
		int[] arr = {10,20,30,40,50};
		
		String a = "abcdef";
		System.out.println(a.length());
		
		for (int i =0; i<arr.length ;i++)
		System.out.println(arr[i]);
		
		System.out.println();
		
		//int가 5개 모여있는게 배열
		
		for(int temp: arr) {
			System.out.println(temp);
		//향상된 for구문
		// sum -> for구문 밖에서는 사용 불가! 안에서만!!
		//	밖에서 쓰고 싶으면 sum+=temp;
		}
		
		System.out.println();
		
		String[] arr1 = {"aa", "bb", "cc", "dd"};
		
		String sumstr = "";
		
		
		for(String temp :arr1) {
			System.out.println(temp);
		sumstr+=temp;
		}
		System.out.println(sumstr);
		
	
	}
}
