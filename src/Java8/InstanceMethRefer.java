package Java8;
@FunctionalInterface  
interface I3{
	public void instanceTest();
	int hashCode();  
    String toString();
}


public class InstanceMethRefer {
	
	public void test1() {
		System.out.println("This is Instance method Refer");
	}
	
	
	public static void main(String[] args) {
		InstanceMethRefer obj = new InstanceMethRefer();
		
		I3 i3 = obj::test1;
		i3.instanceTest();
		
	}

}
