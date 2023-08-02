package basic.boot;

import basic.app5.Circle;
import basic.app5.Oval;
import basic.app5.Pentagon;
import basic.app5.Rectangle;
import basic.app5.Shape;
import basic.app5.Triangle;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape =new Shape();
		shape.shapeMethod();
		System.out.println("----------------------");
		
		Circle circle=new Circle();
		Shape circle1 =new Circle();
		System.out.println(circle.circleMethod(6));
		circle.shapeMethod();
		System.out.println("----------------------");
		
		Rectangle rectangle=new Rectangle();
		Shape rectangle1 =new Rectangle();
		rectangle.shapeMethod();
		System.out.println(rectangle.rectangleMethod(5, 6));
		System.out.println("----------------------");
		
		Pentagon pentagon=new Pentagon();
		Shape pentagon1 =new Pentagon();
		pentagon.shapeMethod();
		pentagon.pentagonMethod();
		System.out.println("----------------------");
		
		Oval oval=new Oval();
		Shape oval2 =new Oval();
		oval.ovalMethod();
		oval.shapeMethod();
		System.out.println("----------------------");
		
		Triangle triangle=new Triangle();
		Shape triangle2=new Triangle();
		System.out.println(triangle.triangleMethod(8, 6, 7));
		triangle.shapeMethod();
	}
}
