package Overriding;
/*******************
 * statistically it is not rong but it is not called a method overriding.
 * 
 * ******************************/

 class A 
{ 
private void m1()
{ 
 System.out.println("m1-A"); 
 } 
} 
 class B extends A
{ 
  void m1()
{ 
 System.out.println("m1-B"); 
}
}

public class IsCalledOverriding {
	public static void main(String[] args) 
	{ 
	 B b = new B(); 
	 b.m1(); 
	 } 
}
