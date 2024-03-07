
package String;

import java.util.List;

public class MaximumOccurence {
	
	public static void main(String[] args) {
		
		String s = "javA";
		s=s.toLowerCase();
		int charOccurence = 0;
		char foundOccurence = 'a';
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) == foundOccurence) {
				charOccurence++;
			}
			
		}
		System.out.println("occurence of character a is "+charOccurence);
	}

}
