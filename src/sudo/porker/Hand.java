package sudo.porker;

import java.util.List;

public abstract class Hand {
	private Hand next = null;
	public Hand setNext(Hand next) {
		this.next = next;
		return next;
	}
	public String judge(List<Card> cards) {
		if(hasRole(cards)) {
			return getRoleName();
		}else {
			if(next != null) {
				return next.judge(cards);
			}else {
				throw new RuntimeException("役が設定されていません。");
			}
		}
	}

	public abstract boolean hasRole(List<Card> cards);
	public abstract String getRoleName();
}
