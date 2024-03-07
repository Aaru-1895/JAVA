package ArrayDemo;

//Parent class
class Base {

	public static void print() {
		System.out.println("In the Base class.");
	}

	public void abc() {
		System.out.println("hello base");
	}
}

class Derived extends Base {

// removal of static causes compilation error
	public static void print() {
		System.out.println("In the child class.");
	}
	
	  public void abc() { System.out.println("hello Child"); }
	 

}

//Driver class
public class StaticDemo {

	public static void main(String args[]) {
		Derived obj = new Derived();

		obj.print();
		obj.abc();
	}
}
