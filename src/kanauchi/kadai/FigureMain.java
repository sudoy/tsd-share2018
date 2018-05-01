package kanauchi.kadai;

public class FigureMain {

	public static void main(String[] args) {

		Circle c1 = new Circle(3.0);
		System.out.println(c1.getArea());

		Square s1 = new Square(4.0);
		System.out.println(s1.getArea());
	}

}

class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;

	}

	public void setRadius() {

	}

	public double getArea() {
		double area = radius * radius * 3.14;
		return area;
	}

}

class Square{
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide() {
		
	}
	
	public double getArea() {
		double area = side * side;
		return area;
	}
}