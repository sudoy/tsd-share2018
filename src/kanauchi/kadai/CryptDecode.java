package kanauchi.kadai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CryptDecode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("CryptDecode(複合化)");
		System.out.println("------------------------");
		System.out.print("ファイル名：");
		String file = scn.nextLine();
		scn.close();

		System.out.println("..........");
		System.out.print("データ名：");

		File inputFile = new File("c:\\output", file);
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(inputFile);

			int c;
			while ((c = fis.read()) != -1) {
				char a = (char) (c - 1);
				System.out.print(a);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
