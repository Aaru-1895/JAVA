package ThreadDemo;

public class ProdConMain {
	public static void main(String[] args) {
		
		ProdConComapny com = new ProdConComapny();
		ProdConsProcucer producer = new ProdConsProcucer(com);
		ProdConConsumer consumer = new ProdConConsumer(com);
		producer.start();
		consumer.start();
		
	}

}
