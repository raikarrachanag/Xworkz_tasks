package keyword.app;

public class VishwasHospital extends Hospital{

	@Override
	public void scheduleAppointment() {
		System.out.println("this is an abstarct method-scheduleappointment");
		
	}

	@Override
	public void assignNurse() {
		System.out.println("this is an abstarct method-assignNurse");
		
		
	}

	@Override
	public void generateBill() {
		System.out.println("this is an abstarct method-generateBill");
		
		
	}

	@Override
	public void performTests() {
		System.out.println("this is an abstarct method-performTests");
		
		
	}

	@Override
	public void assignSpecialWard() {
		System.out.println("this is an abstarct method-assignSpecialWard");
		
	}
	


}
