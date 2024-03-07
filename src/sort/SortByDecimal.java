package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import pack.SortList;

public class SortByDecimal {

	public static void main(String[] args) {
	
	      
		
	
	  System.out.println("Enter  Array Sze:"); Scanner sc = new Scanner(System.in);
	  int size = sc.nextInt(); double[] a = new double[size];
	  
	  System.out.println("Enter "+ size +" Elements:");
	  
	  for(int i=0;i<a.length;i++) { a[i]=sc.nextDouble(); }
	  
	  String[] strArray = new String[a.length];
	  
	  for(int i=0;i<strArray.length;i++) { strArray[i] =String.valueOf(a[i]); }
	  
	  sortByDecimalPoint(strArray); for(int i=0;i<strArray.length;i++) {
	  System.out.println(strArray[i]); }
	  
	
	}
	
	  private static void sortByDecimalPoint(String[] strArray) {
	  Arrays.sort(strArray, new Comparator<String>() {
	  
	  @Override public int compare(String o1, String o2) { String[] s =
	  o1.split("\\."); String[] s1 = o2.split("\\.");
	  if(Integer.parseInt(s[1])>Integer.parseInt(s1[1])) return 1; else return -1;
	  } });
	  
	  }
	 
	
	
	
	
	
}
