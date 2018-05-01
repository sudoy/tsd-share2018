package sudo.kadai;

public class Test {

	public static void main(String[] args) {

		for(int i = 1; i <= 110; i++) {
			System.out.print(i);

			if(i % 3 == 0) {
				System.out.print(" Fizz");
			}
			if(i % 5 == 0) {
				System.out.print(" Buzz");
			}

			System.out.println();
		}
	}

}
