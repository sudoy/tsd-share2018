package sudo.tsd0424;

class Animal2 {
	void cry() {
		System.out.println("???");
	}
}

class Dog2 extends Animal2{
	@Override
	void cry() {
		System.out.println("わんわん");
	}
}

class Cat2 extends Animal2{
	@Override
	void cry() {
		System.out.println("にゃーにゃー");
	}
}

public class Sample6_14 {

	public static void main(String[] args) {
		// →ポリモーフィズム
		Animal2 a = new Dog2();
		a.cry();

		// 事前に暗黙的型変換されたものを戻す
		if(a instanceof Dog2) {
			Dog2 d = (Dog2) a;
		}

	}
}



