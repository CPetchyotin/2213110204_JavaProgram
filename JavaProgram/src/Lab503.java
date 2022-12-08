import javax.swing.*;
public class Lab503 {
		static int inpY;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 inpY = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		 boolean chkYear =checkYear(inpY);
		while (!checkYear(inpY)) {
			inpY = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000"+"\nInput Year,again"));
		}
			JOptionPane.showMessageDialog(null, inpY+(isLeapYear(inpY)?"is":"is not")+ "Leap Year");
		
	}	
    public static boolean checkYear (int year) {
    	if (year >= 1000 && year <= 3000)		
    		return true;    	
    	return false;
    }
    public static boolean isLeapYear (int year) {
    	if((inpY%4 == 0) && (inpY%100 !=0) || (year%400==0))
    	{
    		return true;
    	}
    	else 
    		return false;
    }
}
