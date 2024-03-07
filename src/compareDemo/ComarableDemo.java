package compareDemo;

import java.util.Comparator;

public class ComarableDemo implements Comparable<ComarableDemo>{
	
	private int id;
	private String fname;
	private String lname;
	private String mobile;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

	public ComarableDemo(int id, String fname, String lname, String mobile) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
	}
	/*****************************For int value*************************************/
	/*
	 * @Override public int compareTo(ComarableDemo o) {
	 * 
	 * return this.getId() - o.getId(); }
	 */
	
	/*******************************for String value************************************/
	
	@Override
	public int compareTo(ComarableDemo o) {
		
		return this.fname.compareTo(o.fname);
	}

	@Override
	public String toString() {
		return "ComarableDemo [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + "]";
	}

	
	
	
	

}
