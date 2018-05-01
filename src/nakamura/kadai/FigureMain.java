package nakamura.kadai;

public class FigureMain {

	public static void main(String[] args) {

		// 円の面積
		Circle maru = new Circle(5);
		System.out.println("円の面積：" + maru.getArea());

		// 正方形の面積
		Square hako = new Square(10);
		System.out.println("正方形の面積：" + hako.getArea());
	}

}

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}
}

class Square {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public int getArea() {
		return side * side;
	}
}
