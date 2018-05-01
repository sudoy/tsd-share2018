package sudo.tsd;

public class Test4_13_3 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();

		String s1 = new String("hello"); // 使わない
		String s2 = "hello";
	}
}

class Runtime{
	// デザインパターン13種類
	// シングルトンパターン　※非常によく使われている
	static Runtime getRuntime() {
		return new Runtime();
	}
}