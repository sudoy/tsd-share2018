package kimura.kadai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CryptDecode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("CryptDecode(復合化)");
		System.out.println("-------------------------");

		System.out.println("ファイル名 : ");
		String filename = scn.nextLine();

		System.out.println(".............");

		System.out.println("データ : ");
		String data = scn.nextLine();

		File inputFile = new File("C:\\output");
		FileInputStream in = null ;

		try {
			in = new FileInputStream(inputFile);

			int c;
			while((c = in.read()) != -1) {
				System.out.println((char)(c - 1));
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
