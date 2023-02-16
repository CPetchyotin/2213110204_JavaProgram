import java.io.*;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner sc=  new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data (from file)?: ");
		choice =sc.next().toLowerCase();
		while(!choice.equals("insert")&&!choice.equals("read")) { //while choice != insert and read. loop
			System.out.print("Insert or Read data (from file)?: ");
			choice =sc.next().toLowerCase();
		}
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();
		}
		else {
			System.out.print("\nEnter department: ");
			department =  sc.next();
			file.setDept(department);//send to setdept()
			file.read();
		}
	}

}
