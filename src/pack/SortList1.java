package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortList1 {

public static void main(String[] args) {

//  List<Double> list = Arrays.asList(1.2, 4.32, 645.4, 45.68, 7473.636, 55.101);
  List<Double> doubleLiist = Arrays.asList(1.2, 4.32, 645.4, 45.68, 7473.636, 55.101,254.101);
  
  List<String> stringList = doubleLiist.stream().map(doubleToString -> doubleToString.toString()).collect(Collectors.toList());
  List<Integer> intList = new ArrayList<>();
  Map<Integer, String> mapVal =new HashMap<>();
  for(int i=0;i<stringList.size();i++) {
	  
	  String[] s= stringList.get(i).split("\\.");
	  
	  String s1=s[1];
	  
	  intList.add(Integer.parseInt(s1));
	  
	  mapVal.put(Integer.parseInt(s1), stringList.get(i));
	  
  }
   
  List<Integer> list = intList.stream().sorted().collect(Collectors.toList());
  for(int i=0;i<list.size();i++) {
	  System.out.println(mapVal.get(list.get(i)));
  }
}
}

