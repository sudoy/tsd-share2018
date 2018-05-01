package sudo.tsd0424;

public class Sample3_11 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			// continueを使った場合
			if((i % 3) == 0) {
				continue;
			}
			System.out.println("i = " + i);

//			// continueを使わなかった場合
//			if((i % 3) != 0) {
//				System.out.println("i = " + i);
//			}
			
			int a = 0, b = 0;
			
		}
		System.out.println("for文の後の処理");
	}

}
