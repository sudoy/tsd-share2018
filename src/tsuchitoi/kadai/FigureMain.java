package tsuchitoi.kadai;

public class FigureMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		System.out.println(c1.getArea());
		Square s1 = new Square(10);
		System.out.println(s1.getArea());
		Square s2 = new Square(20);
		System.out.println(s2.getArea());


	}

}
class Circle{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius){
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
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getside() {
		return side;
	}
	public int getArea() {
		return side * side;
	}
}
