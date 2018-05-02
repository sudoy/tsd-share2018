package sudo.porker;

import java.util.List;

public class Flush extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		if(cards.get(0).getMark().equals(cards.get(1).getMark())
				&& cards.get(0).getMark().equals(cards.get(2).getMark())
				&& cards.get(0).getMark().equals(cards.get(3).getMark())
				&& cards.get(0).getMark().equals(cards.get(4).getMark())) {
			return true;
		}
		return false;
	}

	@Override
	public String getRoleName() {
		return "フラッシュ";
	}

}
