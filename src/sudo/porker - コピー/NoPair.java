package sudo.porker;

import java.util.List;

public class NoPair extends Hand{
	public boolean hasRole(List<Card> cards) {
		return true;
	}

	@Override
	public String getRoleName() {
		return "役なし";
	}
}