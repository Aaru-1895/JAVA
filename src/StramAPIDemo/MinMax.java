package StramAPIDemo;

import java.util.List;

public class MinMax {
	
	
	
	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1,5,8,2,6,1,10,4,6,3);
		
		int i=list1.stream().min((x,y)-> x.compareTo(y)).get();
		System.out.println("min Val..."+i);
		
		int maxval =list1.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println("maxval..."+maxval);
		
		 
	}

}
