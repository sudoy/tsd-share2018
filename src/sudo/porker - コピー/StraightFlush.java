package sudo.porker;

import java.util.List;

public class StraightFlush extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		return new Straight().hasRole(cards) && new Flush().hasRole(cards);
	}

	@Override
	public String getRoleName() {
		return "ストレートフラッシュ";
	}

}
