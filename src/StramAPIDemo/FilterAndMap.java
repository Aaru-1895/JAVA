package StramAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
	
	FilterAndMap(){
		System.out.println("cons");
	}
	
	static {
		System.out.println(" in static block...");
		
	}
	
	
	public static void abc() {
		System.out.println("Meth call");
	}
	
	public static void main(String[] args) {
		System.out.println("main call.....");
		FilterAndMap ab = new FilterAndMap();
		abc();
		
		List<Integer> list =Arrays.asList(1,5,8,6,5,1,7);
		
		list.stream().filter(e-> e>5).forEach(System.out::println);
		
		System.out.println("other way...");
		
		/*
		 * list.stream().filter(e-> e>5).forEach(e->{ System.out.println(e); });
		 */
		
		
		
		
		
		/*************** map *****************/
		
		List<Integer> list1 = list.stream().map(a->a*2).collect(Collectors.toList()) ;
		System.out.println("list1..."+list1);
		
	}

}
