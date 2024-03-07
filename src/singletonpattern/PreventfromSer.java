package singletonpattern;

import java.io.Serializable;

public class PreventfromSer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static PreventfromSer preventfromSer = new PreventfromSer();
	
	private PreventfromSer() {
		
	}
	
	/*
	 * public static PreventfromSer getinstance() { if(preventfromSer== null) {
	 * preventfromSer = new PreventfromSer(); } return preventfromSer; }
	 */
	
	protected Object readResolveObject() {
		return preventfromSer;
		
	}
	

}
