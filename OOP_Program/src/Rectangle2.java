
public class Rectangle2 implements Shape2{
	private double width;
	private double length;

	public Rectangle2 (double width, double length) {
		this.width=width;
		this.length= length;

	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	@Override
	public double getArea() {
		return getWidth() * getLength();
	}
	@Override
	public String toString() {
		return "Rectangle[width= "+getWidth()+",length= "+getLength() + ","+color+"]";
}
}
