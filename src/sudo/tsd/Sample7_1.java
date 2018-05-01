package sudo.tsd;

public class Sample7_1 {

	public static void main(String[] args) {
		int x = 15;
		int y = 0;
		try {
			System.out.println("x / y: " + x / y); // 例外発生
			System.out.println("2 * y: " + x * y);
		}catch(ArithmeticException e) {
			System.out.println("発生した例外: " + e);
//			e.printStackTrace();
		}catch(RuntimeException e) {
			System.out.println("ほげほげ");
		}finally {
			System.out.println("finallyブロック。必ず実行されます。");
		}

		System.out.println("x - y: " + (x - y));
	}

}
