package sudo.porker;

import java.util.List;
import java.util.stream.Collectors;

public class FullHouse extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		List<Integer> numbers = cards.stream()
				.map(c -> c.getNumber())
				.distinct()
				.collect(Collectors.toList());

//		List<Integer> numbers = new ArrayList<Integer>();
//
//		for(Card c : cards) {
//			if(numbers.contains(c.getNumber())) {
//				continue;
//			}else {
//				numbers.add(c.getNumber());
//			}
//		}

		return numbers.size() == 2;
	}

	@Override
	public String getRoleName() {
		return "フルハウス";
	}

}
