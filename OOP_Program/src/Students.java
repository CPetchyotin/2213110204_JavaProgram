
public class Students {
	// The private instance variables
	private String name;
	private String address;
//kept the courses and grades in 2 parallel arrays
	private String[] courses;
	private int[] grades; // range is [0,100]
	private int numCourses;// amount of course being taken
//Maximum number of courses taken by student
	private static final int MAX_COURSE = 30;

	public Students(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourses = 0;
	}

//Getters and setters
	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return getName() + "(" + getAddress() + ")";
	}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	public void printGrade() {
		System.out.print(name);
		for(int i =0;i<numCourses;i++) {
			System.out.print(" "+courses[i]+":"+grades[i]);
		}
		System.out.println();
	}
	public double getAverageGrade() {
		int sum= 0;
		for (int i = 0;i<numCourses;i++) {
			sum+=grades[i];
		}
		return (double)sum/numCourses;
	}
}
