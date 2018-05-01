package sudo;

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
		handChain = new Straight();
		handChain
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

// 役なし
class NoPair extends Hand{
	public boolean hasRole(List<Card> cards) {
		return true;
	}

	@Override
	public String getRoleName() {
		return "役なし";
	}
}

// ワンペア
class OnePair extends Hand{

	protected int getPairCount(List<Card> cards) {
		int pairCount = 0;
		for(Card c1 : cards) {
			for(Card c2 : cards) {
				if(c1.getMark().equals(c2.getMark()) &&
						c1.getNumber() == c2.getNumber()) {
					continue;
				}

				if(c1.getNumber() == c2.getNumber()) {
					pairCount++;
					continue;
				}
			}
		}
		return pairCount / 2;
	}

	public boolean hasRole(List<Card> cards) {
		return getPairCount(cards) == 1;
	}

	@Override
	public String getRoleName() {
		return "ワンペア";
	}
}

// ツーペア
class TwoPair extends OnePair{

	public boolean hasRole(List<Card> cards) {
		return getPairCount(cards) == 2;
	}

	@Override
	public String getRoleName() {
		return "ツーペア";
	}
}

// スリーカード
class ThreeOfAKind extends Hand{

	public boolean hasRole(List<Card> cards) {
		for(Card c1 : cards) {
			int count = 0;
			for(Card c2 : cards) {
				if(c1.getNumber() == c2.getNumber()) {
					count++;
				}
			}

			if(count == 3) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getRoleName() {
		return "スリーカード";
	}

}

// ストレート
class Straight extends Hand{

	@Override
	public boolean hasRole(List<Card> cards) {
		// 数字順にソート
		cards.sort((Card c1, Card c2)->{
			if(c1.getNumber() != c2.getNumber()) {
				return c1.getNumber() - c2.getNumber();
			}else {
				return c1.getMark().compareTo(c2.getMark());
			}
		});

		for(int i = 1; i < cards.size(); i++) {
			if(cards.get(i - 1).getNumber() + 1 == cards.get(i).getNumber()) {
				// 何もしない
			}else {
				return false;
			}
		}
		return true;
	}

	@Override
	public String getRoleName() {
		return "ストレート";
	}

}

// フラッシュ
class Flush extends Hand {

	@Override
	public boolean hasRole(List<Card> cards) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public String getRoleName() {
		return "フラッシュ";
	}

}

// フルハウス
class FullHouse extends Hand{

	@Override
	public boolean hasRole(List<Card> cards) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public String getRoleName() {
		return "フルハウス";
	}

}

// フォーカード
class FourOfAKind extends Hand{

	@Override
	public boolean hasRole(List<Card> cards) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public String getRoleName() {
		return "フォーカード";
	}

}

// ストレートフラッシュ
class StraightFlush extends Hand{

	@Override
	public boolean hasRole(List<Card> cards) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public String getRoleName() {
		return "ストレートフラッシュ";
	}

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