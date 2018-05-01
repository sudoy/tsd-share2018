package sudo.tsd0424;

import java.util.Arrays;
import java.util.Comparator;

public class Test4_24_4 {

	public static void main(String[] args) {
		// 配列をソートする
		// 次の配列を文字数順にソートして表示してください。
		String[] array = {"abc", "abcdefg", "a", "ab", "cdef"};

		// ソート後
		// {"a", "ab", "abc", "cdef", "abcdefg"};

		// 配列をソートするときには、Arraysクラスのsortメソッドを
		// 使用すると便利です。
		// また、配列の要素を出力するには、同じくArraysクラスの
		// toStringメソッドを使用すると便利です。

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		// 文字列はそのままでは辞書順(a,b,c順)でソートされてしまいます。
		// このソート順を別のルールに変更するためには、Java API中の
		// Comparatorインタフェースを実装したクラス（オブジェクト）を、
		// sotrメソッドの第2引数に指定する必要があります。

		// Comparatorインタフェースの特徴
		// １．ジェネリックスに対応している
		// ２．Tを型パラメータ（ジェネリックスとした場合）実装するメソッドは
		//    以下の1つのみ。
		//    int compare(T o1, T o2)
		// ３．compareメソッドは引数のo1とo2を比較してソートしたときに先に
		//    なるオブジェクトがo1の場合は負の整数（-1）を、同じ場合にはゼロを、
		//    o2が際になる場合には正の整数（1）を返すように実装する

		// たとえば、intの配列を逆順にソートする場合
		class ReverseSort implements Comparator<Integer>{

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 < o2 ? 1 : -1;
			}
		}

		Integer[] a = {1, 5, 2, 10, 3};
		Arrays.sort(a, new ReverseSort());
		System.out.println(Arrays.toString(a));

		// 以上を踏まえて、文字列配列の要素を文字数順にソートするプログラムを
		// つぎの3パターンとも作成してください。
		// ・implementsを使用
		// ・匿名クラスを使用
		// ・ラムダ式

	}
}
