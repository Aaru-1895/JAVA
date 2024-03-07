package pack;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(List.of(1,4,10,7,13,69,88));
		List<Integer> l2 = new ArrayList<>(List.of(89,1,4,7,13,10));
		
		
		/*
		 * for (int i=0; i<l1.size();i++) {
		 * 
		 * for (int j=0;j<i;j++) {
		 * 
		 * if(l2.contains(l1.get(i))) { continue; }else {
		 * System.out.println("Missing..."+l1.get(i)); break; }
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<l1.size();i++) {
			
			
			for( int j=0; j<i; j++) {
				
				if(l2.contains(l1.get(i))) {
					continue;
				}else {
					list.add(l1.get(i));
					break;
					
				}
			}
			
		}
		System.out.println("Missing values are ...."+list);
		
	}

}
