package compareDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemoMain {
	
	public static void main(String[] args) {
		
		List<ComparatorDemo> list = new ArrayList<>();
		list.add(new ComparatorDemo(10, "JavaLearn", 150));
		list.add(new ComparatorDemo(15, "JavaCode", 200));
		list.add(new ComparatorDemo(25, "JavaBase", 100));
		list.add(new ComparatorDemo(1, "JavaByJohn", 300));
		
		//1st way 
		
		ComparatorDemo1 com = new ComparatorDemo1();
		Collections.sort(list,com);
		System.out.println(list);
		
		
		// 2nd way
		
		Collections.sort(list, new Comparator<ComparatorDemo>() {

		
			@Override
			public int compare(ComparatorDemo o1, ComparatorDemo o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("2nd way List:" +list);
		
		// 3rd way Using java8 
		
		Collections.sort(list, (o1,o2) ->{
			return o1.getId()-o2.getId();
		});
		System.out.println("3rd way :"+list);
		
	
	}
	
	
	
	
	
	
	

}
