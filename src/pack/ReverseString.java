package pack;

import java.util.Arrays;

public class ReverseString {
	
		
		
public static void main(String[] args) {
	
	String s ="Aarti";
	System.out.println("Orignal String is :"+s);
	
	
	if ( s.length()!=0) {
		String reverseString = "" ;
		for(int i= s.length()-1;i>=0;i--) {
			reverseString = reverseString+s.charAt(i);
			
			/*******or****
			  reverseString = reverseString+s.charAt(i);*/
		}
		System.out.println("Reverse Sttring is :"+reverseString);
	}
	else {
		System.out.println("string is empty or null");
	}
	
}
	

}
