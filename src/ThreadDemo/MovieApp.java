package ThreadDemo;



class Bookticket{
	
	int total_seats=10;
	synchronized public  void  booking(int bookSeats) {
		if(total_seats >= bookSeats) {
			System.out.println("booking is confirm !!! "+bookSeats);
			total_seats = total_seats-bookSeats;
			System.out.println("Available seats "+total_seats);
		}
		else {
			System.out.println("sorry booking is not confirm cause Available Seats  are.."+total_seats);
		}
	}
	
}

public class MovieApp extends Thread{
	 static Bookticket b;
	int seats;
	public void run() {
		b.booking(seats);
	}
	
	public static void main(String[] args) {
		b= new Bookticket();
		MovieApp mapp = new MovieApp();
		mapp.seats=7;
		mapp.start();
		
		MovieApp mapp1 = new MovieApp();
		mapp1.seats=6;
		mapp1.start();
	}

}
