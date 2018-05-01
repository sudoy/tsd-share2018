package tsd0501;

public class FruitsMain{
	public static void main(String[] args) {
		Fruits f1 = new Fruits("orange", "orange", 50);
		Fruits f2 = new Fruits("banana", "yellow", 20);
		Fruits f3 = new Fruits("apple", "red", 100);

		System.out.println(f1.getName() + f1.getColor() + f1.getPrice());
		System.out.println(f2.getName() + f2.getColor() + f2.getPrice());
		System.out.println(f3.getName() + f3.getColor() + f3.getPrice());
	}
}

class Fruits {
	private String name;
	private String color;
	private int price;

	public Fruits(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}
}
