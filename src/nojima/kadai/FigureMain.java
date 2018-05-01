package nojima.kadai;

public class FigureMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(18);
		System.out.println(c1.getArea());
		
		Square s1 = new Square();
		s1.setSides(5);
		System.out.println(s1.getArea());

	}

}
class Circle{
	private double radius;
	
	public Circle() {
		radius = 0;
		
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius;
	}
}
class Square{
	private double sides;
	
	public Square() {
		sides = 0;
	
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