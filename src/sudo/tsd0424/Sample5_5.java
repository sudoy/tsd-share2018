package sudo.tsd0424;

public class Sample5_5 {

	public static void main(String[] args) {
		// インスタンス化
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		// メソッドの呼び出し
		car1.setColor("red");
		car2.setColor("blue");
		car3.setColor("green");

		car1.setNumber(100);
		car2.setNumber(200);
		car3.setNumber(300);

		car1.setGas(20.5);
		car2.setGas(30.5);
		car3.setGas(40.5);

		car1.show();
		car2.show();
		car3.show();

	}

}

class Car {
	String color;
	int number;
	double gas;

	// スモールキャメルケース
	public void setColor(String c) {
		color = c;
	}

	public void setNumber(int n) {
		number = n;
	}

	public void setGas(double g) {
		gas = g;
	}

	public void show() {
		System.out.println("車の色は " + color + " ナンバーは[" + number + "] 燃料は [" + gas + "]");
	}

}