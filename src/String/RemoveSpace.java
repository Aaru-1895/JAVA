package String;

public class RemoveSpace {
	
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s);
		StringBuilder sb = removeSpace(s);
		System.out.println(sb);
		
		
	}
	
	public static StringBuilder removeSpace(String s) {
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		for(char c: ch) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
			
		}
		return sb;
		
	}

}
