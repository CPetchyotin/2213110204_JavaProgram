
public class Director {
private String name;
private String email;
private char gender;

public Director(String name,String email,char gender) {
	this.name = name;
	this.email = email;
	this.gender = gender;
}
public Director(String name,String email) {
	this.name = name;
	this.email = email;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public String getGenderName() {
	return (gender=='M')? "Male":(gender =='F')? "Female":"";
}
public String toString() {
	return name+" ("+email+";"+getGenderName()+")";
}
}
