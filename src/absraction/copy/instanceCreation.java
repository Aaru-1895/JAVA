package absraction.copy;


 abstract class AbstractEx {
	 private int val;
	 AbstractEx(int val){
		 this.val = val;
	 }
	 
	 public void doSomething() {
		 System.out.println("I am doing sum of Val + val :"+ 15+15);
	 }
	 
 }


public class instanceCreation extends AbstractEx{

	instanceCreation(int val) {
		super(val);
		
	}
	
	public void doing() {
		System.out.println("I am doing programming");
	}
	
	public static void main(String[] args) {
		instanceCreation ab = new instanceCreation(15);
		ab.doSomething();
		ab.doing();
	}

}
