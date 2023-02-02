import javax.swing.*;
public class CoffeeShopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barista	 staff1 = new Barista("Leon",'M');
		Barista  staff2 = new Barista("Claire",'F');
		int tOd = Integer.parseInt(JOptionPane.showInputDialog(null,"Input Type of 1.Hot 2.Cold : "));
		int tOc = Integer.parseInt(JOptionPane.showInputDialog(null),"Input Type of Coffee 1.Americano 2.Espresso 3.Cappuccino: ");
				char sOc = JOptionPane.showInputDialog(null,"Input Size of Cup S = Short,T = Tall, G = Grande ,V = Venti : ");
				
	}

}
