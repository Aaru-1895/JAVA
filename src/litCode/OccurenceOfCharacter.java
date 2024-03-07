package litCode;

import java.util.ArrayList;
import java.util.List;

public class OccurenceOfCharacter {
	
	
	/*****************1st way ***********************/
	
	public static int characterOccurence(String s1, String s2) {
		
		int index = s1.indexOf(s2);
		return index;
		
	}
	
 /***************** 2nd way ***********************/
	
	public static int characterOccurence1(String s1, String s2) {
		List<Integer> a= new ArrayList<>();
		int index = 0;
		while(index != -1) {
			index = s1.indexOf(s2,index);
			if (index != -1) {
				a.add(index);
			}else {
				break;
			}
			index = index+1;
		}
		System.out.println("index..."+a);
		 
		
		return a.get(0);
		
	}
	
	
	public static void main(String[] args) {
		characterOccurence("sadbutsad",  "sad");
		int num = characterOccurence1("sadbutsad",  "sad");
		System.out.println("num..."+num);
		
	}

}
