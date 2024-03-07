package TrickyQues;

import java.util.Vector;

public class CommonCode {
	
	public static void main(String[] args) {
		
		 
		
		String s = "geeks quiz practice code";
		String[] array = s.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (int i= array.length-1;i>=0;i--) {
			result.append(array[i]);
			if(i > 0) {
				result.append(" ");
			}
		}
		System.out.println(result); 
}
	
}
