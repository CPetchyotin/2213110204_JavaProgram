import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		double heightM = height /100;
		double bmi = weight / (Math.pow(heightM,2));
		if(bmi<18.5) {
		JOptionPane.showMessageDialog(null, "BMI ="+frm.format(bmi)+"\nYou're "+
		"Underweight");}
		else if (bmi>18.5&&bmi<=24.9)
		{
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're "+
					"Normal-weight");}	
		else if (bmi>=25&&bmi<=29.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're "+
					"Over-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else 
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're "+
					"Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		
}
}

