package matrix;

import java.util.Arrays;

public class BinarySearchinSortedMatrix {
	
	
	public static int[] search(int[][] arr, int target) {
		
		int row = 0;
		int col = arr.length-1;
		
		while(row<arr.length && col>=0) {
			
			if(arr[row][col]== target) {
				return new int[] {row,col};
			}
			if(arr[row][col] < target) {
				row++;
			}
			else {
				col--;
			}
		}
		
		return new int[] {-1,-1};
	}
	
	
	public static void main(String[] args) {
		int target = 40;
		int[][] arr = {
				{1, 3, 5, 7},
				{10,11,16,20},
				{23,30,34,60}
};
		
		int[] position = search(arr, target);
		System.out.println("Element position: "+Arrays.toString(position));
	}

}
