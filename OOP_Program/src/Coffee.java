
public class Coffee extends Drink{
private int typeCoffee;
private char sizeCoffee;
private Barista barista;
	
public Coffee(int type,char sizeCoffee,int typeCoffee,Barista barista) {
	super(type,sizeCoffee);
	this.typeCoffee = typeCoffee;
	this.sizeCoffee = sizeCoffee;
	this.barista = barista;
}
public Coffee(int type,int typeCoffee) {
	super(type,' ');
	this.typeCoffee = 0;
	this.sizeCoffee = ' ';
	this.barista = null;
}
public Barista getBarista() {
	return  this.barista;
}
public String getTypeName() {
	return (typeCoffee==1)?"Americano":(typeCoffee==2)?"Espresso":(typeCoffee==3)?"Cappuccino":null;
}
public int getTypePrice() {
return (typeCoffee==1)?50:(typeCoffee==2)?55:(typeCoffee==3)?65:0;
}	
public String getSizeName() {
	return (sizeCoffee=='S')?"Short":(sizeCoffee=='T')?"Tall":
		(sizeCoffee=='G')?"Grande":(sizeCoffee=='V')?"Venti":null;
}
public int getSizePrice() {
	return (sizeCoffee=='S')?100:(sizeCoffee=='T')?150:
		(sizeCoffee=='G')?200:(sizeCoffee=='V')?250:null;
}
public int getTotalPrice() {
	return super.getTypePrice()+this.getTypePrice()+this.getSizePrice();
}
public String toString() {
	return super.getTypeName()+" "+getTypeName()+" "+getSizeName()+" is "+getTotalPrice()+" baht.";
}
}
