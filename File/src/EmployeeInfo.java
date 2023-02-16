import java.util.*;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); //input data from keybord
		String choice;
		System.out.print("Insert or Read data(from File)? : ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert") && !choice.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			choice = console.next().toLowerCase();
		}
		SaveandOpen file = new SavefileOpen(); 
		if(choice.equals("insert"));{
			file.insert();
		}
		else {
			
			System.out.print
		}
		

	}

}
