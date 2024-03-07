package matrix;

import java.util.Arrays;

public class BinarySearch {
	
	public static  int[] search(int[][] arr, int target) {
		
		for(int row =0; row<arr.length;row++) {
			
			for(int col= 0;col<arr[row].length;col++) {
				
				if(arr[row][col]== target) {
					return new int[]{row,col};
				}
				
			} 
		}
		return new int[] {-1,-1};
		
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{25, 12, 10},
				{45, 25, 36, 74},
				{20, 66, 78, 98}
		};
		int targe = 78;
		int[] location =  search(arr, targe);
		System.out.println("Target Located at :"+Arrays.toString(location));
		
	}

}
