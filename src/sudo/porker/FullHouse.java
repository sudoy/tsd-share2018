package sudo.porker;

import java.util.List;

public class FullHouse extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		int pairCount = 0;

		for(Card c1 : cards) {
			for(Card c2 : cards) {
				if(c1.getMark().equals(c2.getMark()) &&
						c1.getNumber() == c2.getNumber()) {
					continue;
				}

				//同じカードが３枚あるか判定
//				if(threeCard < 6) {
//					if(c1.getNumber() == c2.getNumber()) {
//						threeCard++;
//						continue;
//					}
//				}
//
//				//同じカードが２枚あるか判定
//				if(c1.getNumber() == c2.getNumber()) {
//					pairCount++;
//					continue;
//				}

				//ペアが8枚あればフルハウス ワンペア＝2 スリーカード=6
				if(c1.getNumber() == c2.getNumber()) {
					pairCount++;
				}
			}
		}
		return pairCount == 8;

	}

	@Override
	public String getRoleName() {
		return "フルハウス";
	}

}
