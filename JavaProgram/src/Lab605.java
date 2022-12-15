import javax.swing.*;

public class Lab605 {
	static String sp = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " : "));
		}
		showEven(num);
		showOdd(num);
	}

	public static void showEven(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sp = sp + num[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number: \n" + sp);

	}

	public static void showOdd(int[] num) {
		String sp1 = "";
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				sp1 = sp1 + num[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number: \n" + sp1);
	}
}
