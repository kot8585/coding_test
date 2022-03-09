package inflearn.q5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		System.out.println(main.reverse(inputString));
	}

	private String reverse(String inputString) {
		//알파벳인지 아닌지 어떻게 구분?? 1. 아스키 코드, 2. 유틸클래스가 있나
		char[] toCharArray = inputString.toCharArray();
		for (int i = 0; i < toCharArray.length; i++) {
			Character c = toCharArray[i];
			boolean isAlphabetic = Character.isAlphabetic(c);
		}
		return null;
	}
}
