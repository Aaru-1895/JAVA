package pack;


public class StringPermutation {
	
	
	public static void findpurmutation(String s, String String2) {
		
		if (s.length() == 0) 
        {
          System.out.print(String2 + " ");
          return;
        }
		
		for (int i=0;i<s.length();i++){
			char c= s.charAt(i);
			System.out.println("char,,,,,"+c);
			System.out.println("1st sub...."+s.substring(0, i));
			System.out.println("1st sub...."+s.substring(i+1));
			String str = s.substring(0, i)+s.substring(i + 1);
			System.out.println("str..."+str   +" string2 val "+String2 +c);
			System.out.println(str +String2 +c);
			findpurmutation(str,String2+c);
		}
		
	}
	
	
	public static void main(String[] args) {
		String s="cat";
		findpurmutation(s, "");
		
	}

}
