package pack;

public class FibonaciSerious {
	/*public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= 20; i++) {
			System.out.print(a + ", ");

            a = b;
			b = c;
			c = a + b;
		}
		
		
	}*/
	public static void main(String[] args) {
		int n1=0 , n2=1,n3;
		System.out.print(n1 +" "+n2);
		
		for(int i=1;i<20;i++) {
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			
		}
	   
	}

}
