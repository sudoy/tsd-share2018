package sudo.porker;

public class Card {
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
