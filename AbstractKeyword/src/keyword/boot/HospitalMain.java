package keyword.boot;

import keyword.app.Hospital;
import keyword.app.VishwasHospital;

public class HospitalMain {
	public static void main(String[] args) {
		System.out.println("Invoking hospital in main");
		
		Hospital hosp=new VishwasHospital();
		System.out.println("calling abstract methods");
		hosp.assignNurse();
		hosp.generateBill();
		hosp.scheduleAppointment();
		hosp.performTests();
		hosp.assignSpecialWard();
		
		System.out.println("calling normal metrhods");
		hosp.admitPatient();
		hosp.dischargePatient();
		hosp.performSurgery();
		hosp.prescribeMedcation();
		hosp.viewPatient();
	}

}