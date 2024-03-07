package String;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharactorCount {
	public static void main(String[] args) {
		//String str = "heLlo";
		//System.out.println(getDuplicates(str));
		
		
		
		
		 String str= "Geeks", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Geeks"); //Example word
	       
	      for (int i=str.length()-1; i>=0; i--)
	      {
	        //ch= str.charAt(i); //extracts each character
	        nstr += str.charAt(i); //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
		
	
	
	public static Map<Character,Integer> characterCount(String str){
        Map<Character,Integer>  charOccurCount  = new HashMap<>();
        
        for(char ch: str.toLowerCase().toCharArray()) {
        	if(charOccurCount.containsKey(ch)) {
        		charOccurCount.put(ch, charOccurCount.get(ch)+1);
        	}else {
        		charOccurCount.put(ch, 1);
        	}
        		
        }
        
    return charOccurCount;
    }
	
	public static Map<Character,Integer> getDuplicates(String str){
        return characterCount(str).entrySet().stream()
                .filter(count ->count.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        }
}
