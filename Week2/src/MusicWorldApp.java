import javax.swing.*;
import java.text.*;
public class MusicWorldApp {
	static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		double cdSubtotal , cdTotal;
		String cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order "
				+ "\nPlease enter the ID of the CD");
		String cdTitle =JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog
				("Please enter the price of the CD in U.S. dollars"));
		int cdQuantity =  Integer.parseInt(JOptionPane.showInputDialog("Please input the quantity to be purchased"));
		cdSubtotal = cdPrice *cdQuantity;
		cdTotal = cdSubtotal+(cdSubtotal * TAX_RATE);
		JOptionPane.showMessageDialog(null, "Summary of the transaction:"+"\n\nCD ID: "+cdId+"\nCD Title: "
		+cdTitle+"\nCD Unit Price:$"+cdPrice+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal:$"+cdSubtotal+"\nTax rate:"+TAX_RATE*100+"%"+"\nTotal:$"+cdTotal+"\n\nEnd of Program");
		

	}

}
