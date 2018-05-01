package kadai;

import java.util.Random;

public class Kadai11 {

	public static void main(String[] args) {
		// 0から2までのランダムな整数を生成
		int x = new Random().nextInt(3);

		// switch文を使ってグー・チョキ・パーを出力
		if(x == 0) {
			System.out.println("グー");
		} else if(x == 1) {
			System.out.println("チョキ");
		} else {
			System.out.println("パー");

		}
	}
}
