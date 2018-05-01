package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_3 {

	public static void main(String[] args) {
		// ファイルをコピー

		// Fileオブジェクトを作る（２つ）
		// FileInputStream、FileOutputStreamをnew
		// whileで読み込み＆書き込み
		// close

		File inputFile = new File("c:\\ocjp\\ocjp.jpg");
		File outputFile = new File("c:\\ocjp\\ocjpcopy.jpg");

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);

			int c;
			while((c = in.read()) != -1) {
				out.write(c);
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
				if(out != null) {
					out.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}


	}

}
