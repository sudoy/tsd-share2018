package tsd;

public class Test4_13 {

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		t1.method1(100);
		Test2 t2 = new Test2();
		t2.method1(200);
		System.out.println(t1.x); // 100
		System.out.println(t2.x); // 200

		Test2.staticMethod1();
	}
}

class Test2{
	int x; // インスタンス変数
	static int y; // static変数

	void method1(int a) { // a = 100; t1に対して
		System.out.println("method1 called.");
		method2(a); // t.method2()
		staticMethod1(); // OK
	}

	void method2(int b) { // b = 100; t1に対して
		System.out.println("method2 called.");
		x = b;// OK
		y = 200; // OK
	}

	static void staticMethod1() {
		System.out.println("staticMethod1 called.");
		staticMethod2(); // OK
		// method1(100); // NG（コンパイルエラー）

		// どうしてもインスタンスメソッド・変数を使いたい場合
		Test2 t = new Test2();
		t.method1(100);
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 called.");
		y = 100; // OK
		// x = 200; // NG（コンパイルエラー）
	}

}