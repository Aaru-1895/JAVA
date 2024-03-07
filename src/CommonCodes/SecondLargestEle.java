package CommonCodes;

import java.util.Arrays;
import java.util.List;

public class SecondLargestEle {
	public static void main(String[] args) {
		
		int temp =0;
		
		int[] arr = {1,2,5,3,4,6,7,8};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j =i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("2nd Largest value of array is:"+(arr.length-1));
		
		
		//2nd way 
		List<Integer> mylist = Arrays.asList(1,2,5,3,4,6,7,8);
		int number = mylist.stream().sorted((o1,o2) -> o2.compareTo(o1)).skip(2).findFirst().orElse(null);
		
		System.out.println("Largest number:"+number);
		
		
	}
	
	
}
