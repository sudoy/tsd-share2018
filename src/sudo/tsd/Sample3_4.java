package sudo.tsd;

public class Sample3_4 {

	public static void main(String[] args) {
		int age = 15;

		System.out.println("18歳以上ですか？");


		// 3項演算子
		//String str = age < 18 ? "18歳未満です。" : "18歳以上です。";

		// if文を使うと…?
		String str;
		if(age < 18) {
			str = "18歳未満です。";
		} else {
			str = "18歳以上です。";
		}



		System.out.println(str);
	}

}
