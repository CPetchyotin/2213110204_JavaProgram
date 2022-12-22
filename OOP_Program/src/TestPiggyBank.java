import java.util.*;

public class TestPiggyBank {
	static Scanner sc = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PiggyBank pb = new PiggyBank();
		 * 
		 * pb.setPiggyBank(500); System.out.println("Money Total : " + pb.getTotal());
		 * pb.addTwo(34); System.out.println("Add 2 Baht Money : " + 34);
		 * System.out.println("Money Total : " + pb.getTotal()); pb.addTen(13);
		 * System.out.println("Add 10 Baht Money : " + 13);
		 * System.out.println("Money Total : " + pb.getTotal()); pb.addFive(100);
		 */
		sizeOfPiggyBank();
	}

	public static void sizeOfPiggyBank() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		// int size = sc.nextInt();
		// pb.setPiggyBank(size);
		pb.setPiggyBank(sc.nextInt());
		System.out.println("Size of your PiggyBank:" + pb.getPiggyBank());
		inputCoin();
	}// sizeOfPiggyBank ends

	public static void inputCoin() {
		while (true) {
			Line();
			System.out.println("\nMenu of PiggyBank");
			Line();
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit.");
			Line();
			System.out.print("Please select choice: ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("Insert 1 baht : ");
				pb.addOne(sc.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 2) {
				System.out.print("Insert 2 baht : ");
				pb.addTwo(sc.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 3) {
				System.out.print("Insert 5 baht : ");
				pb.addFive(sc.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 4) {
				System.out.print("Insert 10 baht : ");
				pb.addTen(sc.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 5) {
				System.out.println("Bye Bye");
				break;
			}
		}
	}

	public static void Line() {

		for (int i = 0; i <= 50; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
