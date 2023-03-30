package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea(double length, double width) {
		return length*width;
	}
	public double getPerimeter(double length, double width) {
		return 2*length+2*width;
	}
	public boolean greater(Rectangle b) {
		return getArea(this.length, this.width)>getArea(b.length, b.width);
	}
	public boolean square() {
		return this.length == this.width;
	}
	public static void main(String[]args) {
		Rectangle a = new Rectangle(9.0, 8.0);
		Rectangle b = new Rectangle(5.0, 4.0);
		System.out.println(a.greater(b));
		System.out.println(a.square());
	}
}
