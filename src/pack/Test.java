package pack;

import java.util.Arrays;

class A {
	int a = 10;

	A(int b) {
		this.a = b;
	}

	protected void show(int a) {
		System.out.println("working..");
		a = a + 10;
		System.out.println("val..." + a);
	}

}

/*
 * class B extends A{
 * 
 * B() { //super(b); // TODO Auto-generated constructor stub }
 * 
 * void show() {
 * 
 * }
 * 
 * }
 */

public class Test {

	public static void main(String[] args) {
		A a = new A(20);
		System.out.println(a.a);
		System.out.println("before change..." + a.a);
		a.show(10);
		System.out.println("After change..." + a.a);
		
		Test.arrayTest();

	}
	
	
	public static void  arrayTest() {
		
		int[] intAtrray = {1,10,25,14,2,6,45};
		
		/*
		 * Arrays.sort(intAtrray); System.out.println(intAtrray[intAtrray.length-2]);
		 */
		
		int temp;
		for(int i=0; i<intAtrray.length;i++) {
			
			for(int j=i+1;j<intAtrray.length;j++) {
				
				if(intAtrray[i]> intAtrray[j]) {
					temp= intAtrray[i];
					intAtrray[i] = intAtrray[j];
					intAtrray[j]= temp;
				}
			}
		}
		
		System.out.println(intAtrray[intAtrray.length-1]);
		
	}

}
