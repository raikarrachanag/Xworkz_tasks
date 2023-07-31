package practice.app;

public class HomeTown {

	public String tname;
	public long pincode;
	public Area[] area;
	
public HomeTown(String tname, long pincode, Area[] area)
{
	this.tname=tname;
	this.pincode=pincode;
	this.area=area;
}
public void printInfo()
{
	System.out.println("The Home town name :" +this.tname);
	System.out.println("The PinCode is:" +this.pincode);
	for(int pos=0; pos<this.area.length; pos++)
	{
		Area ref=this.area[pos];
		ref.printInfo();
		
	}
}
}

