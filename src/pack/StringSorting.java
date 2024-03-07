package pack;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StringSorting {

	 public static void main(String[] args) {

	     String str  = "Content managementsystem for lawyers and business owners,similar to Facebook but for work. One can create tasks, add events, upload and share files, and also give rights to other users in order to view manage and edit events and tasks. Being a part of the Admin team, we had the facet in user management as the key part of the module";

	     HashMap<String,Integer> duplicateWords = new HashMap<String, Integer>();

	     String [] brokenDown = str.split(" ");

	     for(int i = 0 ; i < brokenDown.length;i++){

	         if(duplicateWords.containsKey(brokenDown[i])){
	                int counter = duplicateWords.get(brokenDown[i]);
	                counter += 1 ;
	                duplicateWords.put(brokenDown[i],counter);
	         }
	         else{
	             duplicateWords.put(brokenDown[i],1);
	            
	         }
	     }
	     System.out.println("duplicateWords.."+duplicateWords);
	     HashMap<String,Integer> duplicateWordsFinal = new HashMap<String, Integer>();

	     for (Map.Entry<String,Integer> mapElement : duplicateWords.entrySet()) {
	         String key = mapElement.getKey();

	         // Adding some bonus marks to all the students
	         int value = mapElement.getValue();

	        if(value>1){
	            duplicateWordsFinal.put(key,value);
	        }


	         // Printing above marks corresponding to
	         // students names

	     }

	     System.out.println("All words and occurances : "+duplicateWords);
	     System.out.println("Only Duplicate words and occurances : "+duplicateWordsFinal);

	     Map<String, Integer> hm1 = sortByValue(duplicateWordsFinal);

	     for (Map.Entry<String, Integer> en : hm1.entrySet()) {
	         System.out.println("Key = " + en.getKey() +
	                 ", Value = " + en.getValue());
	     }

	    }

	    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
	    {
	        // Create a list from elements of HashMap
	        List<Map.Entry<String, Integer> > list =
	                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

	        // Sort the list
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
	            public int compare(Map.Entry<String, Integer> o1,
	                               Map.Entry<String, Integer> o2)
	            {
	                return (o1.getValue()).compareTo(o2.getValue());
	            }
	        });

	        // put data from sorted list to hashmap
	        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
	        for (Map.Entry<String, Integer> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        return temp;
	    }
	
}
