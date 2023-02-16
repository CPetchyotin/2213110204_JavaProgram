import java.io.*;
import java.util.*; //ใช้ Scanner class รับและอ่าน

public class SaveandOpen {
     private String name,dept;
     
     public void insert() throws IOException{
    	 
    	 Scanner console = new Scanner(System.in);
    	 PrintStream prs = new PrintStream(new File("employee.txt"));
    	 String answer;
    	 do {
    		 super.header();
    		 System.out.print("Enter name: ");
    		 name = Console.next();
    		 System.out.print("Enter department : ");
    		 dept = console.next();
    		 prs.println(name+"\t"+dept);
    		 
    		 System.out.print("Enter data again? : ");
    		 answer = console.next();
    	 }while(answer.equalsIgnoreCase("y"));
    	 
     }
     
     public void read() { // try catch
    	 try {
    		 Scanner in = new Scanner(new File("employee.txt"));
    		 int i = 0;
    		 boolean check = false;
    		 super.header();
    		 while (in.hasnext()) {
    			 name = in.next();
    			 dept = in.next();
    			 if(dept.equalsIgnoreCase(super.getdept())) {
    				 i++;
    				 System.out.print(i+ ") "+name)
    				 check = true;
    			 }
    			 
    		 } //while
    			 if(check) {
    				 super.header();
    				 System.out.print("Employee in department "+sugar.getDept()
    				 +)
    		 }
    	 }
    	 
 
     }

}
