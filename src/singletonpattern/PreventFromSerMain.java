package singletonpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class A{  
  A msg(){System.out.println("Hello java");
return this;}  
}  
  
 class Simple extends A{  
	 Simple msg(){System.out.println("Hello java");
return this;}}//C.T.Error  

public class PreventFromSerMain {
	



public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	PreventfromSer originalVal = PreventfromSer.preventfromSer;
	
	ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("D:\\Break-Singleton.ser"));
	obj.writeObject(originalVal);
	obj.close();
	
	ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Break-Singleton.ser"));
	PreventfromSer serializedVal = (PreventfromSer) objectInputStream.readObject();
	objectInputStream.close();
	
	System.out.println("Using Serialization----------------------------");
	System.out.println("originalVal is : "+originalVal.hashCode());
	System.out.println("serializedVal is : "+serializedVal.hashCode());
	
	 
	
	
	
	
	
}
}
