
public class Drink {
private int type;
private char size;

public Drink(int type,char size) {
	this.type = type;
	this.size = size;
}
public Drink() {
	this.type = 0;
	this.size = ' ';
}
public String getTypeName () {
	return (type==1)?"Hot":(type==2)?"Cold":null;
}
public int getTypePrice () {
	return (type==1)?10:(type==2)?20:0;
}
public String getSizeName() {
	return (size=='S')?"Small":(size=='M')?"Medium":(size=='L')?"Large":null;
}
public int getSizePrice() {
	return (size=='S')?15:(size=='M')?20:(size=='L')?25:0;
}
public int getTotalPrice() {
	return getTypePrice()+getSizePrice();
}
}
