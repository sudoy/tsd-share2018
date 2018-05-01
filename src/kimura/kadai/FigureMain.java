package kimura.kadai;

public class FigureMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(2.0);
		System.out.println(c1.getArea());

		Square s1 = new Square(2);
		System.out.println(s1.getArea());

	}

}

class Circle{
	private double radius;

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	Circle(double radius){
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}
}

class Square{
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	Square(int side){
		this.side = side;
	}

	public int getArea() {
		return side * side;
	}
}