 package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	static int[] array = { 2, 7, 11, 15 };
	static int target = 9;

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 1, 1, 1};
		segregatearray(arr, arr.length);
		//System.out.println(Arrays.toString(arr));
		

	
}
	static void segregatearray(int arr[], int size)
	{
		List<Integer> list=new ArrayList<>();
		HashMap<Integer, Integer> mapVal = new HashMap<>();
	 for(int i =0;i<size;i++) {
		 
		
			 mapVal.put(arr[i], mapVal.getOrDefault(arr[i], 0) + 1);
		 
		 
	 }
	 
	 for(int val: arr) {
		if(mapVal.containsKey(val))
		{
		 int count=mapVal.get(val);
		 for(int i=0;i<count;i++)
		 {
			 list.add(val);
		 }
		 mapVal.remove(val);
		}
		
	 }
	 
	 System.out.println(list);
	}
}