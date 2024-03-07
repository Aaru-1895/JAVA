package singletonpattern;

import java.lang.reflect.Constructor;

public class PreventFromReflectionMain {
	public static void main(String[] args) {
		
		PreventFromReflection single = PreventFromReflection.INSTANCE;
		
		// using enum 
		try {
	            Constructor<PreventFromReflection> constructor = PreventFromReflection.class.getDeclaredConstructor();
	            constructor.setAccessible(true);
	            PreventFromReflection singletonReflection = constructor.newInstance();

	            // This code will not be reached
	            System.out.println("Successfully created a new instance using reflection.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		
	 // Using Private cons	
		PreventFromReflection1 obj = PreventFromReflection1.getInstance();
		
		try {
            Constructor<PreventFromReflection1> constructor1 = PreventFromReflection1.class.getDeclaredConstructor();
            constructor1.setAccessible(true);
            PreventFromReflection1 singletonReflection = constructor1.newInstance();

            // This code will not be reached
            System.out.println("Successfully created a new instance using reflection.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	

}
