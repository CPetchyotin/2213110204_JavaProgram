public class TestCustomer {
	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1);
		c1.setDiscount(5);
		System.out.println(c1);
		Line();
		System.out.println("id is: "+c1.getID());
		System.out.println("name is: "+c1.getName());
		System.out.println("discount is: "+c1.getDiscount());
		Line();
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
System.out.println(inv1);
inv1.setAmount(10000);
System.out.println(inv1);
		Line();
System.out.println("id is: "+inv1.getID());
System.out.println("customer is: "+c1);
System.out.println("amount is: "+inv1.getAmount());
		Line();
		System.out.println("customer's id is: "+c1.getID());
		System.out.println("customer's name is: "+c1.getName());
		System.out.println("customer's discount is: "+c1.getDiscount());
		System.out.printf("amount after discount is: %.2f ",inv1.getAmountAfterDiscount());
	} // end of main method()

	public static void Line() {
//use for() statement to display symbol *
		for (int i = 1; i < 65; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
} // end of class()