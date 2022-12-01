import java.util.*;
public class Lab402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentences : ");
		String sentences = scan.nextLine();
		while(!sentences.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentences = scan.nextLine();
		}
		System.out.println();
		int space = 0;
		for(int i =0;i<sentences.length();i++)
		{
			if(sentences.charAt(i)==' ') {
				System.out.println(sentences.substring(space,i));
				space=i+1;
			}
		}
		System.out.println(sentences.substring(space));
	}

}
