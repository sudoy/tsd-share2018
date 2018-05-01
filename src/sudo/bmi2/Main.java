package sudo.bmi2;

public class Main {

	public static void main(String args) {
		Human h = new Human("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
//		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child c = new Child("taro", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
//		System.out.println(BMI.judge(c));
		System.out.println("---------------");
	}
}

class Ningen{
	private double max;
	private double min;
	private String name;
	private double height;
	private double weight;

	public Ningen(String name, double height, double weight,
			double max, double min) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.max = max;
		this.min = min;
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

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}
}

class Human extends Ningen{
	public Human(String name, double height, double weight) {
		super(name, height, weight, 25, 18.5);
	}
}

class Child extends Ningen{
	public Child(String name, double height, double weight) {
		super(name, height, weight, 18, 15);
	}
}

class BMI{
	public static double calc(Human h) {
		// 体重 / 身長 / 身長
		return h.getWeight() / h.getHeight() /  h.getHeight();
	}

	public static double calc(Child h) {
		// 体重 / 身長 / 身長
		return h.getWeight() / h.getHeight() /  h.getHeight();
	}

//	public static String judge(Human h) {
//		double bmi = calc(h);
//		if(Human.MAX < bmi) {
//			return "太りすぎです";
//
//		}else if(Human.MIN <= bmi) {
//			return "標準です";
//
//		}else {
//			return "痩せすぎです";
//		}
//	}
//
//	public static String judge(Child h) {
//		double bmi = calc(h);
//		if(Child.MAX < bmi) {
//			return "太りすぎです";
//
//		}else if(Child.MIN <= bmi) {
//			return "標準です";
//
//		}else {
//			return "痩せすぎです";
//		}
//	}
}


