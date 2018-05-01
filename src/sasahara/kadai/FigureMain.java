package sasahara.kadai;

class Circle{
	double radius;

	Circle(double radius){
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}

}

class Square{
	double sides;

	Square(double sides){
		this.sides = sides;
	}

	public void setSides(double sides) {
		this.sides = sides;
	}

	public double getSides() {
		return sides;
	}

	public double getArea() {
		return sides * sides;
	}

}

public class FigureMain {

	public static void main(String[] args) {
		//Circleのテスト
		Circle c1 = new Circle(5.0);
		System.out.println(c1.getArea());
		Circle c2 = new Circle(1.5);
		System.out.println(c2.getArea());

		//Squareのテスト
		Square s1 = new Square(5.0);
		System.out.println(s1.getArea());
		Square s2 = new Square(1.5);
		System.out.println(s2.getArea());

	}

}
