package sudo.porker;

import java.util.List;

public class TwoPair extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		int pairCount1 = 0;
		int pairCount2 = 0;
		for (Card c1 : cards) {
			for (Card c2 : cards) {
				if (c1.getMark().equals(c2.getMark()) &&
						c1.getNumber() == c2.getNumber()) {
					continue;
				}
				if (pairCount1 < 2) {
					if (c1.getNumber() == c2.getNumber()) {
						pairCount1++;
						continue;
					}
				}
				if (c1.getNumber() == c2.getNumber()) {
					pairCount2++;
					continue;
				}
			}
		}
		return pairCount1 == 2 && pairCount2 == 2;

	}

	@Override
	public String getRoleName() {
		return "ツーペア";
	}

}
