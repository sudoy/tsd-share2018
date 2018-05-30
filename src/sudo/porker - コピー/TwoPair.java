package sudo.porker;

import java.util.List;

public class TwoPair extends OnePair {

	public boolean hasRole(List<Card> cards) {
		return getPairCount(cards) == 2;
	}

	@Override
	public String getRoleName() {
		return "ツーペア";
	}

}
