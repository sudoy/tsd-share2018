package sudo.tsd0501;

import java.util.ArrayList;
import java.util.List;

public class FruitsBasketMain {

	public static void main(String[] args) {
		// フルーツバスケットを作る
		FruitsBasket fb = new FruitsBasket(3);

		// フルーツをバスケットに入れる
		Fruits f1 = new Fruits("orange", "orange", 50);
		fb.put(f1);
		Fruits f2 = new Fruits("banana", "yellow", 20);
		Fruits f3 = new Fruits("apple", "red", 100);
		fb.put(f2);
		fb.put(f3);

		// 4つ目のフルーツをバスケットに入れるとエラー
		Fruits f4 = new Fruits("peach", "pink", 200);
		fb.put(f4);

		// バスケットからフルーツを取り出す
		Fruits f5 = fb.take(0);
	}

}

class FruitsBasket{
	private List<Fruits> basket = new ArrayList<>();
	private int limit;

	public FruitsBasket(int limit) {
		this.limit = limit;
	}

	public void put(Fruits fruits) {
		if(basket.size() >= limit) {
			System.out.println("バスケットはいっぱいです。");
			return;
		}
		basket.add(fruits);
	}

	public Fruits take(int index) {
		return basket.remove(index);
	}
}