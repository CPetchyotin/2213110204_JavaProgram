
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students Jp = new Students("Jirapat Anantasiri","1 Happy Ave");
		System.out.println(Jp);//toString()
		
		Jp.setAddress("25 Pattanakarn");
		System.out.println(Jp.getName());
		System.out.println(Jp.getAddress());
		
		Jp.addCourseGrade("INT107", 25);
		Jp.addCourseGrade("INT108", 79);
		Jp.addCourseGrade("MSC202", 69);
		Jp.printGrade();
		System.out.printf("The average grade is %.2f%n",Jp.getAverageGrade());
	}

}
