import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
private String name;
private String dept;
public void insert()throws IOException {
	Scanner sc = new Scanner(System.in);
	PrintStream write = new PrintStream(new File("employee.txt"));
	char ans;
	do {
		super.header();
		System.out.print("Enter name	: ");
	 name = sc.next();
	System.out.print("Enter department : ");
	 dept = sc.next();
	 //write all data into file
	 write.println(name+"\t"+dept);
	System.out.print("Enter data again? : ");
	 ans =  sc.next().toLowerCase().charAt(0);
	}while(ans =='y');
	super.header();
}
public void read()  {
	try {
		Scanner  in = new Scanner(new File("employee.txt"));
		int i = 0;
		boolean c3k = false;
		super.header();
		while(in.hasNext()) {
			name = in.next();
			dept = in.next();
			if(dept.equalsIgnoreCase(super.getDept())) {
				i++;
				System.out.println(i+") "+name);
				c3k = true;	
			}
		}//while ends
		if(c3k) {
			super.header();
			System.out.print("\nEmployee in department "+super.getDept()+" is "+i+" person.");
			System.out.println();
			super.header();
		}
		else {
			System.out.print("\nSorry, no department: "+super.getDept()+" in file.");
		}
		in.close();
	} catch (IOException e) {
		System.out.print("\nSorry, file not found...");
	}
}
}
