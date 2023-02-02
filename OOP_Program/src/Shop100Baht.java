import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 sold = new Product1();
		int c3k = JOptionPane.showConfirmDialog(null,"Is the program run on Pattanakarn Branch?","Run Program",JOptionPane.YES_NO_OPTION);
		if(c3k ==0) {
			sold = new PattanakarnBranch();
		}
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null,sold);
				
	}

}
