import javax.swing.*;
public class Lab502 {
	static	String email;
	public static void main(String[] args) {
		inputEmail();
		
	}
	public static void checkEmailError (String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, checkEmail(email)?"Your e-mail is "+email:
			"Your e-mail is not hotmail or gmail dot com" );
	}
	public static boolean checkEmail(String checkEmail) {
		if (checkEmail.endsWith("@gmail.com")||checkEmail.endsWith("@hotmail.com")) return true;
		else {
		return false; 
	}
}
	public static void inputEmail() {
		String answer = "";
		do {
		 email = JOptionPane.showInputDialog("Input your e-mail:");
			checkEmailError(email);
			answer= JOptionPane.showInputDialog("Continue [y || Y to continue");
		}while (answer.equalsIgnoreCase("y"));
	}
}
