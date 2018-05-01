package tsuchitoi.kadai;

public class FigureMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		System.out.println(c1.getArea());
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
