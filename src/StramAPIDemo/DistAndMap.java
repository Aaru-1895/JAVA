package StramAPIDemo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class DistAndMap {
	public static void main(String[] args) {
		List<Integer> val =Arrays.asList(1,5,5,6,14,20,4,3,6);
		List<Integer> val1=val.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println("val1..."+val1);
		List<Integer> val2= val.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println("Distinct.collection.."+val2);
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics prime1 = primes.stream().mapToInt(i->i).summaryStatistics();
		System.out.println("Max val is..."+prime1.getMax());
		System.out.println("MIN val is..."+prime1.getMin());
		System.out.println("Sum val is..."+prime1.getSum());
		System.out.println("average val is..."+prime1.getAverage());
	}

}
