package keyword.app;

public abstract class Hospital {
	public void admitPatient() {
		System.out.println("This is an admitpatient method");
	}
	
	public void dischargePatient() {
		System.out.println("This is an dischargepatient method");
	}
	public void performSurgery() {
		System.out.println("This is an perfromSugery method");
	}
	public void viewPatient() {
		System.out.println("This is an viewpatient method");
	}
	public void prescribeMedcation() {
		System.out.println("This is an admitpatient method");
	}
	
	public abstract void scheduleAppointment();
	public abstract void assignNurse();
	public abstract void generateBill();
	public abstract void performTests();
	public abstract void assignSpecialWard();
	

}
