package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionMain {
	
	// Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
	//Test t = new Test();
	
	/*
	 * public static void main(String[] args) throws InstantiationException,
	 * IllegalAccessException, NoSuchMethodException, SecurityException,
	 * IllegalArgumentException, InvocationTargetException { Class<Test> c =
	 * Test.class;
	 * 
	 * // Access the constructor that takes a String parameter Constructor<Test>
	 * constructor = c.getDeclaredConstructor(); constructor.setAccessible(true);
	 * 
	 * // Create an instance by invoking the constructor with a parameter Test test
	 * = constructor.newInstance();
	 * 
	 * 
	 * Constructor<Test> cons= c.getDeclaredConstructor(String.class);
	 * cons.setAccessible(true); cons.newInstance("Hello world");
	 * 
	 * 
	 * // Access the private method "print" using reflection Method m =
	 * c.getDeclaredMethod("print", String.class); m.setAccessible(true);
	 * m.invoke(test, "Method Parameter"); test.show();
	 * 
	 * 
	 * 
	 * }
	 */
	
	 static int breadth;
	    static int height;
	    
	    static {
	        Scanner scanner = new Scanner(System.in);
	        breadth = scanner.nextInt();
	        height = scanner.nextInt();
	        
	        if (breadth <= 0 || height <= 0) {
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	            System.exit(0); // Terminate the program if breadth or height is non-positive
	        }
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(breadth * height);
	    }


	 
}

