package sudo.coding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CryptEncode {

	public static void main(String[] args) {
		String file = "crypt.txt";
		String data = "hello world!";

		// Fileをnew
		File outFile = new File("C:\\output", file);
		// FileOutputStreamをnew
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outFile);

			// データを出力
			for(int i = 0; i < data.length(); i++) {
				int c = data.charAt(i) + 1;
				fos.write(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}


	}

}
