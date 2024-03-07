package CommonCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumInArray {
	
	public static int[] sumInArray(int[] nums, int target) {
		for(int i =0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]== target) {
					return new int[]{i, j};
				}
			}
		}
		
		return null;
	}
	
	// 2nd Approach
	
public static int[] sumInArray2(int[] nums, int target) {
	
	Map<Integer, Integer> map = new HashMap<>();
		
		for(int i =0;i<nums.length;i++) {
			
			int constant = target - nums[i];
			
			if(map.containsKey(nums[i])) {
				return new int[] {};
				
			}
			map.put(nums[i], i);
			
			
			
			}
		
		
		return null;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] nums = { 2, 7, 11, 15 };
		int target = 17;
		int[] val = sumInArray(nums, target);
		System.out.println("Indices of two numbers that add up to target: " + Arrays.toString(val));
		
	}

}
