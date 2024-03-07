package pack;

public class SwapNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a= a+b;
		System.out.println(a);
		b= a-b;
		
		System.out.println(b);
		a=a-b;
		System.out.println(a);
		
	}
}
