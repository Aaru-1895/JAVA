package CommonCodes;

import java.util.Arrays;

public class BUbbleSort {
	
	public static void bubbleSort(int[] nums) {
		int temp;
		boolean swapped;
		for(int i=0;i<nums.length-1;i++) {
			swapped = false;
			for(int j = 0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1] = temp;
					swapped =true;
				}
				
			}
			if(!swapped) {
				break;
			}
			
		}
		System.out.println("SOrted Array :"+Arrays.toString(nums));
		
	}
	
	
	public static void main(String[] args) {
		
		 //int[] nums = { 10, 35, 32, 13, 26,1};   
		 int[] nums = { 1, 2, 3, 4, 5,6};  
		 System.out.println("Befor SOrted Array :"+Arrays.toString(nums));
		 bubbleSort(nums);
		
	}

}
