package practiceAssociation.app;

public class Hospital {

	public String name;
	public Doctor doctor;
	public Nurse nurse;
	public Patient patient;
	
	public void treatment()
	{
		System.out.println("Invoking treatment in hospital");
		if(doctor!=null)
		{
			this.doctor.stethoscope();
		}
		else
		{
			System.out.println("Not operate stethoscope Method");
		}
	}
	public void rooms()
	{
		System.out.println("Invoking rooms in hospital");
		if(doctor!=null)
		{
			this.doctor.whiteCoat();
		}
		else
		{
			System.out.println("Not operate whiteCoat Method");
		}
	}
	public void doctors()
	{
		System.out.println("Invoking doctors in Hospital");
		if(nurse!=null)
		{
			this.nurse.injection();
		}
		else
		{
			System.out.println("Not operate injection Method");
		}
	}
	public void xrayMachine()
	{
		System.out.println("Invoking xrayMachine in Hospital");
		if(nurse!=null)
		{
			this.nurse.tools();
		}
		else
		{
			System.out.println("Not operate tools Method");
		}
	}
	public void medicalShop()
	{
		System.out.println("Invoking medicalShop() in Hospital");
		if(patient!=null)
		{
			this.patient.fever();
		}
		else
		{
			System.out.println("Not operate fever Method");
		}
	}
	public void workers()
	{
		System.out.println("Invoking workers() in Hospital");
		if(patient!=null)
		{
			this.patient.cough();
		}
		else
		{
			System.out.println("Not operate cough Method");
		}
	}
}
