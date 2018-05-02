package sudo.porker;

import java.util.List;

public class StraightFlush extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {

		Flush flu = new Flush();
		boolean flu1 = flu.hasRole(cards);

		Straight stra = new Straight();
		boolean stra1 = stra.hasRole(cards);

		if( flu1 == true && stra1 == true) {
			return true;
		}
		return false;
	}

	@Override
	public String getRoleName() {
		return "ストレートフラッシュ";
	}

}
