package ArrayDemo;

public class ComparatorDemo {

	private String studentname;
    private int rollno;
    private int studentage;
	public ComparatorDemo(int rollno,String studentname, int studentage) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.studentage = studentage;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	@Override
	public String toString() {
		return "ComparatorDemo [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
	
	 
	
}
