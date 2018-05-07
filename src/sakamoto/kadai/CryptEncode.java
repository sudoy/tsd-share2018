package sakamoto.kadai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode {
	public static void main(String[] args) {
		System.out.println("暗号化");
		Scanner scn = new Scanner(System.in);
		System.out.print("ファイル名: ");
		String fName = scn.nextLine();
		System.out.print("データ: ");
		String dName = scn.nextLine();

		scn.close();

		File outputFile = new File("C:\\output\\"+fName);
		FileOutputStream out = null;

		try {
			out = new FileOutputStream(outputFile);
			int c;

			for(int i = 0; i < dName.length(); i++) {
				c = dName.charAt(i)+1;
				out.write(c);
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
		}
	}
}
