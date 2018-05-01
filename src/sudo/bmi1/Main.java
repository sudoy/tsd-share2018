package sudo.bmi1;

public class Main {

	public static void main(String[] args) {
		Human h = new Human("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

//		Child c = new Child("taro", 1.77, 69.5);
//		System.out.println("----- BMI -----");
//		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
//		System.out.println(BMI.judge(c));
//		System.out.println("---------------");
	}
}

class Human{
	public static final double MAX = 25.0;
	public static final double MIN = 18.5;
	private String name;
	private double height;
	private double weight;

	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
}

class BMI{
	public static double calc(Human h) {
		// 体重 / 身長 / 身長
		return h.getWeight() / h.getHeight() /  h.getHeight();
	}

	public static String judge(Human h) {
		double bmi = calc(h);
		if(Human.MAX < bmi) {
			return "太りすぎです";

		}else if(Human.MIN <= bmi) {
			return "標準です";

		}else {
			return "痩せすぎです";
		}
	}
}


