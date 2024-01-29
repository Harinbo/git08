package ex06;

import java.util.Scanner;

// ctrl+shift+f 자동정렬...

public class Ex03 {

	public static void main(String[] args) {

		int input;

		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		input = Integer.parseInt(tmp);

		if (input == 0) {
			System.out.println("0을 입력했네요.");
		}

		if (input != 0) {
			System.out.println("0말고 다른 것을 입력했네요" + input);
		}

	}

}
