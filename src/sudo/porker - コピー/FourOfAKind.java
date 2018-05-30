package sudo.porker;

import java.util.List;

public class FourOfAKind extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		for(Card c1 : cards) {
			int count = 0;
			for(Card c2 : cards) {
				if(c1.getNumber() == c2.getNumber()) {
					count++;
				}
			}

			if(count == 4) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getRoleName() {
		return "フォーカード";
	}

}
