package tsd;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("aの値：");
		int x = scn.nextInt();
		System.out.print("bの値：");
		int y = scn.nextInt();
		scn.close();

		Kuraberu k = new Kuraberu();
		k.a = x;
		k.b = y;

		int bigger = k.getBigger();
		System.out.println("大きい方の値は" + bigger + "です。");
	}
}

class Kuraberu{
	int a;
	int b;

	int getBigger(){
		if(a < b) {
			return b;
		}else {
			return a;
		}
	}
}
