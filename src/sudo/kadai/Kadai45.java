package sudo.kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai45 {

	public static void main(String[] args) {
		int max = 20;

		Scanner scn = new Scanner(System.in);
		System.out.print("要素数：");
		int count = scn.nextInt();
		scn.close();

		int[] arr = new int[count];
		for(int i = 0; i < arr.length; i++) {
			// 1～maxまでのランダム値を代入
			arr[i] = new Random().nextInt(max) + 1;
		}

		for(int j = max; j > 0; j--)  {
			for(int i = 0; i < arr.length; i++) {
				if(j <= arr[i]) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println(); // 改行
		}

		StringBuilder line1 = new StringBuilder();
		StringBuilder line2 = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			line1.append("--");
			line2.append((i % 10) + " ");
		}
		System.out.println(line1);
		System.out.println(line2);
 	}
}
