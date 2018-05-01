package tsd0426;

public class Test2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a++ + ++b + a + a-- - --b;
		System.out.println(c);
	}

}
