package ex05;

public class Ex07 {
	
	public static void main(String[] args) {
	
	int a = 10;
	// a = 1010
	
	// a >> 2 비트가 두 칸 가게 되면...
	// 0010
	
	System.out.printf("%x\n",a);
	System.out.printf("%d\n",a>>2);
	System.out.printf("%d\n",a>>2&a);

}
}
