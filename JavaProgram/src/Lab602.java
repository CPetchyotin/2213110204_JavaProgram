import java.util.*;
public class Lab602 {
static Scanner sc=  new Scanner(System.in);
static double average  = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] sCo  = new double [5];
		for (int i = 0; i < sCo.length; i++) {
			System.out.print("Input score of student "+(i+1) +" : ");
			sCo[i]= sc.nextDouble();
			 average += sCo[i];			
		}
		System.out.println();
		average = average /(sCo.length);
		System.out.println("Average of "+ sCo.length+" student is " + average);
		for(int i = 0 ; i<sCo.length;i++) {
			if(sCo[i] >=average) {
			System.out.println("> Student "+(i+1)+ " ("+ sCo[i] +")");	
			}
		}
	}

}
