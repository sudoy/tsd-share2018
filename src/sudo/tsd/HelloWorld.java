package sudo.tsd;

public class HelloWorld {
	public static void main(String[] args) {
		// 注釈（処理の説明）
		System.out.println(1000);
		System.out.println(0b1000); // 2進数
		System.out.println(01000); // 8進数
		System.out.println(0x1000); // 16進数

		System.out.println(3.14);
		System.out.println(3e4); // 3×10の4乗

		System.out.println('a'); // シングルクォート＝1文字
		System.out.println('あ');
		System.out.println('\u3012'); // 文字コード

		System.out.println("1000");
		System.out.println("hogehoge");
		System.out.println("p"); // 1文字だけど文字列
		System.out.println("");

		System.out.println(true);
		System.out.println(false);

		// System.out.println(null); なにもないことを表す

		/* ここもコメント

		 この間もコメント

		 ここもコメント */

		/** コメントの範囲は①と同じ。
		 Javadoc用のコメント
		 */

	}
}
