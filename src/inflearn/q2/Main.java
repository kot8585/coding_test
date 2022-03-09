package inflearn.q2;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Main main = new Main();
		Scanner scanner = new Scanner(System.in);
		char[] chars = scanner.next().toCharArray();

		System.out.println(main.reverseCase(chars));

	}

	public String reverseCase(char[] chars) { // ## 클린코드에서 같은 객체로 리턴하라고 했던것같은데...
		StringBuilder builder = new StringBuilder();
		for (Character character : chars) {
			if (Character.isLowerCase(character)) {
				builder.append(Character.toUpperCase(character));
			} else {
				builder.append(Character.toLowerCase(character));
			}
		}
		return builder.toString();
	}
}

