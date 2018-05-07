package nakamura.kadai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CryptDecode {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("CriptDecode（復号化）");
		System.out.println("--------------------------");
		System.out.print("ファイル名：");
		String fname = scn.nextLine();

		File input = new File("C:\\output\\", fname);
		FileInputStream in = null;
		try {
			in = new FileInputStream(input);


			System.out.print("データ：");
			int c;
			while((c = in.read()) != -1) {
				char a = (char)(c - 1);
				System.out.print(a);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scn.close();
	}

}
