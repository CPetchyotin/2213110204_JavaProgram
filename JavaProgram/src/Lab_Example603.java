import java.util.*;
public class Lab_Example603 {
static int sum = 0 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] inP = new int[5];
		for (int i = 0; i < inP.length; i++) {
			System.out.print("Input number "+(i+1)+" : ");
			inP[i] = sc.nextInt();
		}
		sumOfpos(inP);
		System.out.println();
		System.out.println("Summation of positive number is "+ sum);
		
	}
	public static int sumOfpos (int[] in) {
		for(int inn : in) {
		 sum += inn;
	}
		return sum;
	}
}
