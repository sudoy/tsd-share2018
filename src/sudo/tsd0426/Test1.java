package sudo.tsd0426;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test1 {

	public static void main(String[] args) throws Exception {
		File file = new File("c:\\output\\objectStore.ser");
		FileOutputStream out = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(out);

		User obj = new User("sudo", 35, "hogehoge", new School("niigata"));
		os.writeObject(obj);

		os.close();

//		FileInputStream in = new FileInputStream(file);
//		ObjectInputStream is = new ObjectInputStream(in);
//		Object object = is.readObject();
//		is.close();
//
//
//		if(object instanceof User) {
//			User obj = (User)object;
//			System.out.println(obj.getName());
//			System.out.println(obj.getAge());
//		}else {
//			System.out.println("読み込めませんでした。");
//		}
	}
}

class School {
	private String schoolName;
	public School(String schoolName) {
		this.schoolName = schoolName;
	}
}

class User implements Serializable{
	private String name;
	private int age;
	private String pass;
	protected transient School school;

	public User(String name, int age, String pass, School school) {
		super();
		this.name = name;
		this.age = age;
		this.pass = pass;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


}


