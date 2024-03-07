package pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DecimalSorting {
	
	public static void main(String[] args) {
		
		List<Double> doubleList = Arrays.asList(1.2,4.4, 4.32, 645.4, 45.68, 7473.636, 55.101,254.101);
		
		List<Double> list = doubleList.stream().sorted().collect(Collectors.toList());
		System.out.println("list..."+list);
		
	}

}
