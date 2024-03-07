package String;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
	
	public static void main(String[] args) {
		
		String s ="javafgdfdhgdhf";
		
		
		String str1 = "example.com", str2 = "Example.com";
	    CharSequence cs = "example.com";
	     System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
	      System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
		
			/*
			 * for (int i =0;i<s.length();i++) {
			 * 
			 * for(int j=i+1;j<s.length();j++) {
			 * 
			 * if(s.charAt(i) == s.charAt(j)) { System.out.println("duplicates .."+
			 * s.charAt(i)); } } }
			 */
	      
	      
	    Map<Character, Integer> mapVal = new HashMap();
	    
	    for(int i=0; i<s.length();i++) {
	    	if(mapVal.containsKey(s.charAt(i))) {
	    		mapVal.put(s.charAt(i), mapVal.get(s.charAt(i))+1);
	    	}else {
	    		mapVal.put(s.charAt(i),1);
	    	}
	    	
	    	
	    	
	    }
	    System.out.println("mapVal.."+mapVal);
	    
	    
	    /*************************2nd way******************************/
	    Map<Character, Integer> character = new HashMap();
	    for(Character ch : s.toLowerCase().toCharArray()) {
	    	
	    	if(character.containsKey(ch)) {
	    		character.put(ch, character.get(ch)+1);
	    	}else {
	    		character.put(ch, 1);
	    	}
	    }
	    System.out.println("character.."+character);
	}

}
