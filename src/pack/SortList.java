package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

//public  class SortList implements Comparator<String>{
	public  class SortList{
	
	/*
	@Override
	public int compare(String version1, String version2) {
		 String[] v1 = version1.split("\\.");
	        String[] v2 = version2.split("\\.");
	        System.out.println("v1..."+v1.toString());
	        int major1 = major(v1);
	        int major2 = major(v2);
	        if (major1 == major2) {
	            return minor(v1).compareTo(minor(v2));
	        }
	        return major1 > major2 ? 1 : -1;
	    }

	    private int major(String[] version) {
	        return Integer.parseInt(version[0]);
	    }

	    private Integer minor(String[] version) {
	        return version.length > 1 ? Integer.parseInt(version[1]) : 0;
	    }
	
	
	
	
	public static void main(String... args) {
		String[] list = {"2.1", "3.6" , "4.2","1.6"};
		List<String> list1 = Arrays.asList(list);
	    list1.sort(new SortList());
	    for (String el : list1) {
	        System.out.println(el);
	}
	*/
	
	/*
	 * public static void main(String... args) { String[] arr = { "1.5", "2.6",
	 * "3.1", "5.1", "5.10", "5.2", "5.20", "6.0" };
	 * 
	 * ToIntFunction<String> sortByIntegerPart = doubleNumber -> { int pos =
	 * doubleNumber.indexOf('.'); String str = pos == -1 ? doubleNumber :
	 * doubleNumber.substring(0, pos); return Integer.parseInt(str); };
	 * ToIntFunction<String> sortByFractionalPart = doubleNumber -> { int pos =
	 * doubleNumber.indexOf('.'); String str = pos == -1 ? "0" :
	 * doubleNumber.substring(pos + 1); return Integer.parseInt(str); };
	 * Comparator<String> sortByIntFractParts =
	 * Comparator.comparingInt(sortByIntegerPart)
	 * .thenComparingInt(sortByFractionalPart);
	 * 
	 * List<String> sorted = Arrays.stream(arr).sorted(sortByIntFractParts)
	 * .collect(Collectors.toList()); System.out.println(sorted); }
	 * 
	 * @Override public int compare(String o1, String o2) { // TODO Auto-generated
	 * method stub return 0; }
	 */
	
	
	 public static void main(String args[]){

       List<Double> list = Arrays.asList(1.2,7.2, 4.32, 645.4, 45.68, 7473.636, 55.101);
       //List<Double> list = Arrays.asList(32.47, 585.12, 713.457, 83.1234);

       List<String> decimalList = list.stream().map(doubleToInt -> doubleToInt.toString()).collect(Collectors.toList());
//
       HashMap<Integer, String> decimalKeyValue = new HashMap<>();

       List<Integer> integerList = new ArrayList<>();

       for (int j = 0; j < decimalList.size(); j++){
    	   System.out.println(decimalList.get(j)+"..."+decimalList.get(j).split("\\.").toString());
           String[] strings = decimalList.get(j).split("\\.");
           
            
           String stringssssss = strings[1];
           
            
               System.out.println(stringssssss);
           integerList.add(Integer.parseInt(stringssssss));
           decimalKeyValue.put(Integer.parseInt(stringssssss), strings[0]+"."+stringssssss);
       }

       List<Integer> newIntegerList = integerList.stream().sorted().collect(Collectors.toList());

       for (int i = 0; i < newIntegerList.size(); i++){

           System.out.println(decimalKeyValue.get(newIntegerList.get(i)));
       }
   }

		
	
	}	
	
	


