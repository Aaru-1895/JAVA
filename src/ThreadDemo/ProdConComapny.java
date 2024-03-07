package ThreadDemo;

public class ProdConComapny {
	
	int n;
	boolean f=false;
	// f=false: chance: producer
	//f=true: chance :consumer
	synchronized public void produce_Product(int n)throws Exception
	{
		if(f)
		{
			System.out.println("..."+f);
			wait();
		}
		this.n=n;
		System.out.println("Produced : "+this.n);
		f=true;
		System.out.println();
		notify();
	}

	synchronized public int consume_Product()throws Exception
	{
		if(!f)
		{
			System.out.println("f is .."+f);
			wait();
		}
		System.out.println("Consumed : "+this.n);
		f=false;
		notify();
		return this.n;
	}
	
}
