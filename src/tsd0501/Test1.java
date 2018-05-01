package tsd0501;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(new Integer(100));
		a.add(200);
		a.add(300);
//		for(int x : a) {
//			System.out.println(x);
//		}

		short s = 5;
		int i = s; // 暗黙的型変換
//		Integer wi = s;

		// 1)
		Integer wi1 = new Integer(s);
		// 2)
		Integer wi2 = (int) s;


		Short s2 = 10;
		int i2 = s2; // 暗黙的型変換
	}

}
