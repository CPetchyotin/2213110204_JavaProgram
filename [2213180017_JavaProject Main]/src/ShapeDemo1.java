import java.util.*;

public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double radius = sc.nextDouble();
		double height = sc.nextDouble();	
		Circle circle =new Circle(radius, null) ;
		
		System.out.println("Circle["+circle+"]");
		System.out.println("Circle["+circle.getArea()+"]");
		System.out.println();

		Cylinder cylinder = new Cylinder(radius,height);
		
		System.out.println("Circle["+cylinder+"]");
		System.out.println("Circle[area="+cylinder.getArea()+"]");
		System.out.println("Circle[volume="+cylinder.getVolume()+"]");
	}

}