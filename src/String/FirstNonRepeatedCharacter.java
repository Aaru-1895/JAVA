package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	 public static void main(String[] args) {
	        String string = "Puja";
	        System.out.println(firstNonrepeatedChar(string));
	    }

	    public static char firstNonrepeatedChar(String str){
	      Map<Character, Integer> characterCounnt = new HashMap<>();
	      for(char ch:str.toLowerCase().toCharArray()) {
	    	  characterCounnt.put(ch,characterCounnt.containsKey(ch)? characterCounnt.get(ch)+1:1);
	      }
	      
	      for(Map.Entry<Character, Integer> mapVal :characterCounnt.entrySet()) {
	    	  if(mapVal.getValue()==1)
	    		  return mapVal.getKey();
	      }
	      throw new RuntimeException("All characters are repeated!");
		
	    }
	    

}
