package String;

public class SuffleString {
	
	public static String restoreString(String s, int[] indices) {
		char[] ch = new char[s.length()];
		
		for(int i = 0;i<s.length();i++) {
			ch[indices[i]]= s.charAt(i);
		}
		 return new String(ch);
		
	}
	
	public static void main(String[] args) {
		 String s = "codeleet";
		 int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
		 String rearrangedString = restoreString(s, indices);
		  System.out.println("Rearranged String: " + rearrangedString);
		
	}

}
