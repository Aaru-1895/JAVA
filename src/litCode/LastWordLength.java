package litCode;

public class LastWordLength {
	
	
	/*****************1st way ***********************/
	
	public static int getWordLength(String s) {
		int num =0;
		for (int i=s.length()-1; i>=0; i--) {
			
			if(s.charAt(i) == ' ') {
				break;
			}
			num++;
		}
		return num;
		
	}
	
	/*****************2nd way ***********************/
	public static int getWordLengthWithArray(String s) {
		int num =0;
		String[] word = s.split("\\s");
		num = word[word.length-1].length();
		return num;
		
	}
	
	public static void main(String[] args) {
		int length =  LastWordLength.getWordLength("Hello World");
		int length1 =  LastWordLength.getWordLengthWithArray("Hello World");
		System.out.println("length.."+length);
		System.out.println("length1.."+length1);
		
	}

}
