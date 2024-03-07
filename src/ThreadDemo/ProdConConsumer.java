package ThreadDemo;

public class ProdConConsumer extends Thread{
	ProdConComapny comapny;
	
	ProdConConsumer(ProdConComapny comapny){
		this.comapny = comapny;
	}
	
	 @Override
	    public void run() {
	     try {
			comapny.consume_Product();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
		 
	    }
}
