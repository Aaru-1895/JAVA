package IgnoreThis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWords {
	
	public static void main(String[] args) {
		
		String seq = "welcome to code decode and code decode welcome you";
		
		String[] str = seq.split(" ");
		System.out.println(Arrays.toString(str));
		
		Map<String, Integer> val = new HashMap<>();
		for(int i=0;i<str.length;i++) {
			val.put(str[i], val.getOrDefault(str[i], 0)+1);
		}
		
		System.out.println(val);
		
		for(Map.Entry<String, Integer> mapVal : val.entrySet()) {
			System.out.println("The Word is: "+mapVal.getKey() +" The Value is :"+mapVal.getValue());
		}
	}

}
