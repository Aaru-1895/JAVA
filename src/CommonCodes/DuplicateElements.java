package CommonCodes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	
	public static boolean containsDuplicate(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		for(int num : nums) {
			if(set.contains(num)) {
				return true;
			}else {
				set.add(num);
			}
		}

		return false;
		}

	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 7};
		 boolean hasDuplicate = containsDuplicate(nums);
	        System.out.println("Output: " + hasDuplicate); 
	}

}
