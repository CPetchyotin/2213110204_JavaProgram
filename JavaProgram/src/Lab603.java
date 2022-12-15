import java.util.*;
public class Lab603 {
	static Scanner sc = new Scanner(System.in);
static int[] nofInt = {78,36,58,41,25,92,75};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input index of array : ");
		int indexofAr= sc.nextInt();
		while (indexofAr < 0 ||indexofAr > (nofInt.length-1)) {
			System.out.print("Input index of array, again : ");
			indexofAr = sc.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+ (nofInt[indexofAr]));
		//System.out.println("Value in next index is "+ (nofInt[indexofAr+1]));
		if(indexofAr == nofInt.length-1)
		{
			System.out.println("Sorry, 6 is the last index in array.");
		}
		else 
		{
			System.out.println("Value in next index is "+(nofInt[indexofAr]));
		}
	}

}
