package CommonCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RecuringWords {
	
	public static void getRecurringWord(String s){
		String[] word = s.split("\\s");
		
		
		Map<String,Integer> myval = new HashMap<>();
		for(String s1:word) {
			myval.put(s1, myval.getOrDefault(s1, 0)+1);
			
		}
	
		for(Map.Entry<String, Integer> val :myval.entrySet()) {
			if(val.getValue()>1) {
				System.out.println(val.getKey());
			}
		}
		
	
		
	}
	
	
	public static void main(String[] args) {
		
		String string = "Big black bug bit a big black dog on his big black nose";  
		getRecurringWord(string.toLowerCase());
	}

}
