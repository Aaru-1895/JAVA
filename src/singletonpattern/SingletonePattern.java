package singletonpattern;

import java.io.Serializable;

public class SingletonePattern implements Serializable, Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonePattern sigPattern;
	
	private SingletonePattern() {
		
	} 
	
	public static SingletonePattern getInstance() {
		if (sigPattern == null) {
			synchronized (SingletonePattern.class) {
				if (sigPattern == null) {
					sigPattern = new SingletonePattern();
				}
			}
		}
		return sigPattern;
	}

	public void checkInstance() {
		System.out.println("hash value of the singletonClass "+sigPattern);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
