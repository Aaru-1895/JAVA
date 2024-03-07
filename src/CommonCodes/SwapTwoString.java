package CommonCodes;

public class SwapTwoString {
	public static void main(String[] args) {
		
		String a = "Aaru";
		String b = "Kishu";
		
        System.out.println("Before swapping:");
        System.out.println("String a: " + a);
        System.out.println("String b: " + b);

        // Swapping without a third variable
        a = a + b; // Concatenate a and b
        System.out.println("a..."+a);
        b = a.substring(0, a.length() - b.length());
        a = a.substring(a.length() - b.length()-1, a.length());
      

		System.out.println("Swaped A:"+a);
		System.out.println("Swaped B:"+b);
		
		
	}

}
