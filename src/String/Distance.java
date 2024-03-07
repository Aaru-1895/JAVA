package String;

import java.util.HashMap;
import java.util.Map;

public class Distance {
	public static void main(String[] args) {
		String s = "Programming";
		checkDuplication(s);
		
	}
	
	public static void checkDuplication(String s) {
		char[] arrayVal = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(Character ch :arrayVal) {
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);

			}
			}
		System.out.println("..."+map);
		}
	}


