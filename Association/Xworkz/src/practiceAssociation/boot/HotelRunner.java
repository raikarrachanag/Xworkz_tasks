package practiceAssociation.boot;

import practiceAssociation.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking main in HotelRunner");
		Hotel hotel = new Hotel();
		hotel.food();
		hotel.owner();
	}
}
