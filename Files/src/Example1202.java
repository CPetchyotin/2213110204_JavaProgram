import java.io.*;
import java.util.*;
public class Example1202 {
static Scanner sc = new Scanner(System.in); //input from console
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("Input Section: ");
		int sect = sc.nextInt();
		Header(sect);
		showListStudent(sect);
		
	}
	public static void showListStudent(int sec)throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while((temp = read.readLine()) !=null) {
			String[] data = temp.split("\t");
			double midSc = Double.parseDouble(data[4]);
			double finalSc = Double.parseDouble(data[5]);
			String gradeResult = findResult(midSc,finalSc);
			if(Integer.parseInt(data[3])==sec) {
				System.out.println(data[0]+" "+data[2]+"\t"+midSc+"\t"+finalSc+"\t"+gradeResult);
		}
	}
		read.close();
	}
		public static String findResult(double mid,double finalSc) {
			double totalSc = mid +finalSc;
			return (totalSc>=40)?"Pass":"Fail";
		}
	
	public static void Header(int sec) {
		System.out.println("****************************************************************************************");
		System.out.println("\t\t\tList of Data for Section "+sec);
		System.out.println("****************************************************************************************");
	}

}
