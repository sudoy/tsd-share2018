package tsd;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample4_5 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();


		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";

		myList.add(st1);
		myList.add(st2);
		myList.add(st3);

		for(int i = 0; i < myList.size(); i++) {
			String st = myList.get(i);
			System.out.println(st);
		}

		for(String st : myList) {
			System.out.println(st);
		}

		// Iteratorクラス（反復子）
		// ・現在値
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()) {
			String st = itr.next();
			System.out.println(st);
		}
	}

}
