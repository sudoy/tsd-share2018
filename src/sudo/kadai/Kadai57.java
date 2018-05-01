package sudo.kadai;

import java.util.Scanner;

public class Kadai57 {

	public static void main(String[] args) {
		// 入力を受け取る
		// Scannerのインスタンス化
		Scanner scn = new Scanner(System.in);
		System.out.print("整数：");
		int x = scn.nextInt();

		// signOfメソッドを実行
		Test57 t = new Test57();
		int y = t.signOf(x);

		// 実行結果の出力
		System.out.println("signOf(x)は" + y + "です。");

		scn.close();
	}
}

class Test57{
	// signOfメソッドを作る
	int signOf(int n) {
		if(n < 0) {
			return -1; // メソッド終了
		} else if(n == 0) {
			return 0;
		} else {
			return 1;
		}
	}

}
