package sudo.tsd0424;

public class Test4_11 {

	public static void main(String[] args) {
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(10);
//		// a.add("佐藤"); // コンパイルエラー
//
//
//		ArrayList b = new ArrayList();
//		b.add(10);
//		b.add("佐藤"); // 結果として、実行時エラーになることが多い
//

		String s = "";
		for(int i = 0; i < 100; i++) {
			// s += i;
			s = s + i;
		}
		System.out.println(s);

	}

}
