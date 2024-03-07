package Collection.Arraya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class ArrayDemo {
	
	public static List getVal() {
		List list = new ArrayList<>();
		int[] array = {5, 10, 20, 15,25,22};
		
		for(int i=1; i<array.length;i++) {
			
			if(array[i-1]<array[i] && array[i] > array[i+1]) {
				list.add(array[i]);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		list.add(1);
		list.add("se");
		list.add(null);
		Collections.unmodifiableList(list);
		list.add(5);
		System.out.println(list);
		
		
		int swapNumber ;
		
		
		List val = getVal();
		System.out.println("val..."+val);
		
		
		
		
        
}
}