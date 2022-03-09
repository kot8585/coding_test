package inflearn.q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();
		int inputInt = sc.nextInt();
		for (int i = 0; i < inputInt; i++) {
			list.add(sc.next());
		}
		main.reverseString(inputInt, list).stream().forEach(System.out::println);
	}

	private List<String> reverseString(int n, List<String> list) {
		List<String> reverseChars = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = list.get(i);
			String builder = new StringBuilder(s).reverse().toString();
			reverseChars.add(i, builder);
		}

		return reverseChars;
	}
}
