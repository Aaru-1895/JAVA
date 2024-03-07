package pack;

import java.util.HashMap;
import java.util.Map;

public class WordAccurence {
	
	public static void main(String[] args) {
		
		String  s= "Welcome to Java Session Session Session";
		
		String[] s1= s.split(" ");
		Map<String, Integer> mapval= new HashMap<>();
		int count=1;
		for(int i=0;i<s1.length;i++) {
		
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equals(s1[j])) {
					count =count+1;
					s1[j]="0";
					//System.out.println(count);
				}
			}
			if(s1[i]!="0") {
				System.out.println(s1[i]+"--"+count); //Printing the word along with count
				count=1;
			}
			
			
		}
		System.out.println("mapval.."+mapval);
		
		
		
		String str = "jjjjjjjjjjjjjjjjhyfgtyfyfty7";
		char[] charArray = str.toLowerCase().toCharArray();
		Map<Character,Integer> charCountMap = new HashMap<>();
		for(char ch:charArray)
		{
			charCountMap.put(ch, charCountMap.containsKey(ch)?charCountMap.get(ch)+1:1);
		}
		System.out.println("charCountMap...."+charCountMap);
	}

}
