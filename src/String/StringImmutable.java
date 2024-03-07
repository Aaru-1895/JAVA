package String;

public class StringImmutable {
	public static void main(String[] args) {
		
		
		String s1="Hello";
		
		String s2= s1;
		
		System.out.println(s1==s2);
		s1+="hey";
		 s2= s1;
		System.out.println(s1==s2);
		
				
	}

}
