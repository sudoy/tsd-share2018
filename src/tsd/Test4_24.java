package tsd;

import java.util.function.Predicate;

public class Test4_24 {

	public static void main(String[] args) {
		// implements
		PredicateImpl p1 = new PredicateImpl();
		System.out.println(p1.test("hogehoge"));

		// 匿名クラス
		Predicate<String> p2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};
		System.out.println(p2.test("hogehoge"));

		// ラムダ式
		Predicate<String> p3 = (String t) -> {
			return t.length() >= 10;
		};
		// ラムダ式（省略）
		Predicate<String> p4 = t -> t.length() >= 10;
		System.out.println(p4.test("hogehoge"));
	}

}

class PredicateImpl implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}