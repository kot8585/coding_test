package inflearn.q12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TODO
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int inputInt = sc.nextInt();
		String inputString = sc.next();
		main.solution(inputString, inputInt);
	}

	private void solution(String str, int cnt) {
		List<Integer> substringArr = new ArrayList<>(cnt);
		for (int i = 0; i < cnt*7; i+=7) {
			String substring = str.substring(i, i + 7);

			int parseInt = Integer.parseInt(substring.replace("#", "1").replace("*", "0"), 2);
			char c = (char) parseInt;
			System.out.print(c);
		}

	}
}
