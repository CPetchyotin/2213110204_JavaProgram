import java.util.*;
import java.io.*;
public class ATMBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number : ");
		String acc = sc.next();
		while(acc.charAt(1)!='-'&&acc.charAt(5)!='-'&&acc.charAt(9)!='-'&&acc.charAt(12)!='-'&&acc.length()!=14) {
			System.out.print("Input wrong type, Enter account number : ");
			acc= sc.next();
		}
		System.out.print("Enter password : ");
		String pa =  sc.next();
		while(pa.length()!=4) {
			System.out.print("Enter password : ");
			pa = sc.next();
		}
		System.out.print("Enter money : ");
		int cas = sc.nextInt();
		while(cas <= 0||cas%100!=0) {
			System.out.print("Enter money : ");
			cas = sc.nextInt();
		}
		System.out.println();
		ATMChecking bank = new ATMChecking(acc,pa,cas);
		bank.show();
	}

}
