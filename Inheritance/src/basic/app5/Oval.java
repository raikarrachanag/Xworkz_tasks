package basic.app5;

public class Oval extends Shape {
	public String type = "Close-Curved-Shape";

	public Oval() {
		System.out.println("Calling default Constructer of OVAL");
	}

	public void ovalMethod() {
		System.out.println("Type : "+type);
	}
}
