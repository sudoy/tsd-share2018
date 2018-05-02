package sudo.porker;

import java.util.ArrayList;
import java.util.List;

public class Straight extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		List<Card> tmp = new ArrayList<Card>();

		// Aがあった場合は、14として登録
		for(Card c : cards) {
			if(c.getNumber() == 1) {
				tmp.add(new Card(c.getMark(), 14));
			}
			tmp.add(c);
		}

		// 数字順にソート
		tmp.sort((Card c1, Card c2)->c1.getNumber() - c2.getNumber());

		int count = 0;
		for(int i = 1; i < tmp.size(); i++) {
			if(tmp.get(i - 1).getNumber() + 1 == tmp.get(i).getNumber()) {
				count++;
			}
		}
		return count == 4;
	}

	@Override
	public String getRoleName() {
		return "ストレート";
	}


}
