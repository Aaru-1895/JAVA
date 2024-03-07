package singletonpattern;

public class MainClass {
	public static void main(String[] args) {
		
		SingletonePattern singletonePattern = SingletonePattern.getInstance();
		singletonePattern.checkInstance();
		
		SingletonePattern singletonePattern2 = SingletonePattern.getInstance();
		singletonePattern2.checkInstance();
		
	}
	

}
