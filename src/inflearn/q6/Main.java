package inflearn.q6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		String inputString = sc.next();

		System.out.println(main.removeSameChar(inputString));
	}

	private String removeSameChar(String inputString) {
		String answer = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.indexOf(inputString.charAt(i)) == i) {
				answer += inputString.charAt(i);
			}
		}
		return answer;
	}
}
