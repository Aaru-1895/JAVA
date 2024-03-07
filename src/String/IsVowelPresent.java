package String;

public class IsVowelPresent {
	
	public static void main(String[] args) {
		String s = "prsnl";
		boolean result = vowelPresent(s);
		System.out.println(result);
		
		
	}
	
	
	
	public static boolean vowelPresent(String s) {
		
		return s.toLowerCase().matches(".*[aeiou].*");
	}

}


