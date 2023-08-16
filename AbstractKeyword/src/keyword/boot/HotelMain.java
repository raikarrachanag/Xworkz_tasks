package keyword.boot;

import keyword.app.Hotel;
import keyword.app.UdupiHotel;

public class HotelMain {

	public static void main(String[] args) {
		System.out.println("Invoking main in hotel");
		
		Hotel hotel = new UdupiHotel();
		System.out.println("calling normal methods");
		hotel.checkIn();
		hotel.checkOut();
		hotel.bookRoom();
		hotel.viewRooms();
		hotel.roomServices();
		
		System.out.println("Calling abstract method");
		hotel.cancelRoom();
		hotel.manageStaff();
		hotel.viewOccupiedRooms();
		hotel.processPayment();
		hotel.provideFoodService();
	}

}
