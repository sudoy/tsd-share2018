package sudo.porker;

import java.util.List;

public class ThreeOfAKind extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		int count = 0;

		for(int i = 1; i < 14; i++) {
			count = 0;
			for(Card c : cards) {
				if(c.getNumber() == i) {
					count++;
				}
			}
			if(count == 3) {
				return count == 3;
			}
		}
		return false;




	}

	@Override
	public String getRoleName() {
		return "スリーカード";
	}

}
