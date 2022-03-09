package inflearn.q9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		System.out.println(main.getOnlyInt(inputString));
	}

	private int getOnlyInt(String inputString) {
		String result = "";
		for (Character character : inputString.toCharArray()) {
			if( !Character.isDigit(character)) continue;
			result += character;
		}

		return Integer.parseInt(result);
	}

}
