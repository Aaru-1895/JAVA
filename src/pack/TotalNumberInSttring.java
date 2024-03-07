package pack;

public class TotalNumberInSttring {
	
	
	
	public static void test(String str) {
		
		int count=0;
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				count++;
			}
			
			
		}
		System.out.println("count of Strig..."+count);
	}
	
	
	
	public static void main(String[] args) {
		String s= "Aarti hello";
		test(s);
	}

}
