package ArrayDemo;

import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		
		/**************convert list to array*************/
		
		List<Integer> l1 = Arrays.asList(1,2,74,4,55,5,4);
		Integer[] a1 = (Integer[]) l1.toArray();
		
		Integer[] a = new Integer[l1.size()];
		for(int i=0; i<l1.size();i++) {
			a[i] = l1.get(i);
		}
		
		/******Iterate array*******/
		for(Integer data:a) {
			System.out.println(data);
		}
	}
	
	

}
