package sudo.tsd0424;

public class Sample4_6 {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

		// 実行時引数を全てprintlnで出力する（エラーにならないように）
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		for(String s : args) {
			System.out.println(s);
		}
	}

}
