import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Input radius : ");
			double radius = sc.nextDouble();
			System.out.print("Input height : ");
			double height  = sc.nextDouble();
			Circle circle = new Circle(radius,"");
			System.out.println("Circle["+circle+"]"+"\nCircle[area="+circle.getArea()+"]");
			System.out.println();
			Cylinder cylinder = new Cylinder(radius,height);
			System.out.println("Cylinder["+cylinder+"]");
			System.out.println("Cylinder[area="+cylinder.getArea()+"]");
			System.out.println("Cylinder[volumn="+cylinder.getVolume()+"]");
	}

}
