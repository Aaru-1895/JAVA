package pack;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StringCount {
	
	public static void main(String[] args) {
		
	     String str  = "Content managementsystem for lawyers and business owners,similar to Facebook but for work. One can create tasks, add events, upload and share files, and also give rights to other users in order to view manage and edit events and tasks. Being a part of the Admin team, we had the facet in user management as the key part of the module";
	     String[] brokenString = str.split(" ");
	     
	     HashMap<String,Integer> duplicateWords = new HashMap<String, Integer>();
	     
	     for(int i=0;i<brokenString.length;i++) {
	    	 if(duplicateWords.containsKey(brokenString[i])) {
	    		 int counter = duplicateWords.get(brokenString[i]);
	    		 counter += 1 ;
	    		 duplicateWords.put(brokenString[i], counter);
		     }else {
		    	 duplicateWords.put(brokenString[i], 1);
		     }
	     }
	     System.out.println(duplicateWords);
	     Map<String, Integer> hm1 = sortByValue(duplicateWords);
	     
	     
	     for(Map.Entry<String, Integer> en :hm1.entrySet()) {
	    	 System.out.println("Key "+en.getKey() +" value "+en.getValue());
	    	
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
