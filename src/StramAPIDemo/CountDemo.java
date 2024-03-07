package StramAPIDemo;

import java.util.Arrays;
import java.util.List;

public class CountDemo {
	
	public static void main(String[] args) {
		
		List<String> listData = Arrays.asList("as", "sds","sdsd","daewreew","","rtrthr" ,"");
		long cnt = listData.stream().filter(x->!x.equalsIgnoreCase("")).count();
		int emptyCount = (int)listData.stream().filter(x->x.isEmpty()).count();
		int Count = (int)listData.stream().filter(x->x.length()>3).count();
		int startWith = (int)listData.stream().filter(x->x.startsWith("s")).count();
		System.out.println("Non empty Strinng count.."+cnt);
		System.out.println("Empty String count.."+emptyCount);
		System.out.println("Length Greater than 3 count.."+Count);
		System.out.println("Start with s count.."+startWith);
	}

}
