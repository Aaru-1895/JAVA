package CommonCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
	public static void main(String[] args) {
		int var =0;
		
		int[] array = {1,2,5,3,4,6,7,8};
		
		for(int i =0 ; i<array.length;i++) {
			
			for (int j= i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					var  = array[i];
					array[i] = array[j];
					array[j] = var;
					
				}
				
			}
		}
		System.out.println("Sorted Array:");
		for(int val: array) {
			System.out.println(val);
		}
		
		
		// Using JAVA Stream API
		System.out.println("2nd sorting");
		 List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6);

	        // Sorting the list using Java 8 Stream API
	        List<Integer> sortedNumbers = numbers.stream()
	                                             .sorted()
	                                             .collect(Collectors.toList());

	        // Print the sorted list
	        System.out.println("Sorted Numbers: " + sortedNumbers);
		
	}
	
	

}
