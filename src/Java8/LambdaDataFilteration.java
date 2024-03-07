package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	 int id;
	 String name;
	float price;
	
	Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	

}

public class LambdaDataFilteration {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "mobile", 10000));
		list.add(new Product(2, "laptop", 30000));
		list.add(new Product(3, "CPU", 40000));
		
		 Stream<Product> priceList = list.stream().
				                          filter(p -> p.price>1000);
		 
		 priceList.forEach(
				 (n) -> System.out.println(n.toString()));
		 
		 

		 List<Float> priceList1 = list.stream().
				                          filter(p -> p.price>10000).
				                          map(p -> p.price).
				                          collect(Collectors.toList());
		 
		 System.out.println("priceList1.."+priceList1);
		 
		 List<Integer> list1 = new ArrayList<>();
		 
			for(int i=1; i<=100;i++) {
				if(i%2==0) {
					list1.add(i);
				}
			}
			
			List<Integer> list2 = Stream.iterate(1, i->i<=100, i->i+1)
					.filter(i->i%2==0)
					.collect(Collectors.toList());
			
			Stream.iterate(1, i->i<=100, i->i+1)
			.filter(i-> i%2==0)
			.forEach(System.out::println);
			
			
			String input = "aabbzabczaz";
	        String output = compressString(input);
	        System.out.println("Output: " + output);
			
				
			
	}
	
	
	public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        StringBuilder compressedString = new StringBuilder();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        
        
        for (Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            for(int j=1;j<= entry.getValue();j++) {
            	compressedString.append(entry.getKey());
            }
        }
        

        return compressedString.toString();
    }
	
		

}
