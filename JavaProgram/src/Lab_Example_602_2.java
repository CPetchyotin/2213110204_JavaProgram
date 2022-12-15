import javax.swing.*;
public class Lab_Example_602_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean deptwasFound = false;
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		String search = JOptionPane.showInputDialog("Enter a department name");
		for (int i = 0; i < deptName.length; i++) {
			if (search.equalsIgnoreCase(deptName[i]))
			{
			deptwasFound = true;
			}
		}
		if(deptwasFound)
		JOptionPane.showMessageDialog(null, search +" was  found in the list");
		else 
			JOptionPane.showMessageDialog(null, search + " was not found in the list");
	} 

}
