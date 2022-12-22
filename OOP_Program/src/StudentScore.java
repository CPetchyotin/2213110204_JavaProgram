import java.util.*;

public class StudentScore {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many student in classroom : ");
		int size = sc.nextInt();
		Student[] std = new Student[size];
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(sc.next());
			System.out.print("Input student score : ");
			std[i].setScore(sc.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(sc.nextInt());
			}
			System.out.println("-----------------------------------");
		}
		for (Student _std : std) {
			if (_std.isPass()) {
				System.out.println(">> " + _std.getName() + " get grade " + findGrade(_std.getScore()));
			}
		}

	}
	public static String findGrade(int score) {
		return (score < 50) ? "F"
				: (score < 55) ? "D"
						: (score < 60) ? "D+"
								: (score < 65) ? "C"
										: (score < 70) ? "C+" : (score < 75) ? "B" : (score < 80) ? "B+" : "A";



}
	}

