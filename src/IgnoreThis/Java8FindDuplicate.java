package IgnoreThis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8FindDuplicate {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,87,10,20,76,80,80,80);
		
		Set<Integer> set = new HashSet<>();
		list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
		
	
		
		
	}

}
