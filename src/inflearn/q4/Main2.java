package inflearn.q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * if ( lt < rt ) : 단어 바꾸기
 */
public class Main2 {
	public static void main(String[] args) {
		Main2 main2 = new Main2();
		Scanner sc = new Scanner(System.in);
		int inputInt = sc.nextInt();
		List<String> stringList = new ArrayList<>();
		for (int i = 0; i < inputInt; i++) {
			String inputString = sc.next();
			stringList.add(inputString);
		}

		main2.reverse(inputInt, stringList);
	}

	private List<String> reverse(int inputInt, List<String> stringList) {
		for (String str : stringList) {
			char[] chars = str.toCharArray();
			int lt=0;
			int rt = str.length();

			while (lt < rt) {
				char tmp = chars[lt];
				chars[lt] = chars[rt];
				chars[rt] = tmp;
				lt++;
				rt--;
			}
		}
		return null;
	}

}
