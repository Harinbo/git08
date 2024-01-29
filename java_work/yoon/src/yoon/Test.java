package yoon;

import java.net.Socket;

class Accumulator{
	public static void add(int i) {
//		sum += i;
		sum = sum + i;
	}
	public static void showResult() {
		System.out.println("sum = " + sum);
	}
}

public class Test {
	
	public static void main(String[] args) {
		
	}
}
