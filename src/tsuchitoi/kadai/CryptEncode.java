package tsuchitoi.kadai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode {

	public static void main(String[] args) {
		System.out.println("CryptEncode (暗号化)");
		System.out.println("-----------------------------");
		Scanner scn = new Scanner(System.in);
		System.out.print("ファイル名 : ");
		File outputFile = new File("c:\\output\\" + scn.nextLine());
		System.out.print("データ : ");
		String a = scn.nextLine();
		scn.close();
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(outputFile);
			int c;
			for(int i = 0; i < a.length(); i++) {
				c = a.charAt(i) + 1;
				out.write(c);
				System.out.println(".");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("暗号化終わりました。");
		}
	}

}
