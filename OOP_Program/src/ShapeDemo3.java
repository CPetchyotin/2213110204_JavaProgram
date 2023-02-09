import javax.swing.*;
public class ShapeDemo3 {
	public static void main(String[] args) {
		Cylinder[] cy = new Cylinder[5];
		for(int i= 0;i<cy.length;i++) {
			double radius =Double.parseDouble(JOptionPane.showInputDialog(null, "Input radius :"));
			double height =Double.parseDouble(JOptionPane.showInputDialog(null, "Input height :"));
				cy[i] = new Cylinder(radius,height);
		}
		int n =0;
		for(int i= 0;i<cy.length;i++) {
			n++;
			JOptionPane.showMessageDialog(null,"Cylinder "+n+", volume="+cy[i].getVolume());
		}
	}
}
