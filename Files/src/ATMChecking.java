import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class ATMChecking extends ATMData {
private int money;
private int cash;
public ATMChecking(String accountNumber,String password,int money) {
	super(accountNumber,password);
	this.money = money;
}
public boolean checkBookBank() throws IOException {
	Scanner read = new Scanner(new File("ATMBookBank.txt"));
	while(read.hasNext()){
		String accNo = read.next();
		String pas = read.next();
		 cash  = read.nextInt();
		if(super.getID().equals(accNo)&&super.getPass().equals(pas)&&this.money == cash) {
			return true;					
		}
	}
	read.close();
	return false;
}
public void show() {
	DecimalFormat fm  = new DecimalFormat("#,###.00");
	int thousand = this.money/1000;
	int fivehund = thousand/1000%500;
	int hund = fivehund/500%100;
	System.out.println("You drawing for "+fm.format(this.money)+", get"+"\n\t\t1000 = "+thousand+"\n\t\t500 = "+fivehund+"\n\t\t100 = "+hund);
	System.out.println("Your balance is "+fm.format(cash-this.money)+" Baht.");
}
}
