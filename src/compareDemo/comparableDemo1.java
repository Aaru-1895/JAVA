package compareDemo;

import java.util.ArrayList;
import java.util.Collections;

public class comparableDemo1 {
	
	
	public static void main(String[] args) {
		ArrayList<ComarableDemo> dataList = new ArrayList<ComarableDemo>();
		
		dataList.add(new ComarableDemo(1, "Aaru", "Prajapati", "123"));
		dataList.add(new ComarableDemo(12, "Krishu", "Prajapati", "111"));
		dataList.add(new ComarableDemo(2, "Shivu", "Patel", "102"));
		dataList.add(new ComarableDemo(20, "pihu", "Patel", "222"));
		dataList.add(new ComarableDemo(35, "Richu", "soni", "147"));
		
		System.out.println("Before sorting  .."+dataList);
		Collections.sort(dataList);
		System.out.println("After sorting  .."+dataList);
		
	}

}
