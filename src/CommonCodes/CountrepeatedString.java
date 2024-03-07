package CommonCodes;

import java.util.HashMap;
import java.util.Map;

public class CountrepeatedString {
	
	public static void main(String[] args) {
		
		String s = "Shirsh".toLowerCase();
		
		
		Map<Character, Integer> myMap = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i), 0)+1);
		}
		for(Map.Entry<Character, Integer>  val : myMap.entrySet()) {
			System.out.println("The Charcter Is "+val.getKey() +"  The Value is :"+val.getValue());
			
		}
		
		
	}

}
