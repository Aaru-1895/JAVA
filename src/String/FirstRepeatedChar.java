package String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirstRepeatedChar {
	
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

	    list.add("Item 1");
	    list.add("Item 2");
	    list.add("Item 3");

	    // Create an iterator
	    Iterator<String> iterator = list.iterator();

	    // Iterating through the list
	    while (iterator.hasNext()) {
	        String item = iterator.next();

	        
	        // Modify the list (this won't affect the iterator)
	        if (item.equals("Item 2")) {
	        }
	        
	        System.out.println(list);
	    }

	    // The iterator is fail-safe and won't throw ConcurrentModificationException
	}
	}
	
	/*
	 * public static Character findDuplicate(String s) { Character c = null;
	 * Set<Object> set = new HashSet<>();
	 * 
	 * for(int i =0;i<s.length();i++) { if(set.contains(s.charAt(i))) { return
	 * s.charAt(i); }else { set.add(s.charAt(i)); }
	 * 
	 * } return null;
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * String s = "wordwrap"; Character c= findDuplicate(s);
	 * System.out.println("Repeated Character:"+c);
	 * 
	 * }
	 */
	
	


