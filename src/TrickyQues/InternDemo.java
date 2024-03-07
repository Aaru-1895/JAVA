package TrickyQues;

public class InternDemo {

	 public static void main(String[] args) {
	        String s1 = "hello";
	        String s2 = new String("hello");

	        s2 = s2.intern();
	        
	       /* how does intern will work ?
	        * 
	        * The Java String class intern() method returns the interned string. It returns the canonical representation of string.

			It can be used to return string from memory if it is created by a new keyword. It creates an exact copy of the heap string object in the String Constant Pool.
	        * If string is present in scp then ref will return*/ 
	        System.out.println(s1 == s2);
	    }
}
