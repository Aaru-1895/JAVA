package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapArray {
	
	public static void main(String[] args) {
		int[] array = {1,10,50,25,73,12,100,20};
		System.out.println(Arrays.toString(array));
		System.out.println("Max val is :"+findMax(array));
		//swapNumber(array,2,6);
		reverse(array);
		sum();
		
}
	// Find Max Value
	public static int findMax(int[] arr) {
		int maxval=arr[0];
		for(int i= 1; i<arr.length;i++) {
			if(arr[i]> maxval) {
				maxval = arr[i];
			}
			
		}
		return maxval;
	}
	
	//Reverse The Array
	
	public static void reverse(int[] arr) {
		
		int start =0;
		int end =arr.length-1;
		while(start < end) {
			swapNumber(arr, start, end);
			start++;
			end--;
		}
		System.out.println("Reverse Array:"+Arrays.toString(arr));
		
	}
		
	// swap the number 
	
	public static void swapNumber(int[] arr, int index1, int index2) {
		int val = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = val;
	//	System.out.println("Swapd Array :"+Arrays.toString(arr));
	}
	//sum of two
	public static void sum() {
		int[] array = {3,2,4};
		List<Integer> list = new ArrayList<>();
		for(int i= 0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				if((array[i]+array[j])==6) {
					list.add(i);
					list.add(j);
				}
			}
			
		}
		System.out.println(list);
	}
	
	
	
}
