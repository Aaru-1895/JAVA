package pack;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		
		String s1 = "HEART";
		String s2 ="EARTH";
		
		
		char[] s3 =s1.toCharArray();
		char[] s4 =s2.toCharArray();
		
		  Arrays.sort(s3);
		  Arrays.sort(s4);
		  
		  System.out.println(s3 +""+ s4);
		  if(Arrays.equals(s3, s4)) {
			  System.out.println("string is Anagram");
		  }else {
			  System.out.println("string is not Anagram");
		  }
	}
	
	/*
	 * select d.deptName, count(e.deptId) from test.dept d left join test.emp e on
	 * e.deptId = d.deptId group by d.deptId order by d.deptName ASC;
	 */

}
