package sudo.porker;

import java.util.List;

// ワンペア
public class OnePair extends Hand{

	public boolean hasRole(List<Card> cards) {
		int pairCount = 0;
		for(Card c1 : cards) {
			for(Card c2 : cards) {
				if(c1.getMark().equals(c2.getMark()) &&
						c1.getNumber() == c2.getNumber()) {
					continue;
				}

				if(c1.getNumber() == c2.getNumber()) {
					pairCount++;
					continue;
				}
			}
		}
		return pairCount == 2;
	}

	@Override
	public String getRoleName() {
		return "ワンペア";
	}
}