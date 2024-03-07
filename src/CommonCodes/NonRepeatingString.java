package CommonCodes;

import java.util.Map;
import java.util.TreeMap;

public class NonRepeatingString {
	
	public static void main(String[] args) {
		
		String s = "Attrtidfgh".toLowerCase();
		
		Map<Character, Integer> myVal  = new TreeMap<>();
		
		for(int i=0;i<s.length();i++) {
			myVal.put(s.charAt(i), myVal.getOrDefault(s.charAt(i), 0)+1);
			
		}
		for(Map.Entry<Character, Integer> val :myVal.entrySet()) {
			if(val.getValue()>1) {
				System.out.println(val.getKey());
				break;
			}
		}
	}

}
