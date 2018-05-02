package sudo.tsd0502;

public class Test1 {

	public static void main(String[] args) {
		FooBar<String> f1 = new FooBar<>();
		FooBar<Integer> f2 = new FooBar<>();
	}

}

class FooBar<E>{
	private E x ;

	public void setX(E x) {
		this.x = x;
	}

	public E getX() {
		return x;
	}
}