package sudo.porker;

import java.util.List;

//ストレート
public class Straight extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {

		int sum = 0;

	cards.sort( (Card o1, Card o2) -> o1.getNumber() - o2.getNumber());  //ラムダ

		int number = cards.get(0).getNumber()+1;
		int count = 0;

		for(int i = 0; i < 5; i++) {
			sum += cards.get(i).getNumber();
		}
		if(sum == 47) {
			return true;
		}

		for(int i = 1; i < 5; i++) {
			if(cards.get(i).getNumber() == number) {
				count++;
			}
			number++;
		}
		if(count == 4) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String getRoleName() {
		return "ストレート";
	}

}

//class cardCheck implements Comparable<cardCheck>{
//	protected String mark;
//	protected int number;
//
//	public cardCheck(String mark,int number) {
//		this.mark = mark;
//		this.number = number;
//
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
//	public int getNumber() {
//		return number;
//	}
//	public String getMark() {
//		return mark;
//	}
//
//}


//Arrays.sort(cards, new Comparator<cardCheck>() {  //Comparator
//
//	@Override
//	public int compare(cardCheck o1, cardCheck o2) {
//
//		return o1.number.compareTo(o2.number);
//	}
//
//});
