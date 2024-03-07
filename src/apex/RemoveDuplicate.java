package apex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	
	public static int duplicateRemove(int[] nums) {
		
		int pointer=0;
	
		for(int i=1;i<nums.length;i++) {
			
			if(nums[i] != nums[pointer]) {
				pointer++;
				nums[pointer] = nums[i];
			}
			
			
		}
		System.out.println(Arrays.toString(nums));
		
		return pointer+1;
	}
	

	public static void main(String[] args) {
		
		int[] nums = {1,1,5,6,6,8};
		
		int length = duplicateRemove(nums);
		System.out.println("length is .."+length);
		
		
	}
	
	
}
