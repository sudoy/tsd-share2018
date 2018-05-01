package tsd0425;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
//		■データを暗号化・復号化するプログラム
//
//		以下の2つのクラスを作成する
//		・CryptEncode
//		Scannerで読み込んだ文字データを暗号化してファイルへ保存する
//		出力先のフォルダは「C:\output」とする。
//
//		・CryptDecode
//		ファイルの内容を読み込んで復号化してコンソールへ表示する
//
//		＜暗号化アルゴリズム＞
//		暗号化は読み込んだ文字コードを1つずらす
// 		int c = input.charAt(i) + 1;
//		※変数cに文字コードが変わった数値が入る
//
//		＜実行例＞
//		CryptEncode（暗号化）
//		--------------------------
//		ファイル名：crypt.txt
//		データ：hello world
//		...........
//		暗号化が終わりました。
//
//		CriptDecode（復号化）
//		--------------------------
//		ファイル名：crypt.txt
//		...........
//		データ：hello world
//
//
//		＜発展問題＞
//		暗号化アルゴリズムを複雑にする
//		必ず1つずらすのではなく、データ（int値）を全て合算し、
//		文字数で割ったあまり分のコードをずらす



		encode();
		decode();
	}

	private static void encode() {
		String input = "hello world!";
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(new File("C:\\output\\crypt.txt"));
			dos = new DataOutputStream(fos);

			int sum = 0;
			for(int i = 0; i < input.length(); i++) {
				int c = input.charAt(i) + 1;
				sum += c;
			}

			int offset = sum % input.length();
			for(int i = 0; i < input.length(); i++) {
				int c = input.charAt(i) + offset;
//				fos.write(c);
				dos.writeChar(c);
			}
			System.out.println("暗号化が終わりました。");
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

	private static void decode() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(new File("C:\\output\\crypt.txt"));
			dis = new DataInputStream(fis);

			StringBuilder sb = new StringBuilder();
			int sum = 0;
			int cnt = 0;
			int c;
			try {
				//while((c = fis.read()) != -1) {
				while((c = dis.readChar()) != -1) {
					sum += c;
					cnt++;
					sb.append((char)c);
				}
			}catch(EOFException e) {

			}
			int offset = sum % cnt;
			for(int i = 0; i < sb.toString().length(); i++) {
				int x = sb.toString().charAt(i) - offset;
				System.out.print((char)x);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
