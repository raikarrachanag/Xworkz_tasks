package basic.app5;

public class Shape {
	public String type = "Triangle";

	public Shape() {
		System.out.println("Calling default Constructer of Shape");
	}

	public void shapeMethod() {
		System.out.println("Type : " + type);
	}
}
