package tsd0427;

public class Test1 {

	public static void main(String[] args) {


	}

}

class Animal{
	String name;
	int age;
	int gender;

	@Override
	public boolean equals(Object obj) {
		Animal a = (Animal) obj;
		return name.equals(a.name) && age == a.age && gender == a.gender;
	}

	@Override
	public int hashCode() {
		return name.hashCode() % age + gender;
	}
}