package inflearn.q3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(main.getMostLongString(inputString));
	}

	private String getMostLongString(String inputString) {
		String[] strings = inputString.split(" ");
		String mostLongString = "";
		for (String string : strings) {
			if (mostLongString.isEmpty()) {
				mostLongString = string;
				continue;
			}
			if (mostLongString.length() < string.length()) {
				mostLongString = string;
			}
		}
		return mostLongString;
	}

	private String getMostLongStringV2(String inputString) {
		int i = inputString.indexOf(" ");
		return null;
	}
}
