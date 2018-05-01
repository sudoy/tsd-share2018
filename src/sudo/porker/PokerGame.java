package sudo.porker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerGame {
	public static final int NUMBER_MAX = 13;

	public static void main(String[] args) {
		List<Card> cards = new ArrayList<>();

		for(Mark mark : Mark.values()) {
			for(int number = 1; number <= NUMBER_MAX; number++) {
				cards.add(new Card(mark, number));
			}
		}

		List<Card> pickup = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			int x = new Random().nextInt(cards.size());
			pickup.add(cards.get(x));
			cards.remove(x);
		}

//		スリーカード
//		pickup = new ArrayList<>();
//		pickup.add(new Card("ダイヤ", 11));
//		pickup.add(new Card("ハート", 11));
//		pickup.add(new Card("クラブ", 11));
//		pickup.add(new Card("ハート", 1));
//		pickup.add(new Card("クラブ", 2));

//		ストレート
//		pickup = new ArrayList<>();
//		pickup.add(new Card(Mark.DIAMOND, 5));
//		pickup.add(new Card(Mark.HEART, 6));
//		pickup.add(new Card(Mark.CLUB, 4));
//		pickup.add(new Card(Mark.HEART, 3));
//		pickup.add(new Card(Mark.CLUB, 2));

		for(Card c : pickup) {
			System.out.println("{" + c.getMark() + ", " + c.getNumber() +"}");
		}

		Poker poker = new Poker();
		System.out.println(poker.judge(pickup));
	}
}

class Poker{
	private Hand handChain = null;
	public Poker() {
		handChain = new StraightFlush();
		handChain
			.setNext(new FourOfAKind())
			.setNext(new FullHouse())
			.setNext(new Flush())
			.setNext(new Straight())
			.setNext(new ThreeOfAKind())
			.setNext(new TwoPair())
			.setNext(new OnePair())
			.setNext(new NoPair());
	}
	public String judge(List<Card> cards) {
		return handChain.judge(cards);
	}

}

abstract class Hand{
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

enum Mark{SPADE, DIAMOND, HEART, CLUB};

class Card{
	private Mark mark;
	private int number;

	public Card(Mark mark, int number) {
		super();
		this.mark = mark;
		this.number = number;
	}

	public Mark getMark() {
		return mark;
	}
	public void setMark(Mark mark) {
		this.mark = mark;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}