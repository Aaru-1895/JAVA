package CommonCodes;

import java.util.Arrays;

public class ArrayRotation {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,10,7,9,12};
		System.out.println("Array Befor Rotation: "+Arrays.toString(arr));
		int temp= arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		
		System.out.println("Array After 1 Left Rotation: "+Arrays.toString(arr));
		
		
		// Right Rotation in Array
		
		
		int[] arr1 = {5,8,9,10,45,23,1,6};
		System.out.println("Array Befor Rotation: "+Arrays.toString(arr1));
		
		int temp1= arr1[arr1.length-1];
		
		for(int i=arr1.length-2;i>=0;i--) {
			System.out.println(i +" "+arr1[i]);
			arr1[i+1] = arr1[i];
		}
		arr1[0] = temp1;
		
		System.out.println("Array After 1 Right Rotation: "+Arrays.toString(arr1));
		
		
		
	}

}
