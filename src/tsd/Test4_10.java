package tsd;

import java.util.Scanner;

public class Test4_10 {

	public static void main(String[] args) {
//		int[] x = new int[7];
//
//		// 値を代入していない
////		x[1] = 100;
//
////		System.out.println(x[0]);
////		System.out.println(x[1]);
////		System.out.println(x[2]);
////		System.out.println(x[3]);
////		System.out.println(x[4]);
//
//		// おぼえる！
//		for(int i = 0; i < x.length; i++) {
//			System.out.println(x[i]);
//		}


//		// 問題１
//		int[] x = {10, 20, 30, 40, 50};
////		for(int i = 0; i < x.length; i++) {
////			System.out.println(x[i]);
////		}
//
//		// 拡張forに書き換える
//		for(int i : x) {
//			System.out.println(i);
//		}
//
//		// 問題２
//		for(int i = x.length - 1; 0 <= i; i--) {
//			System.out.println(x[i]);
//		}

		Scanner scn = new Scanner(System.in); // お約束
		System.out.print("aを入力してください：");
		int a = scn.nextInt();
		scn.close(); // お約束

		for(int i = 0; i < a; i++) {
			System.out.println(i);
		}

	}

}
