package Java8;
interface I2{
	
	public void methTest();
}


public class MethodRefer1 {
	
	public static void test() {
		System.out.println("This is metho refrence test");
	}
	
	
	public static void main(String[] args) {
		
		I2 i1 = MethodRefer1::test;
		i1.methTest();
		
		
		String s = new String("Abc");
		String s1 = "Abc";
		 
		 s= "ABC";
		 System.out.println(s);
		 changeString(s1);
		 
		
		
	}
	
	public static void changeString(String s1) {
		s1= "XYZ";
		System.out.println(s1);
	}
	
	

}
