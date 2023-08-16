package keyword.app;

public class UdupiHotel extends Hotel{

	@Override
	public void cancelRoom() {
		System.out.println("this is abstract method-cancelRoom");
	}

	@Override
	public void processPayment() {
		System.out.println("this is abstract method-processpayment");
		
	}

	@Override
	public void viewOccupiedRooms() {
		System.out.println("this is abstract method-viewOccupiedRoom");
	}

	@Override
	public void manageStaff() {
		System.out.println("this is abstract method-manageStaff");
		
	}

	@Override
	public void provideFoodService() {
		System.out.println("this is abstract method-foodservice");
		
	}

}