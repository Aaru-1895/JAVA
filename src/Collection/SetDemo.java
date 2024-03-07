package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class SetDemo {
	// Try this example with or without Equals(), hashCode()
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		set.add(new Student(2, "Aaru"));
		set.add(new Student(5, "Kiru"));
		set.add(new Student(2, "Aaru"));
		
		System.out.println(set.toString());
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(5);
		set1.add(4);
		set1.add(15);
		set1.add(5);
		System.out.println(set1.toString());
		
		
		Student s1 = new Student(2, "Aaru");
		Student s2 = new Student(5, "Kiru");
		Student s3 = new Student(2, "Aaru");
		
		Map<Student, Student> map =  new HashMap<>();
		map.put(s1, new Student(2, "Aaru"));
		map.put(s2, new Student(5, "Kiru"));
		map.put(s3, new Student(2, "Aaru"));
		
		System.out.println(map.toString());
		
		Map<Integer, String> map1 =  new HashMap<>();
		
	}
	
	

}


class Student{
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	  @Override public boolean equals(Object o) { if (this == o) return true; if (o
	  == null || getClass() != o.getClass()) return false; Student student =
	  (Student) o; return id == student.id && Objects.equals(name, student.name); }
	  
	  @Override public int hashCode() { return Objects.hash(id, name); }
	 
	 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
