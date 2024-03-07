package ArrayDemo;

public class comparabledemo implements Comparable<comparabledemo>{
	
	private String studentname;
    private int rollno;
    private int studentage;
	public String getStudentname() {
		return studentname;
	}
	
	
	@Override
	public int compareTo(comparabledemo o) {
		
		return this.getStudentage() - o.getStudentage();
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
	public comparabledemo(int rollno, String studentname,int studentage) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.studentage = studentage;
	}
	@Override
	public String toString() {
		return "comparabledemo [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
	
  
}
