package StramAPIDemo;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningDemo {
	
	public static void main(String[] args) {
		
		
		List<String> cities = List.of("amd", "guj","surat" , "deesa","pln");
		List<String> cities1 = cities.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		String cities2 = cities.stream().map(x->x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println("cities1..."+cities1);
		System.out.println("cities2..."+cities2);
}
}