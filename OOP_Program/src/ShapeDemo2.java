import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cylinder[] cy = new Cylinder[5];
		for(int i= 0;i<cy.length;i++) {
			System.out.print("Input radius and height : ");
			double radius = sc.nextDouble();
			double height = sc.nextDouble();
				cy[i] = new Cylinder(radius,height);
		}
		System.out.println();
		int n = 0;
		for(int i=0;i<cy.length;i++) {
			n++;
			System.out.println("Cylinder "+n+", volume="+cy[i].getVolume());
		}
		
	}

}
