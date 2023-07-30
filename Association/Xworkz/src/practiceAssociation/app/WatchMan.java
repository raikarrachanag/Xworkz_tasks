package practiceAssociation.app;

public class WatchMan {

	public String name;
	public Gun gun;
	
	public void secure()
	{
		if(this.gun!=null)
		{
			this.gun.shoot();
			
		}
		else {
			System.out.println("Gun is Null, Hence Not operate shoot() Method");
		}
		System.out.println("Invoking secure in WatchMan");

	}
	
}






















