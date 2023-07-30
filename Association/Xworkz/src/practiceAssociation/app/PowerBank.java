package practiceAssociation.app;

public class PowerBank {

	public String brand;
	public Battery battery;
	
	public void cable() 
	{
		System.out.println("Invoking capacity in PowerBank");
		if(this.battery!=null)
		{
			this.battery.capacity();
		}
		else
		{
			System.out.println("Battery is Null, Hence Not operate capacity() Method");
		}
	}
	public void indicator()
	{
		
		System.out.println("Invoking resistor in PowerBank");
		if(this.battery!=null)
		{
			this.battery.resistor();
		}
		else
		{
			System.out.println("Battery is Null, Not operate resistor() Method");
		}
	}
}
