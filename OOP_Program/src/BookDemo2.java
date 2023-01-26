import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		Book1 book = new Book1(title,new Author1(name,email),page);
		int c3k = JOptionPane.showConfirmDialog(null,"Is the page correct","Confirm",JOptionPane.YES_NO_OPTION); 
		if(c3k== 1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again:"));
			book.setPage(page);
			JOptionPane.showMessageDialog(null, "Book Title : "+book.getTitle()+"\nAuthor name : "+book.getAuthor().getName()
					+" ("+book.getPage()+" page)"+"\nAuthor e-mail : "+book.getAuthor().getEmail());
		}
		else {
			book.setPage(page);
			JOptionPane.showMessageDialog(null, "Book Title : "+book.getTitle()+"\nAuthor name : "+book.getAuthor().getName()
					+" ("+book.getPage()+" page)"+"\nAuthor e-mail : "+book.getAuthor().getEmail());
		}
		
	}

}
