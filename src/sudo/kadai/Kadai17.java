package sudo.kadai;

import java.util.Scanner;

public class Kadai17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int x;
		do {
			// 入力値を取得
			System.out.print("3桁の正の整数値：");
			x = scn.nextInt();

		}while(x < 100 || 999 < x);

		System.out.println(x + "と入力しましたね。");

		scn.close();

	}

}
