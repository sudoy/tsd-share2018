package tsd;

public class Test4_4 {
	public static void main(String[] args) {

//		int x; // データ型が整数
//		x = 100;
//		System.out.println(x); // ①???? -> 100
//
//		x = 200;
//		System.out.println(x); // ②???? -> 200
//
//		// ①100  ②300
//
//		// ①200  ②200
//
//		// ①100  ②200 正解
//
//
//
////		x = 3.14;
////		x = "hello";
//
//		int y = 20;
//		System.out.println(y);


		// 代入とデータ型
		// 「代入の右辺と左辺のデータ型は揃える！！！」
		int a = 100; // 整数リテラルはint型
		byte b = 100; // エラー
		long l = 100L; // リテラルの後ろにLを付けるとlong型

		double d = 3.14; // 少数リテラルはdouble型
		float f = 3.14F; // リテラルの後ろにFを付けるとfloat型




		int x = 10;
		int y = 100;

		// 同じ
		x += y;
		x = x + y;

		// 全部同じ
		x += 1;
		x = x + 1;
		x++;


		// 同一の判定に「==」が使用できるのは基本データ型のみ
		String s1 = "hello";
		String s2 = "world";

		System.out.println(s1 == s2); // NG
		System.out.println(s1.equals(s2)); // OK




	}
}
