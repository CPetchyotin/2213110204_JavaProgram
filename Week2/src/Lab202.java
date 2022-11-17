import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.print("Input the number of minutes: ");
		int minutes = sca.nextInt();
		int years = minutes/525600;
		int daysremain = minutes % 525600;
		int days = daysremain/1440;
		System.out.print(""+minutes+ " minutes is approximately "+years+ " years and  "+days+" days" );
		
	}

}
