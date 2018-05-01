package nojima.kadai;

public class FigureMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		System.out.println(c1.getArea());

		Square s1 = new Square(15);
		System.out.println(s1.getArea());

	}

}
class Circle{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
class Square{
	private double sides;

	public Square(double sides) {
		this.sides = sides;

	}
	public void setSides(double sides) {
		this.sides = sides ;
	}

	public double getSides() {
		return sides;
	}
	public double getArea() {
		return sides*sides;
	}

}