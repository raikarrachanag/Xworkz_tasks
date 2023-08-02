package basic.app2;

public class Dog extends Animal{
	
	public String type;
	
public Dog()
{
	this.type="Rottweiler";
	System.out.println("the breed of dog is "+this.type);	
			
}
public int noOfChildrens()
{
	return 4;
}
	

}
