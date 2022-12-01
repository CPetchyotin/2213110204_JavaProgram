import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Text: ");
		String text = scan.nextLine();
		String retext ="";
		for(int i=text.length();i>=0;i--) {
			retext = retext + text.charAt(i);
		}
		if(text.equals(retext))
		{
			System.out.println("It is a palindrome");
		}
		else
		   System.out.println("It is not a palindrome");
	}

}
