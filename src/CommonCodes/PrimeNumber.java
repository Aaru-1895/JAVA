package CommonCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumber {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<50;i++) {
			if(i%2 !=0) {
				list.add(i);
			}
		}
		System.out.println(list);
		
		// 2nd way Using java8 
		
		List<Integer> primeList = Stream.iterate(1, i->i+1).limit(50).
				filter(n-> n%2 !=0).collect(Collectors.toList());
		
		System.out.println(primeList);
	}

}
