package kanauchi.kadai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("CryptEncode(暗号化)");
		System.out.println("------------------------");

		System.out.println("ファイル名：");
		String file = scn.nextLine();

		System.out.println("データ名：");
		String data = scn.nextLine();
		scn.close();

		File outputFile = new File("c:\\output", file);

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(outputFile);

			for (int i = 0; i < data.length(); i++) {
				int c = data.charAt(i) + 1;
				System.out.println(".");
				fos.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("暗号化終わりました。");
	}

}
