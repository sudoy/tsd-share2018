package sudo.tsd0424;

public class Sample2_10 {

	public static void main(String[] args) {
		// コピー（CTRL+C）
		// 貼り付け（CTRL+V）

		String str = "きつね";

		char a = str.charAt(0);
		System.out.println(a);

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));

		int b = str.indexOf("つ");
		System.out.println(b);

		System.out.println(str.indexOf("つ"));

		int c = str.length();
		System.out.println("何文字？>>>>>" + c);


		System.out.println("何文字？>>>>>" + str.length());
		// ->              "何文字？>>>>>" + 3
		// ->              "何文字？>>>>>3"

		System.out.println(str.toString());


		// equals()
		String str2 = "たぬき";

		boolean d = str.equals(str2);
		System.out.println(d);

		if(str.equals(str2)) {
			System.out.println("同じです");
		}else {
			System.out.println("違います");
		}

		System.out.println(str.equals(str2));
	}

}
