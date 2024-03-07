package ArrayDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIeration {
	public static void main(String[] args) {
		
		
		Set<String> hashset = new HashSet<>(); 
		hashset.add("Pear");
	    hashset.add("Apple");
	    hashset.add("Orange");
	    hashset.add("Papaya");
	    hashset.add("Banana"); 
	    
	    Iterator<String> itr = hashset.iterator();
		/* System.out.println(itr.next()); */
		
		  while(itr.hasNext()) { 
			  System.out.println(itr.next()); }
		 
	    
	    System.out.println("using for each");
	    
		/*
		 * for(String s:hashset) { System.err.println(s); }
		 */
	}

}
