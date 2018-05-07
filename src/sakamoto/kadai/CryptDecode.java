package sakamoto.kadai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CryptDecode {
	public static void main(String[] args) {
		System.out.println("復号化");
		Scanner scn = new Scanner(System.in);
 		System.out.print("ファイル名: ");
 		String fName = scn.nextLine();
 		scn.close();

 		File inputFile = new File("C:\\output\\"+fName);
 		FileInputStream in = null;
 		try {
			in = new FileInputStream(inputFile);
			int c;

			while((c = in.read()) != -1) {
				System.out.print((char)(c-1));
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
