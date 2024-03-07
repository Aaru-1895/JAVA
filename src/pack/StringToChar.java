package pack;

public class StringToChar {
	
	public static void main(String[] args) {
		
		
		String s="java";
		
		char[] c =s.toCharArray();
		//System.out.println(c);
		
		s.getChars(0, 1, c, 0);
		System.out.println(c);
	}

}
