package inflearn.q17;

import java.util.Scanner;

//TODO. 어렵
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println(main.aris(input));
	}

	private int aris(int input) {
		int[] ints = new int[input + 1];
		int cnt = 0;
		for (int i = 2; i <= input; i++) {
			if (ints[i] == 0) {
				cnt++;
			}
			for (int j = i; j <= input; j+=i) {
				ints[j] = 1;
			}
		}
		return cnt;
	}
}
