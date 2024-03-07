package CommonCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import compareDemo.comparableDemo1;

public class SortByDOBMain {
	
	public static void main(String[] args) {
		
		 
		List<SortByDOB> list = new ArrayList<>();
		list.add(new SortByDOB(1,"Aaru","24051998"));
		list.add(new SortByDOB(2,"Shivu","01011999"));
		list.add(new SortByDOB(10,"Kishu","05122020"));
		list.add(new SortByDOB(15,"Henal","20041689"));
		list.add(new SortByDOB(3,"Shivangi","03041950"));
		list.add(new SortByDOB(16,"Neha","24061736"));
		
		List<SortByDOB> sortedList = list.stream().sorted((o1,o2) -> o1.getId()-o2.getId()).collect(Collectors.toList());
		System.out.println("SOrted List : "+sortedList);
		
		//@nd Way 
		
		List<SortByDOB> sortedList1 = list.stream().
				sorted(Comparator.comparing(SortByDOB::getDob)).collect(Collectors.toList());
		
		sortedList1.forEach(System.out::println);
		
		
	}

}
