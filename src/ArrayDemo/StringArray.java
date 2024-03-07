package ArrayDemo;

public class StringArray {
	 public static void main(String[] args) 
	    { 
	      String[] strArray = { "Book", "Pencil", "Eraser", "Color", "Pen" };
	        boolean found = false;
	        int index = 0;
	        String searchStr = "Pen";
	       for (int i = 0; i <strArray.length; i++) {
	       if(searchStr.equals(strArray[i])) {
	            index = i; 
	            found = true; 
	            break;
	            }
	        }
	       if(found)
	          System.out.println(searchStr +" found at the index "+index);
	        else
	          System.out.println(searchStr +" not found in the array");

}
}

   