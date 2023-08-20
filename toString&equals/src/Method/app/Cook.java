package Method.app;

public class Cook {

	private String name;
	private int age;
	private String specialization;
	private int experience;
	private boolean isCertified;
	private boolean isFullTime;
	
	public Cook() {
		super();
		
	}
	public Cook(String name, int age, String specialization, int experience, boolean isCertified, boolean isFullTime) {
		super();
		this.name = name;
		this.age = age;
		this.specialization = specialization;
		this.experience = experience;
		this.isCertified = isCertified;
		this.isFullTime = isFullTime;
	}
	@Override
	public String toString() {
		System.out.println("Invoking toString() Method in Cook");
		return "Name: "+name+ "Age: "+age+ "Specialization: "+specialization+ "Experience: "+experience+ "IsCertified: "+isCertified+ "IsFullTime: "+isFullTime;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals() Method in Cook");
		if(obj!=null)
		{
			System.out.println("Object is not equal to Null");
			if(obj instanceof Cook)
			{
				System.out.println("Object is instance of Cook");
				Cook cook=(Cook)obj;
				if(cook.name.equals(this.name)&& cook.age==this.age && cook.specialization==this.specialization && cook.isCertified==this.isCertified && cook.isFullTime==this.isFullTime)
				{
					System.out.println("Object and Properties are same");
					return true;
				}
				else
				{
					System.out.println("Object and Properties are not same");
				}
			}
			else
			{
				System.out.println("Object is not instance of cook");
			}
		}
		else
		{
			System.out.println("Object is equal to Null");
		}
		return false;
	}
	
	
}
