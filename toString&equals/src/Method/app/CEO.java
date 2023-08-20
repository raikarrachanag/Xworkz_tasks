package Method.app;

public class CEO {

	private String name;
	private String company;
	private int age;
	private int experience;
	private String gender;
	private String position;
	
	public CEO() {
		super();
		
	}

	public CEO(String name, String company, int age, int experience, String gender, String position) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.experience = experience;
		this.gender = gender;
		this.position = position;
	}

	@Override
	public String toString() {
		System.out.println("Invoking toString() Method in CEO");
		return "Name: "+name + "Comapany: "+company + "Age: "+age +"Experience: "+experience +"Gender: "+gender+"Position: "+position;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals() Method in CEO");
		if(obj!=null)
		{
			System.out.println("Object is not equal to null");
			if(obj instanceof CEO)
			{
				System.out.println("Object is instance of CEO");
				CEO ceo=(CEO)obj;
				if(ceo.name.equals(this.name) && ceo.age==this.age)
				{
					System.out.println("Object and Properties are Same");
					return true;
				}
				else
				{
					System.out.println("Object and Properties are not same");
				}
			}
			else
			{
				System.out.println("Object is not instance of CEO");
			}
		}
		else
		{
			System.out.println("Object is equal to null");
		}
		return false;
	}
	

}
