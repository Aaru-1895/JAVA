package ThreadDemo;

public class ProdConsProcucer extends Thread{
	
	ProdConComapny comapny;
	
	ProdConsProcucer(ProdConComapny c){
		this.comapny = c;
		
	}
	
	@Override
    public void run() {
		
		int i=1;
		while(true)
		{
			try {
				this.comapny.produce_Product(i);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try{Thread.sleep(1000);}catch(Exception e){}
			i++;
		}
	}
        
    }


