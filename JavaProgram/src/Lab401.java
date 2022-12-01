import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String Fname = scan.nextLine();
		int spacebar = Fname.indexOf(' ');		
		if(spacebar==-1) {
			System.out.println("Incorrect Name");
		}
		else {
			String Firstname = Fname.substring(0,spacebar).toUpperCase();
			String Lname = Fname.substring(spacebar+1).toLowerCase();
			System.out.println("First Name:"+Firstname);
			System.out.println("Last Name :"+Lname);
		}
	}

}
