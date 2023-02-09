import java.util.Scanner;
import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);	
		double[] radius = new double[5];
		double height[] = new double[5];


		for(int i = 0 ; i<radius.length;i++) {
			radius[i] = Double.parseDouble(JOptionPane.showInputDialog("Input radius "));			
			height[i] = Double.parseDouble(JOptionPane.showInputDialog("Input radius "));
		}
		
		for(int i = 0 ; i<radius.length;i++) {
			Cylinder cylinder = new Cylinder(radius[i],height[i]);
			JOptionPane.showMessageDialog(null, "Cylinder "+(i+1)+", volume="+cylinder.getVolume());
		}
	}

}