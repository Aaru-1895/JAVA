package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableList {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> mutableList = new ArrayList<>();
	     mutableList.add("Item 1");
	     mutableList.add("Item 2");
	     mutableList.add("Item 3");

	     // Make the ArrayList unmodifiable
	     List<String> unmodifiableList = Collections.unmodifiableList(mutableList);

	     // Try to modify the unmodifiable list - This will throw UnsupportedOperationException
	      //unmodifiableList.add("Item 4"); // Uncommenting this line will result in an exception

	     // Print the original and unmodifiable lists
	     System.out.println("Original List: " + mutableList);
	     System.out.println("Unmodifiable List: " + unmodifiableList);
	     
	     
		
	}
	 

}
