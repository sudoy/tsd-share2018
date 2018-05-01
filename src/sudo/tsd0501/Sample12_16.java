package sudo.tsd0501;

class Sample12_16 {
	public static void main(String[] args) {
		func(10, 20, 30);
	}

	// 暗黙の変換
	static void func(long i) {
		System.out.println("(long i)");
	}

	// autoboxing
	static void func(Integer i) {
		System.out.println("(Integer i)");
	}

	// 可変長引数（パラメータ）
	static void func(int... i) {
//		// iが配列
//		for(int x : i) {
//			System.out.println(x);
//		}
		System.out.println("(int... i)");
	}
}
