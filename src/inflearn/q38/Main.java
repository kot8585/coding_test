package inflearn.q38;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();

		String removedString = main.removeBetweenBracketString(inputString);
		System.out.println(removedString);

	}

	private String removeBetweenBracketString(String inputString) {
		int BracketCount = 0;
		String result = "";

		char[] charArray = inputString.toCharArray();

		for (char c : charArray) {
			if (c == '(') {
				BracketCount++;
				continue;
			}
			if (c == ')') {
				BracketCount--;
				continue;
			}
			if (BracketCount == 0) {
				result += c;
			}
		}
		return result;
	}
}
