import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input title : ");
		String title = sc.nextLine();
		System.out.print("Input publish year : ");
		int publicYear = sc.nextInt();
		System.out.print("Input author name : ");
		String author_name = sc.next();
		System.out.print("Input author email : ");
		String email = sc.nextLine();
		FictionBook book = new FictionBook(title,publicYear);
		book.setAuthorName(author_name);
		book.setEmail(email);
		while(book.checkFormatName()) {
			System.out.print("Input author name, again : ");
			author_name = sc.nextLine();		
			while(book.checkEmail()) {
			System.out.print("Input author email, again : ");
			 email = sc.nextLine();
		}
		if(book.checkFormatName()==true&&book.checkEmail()==true) {
			System.out.println(book);
		}
	}

}}
