package String;

public class StringToInteger {
	static String str="1234";
	public static void main(String[] args) {
		
		
		int val = Integer.parseInt(str);
		System.out.println("Integer val.."+val);
		
		
		//Object object =  "1234";
		Object object =  1234;
		Integer intval;
		String s;
		if(object instanceof String) {
			intval = Integer.parseInt(object.toString());
            System.out.println("Gets String! Integer of String is "+intval+" class : "+intval.getClass().getName());

		}
		if(object instanceof Integer) {
			s = Integer.toString((Integer)object);
            System.out.println("Gets String! Integer of String is "+s+" class : "+s.getClass().getName());

		}
		
	}
	
	
	

}
