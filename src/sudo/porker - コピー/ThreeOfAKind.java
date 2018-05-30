package sudo.porker;

import java.util.List;

public class ThreeOfAKind extends Hand {

	public boolean hasRole(List<Card> cards) {
		for(int i = 1; i <= 13; i++) {
			int count = 0;
			for(Card c2 : cards) {
				if(i == c2.getNumber()) {
					count++;
				}
			}

			if(count == 3) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getRoleName() {
		return "スリーカード";
	}

}
