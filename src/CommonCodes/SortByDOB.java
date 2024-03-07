package CommonCodes;

public class SortByDOB {
	
	private int id;
	private String eName;
	private String dob;
	
	
	public SortByDOB(int id, String eName, String dob) {
		super();
		this.id = id;
		this.eName = eName;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "SortByDOB [id=" + id + ", eName=" + eName + ", dob=" + dob + "]";
	}
	
	
	
	

}
