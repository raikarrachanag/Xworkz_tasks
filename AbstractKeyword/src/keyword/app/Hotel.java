package keyword.app;

public abstract class Hotel {
	public void checkIn() {
		System.out.println("this is checkin method");
	}
	public void checkOut() {
		System.out.println("this is checkout method");
	}
	public void bookRoom() {
		System.out.println("this is bookroom method");
	}
	public void viewRooms() {
		System.out.println("this is viewRoom method");
	}
	public void roomServices() {
		System.out.println("this is roomservices method");
	}
	
	public abstract void cancelRoom();
	public abstract void processPayment();
	public abstract void viewOccupiedRooms();
	public abstract void manageStaff();
	public abstract void provideFoodService();
	

}