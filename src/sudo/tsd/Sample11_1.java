package sudo.tsd;

import java.io.File;

public class Sample11_1 {

	public static void main(String[] args) {
		try {
			File f1 = new File("C:\\ocjp\\Sample11_1.java");
			System.out.println(f1.getCanonicalPath());
		}catch(Exception e) {

		}
	}

}
