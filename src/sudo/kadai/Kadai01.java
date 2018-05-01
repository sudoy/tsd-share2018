package sudo.kadai;

import java.util.Scanner;

public class Kadai01 {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		System.out.print("xを入力：");
		int x = scn.nextInt();
		System.out.print("yを入力：");
		int y = scn.nextInt();
		scn.close();

//		int x = 22;

		if(x > 0) {
			System.out.println("正です");
		}else {
			System.out.println("負です");
		}
	}

}
