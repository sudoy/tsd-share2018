import java.util.ArrayList;

public class FruitsMain {

	public static void main(String[] args) {
		Fruits f[] = { new Fruits("オレンジ", "orange", 100),
				new Fruits("りんご", "red", 100),
				new Fruits("バナナ", "yellow", 100) };

		for (int i = 0; i < f.length; i++) {
			System.out.println("名前は" + f[i].getName() + "色は" + f[i].getColor() + "価格は" + f[i].getPrice());
		}

		FruitsBasket fb = new FruitsBasket(2);
		fb.put(new Fruits("オレンジ", "orange", 100));
		fb.put(new Fruits("りんご", "red", 100));
		fb.put(new Fruits("バナナ", "yellow", 100));

		Fruits f1 = fb.take(1);
		System.out.println(f1.getName());
	}
}

class FruitsBasket{
	// has-a関係
	private ArrayList<Fruits> fruitsList = new ArrayList<>();
	private int limit;

	public FruitsBasket(int limit) {
		this.limit = limit;
	}

	public void put(Fruits fruits) {
		if(fruitsList.size() == limit) {
			System.out.println(fruits.getName() + "はもう入りません。");
			return;
		}
		System.out.println(fruits.getName() + "が入りました。");
		fruitsList.add(fruits);
	}

	public Fruits take(int index) {
		return fruitsList.remove(index);
	}
}

class Fruits {

	private String name;
	private String color;
	private int price;

	public Fruits(String n, String c, int p) {
		name = n;
		color = c;
		price = p;
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
