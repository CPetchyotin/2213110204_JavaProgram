import java.text.DecimalFormat;
import java.util.*;

public class StockProduct {
static double sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat f = new DecimalFormat("#,###.00");
		Scanner sc = new Scanner(System.in);
		Product[] productList = new Product[4];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product   Id    : ");
			productList[i].setId(sc.next());
			System.out.print("Input product	Unit  : ");
			productList[i].setUnit(sc.nextInt());
			while(productList[i].getUnit()<=0) {
				System.out.print("Input product	Unit,again  : ");
				productList[i].setUnit(sc.nextInt());
			}
			System.out.print("Input product   Price : ");
			productList[i].setPrice(sc.nextDouble());
			while(productList[i].getPrice()<=0) {
				System.out.print("Input product	Unit,again  : ");
				productList[i].setPrice(sc.nextDouble());
			}
			System.out.println();
			for(Product show : productList) {
				System.out.println("Product ID : "+show.getId()+", Total Price = "+f.format(show.calculate())+"baht.");
				sum+=show.calculate();
			}
		}
		System.out.print("------------------------------------------------------------");
		System.out.println("Total price of all product is "+f.format(sum)+" baht.");

	}
}