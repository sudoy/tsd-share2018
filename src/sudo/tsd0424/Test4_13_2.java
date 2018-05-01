package sudo.tsd0424;

public class Test4_13_2 {

	public static void main(String[] args) {
		Car2[] cars = {new Car2("red", 100, 20.5),
				new Car2("blue", 200, 30.5),
				new Car2("green", 300, 40.5)};

		for(int i = 0; i < cars.length; i++) {
			cars[i].show();
		}
	}

}

class Car2{
	String color;
	int number;
	double gas;

	Car2(String c, int n, double g) {
		color = c;
		number = n;
		gas = g;
	}

	void show() {
		System.out.println(color + ", " + number + ", " + gas);
	}

}