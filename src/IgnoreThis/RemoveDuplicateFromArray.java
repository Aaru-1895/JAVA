package IgnoreThis;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	
	
		
		public static int removeDuplicates(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }

	        int index = 1; // Start from the second element

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[index++] = nums[i];
	            }
	        }

	        return index;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
	        int length = removeDuplicates(nums);

	        System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < length; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }

}
