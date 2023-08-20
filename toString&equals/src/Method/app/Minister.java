package Method.app;

public class Minister {
	private String name;
	private int age;
	private String party;
	private boolean isFemale;
	private String qualification;
	private int experience;
	
	public Minister()
	{
		
	}

	public Minister(String name, int age, String party, boolean isFemale, String qualification, int experience) {
		super();
		this.name = name;
		this.age = age;
		this.party = party;
		this.isFemale = isFemale;
		this.qualification = qualification;
		this.experience = experience;
	}

	@Override
	public String toString() {
		System.out.println("Invoking toString() Method in Minister");
		return "Name: " +name +"Age: " +age +"Party: "+party +"IsFemale: "+isFemale +"Qualification:" +qualification +"Experience: "+experience;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals() method in Minister");
		if(obj!=null)
		{
			System.out.println("The obj is not null");
			if(obj instanceof Minister)
			{
				System.out.println("Object is instanceof Minister");
				Minister min=(Minister)obj;
				if(min.name.equals(this.name))
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
				System.out.println("Object is not instanceof Minister");
			}
		}
		else
		{
			System.out.println("The obj is null");
		}
		return false;
	}
	
}
