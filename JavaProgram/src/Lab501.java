
public class Lab501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(formatnumber(500));
		System.out.println(formatnumber(500.554556));
		System.out.println(formatnumber("500"));
	}

	private static String formatnumber (int value) {
		return String.format("%d", value);
	}
	private static String formatnumber (double value) {
		 return String.format("%f", value);
	}
	private static String formatnumber (String value) {
		 return String.format("%s.00", value);
	}
}