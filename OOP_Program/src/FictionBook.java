import java.time.LocalDateTime;

public class FictionBook implements Author3,Book3 {
private String author_name;
private String email;
private String title;
private int publicYear;

public FictionBook(String title,int publicYear) {
	this.title = title;
	this.publicYear = publicYear;
	this.email = "";
	this.author_name= "";
}
public void setAuthorName(String name) {
	author_name = name.trim();
}
public void setEmail(String email) {
	this.email = email;
}
public boolean checkFormatName() {
	return 	(author_name.trim().contains(" "))? true : false ;
}
@Override
public String getLastName() {
	int sp = 0;
	for(int i= 0;i<author_name.length();i++) {
		if(author_name.charAt(i)==' ') {
			sp = i;
		}
	}
	return author_name.substring(0,sp+1).toUpperCase();
}
@Override
public String getFirstName() {
	int sp = 0;
	for(int i= 0;i<author_name.length();i++) {
		if(author_name.charAt(i)==' ') {
			sp = i;
		}
	}
	return author_name.substring(0,sp-1).toUpperCase();
}
@Override
public boolean checkEmail() {
	return (email.endsWith("@hotmail.com"))? true:email.endsWith("@windowslive.com")? true:false;
}
@Override
public int totalPublicYear() {
	return LocalDateTime.now().getYear()-publicYear;
}
@Override
public String getTitle() {
	return title;
}

public String toString() {
	return getTitle()+ "write by "+getLastName().charAt(0)+"."+getFirstName()+"("+this.email+")"
			+ " Published for "+totalPublicYear()+" years.";
}
}
