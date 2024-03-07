package TrickyQues;

public class Tricky {
	public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String args[]) {
    	Tricky test = new Tricky();
        test.print(10);
        
        String s = new String("5rtrt");
        System.out.println(5 + 10 + s + 10 * 2);
    }
}