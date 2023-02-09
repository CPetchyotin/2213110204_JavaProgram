import java.util.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input width : ");
		double width = sc.nextDouble();
		System.out.print("Input length : ");
		double length = sc.nextDouble();
			Rectangle2 rec = new Rectangle2(width,length);
			System.out.println(rec+"\nArea of Rectangle is : "+rec.getArea());
				
	}

}
