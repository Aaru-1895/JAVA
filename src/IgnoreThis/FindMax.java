package IgnoreThis;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindMax {
	
	public static int getMaxVal(int[] arr) {
		
		int temp =0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]  = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		return arr[arr.length-1];
	}
	
	
	public static void main(String[] args) {
		// 1st way
		
		int array[] = {8,2,99,1,10};
		OptionalInt a=Arrays.stream(array).max();
		System.out.println(a);
		
		//2nd way 
		
		List<Integer> list = List.of(150,4,25,2,1);
		Optional<Integer> max= list.stream().max((i,j)-> i.compareTo(j));
		System.out.println(max);
		
		//3rd way
		
		int arr[] = {8,2,99,1,10};
		
		int maxval = getMaxVal(arr);
		System.out.println(maxval);
	}

}
