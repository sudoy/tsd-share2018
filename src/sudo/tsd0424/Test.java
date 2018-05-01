package sudo.tsd0424;

public class Test {

	public static void main(String[] args) {
		boolean a = true;
		int x = 100;

		if((x = 101) % 2 == 0) {
			System.out.println("a = true");
		}else {
			System.out.println("a = false");
		}

		System.out.println(a);
	}

}
