package sudo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TypingGame {
	private static final String DATA_PATH = "\\\\192.168.3.62\\public\\研修資料\\data.txtxxx";
	private static final int QUESTION_COUNT = 2;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(DATA_PATH);

		BufferedReader br = null;
		ArrayList<String> data = new ArrayList<>();
		try {
			// 問題を読み込む
			br = new BufferedReader(new FileReader(file));

			String line;
			while((line = br.readLine()) != null) {
				data.add(line);
			}

		} catch (IOException e) {
			throw new FileNotFoundException("ファイルがありません。");

		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Scanner scn = new Scanner(System.in);

		for(int i = 0; i < QUESTION_COUNT; i++) {
			// ランダムで数字を生成
			int idx = new Random().nextInt(data.size());

			// ArrayListから要素を1つ取り出す
			String str = data.get(idx);

			// 1行目に漢字の問題、2行目に漢字変換されていない問題を表示
			// strを二つの文字列に分割
			String line1 = str.split(",")[0];
			String line2 = str.split(",")[1];

			System.out.println("**************** 第" + (i + 1) + "問 ****************");
			System.out.println(line1); // 漢字の問題文
			System.out.println(line2); // ひらながの問題文
			System.out.println();

			while(true) {
				// ユーザーの入力を受け付けて、
				// 入力と表示した問題が同じかどうかを判定する
				System.out.println("【入力してください】");
				String input = scn.next();
				if(input.equals(line2)) {
					// 次の問題へ
					break;
				}

				// 同じ問題を表示するようにする
				// 入力して下さいを表示している場所まで戻る
			}

			// 同じデータを2回出さないようにする
			data.remove(idx); // データ削除
		}



		scn.close();


	}

}
