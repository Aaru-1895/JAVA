package ArrayDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDEmo1 {
	
	public static void main(String[] args) {
		
		ArrayList<ComparatorDemo> arraylist = new ArrayList<ComparatorDemo>();
	    arraylist.add(new ComparatorDemo(111, "John", 30));
	    arraylist.add(new ComparatorDemo(333, "Ronaldo", 31));
	    arraylist.add(new ComparatorDemo(222, "Messi", 29));
	    
	    
	    System.out.println("befor sorting.."+arraylist);
	    Collections.sort(arraylist, new AgeComparator());
	    
	    System.out.println("after sorting..."+arraylist);
	    
	    
	    ArrayList<ComparatorDemo> list1 = new ArrayList<>(arraylist);
	    
	    Collections.sort(list1, new NameComparator());
	    System.out.println("list1 "+list1);
		
	}

}
