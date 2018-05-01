package sudo.kadai;

public class Kadai84 {

	public static void main(String[] args) {
		Human[] h = {new Human("鈴木一郎", 180, 75),
					new Human("山田太郎", 165, 50)};

		System.out.println("名前　　　　　：" + h[0].getName());
		System.out.println("身長　　　　　：" + h[0].getHeight());
		System.out.println("痩せる前の体重：" + h[0].getWeight());
		h[0].delWeight(13);
		System.out.println("痩せた後の体重：" + h[0].getWeight());

		System.out.println();

		System.out.println("名前　　　　　：" + h[1].getName());
		System.out.println("身長　　　　　：" + h[1].getHeight());
		System.out.println("太る前の体重　：" + h[1].getWeight());
		h[1].addWeight(22);
		System.out.println("太る後の体重　：" + h[1].getWeight());
	}

}

class Human{
	private String name;
	private int height;
	private int weight;

	public Human(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void addWeight(int addweight) {
		weight += addweight;
	}
	public void delWeight(int delweight) {
		weight -= delweight;
	}
	public String getName() {
		return name;
	}
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}

}
