package String;

public class StringIntern {
	
	public static String val="code";
	
	public static void main(String[] args) {
		
		String s1 = new String("code");
		
		System.out.println(s1.intern());
		String s2 = "code";

		String s3 = s1.intern();
		
		System.out.println(s3 == s2);
		
	}

}
