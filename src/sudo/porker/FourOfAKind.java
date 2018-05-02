package sudo.porker;

import java.util.List;

public class FourOfAKind extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {

		int count = 0;
		for(int i = 1; i < 14; i++) {
			count = 0;
			for(Card c : cards ) {
				if( c.getNumber() == i ) {
					count++;
				}
			}
			if(count == 4) {
				return count == 4;
			}

		}
		System.out.println(count);
		return false;


	}

	@Override
	public String getRoleName() {

		return "フォーカード";
	}

}
