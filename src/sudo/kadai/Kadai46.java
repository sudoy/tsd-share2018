package sudo.kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai46 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

//		System.out.print("人数：");
//		int count = scn.nextInt();
//
//		int[] a = new int[count];
		ArrayList<Integer> a = new ArrayList<>();

		System.out.println("点数を入力せよ");
		int input = 0;
		int i = 0;
		while(true) {

			System.out.print((i + 1) + "番目の点数：");

			// 配列に格納
			input = scn.nextInt();
			if(input == -1) {
				break;
			}
			a.add(input);

			i++;
		}

		int sum = 0;
		int max = 0;
		int min = 999999;

		for(int x : a) {
			sum += x;
			if(max < x) {
				max = x;
			}
			if(x < min) {
				min = x;
			}
		}

		System.out.println("合計点は" + sum + "点です");
		System.out.println("平均点は" + ((double) sum / a.size()) + "点です。");
		System.out.println("最高点は" + max + "点です");
		System.out.println("最低点は" + min + "点です");
		scn.close();
	}

}
