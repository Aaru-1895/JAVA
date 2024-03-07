package CommonCodes;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,8,9,10};
		
		for(int i=1;i<array.length-1;i++) {
			int current = array[i];
			int next = array[i+1];
			
			if((next - current) !=1) {
				System.out.println("Missing Number Is: "+ (array[i]+1));
			}
			
		}
		
		// 2nd way
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<array.length-1;i++) {
			set.add(array[i]);
		}
		
		for(int i=1;i<array.length-1;i++) {
			
			if(!set.contains(i)){
				System.out.println("missing number :" +i);
			}
		}
		
	}

}
