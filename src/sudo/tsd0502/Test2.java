package sudo.tsd0502;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		Employee[] array = new Employee[3];
		array[0] = new Employee(461, "サカモト");
		array[1] = new Employee(462, "アチトイ");
		array[2] = new Employee(460, "キムラ");

		Arrays.sort(array, (o1, o2) -> o1.name.compareTo(o2.name));

		Arrays.stream(array).forEach(e -> {
			System.out.printf("社員番号：%d、名前：%s\n", e.no, e.name);
		});
	}
}

class Employee implements Comparable<Employee>{
	protected int no;
	protected String name;

	public Employee(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		return this.no - o.no;
	}
}