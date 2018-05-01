package sudo.kadai;

import java.util.Scanner;

public class Kadai44 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// ①要素数の読み込み
		System.out.print("要素数：");
		int count = scn.nextInt();

		int[] a = new int[count];

		// ①の回数分、数値を読み込む
		for(int i = 0; i < count; i++) {
			System.out.print("a[" + i + "] = ");

			// 配列に格納
			a[i] = scn.nextInt();
		}

		// 書式化して出力
		System.out.print("{");
		for(int i = 0; i < count; i++) {
			if(i < count - 1) {
				System.out.print(a[i] + ", ");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.print("}");

		scn.close();
	}

}
