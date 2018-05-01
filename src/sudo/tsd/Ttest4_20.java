package sudo.tsd;

import java.io.IOException;

public class Ttest4_20 {

	public static void main(String[] args) throws IOException {
		//		File file = new File("test.txt");
		//		FileReader fr = new FileReader(file);

		//		try {
		//			String s = "hogehoge";
		//			int i = Integer.parseInt(s);
		//		}catch(NumberFormatException e) {
		//			System.out.println("intに変換できなかった");
		//		}

		//		ClassA a = new ClassA();
		//		ClassB b = new ClassB();
		//		if(a.equals(b)) {
		//			System.out.println("同じ");
		//		}else {
		//			System.out.println("違うよ");
		//		}

		//		Scanner scn = new Scanner(System.in);
		//		String input = scn.nextLine();

		String[] a = { "5", "23", "1", "89", "1", "1" };

		Ttest4_20 obj = new Ttest4_20();
		int[] b = obj.makeArray3(a);

		for (int i : b) {
			System.out.println(i);
		}
	}

	// 戻り値：{5, 23, 0, 89, 0, 0}
	int[] makeArray1(String[] a) {
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]); // ★例外発生
			}catch(NumberFormatException e) {

			}
		}
		return b;
	}

	// 戻り値：{5, 23, 0, 0, 0, 0}
	int[] makeArray2(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]); // ★例外発生
			}
		}catch(NumberFormatException e) {

		}
		return b;
	}

	// 戻り値：{0, 0, 0, 0, 0, 0}
	int[] makeArray3(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]); // ★例外発生
			}
			return b;
		}catch(NumberFormatException e) {
			return new int[a.length];
		}
	}
}

//class ClassA{}
//class ClassB{}
