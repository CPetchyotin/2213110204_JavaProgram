

public abstract class Shape  {
	
    private String color;
	
	public Shape() {
		this.color = null; 	
	}
	
	public void Shape(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	
	public String toString() {
		return this.color;
	}

}//end of class Shape
