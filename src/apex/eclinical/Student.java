package apex.eclinical;

public class Student implements Comparable<Student>{

	
	private int id;
	private String name, address, mobile;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Student(int id, String name, String address, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
}
