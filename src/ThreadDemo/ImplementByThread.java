package ThreadDemo;

public class ImplementByThread extends Thread{
	
	@Override
	public void run(){
		
		for(int i=10;i>=1;i--) {
			System.out.println("my Value is :"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		/*
		 * ImplementByThread obj = new ImplementByThread(); obj.start();
		 */
	}

}
