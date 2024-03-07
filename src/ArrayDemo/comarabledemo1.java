package ArrayDemo;

import java.util.ArrayList;
import java.util.Collections;

public class comarabledemo1 {
	
	public static void main(String[] args) {
		 ArrayList<comparabledemo> arraylist = new ArrayList<comparabledemo>();
		    arraylist.add(new comparabledemo(111, "John", 30));
		    arraylist.add(new comparabledemo(333, "Ronaldo", 31));
		    arraylist.add(new comparabledemo(222, "Messi", 29));
		    
		    System.out.println(arraylist);
		    Collections.sort(arraylist);
		    System.out.println(arraylist);
	}

}
