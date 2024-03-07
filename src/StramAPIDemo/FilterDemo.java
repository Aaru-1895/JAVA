package StramAPIDemo;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> result = intList.stream().filter(val -> (val%2)==0).collect(Collectors.toList());
		System.out.println("result..."+result);
		
		//List<Integer> mapUseList = intList.stream().map(val ->val == 2).collect(Collectors.toList());
		
		
	}

}
