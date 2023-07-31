package practice.app;

public class Floor {

	public String fname;
	public int no;
	
public Floor(String fname, int no)
{
	this.fname=fname;
	this.no=no;
}
public void printInfo()
{
	System.out.println("Floor name :" +this.fname);
	System.out.println("Floor No.:" +this.no);
}
}
