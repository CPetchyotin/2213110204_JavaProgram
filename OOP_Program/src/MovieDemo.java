import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input movie id   : ");
		String id = sc.nextLine();
		System.out.print("Input movie name : ");
		String name = sc.nextLine();
		System.out.println();
		System.out.print("Input director name   : ");
		String dName = sc.nextLine();
		System.out.print("Input director e-mail : ");
		String email = sc.nextLine();
		System.out.print("Input director gender : ");
		char gender = sc.next().toUpperCase().charAt(0);
		while(gender!= 'M'&&gender!= 'F') {
			System.out.print("Input director gender,again : ");
			 gender = sc.next().toUpperCase().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theater no.  : ");
		int noTh = sc.nextInt();
		while(!(noTh>=1&&noTh<=15)) {	
	    System.out.print("Please input 1 - 15 only : ");
			 noTh = sc.nextInt();
		}
		Theater theater = new Theater(id,name,new Director(dName,email,gender),noTh);
		System.out.println("\n"+theater);
		
	}

}
