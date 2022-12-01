import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String msg = scan.nextLine();
		if (msg.toLowerCase().indexOf("nichi")>=0)
		{
			System.out.println("Nichi is a sentence");
		}
		else { System.out.println(msg);
		}
	}

}
