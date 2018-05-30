package sudo.porker;

import java.util.List;

public class Flush extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
//		if(cards.get(0).getMark().equals(cards.get(1).getMark())
//				&& cards.get(0).getMark().equals(cards.get(2).getMark())
//				&& cards.get(0).getMark().equals(cards.get(3).getMark())
//				&& cards.get(0).getMark().equals(cards.get(4).getMark())) {
//			return true;
//		}

		long count = cards.stream()
				.filter(card -> card.getMark().equals(cards.get(0).getMark()))
				.count();
		return count == 5;
	}

	@Override
	public String getRoleName() {
		return "フラッシュ";
	}

}
