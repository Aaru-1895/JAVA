package Java8;

interface I1{
	 public void sum();
}

public class LanbdImpl1 implements I1{
	
	public static void main(String[] args) {
		
		I1 i1 = () ->{
			System.out.println("hgjhg");
		};
		
		i1.sum();
		LanbdImpl1 obj = new LanbdImpl1();
		obj.sum();
		
	}
	
	

	@Override
	public void sum() {
		System.out.println("sum method");
		
	}

	

}
