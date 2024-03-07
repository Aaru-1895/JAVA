package matrix;

import java.util.Arrays;

public class NintyDegreeRotation {
	
	public static void main(String[] args) {
		
		
	int[][] arr = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13,14, 15, 16},
			
	};
	
	
	// To rotate the array  first find it's Transpose and then reverse the array
	
	
	//step 1 Transpose the array
	int temp;
	
	for (int i=0; i<arr.length; i++) {
		
		for(int j=0; j<i; j++) {
			temp = arr[i][j];
			arr[i][j] = arr[j][i];
			arr[j][i] = temp;
			
		}
	}
	
	//print the Array 
	
	/*
	 * for (int i=0; i<arr.length; i++) { for(int j=0; j<arr.length; j++) {
	 * System.out.print(arr[i][j]+" ");
	 * 
	 * } System.out.println(); }
	 */
	
	//step - 2 Reverse the Array
	
	for(int i=0;i<arr.length; i++) {
		
		int left =0;
		int right = arr.length-1;
		while(left<right) {
			int temp1;
			temp1 = arr[i][left];
			arr[i][left] = arr[i][right];
			arr[i][right] = temp1;
			left++;
			right--;
		}
		
	}
	
	//print the Array 
	
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	

}
}