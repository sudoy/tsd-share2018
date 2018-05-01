class Animal {
	private int age;
	public Animal(int height, int weight, int age) {
		super();
		this.age = age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void showWalk(){
		System.out.println("歩く");
	}
}

//class Dog extends Animal{
//	public Dog(int a) {
//		super(a);
//	}
//	public void showBite() {
//		System.out.println("噛みつく");
//	}
//}
//class Cat extends Animal{
//	public void showScrabble() {
//		System.out.println("ひっかく");
//	}
//}

public class DogCatMain {

	public static void main(String[] args) {
//		Dog d1 = new Dog(10);
//		Cat c1 = new Cat();
//
//		d1.showWalk();
//		d1.showBite();
//
//		c1.showWalk();
//		c1.showScrabble();
	}
}
