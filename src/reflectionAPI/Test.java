package reflectionAPI;

public class Test {
	
	private int id;
    private String name;
    
    private Test() {
    	System.out.println("defalu");
    }

    // Public constructor that accepts a String parameter
    private Test(String name) {
        this.name = name;
        System.out.println("Parameterized constructor called with name: " + name);
    }

    public void show() {
        System.out.println("Public method calling..");
    }

    private void print(String name) {
        System.out.println("Private method called with name: " + name);
    }
}
