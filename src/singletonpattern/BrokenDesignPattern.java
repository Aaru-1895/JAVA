package singletonpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrokenDesignPattern {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		SingletonePattern originalVal = SingletonePattern.getInstance();
		SingletonePattern DuplicateVal = SingletonePattern.getInstance();
		System.out.println("originalVal is : "+originalVal.hashCode());
		System.out.println("DuplicateVal is : "+DuplicateVal.hashCode());
		
		//Using Reflection 
		
		Constructor constructor	= SingletonePattern.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonePattern reflactedVal = (SingletonePattern) constructor.newInstance();
		System.out.println("Using Reflection----------------------------");
		System.out.println("originalVal is : "+originalVal.hashCode());
		System.out.println("reflactedVal is : "+reflactedVal.hashCode());
		
		
		//Using Serialization Deserialization
		
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("D:\\Break-Singleton.ser"));
		obj.writeObject(originalVal);
		obj.close();
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Break-Singleton.ser"));
		SingletonePattern serializedVal = (SingletonePattern) objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println("Using Serialization----------------------------");
		System.out.println("originalVal is : "+originalVal.hashCode());
		System.out.println("serializedVal is : "+serializedVal.hashCode());
		
		
		//Using Cloning
		
		SingletonePattern cloneVal = (SingletonePattern) originalVal.clone();
		
		System.out.println("Using Cloning----------------------------");
		System.out.println("originalVal is : "+originalVal.hashCode());
		System.out.println("cloneVal is : "+cloneVal.hashCode());
		
		
			
		
	}

}
