import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book b = new Book();
		System.out.print("Input book title   : ");
		b.setTitle(sc.nextLine());
		System.out.print("Input book price   : ");
		b.setPrice(sc.nextFloat());
		System.out.print("Input publish year : ");
		b.setPublishyear(sc.nextInt());
		System.out.println();
		System.out.println(b.toString());
	}

}
