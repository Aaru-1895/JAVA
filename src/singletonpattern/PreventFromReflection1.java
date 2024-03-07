package singletonpattern;

public class PreventFromReflection1 {
	
	private static PreventFromReflection1 preventFromReflection; 
	
	private PreventFromReflection1() {
		if(preventFromReflection!= null) {
			throw new IllegalStateException("Singleton instance already created.");
		}
		
	}
	
	public static PreventFromReflection1 getInstance() {
		if(preventFromReflection == null) {
			preventFromReflection = new PreventFromReflection1();
		}
		return preventFromReflection;
	}
	

}
