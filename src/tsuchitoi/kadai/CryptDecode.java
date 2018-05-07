package tsuchitoi.kadai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CryptDecode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("CryptDecode(復号化)");
		System.out.println("-------------------------------");
		System.out.print("ファイル名 : ");
		File inputFile = new File("c:\\output\\" + scn.nextLine());
		scn.close();
		FileInputStream in = null;
		System.out.println("データ : ");
		try {
			in = new FileInputStream(inputFile);
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)(c - 1));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
