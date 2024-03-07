package String;

public class LonggestCommonPrefix {
	

	  public static String findCommonPrefix(String[] strs) { if (strs == null ||
	  strs.length == 0) { return ""; }
	  
	  String prefix = strs[0]; // Initialize with the first string
	  System.out.println("prefix..."+prefix); 
	  for (int i = 1; i < strs.length; i++)
	  { 
		  System.out.println("..."+strs[i]); 
		  while (strs[i].indexOf(prefix) != 0) {
	  System.out.println("................"+strs[i].indexOf(prefix));
	  System.out.println(prefix.substring(0, prefix.length() - 1)); 
	  prefix =prefix.substring(0, prefix.length() - 1);
	  System.out.println("prefix..."+prefix); } }
	  
	  
	  return prefix; }
	 

    public static void main(String[] args) {
    	LonggestCommonPrefix c = new LonggestCommonPrefix();
    	
     
}
    
}







