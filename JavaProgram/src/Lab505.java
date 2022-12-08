import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputStudent();
	}

	public static void inputStudent() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		String stuId = scn.next();
		System.out.print("Enter Subject Id: ");
		int subId = scn.nextInt();
		while (isLength(stuId, subId) == false) {
			System.out.print("Enter Student Id: ");
			stuId = scn.next();
			System.out.print("Enter Subject Id: ");
			subId = scn.nextInt();
		}
		System.out.println();
		String subI = subId + "";
		isLength(stuId, subId);
		isITStudent(stuId);
		isITSubject(subId);
		displayData(isITStudent(stuId), isITSubject(subId), stuId, subId);

	}

	public static boolean isLength(String stuId, int subId) {
		String subI = subId + "";
		if (stuId.length() == 10 && subI.length() == 7)
			return true;
		return false;
	}

	public static boolean isITStudent(String stuId) {
		if (stuId.substring(0, 6).equals("211311"))
			return true;
		return false;
	}

	public static boolean isITSubject(int subId) {
		String subI = subId + "";
		if (subI.substring(4).equals("1"))
			return true;
		return false;
	}

	public static void displayData(boolean isITStudent, boolean isITSubject, String stuId2, int stuId) {
		if (isITStudent = true && isITSubject == true) {
			System.out.println("Student	 id: " + stuId + " 1st year Student in IT\nEnroll in courses for Year 1");
		}

	}
}
