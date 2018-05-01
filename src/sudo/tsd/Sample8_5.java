package sudo.tsd;

public class Sample8_5 {

	public static void main(String[] args) {
//		Predicate<String> pre = t -> {
//			return !t.equals("Hello");
//		};

//		Predicate<String> pre = new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return !t.equals("Hello");
//			}
//
//		};
//
//		System.out.println(pre.test("Hello"));
//		System.out.println(pre.test("1"));

		Hogehoge h = (String s) ->{
			return s.length();
		};

		h.method2("hello");

	}


}

interface Hogehoge{
	public int method1(String s);
	public default void method2(String s) {
		System.out.println(s + ":" + method1(s));
	}

}