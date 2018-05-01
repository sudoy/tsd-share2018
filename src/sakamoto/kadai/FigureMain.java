package sakamoto.kadai;

public class FigureMain {
	public static void main(String[] args) {
		Circle c1 = new Circle (5);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(7);

		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		System.out.println(c3.getArea());

		System.out.println();

		Square s1 = new Square(6);
		Square s2 = new Square(9);
		Square s3 = new Square(11);

		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
		System.out.println(s3.getArea());



	}
}

class Circle{
	private double radius;

	public Circle(double radius) {         //コンストラクタ
		this.radius = radius;
	}

	public void setRadius(double radius) { //セッター
		this.radius = radius;
	}

	public double getRadius() {				//ゲッター
		return radius;
	}

	public double getArea(){
		return radius * radius * 3.14;
	}
}

class Square{
	private double side;

	public Square(double side) {         //コンストラクタ
		this.side = side;
	}

	public void setSide(double side) { //セッター
		this.side = side;
	}

	public double getSide() {				//ゲッター
		return side;
	}

	public double getArea(){
		return side * side;
	}
}
