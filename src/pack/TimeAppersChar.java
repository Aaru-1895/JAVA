package pack;

public class TimeAppersChar {
	
	
	public static void main(String[] args) {
		
		 String str1 = new String("interviewbit");
		 String str2 = new String("INTERVIEWBIT");
		 System.out.println("..............."+ (str1 == str2));
		 
		 String str3 = "interviewbit";
		 String str4 ="INTERVIEWBIT";
		 System.out.println("..............."+ (str3 == str4));
		 
		String str= "Aarati";
		char c='e';
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				count++;
			}
		}
		System.out.println("Accurence of e "+count);
		
	}

}
