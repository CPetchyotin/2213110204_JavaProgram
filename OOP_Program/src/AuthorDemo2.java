import java.util.*;
public class AuthorDemo2 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author[] author = new Author[4];
		for(int i = 0;i<author.length;i++) {
		System.out.println("Information Author "+(i+1));
		Line();
		System.out.print("Input author name   : ");
		String name = sc.nextLine();
		System.out.print("Input author e-mail : ");
		String email = sc.nextLine();
		author[i] = new Author(name,email);
		Line();
		}
		System.out.println();
		int i = 1;
		for(Author _Author : author) {
			System.out.print(""+(i++)+". "+_Author.getName()+" ("+_Author.getEmail()+")"+"\n");
		}
	}
public static void Line() {
	for(int i =1;i<50;i++) {
		System.out.print("-");
	}
	System.out.println();
}
}
