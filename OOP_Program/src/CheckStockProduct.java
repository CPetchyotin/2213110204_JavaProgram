import java.text.DecimalFormat;
import java.util.*;

public class CheckStockProduct {
	static double sum = 0;

	public static void main(String[] args) {
// TODO Auto-generated method stub
		DecimalFormat f = new DecimalFormat("#,###.00");
		Scanner sc = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int hmpl = sc.nextInt();
		System.out.println();
		Product[] productList = new Product[hmpl];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product(); 
			System.out.print("Input product  Id    : ");
			productList[i].setId(sc.next());
			System.out.print("Input product  Unit  : ");
			productList[i].setUnit(sc.nextInt());
			while (productList[i].getUnit() <= 0) {
				System.out.print("Input product Unit,again  : ");
				productList[i].setUnit(sc.nextInt());
			}		
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("------------------------------------------------------------");
		for (Product show : productList) {
			if(show.Check(show.getUnit()).equalsIgnoreCase("low")) {
				System.out.println(">> "+show.getId()+" has "+ show.getUnit()+ " units");
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("------------------------------------------------------------");
		for (Product show : productList) {
			if(show.Check(show.getUnit()).equalsIgnoreCase("normal")) {
				System.out.println(">> "+show.getId()+" has "+ show.getUnit()+ " units");
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("------------------------------------------------------------");
		for (Product show : productList) {
			if(show.Check(show.getUnit()).equalsIgnoreCase("high")) {
				System.out.println(">> "+show.getId()+" has "+ show.getUnit()+ " units");
			}
		}
	}
}