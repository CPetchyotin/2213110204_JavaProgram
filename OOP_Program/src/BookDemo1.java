import java.util.*;

public class BookDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input author name   : ");
		String name = sc.nextLine();
		System.out.print("Input author email  : ");
		String email = sc.nextLine();
		
		Author1 auth = new Author1(name,email);
		System.out.println(auth);//use toString
		
		System.out.println();
		System.out.print("Input book title : ");
		 sc.nextLine();
		String title = sc.nextLine();
		System.out.print("Input book page  : ");
		int page = sc.nextInt();
		 Book1 book = new Book1 (title,auth,page);
		 System.out.println(book);
	}

}
