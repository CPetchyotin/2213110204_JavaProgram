import java.util.*;
import javax.swing.*;
public class Example_403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String input = scan.nextLine();
		while(!input.endsWith(".")) {
			System.out.print("Input a sentence, again: ");
			input = scan.nextLine();
		}
		System.out.println();
		int space = 0;
		for(int i = 0;i < input.length();i++) {
			if(input.charAt(i)==' ') {
				space++;
			}	
		}	
		System.out.println
		("This sentence has "+space+" spacebars."+"\nThis sentence has "+(space+1)+" words.");
	*/}
	String input = JOptionPane.showInputDialog("Input a sentence:");
	while(!input.endsWith(".")) {
		JOptionPane.showInputDialog("Input a sentence, again:");		
	}
	System.out.println();
	int space = 0;
	for(int i = 0;i < input.length();i++) {
		if(input.charAt(i)==' ') {
			space++;
		}	
	}	
	JOptionPane.showInputDialog
	("This sentence has "+space+" spacebars."+"\nThis sentence has "+(space+1)+" words.");
}
}
