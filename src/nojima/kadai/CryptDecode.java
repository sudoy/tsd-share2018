package nojima.kadai;

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
		System.out.print("ファイル名 : ");
		String fileName = scn.nextLine();
		File inputFile = new File("c:\\output", fileName);
		scn.close();
		FileInputStream in = null;
		System.out.println("...........");
		System.out.print("データ：");

		try {
			in = new FileInputStream(inputFile);
			int c;
			while(( c = in.read()) != -1) {
				int code = c - 1;
				System.out.print((char)code);
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
