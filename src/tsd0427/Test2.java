package tsd0427;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		List<Integer> l = new ArrayList<>();
		for(int i = 0; i < 99999; i++) {
			int value = new Random().nextInt(9999);
			l.add(0, value);
		}

		long end = System.currentTimeMillis();
		System.out.println("処理時間：" + (end - start));

	}

}
