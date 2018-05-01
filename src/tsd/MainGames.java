package tsd;

import java.util.ArrayList;

public class MainGames {

	public static void main(String[] args) {
//		// 配列宣言
//		Game[] games = new Game[3];
//
//		// 配列の中にオブジェクトを代入
//		games[0] = new Game("スプラトゥーン2", "アクションシューティング", 712);
//		games[1] = new Game("モンスターハンターワールド", "アクションロールプレイング", 936);
//		games[2] = new Game("ドラゴンクエストIX", "ロールプレイング", 317);

		// ArrayList宣言
		ArrayList<Game> games = new ArrayList<>();

		Game g1 = new Game("スプラトゥーン2", "アクションシューティング", 712);
		games.add(g1);
		games.add(new Game("モンスターハンターワールド", "アクションロールプレイング", 936));
		games.add(new Game("ドラゴンクエストIX", "ロールプレイング", 317));

		for(int i = 0; i < games.size(); i++) {
			games.get(i).show(); // メソッドチェーン（最近流行り）
		}
	}

}

class Game{
	String name;
	String type;
	int sale;

	Game(String n, String t, int s){
		name = n;
		type = t;
		sale = s;
	}

	void show() {
		System.out.println("ゲーム名：" + name + "、ジャンル：" + type + "、販売本数：" + sale + "万");
	}
}