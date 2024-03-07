package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AnnagramExmple {
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * String s= "ABC"; String s1="BAC";
	 * 
	 * char[] s3 =s.toLowerCase().toCharArray(); char[] s4
	 * =s1.toLowerCase().toCharArray();
	 * 
	 * Arrays.sort(s3); Arrays.sort(s4);
	 * 
	 * if(Arrays.equals(s3, s4)) { System.out.println("String is annagram"); } }
	 */
	
	 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
    static boolean isAnagram(String a, String b) {
      char[] s3 =a.toLowerCase().toCharArray();
        char[] s4 =b.toLowerCase().toCharArray();
        
       if(s3.length != s4.length){
         return false;  
       }
     
       
       HashMap<Character, Integer> freqA =  new HashMap<>();
        HashMap<Character, Integer> freqB = new HashMap<>();
        
        for(char ch : s3){
            freqA.put(ch, freqA.getOrDefault(ch, 0)+1);
        }
        
        for(char ch1 :s4){
            freqB.put(ch1, freqB.getOrDefault(ch1, 0)+1);
        }
        if(freqA.equals(freqB)){
            return true;
        }
		return false;
        
       
    }

}
