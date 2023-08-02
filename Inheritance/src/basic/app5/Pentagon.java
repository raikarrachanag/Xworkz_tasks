package basic.app5;

public class Pentagon extends Shape{
	public int noOfSides;

	public Pentagon() {
		System.out.println("Calling default Constructer of Pentagon");
	}

	public void pentagonMethod() {
		System.out.println("sides : "+noOfSides);
	}
}
