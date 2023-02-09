
public abstract class Shape1 {
	private String color;
	
	public Shape1() {
		this.color = null;
		
	}
	
	public Shape1(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
		
	public String toString() {
		return "Color ="+this.color;
	}
}

