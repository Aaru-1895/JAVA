package Java8Feature;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {
	
	public static void main(String[] args) {
		
		String sampleInput = "Hello World and Coders";
		
		String[] stringData= sampleInput.split(" ");
		
		List<StringBuffer> listData = Arrays.stream(stringData).map(x -> {
			StringBuffer stringbuffer = new StringBuffer(x);
			return stringbuffer.reverse();
		}).collect(Collectors.toList());
		Collections.reverse(listData);
		listData.stream().forEach(word ->System.out.println(word));
	
	System.out.println("listData...."+listData);
	}

}
