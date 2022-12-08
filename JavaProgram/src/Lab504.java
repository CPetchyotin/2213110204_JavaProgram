import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter your name, seperated by a space.\n:");
		String fullname = scn.nextLine();		
		int spacebar = fullname.indexOf(' ');
		String firstName = fullname.substring(0,spacebar);
		System.out.println(abbreviatName(fullname)+firstName);
	}
	public static String abbreviatName (String fullname) {
	    String afterSp = "";
		for(int i = 0;i<fullname.length();i++)
		{
			if(fullname.charAt(i)==' ') {
				afterSp = (afterSp+fullname.charAt(i+1)).toUpperCase();
				afterSp = afterSp +".";
			}
		}
		return afterSp;
	}

}
