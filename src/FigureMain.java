public class FigureMain {

	public static void main(String[] args) {
		Circle c1[] = {new Circle(10),
					   new Circle(20),
				       new Circle(30)};

		for(int i = 0; i < c1.length; i++) {
			System.out.println("c1[" + i + "]の面積は : " + c1[i].getArea());
		}
		Square s1[] = {new Square(10),
					   new Square(20)};

		for(int j = 0; j < s1.length; j++) {
			System.out.println("s1[" + j + "]の面積は : " + s1[j].getArea());
		}

		Circle circle = new Circle(5.0);
		Cylinder c = new Cylinder(10, circle);
		System.out.println(c.getVolume());
	}
}
class Circle{
	private double radius;
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double r){
		radius = r;
	}

	public double getArea() {

		double area = radius * radius * 3.14;
		return area;
	}
}

class Square{
	private int sides;
	Square(int s){
		sides = s;
	}

	public void setSides(int s) {
		sides = s;
	}

	public int getSides() {
		return sides;
	}

	public int getArea() {
		int area = sides * sides;
		return area;
	}
}

class Cylinder{
	private int height;
	private Circle circle;

	public Cylinder(int h, Circle c) {
		height = h;
		circle = c;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle c) {
		circle = c;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}
}


