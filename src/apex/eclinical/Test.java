package apex.eclinical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Aarti", "abc", "123"));
		list.add(new Student(2, "Priya", "XYS", "123"));
		list.add(new Student(3, "Nehu", "abc", "123"));
		list.add(new Student(4, "Kishu", "abc", "123"));
		
		Collections.sort(list);
		
		System.out.println(list.toString());
		
	}

}

/*
 * public class Demo1 {
 * 
 * static String name = "test";
 * 
 * public static void main(String[] args) { Demo1 o1 = new Demo1(); o1.name =
 * "Hello"; System.out.println(o1.name);
 * 
 * Demo1 o2 = new Demo1(); System.out.println(o2.name);
 * System.out.println(Demo1.name);
 * 
 * } }
 */

//declaration 

/*
 * set<String> set = new HashSet<String>(); List<String> list - New
 * ArrayList<String>();
 * 
 * Map<key,Value> map = new hashMap<key,Value>();
 */
