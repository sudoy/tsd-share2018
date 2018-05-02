package sudo.porker;

import java.util.List;

//ストレート
public class Straight extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {


		cards.sort( (Card o1, Card o2) -> o1.getNumber() - o2.getNumber());
		return true;

//		return straightCount == 1; //ストレートになったら点灯 仮
	}

	@Override
	public String getRoleName() {
		return "ストレート";
	}

}
//
//class cardCheck implements Comparable<cardCheck>{
//	protected int number;
//	protected String mark;
//
//	public cardCheck(int number, String mark) {
//		this.number = number;
//		this.mark = mark;
//	}
//
//	@Override
//	public int compareTo(cardCheck o) {
//		if(this.number == o.number) {
//			return 0;
//		}else if(this.number < o.number){
//			return -1;
//		}else {
//			return 1;
//		}
//	}
//
//}
