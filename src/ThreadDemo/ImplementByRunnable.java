package ThreadDemo;

public class ImplementByRunnable implements Runnable{

	@Override
	public void run(){
		
		for(int i=1;i<=10;i++) {
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
		System.out.println("....");
		ImplementByRunnable obj= new ImplementByRunnable();
		
		Thread t = new Thread(obj);
		t.start();
		
		ImplementByThread obj1 = new ImplementByThread();
		obj1.start();
		
	}

}
