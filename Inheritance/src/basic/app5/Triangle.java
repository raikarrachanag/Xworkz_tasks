package basic.app5;

public class Triangle extends Shape {
	public String area;

	public Triangle() {
		System.out.println("Calling default Constructer of Square");
	}

	public double triangleMethod(double l, double b, double h) {
		return l*b*h;
	}

}
