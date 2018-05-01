package sudo;

public class Main {

	public static void main(final String[] args) {
		Fluits banana = new Fluits("バナナ"); // インスタンス化
		Fluits apple = new Fluits("リンゴ");

		banana.method2();
		apple.method2();

	}
}

class Fluits{
	private String name;

	public Fluits() {
		this.name = "ななし";
	}

	public Fluits(String name) {
		// オブジェクトの製造処理
		this.name = name;
	}

	public String method1() {
		return "【" + this.name + "】";
	}

	public void method2() {
		System.out.println("test");
		System.out.println(this.method1());
	}
}
