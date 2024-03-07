package pack;

import java.util.List;
import java.util.stream.Collectors;

public class ListContainOddNo {
	public static void main(String[] args) {
		
		List<Integer> l =List.of(1,2,5,8,454,4,6,9,10);
		List<Integer> l1 = l.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		
		/*
		 * for(int i=l.size()-1;i>0;i--) { System.out.println(l.get(i)); }
		 */
				
	}

}
