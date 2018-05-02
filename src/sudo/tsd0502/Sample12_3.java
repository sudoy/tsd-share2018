package sudo.tsd0502;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Sample12_3 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";
		// Integer i = 123;
		myList.add(st1);
		myList.add(st2);
		myList.add(st3);
		// myList.add(i); // コンパイルエラー

		/* 従来の書き方 */
		for (int i = 0; i < myList.size(); i++) {
		    String st = (String) myList.get(i);
		    System.out.println(st);
		}

		/* JDK 5.0では以下の書き方が可能 */
		for (String st : myList) {
			System.out.println(st);
		}

		/* Stream APIの書き方（ラムダ式） */
		myList.stream().forEach(str -> System.out.println(str));

		/* Stream APIの書き方（匿名クラス） */
		myList.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		myList.stream().forEach((String t) -> {
			System.out.println(t);
		});
	}

}
