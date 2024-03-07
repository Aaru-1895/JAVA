package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {
	 public static void main(String[] args) {
	        String s1 = "AABBCC";
	        String s2 = "ABBBCC";
	        System.out.println(checkAnagram(s1,s2));

	        List<Integer> intList = List.of(1,2,3,4,5,6,7);
	        List<Integer> newList = intList.stream().filter(e-> e>3).collect(Collectors.toList());
	       System.out.println("newList..."+newList);
	        

	    }

	    public static int checkAnagram(String s1,String s2){
	        boolean flag = false;
	        char[] string1Array = s1.toLowerCase().toCharArray();
	        char[] string2Array = s2.toLowerCase().toCharArray();
	        Arrays.sort(string1Array);
	        Arrays.sort(string2Array);
	        return Arrays.compare(string1Array,string2Array);
	    }

}
