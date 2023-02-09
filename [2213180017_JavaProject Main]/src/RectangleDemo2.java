import java.util.*;

public class RectangleDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input width : ");
		double width = sc.nextDouble();
		System.out.print("Input length : ");
		double length = sc.nextDouble();
		
		
		Rectangle rec = new Rectangle2(width,length);
		System.out.print(rec);
		System.out.print("Area of Rectangle is "+rec.getArea());
		

	}

}
